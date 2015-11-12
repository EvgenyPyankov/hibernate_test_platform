package db;

import db.hibernate.Factory;
import db.entity.*;
import org.hibernate.SessionFactory;

import java.sql.SQLException;
import java.util.*;

public class DBController implements DBControllerMethods{
    private static SessionFactory sessionFactory;

    public Test getTestById(int id) throws SQLException{
        return Factory.getInstance().getTestDAO().getTestById(id);
    }

    private void deepCopy(Set<Answer> from, Set<Answer>to){
        for(Answer answer:from)
            to.add(new Answer(answer.getNumber(),answer.getTitle()));
    }

    public void addTest(Test test) throws SQLException{
        for(Question question:test.getQuestions()){
            Set<Answer> answers = new HashSet<Answer>();
            deepCopy(question.getAnswers(),answers);
            question.setAnswers(answers);
            for (Answer answer:question.getAnswers()){
                answer.setQuestion(question);
            }
            question.setTest(test);
        }

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

    }


}
