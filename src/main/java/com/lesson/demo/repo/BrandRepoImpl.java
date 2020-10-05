package com.lesson.demo.repo;

import com.lesson.demo.entity.data.Brand;
import com.lesson.demo.entity.query.CountProduct;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.util.List;
@Repository
//@AllArgsConstructor

public class BrandRepoImpl implements BrandRepoExample{
//    @Autowired
    @PersistenceContext//chỉ dùng cho Entity
    private EntityManager entityManager;

    @Autowired
    private EntityManagerFactory factory;

    @Override
    public Brand findById(int id) throws Exception{
        TypedQuery<Brand> query = entityManager.createQuery("select b from Brand b " +
                "where b.id = ?1 " +
                "and b.deleted = false",
                Brand.class);
        query.setParameter(1, id);
        return query.getSingleResult();
    }

    @Override
    public Long count() {
        return entityManager.createQuery("select count(b) from Brand b" +
                " where  b.deleted = false",Long.class).getSingleResult();
    }

    @Override
    public List<Brand> findAll() {
        Query query = entityManager.createQuery("select brand from Brand brand where brand.deleted = false");
        return query.getResultList();
    }

    @Override
    public List<Brand> findByName(String name) {
        Query query = entityManager.createQuery("select b from Brand b where b.name like concat('%',?1,'%')");
        query.setParameter(1, name);
        return query.getResultList();

    }

    @Override
    public boolean insert(Brand brand) {
        EntityManager entityManager = factory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        try {
            entityTransaction.begin();
            // code loạn xì ngầu
            entityTransaction.commit();
            return false;
        } catch (Exception e) {
            entityTransaction.rollback();
        }
        return false;
    }

    @Override
    public boolean update(Brand brand) {
        return false;
    }

    @Override
    @Transactional
    public boolean delete(int id) {
        Query query = entityManager.createQuery("update Brand b set b.deleted=true where b.id = ?1");
        query.setParameter(1, id);
        return query.executeUpdate() > 0;
    }

    @Override
    public List<CountProduct> countProduct() {
        return entityManager.createQuery("select new" +
                " com.lesson.demo.entity.query.CountProduct(p.brand.name, count(p)) " +
                "from Product p group by p.brand").getResultList();
    }
}
