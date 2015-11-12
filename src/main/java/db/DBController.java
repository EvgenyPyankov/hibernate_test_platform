package db;

import db.Hibernate.Factory;
import db.entity.*;
import org.hibernate.SessionFactory;

import java.sql.SQLException;
import java.util.List;

public class DBController implements DBControllerMethods{
    private static SessionFactory sessionFactory;

    public Test getTestById(int id) throws SQLException{
        return Factory.getInstance().getTestDAO().getTestById(id);
    }

    public void addTest(Test test) throws SQLException{
        Factory.getInstance().getTestDAO().addTest(test);
    }

    public void addUser(User user) throws SQLException{
        Factory.getInstance().getUserDAO().addUser(user);
    }

    public User getUserByLogin(String login) throws SQLException{
        return Factory.getInstance().getUserDAO().getUserByLogin(login);
    }

    public User getUserByEmail(String email)throws SQLException {
           return Factory.getInstance().getUserDAO().getUserByEmail(email);
    }

    public List<Test> getTests()throws SQLException{
        return Factory.getInstance().getTestDAO().getTests();
    }

    public DBController() {
//        Configuration configuration = new Configuration().configure();
//        ServiceRegistryBuilder registry = new ServiceRegistryBuilder();
//        registry.applySettings(configuration.getProperties());
//        ServiceRegistry serviceRegistry = registry.buildServiceRegistry();
//
//        // builds a session factory from the service registry
//        sessionFactory = configuration
//                .buildSessionFactory(serviceRegistry);
//
//        // obtains the session
//        Session session = sessionFactory.openSession();
//        session.beginTransaction();
//
////        Group groupAdmin = new Group("Administrator Group");
////        Group groupGuest = new Group("Guest Group");
////
////        User user1 = new User("Tom", "tomcat", "tom@codejava.net");
////        User user2 = new User("Mary", "mary", "mary@codejava.net");
////
////        groupAdmin.addUser(user1);
////        groupAdmin.addUser(user2);
////
////        groupGuest.addUser(user1);
////
////        user1.addGroup(groupAdmin);
////        user2.addGroup(groupAdmin);
////        user1.addGroup(groupGuest);
////
////        session.save(groupAdmin);
////        session.save(groupGuest);
//
//        Test test1 = new Test();
//        test1.setTitle("test2");
//        test1.setTestCategory(TestCategory.MATH);
//
//        //Set<Question> questions = new HashSet<Question>();
//        //questions.add(new Question("hey",1,test1));
//
//        Question question1 = new Question("question1",1,test1);
//
//        Answer answer1 = new Answer("answer1",1,question1);
//        Answer answer2 = new Answer("answer2",2,question1);
//
//        question1.getAnswers().add(answer1);
//        question1.getAnswers().add(answer2);
//
//        test1.getQuestions().add(question1);
//
//
//
////        HashSet<Test> tests = new HashSet<Test>();
////        tests.add(test1);
////        User user1 = new User();
////        user1.setLogin("John");
////
////
////
////
////        session.save(user1);
//        System.out.println(test1);
////        session.save(test1);
////        session.save(question1);
////        session.save(answer1);
////        session.save(answer2);
//
//
//
//        session.getTransaction().commit();
//
//
//        session.close();
//
//


    }


}
