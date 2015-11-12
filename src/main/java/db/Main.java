package db;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

//        db.addUser(new User("John","king@mail.ru",777));

//        try {
//            db.addUser(new User("Max","yeahyeah@gmail.ru",777));
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

        User user1 = null;
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


        try {
            Test test = db.getTestById(9);
            if (db.getTestById(10)==null) System.out.println("Doesnt exist!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
