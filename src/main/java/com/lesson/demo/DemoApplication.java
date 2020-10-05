package com.lesson.demo;

import com.lesson.demo.entity.data.Address;
import com.lesson.demo.entity.data.Brand;
import com.lesson.demo.entity.data.Category;
import com.lesson.demo.entity.data.Customer;
import com.lesson.demo.repo.BrandRepoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@SpringBootApplication

public class DemoApplication implements CommandLineRunner {

    @Autowired
    private ConfigurableApplicationContext context;
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
    }
    @PersistenceContext//chỉ dùng cho Entity
    private EntityManager entityManager;

    @Autowired
    private BrandRepoExample example;

    @Override
    @Transactional
    public void run(String... args) throws Exception {
//        Address address = entityManager.find(Address.class,2);
//        System.out.println(address.getCustomer().getName());

//        Brand brand = new Brand();
//        entityManager.persist(brand);
//        brand.setName("Hedspi");
//        brand.setDeleted(false);
//        Brand brand = entityManager.find(Brand.class, 38);
//        brand.setName("Dathaydoi");
//        entityManager.merge(brand);
//        System.out.println(example.countProduct());
//        Category category = entityManager.find(Category.class,2);
        Address address = Address.builder().street("DC").district("TX").province("HN").deleted(false).build();
        Customer customer = Customer.builder().name("H").email("m@g.com").phone("039").deleted(false).build();
        address.setCustomer(customer);
        entityManager.persist(address);
    }
}
