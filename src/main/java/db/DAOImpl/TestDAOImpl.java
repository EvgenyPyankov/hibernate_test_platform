package db.DAOImpl;

import db.DAO.TestDAO;
import db.entity.*;
import db.hibernate.HibernateUtil;
import org.hibernate.Session;

import java.sql.SQLException;
import java.util.*;

public class TestDAOImpl implements TestDAO {
    public void addTest(Test test) throws SQLException {
        Session session = null;
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        session.save(test);

        session.getTransaction().commit();
        if (session != null && session.isOpen()) {
            session.close();

        }
    }

    public Test getTestById(int id) throws SQLException {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Test test =  (Test) session.get(Test.class, id);
        if (session.isOpen()) session.close();
        return test;
    }

    public List<Test> getTests() throws SQLException {
        Session session = null;
        List<Test> tests = null;
        session = HibernateUtil.getSessionFactory().openSession();
        tests = session.createCriteria(Test.class).list();
        if (session.isOpen()) session.close();
        return tests;
    }

    public void addPassedTest(Test test, User user) throws SQLException {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();


        UserPass userPass = new UserPass();
        userPass.setTest(test);
        userPass.setUser(user);
        userPass.setDate(new Date());
        session.save(userPass);
        for (Question question:test.getQuestions()){
            if (question.getQuestionType()==2){

            }
            else {
                for (Answer answer:question.getAnswers()){
                    if (answer.getIsChoosed()==1) {
                        UserAnswer userAnswer = new UserAnswer();
                        userAnswer.setQuestion(question);
                        question.getUserAnswers().add(userAnswer);
                        userAnswer.setAnswer(answer);
                        answer.getUserAnswers().add(userAnswer);
                        userAnswer.setUserPass(userPass);
                        userPass.getUserAnswers().add(userAnswer);
                        // session.save(answer);
                        session.save(userAnswer);
                    }
                }
                //session.save(question);
            }

        }



        session.getTransaction().commit();

        if (session != null && session.isOpen()) {
            session.close();

        }

    }
}
