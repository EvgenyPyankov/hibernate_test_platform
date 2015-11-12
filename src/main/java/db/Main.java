package db;

import java.sql.SQLException;
import java.util.*;

import db.entity.*;

public class Main {
    public static void main(String[] args) {
        DBController db = new DBController();
//        try {
//            db.addTest(new Test("one more test",TestCategory.QUESTIONAIRE,null));
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        List<Test> tests = null;
//        try {
//            tests = db.getTests();
//            for (Test item:tests)
//                System.out.println(item.toString());
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }


//        try {
//            db.addUser(new User("Max","yeahyeah@gmail.ru",777));
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

        //     User user1 = null;
//        try {
//            user1 = db.getUserByEmail("king@mail.ru");
//            System.out.println(user1.toString());
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

//        try {
//            user1 = db.getUserByLogin("John");
//            System.out.println(user1.toString());
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }


//        System.out.println(db.getUserByEmail("king@mail.ru"));


//        try {
//            Test test = db.getTestById(9);
//            if (db.getTestById(10)==null) System.out.println("Doesnt exist!");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

        Set<Question> questions;
        Set<Answer> answers;

        questions = new HashSet<Question>();
        answers = new HashSet<Answer>();



        answers.add(new Answer(1, "yes"));
        answers.add(new Answer(2, "rather yes"));
        answers.add(new Answer(3, "i don't know"));
        answers.add(new Answer(4, "rather no"));
        answers.add(new Answer(5, "no"));





        questions.add(new Question(1, "I am able to relax", answers,1));
        questions.add(new Question(2, "I tend to focus on upsetting situations or events happening in my life", answers,1));
        questions.add(new Question(3, "I feel fearful for no reason", answers,1));
        questions.add(new Question(4, "I am as happy as the people around me", answers,1));
        questions.add(new Question(5, "I have diarrhea, constipation, or other digestive problems", answers,1));
        questions.add(new Question(6, "I have a dry mouth", answers,1));
        questions.add(new Question(7, "When someone snaps at me, I spend the rest of the day thinking about it", answers,1));
        questions.add(new Question(8, "No matter what I do, I can't get my mind off my problems", answers,1));

        try {
            db.addTest(new Test("new Test",TestCategory.QUESTIONAIRE,questions, db.getUserByLogin("John")));
        } catch (SQLException e) {
            e.printStackTrace();
        }




    }


}
