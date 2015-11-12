package db;

import java.util.ArrayList;
import java.util.List;

import db.entity.*;

public class Main {
    public static void main(String[] args) {
        DBController db = new DBController();
//        List<Test> tests = db.getTests();
//        for (Test item:tests)
//            System.out.println(item.getTitle());
//        db.addUser(new User("John","king@mail.ru",777));
//        db.addUser(new User("Lennon","king1@mail.ru",777));

        User user1 = db.getUserByEmail("kin@mail.ru");
        //System.out.println(user1.toString());

//        System.out.println(db.getUserByEmail("king@mail.ru"));


    }


}
