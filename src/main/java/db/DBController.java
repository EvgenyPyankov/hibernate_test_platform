package db;

import db.entity.Test;
import db.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DBController implements DBControllerMethods{
    private static SessionFactory sessionFactory;

    public List<Test> getTests() {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        List<Test> tests= new ArrayList<Test>();
        tests = session.createCriteria(Test.class).list();
        session.close();
        return  tests;
    }

    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure();
        ServiceRegistryBuilder registry = new ServiceRegistryBuilder();
        registry.applySettings(configuration.getProperties());
        ServiceRegistry serviceRegistry = registry.buildServiceRegistry();

        // builds a session factory from the service registry
        sessionFactory = configuration
                .buildSessionFactory(serviceRegistry);

        // obtains the session
        Session session = sessionFactory.openSession();
        session.beginTransaction();

//        Group groupAdmin = new Group("Administrator Group");
//        Group groupGuest = new Group("Guest Group");
//
//        User user1 = new User("Tom", "tomcat", "tom@codejava.net");
//        User user2 = new User("Mary", "mary", "mary@codejava.net");
//
//        groupAdmin.addUser(user1);
//        groupAdmin.addUser(user2);
//
//        groupGuest.addUser(user1);
//
//        user1.addGroup(groupAdmin);
//        user2.addGroup(groupAdmin);
//        user1.addGroup(groupGuest);
//
//        session.save(groupAdmin);
//        session.save(groupGuest);

        Test test1 = new Test();
        test1.setTitle("test2");

        HashSet<Test> tests = new HashSet<Test>();
        tests.add(test1);
        User user1 = new User();
        user1.setLogin("John");




        session.save(user1);
        session.save(test1);


        session.getTransaction().commit();


        session.close();




    }
}
