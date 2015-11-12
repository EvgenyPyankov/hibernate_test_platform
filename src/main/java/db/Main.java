package db;

import java.util.ArrayList;
import java.util.List;

import db.entity.*;

public class Main {
    public static void main(String[] args) {
        DBController db = new DBController();
        List<Test> tests = db.getTests();

//        for(Test item:tests)
//            System.out.println(item.toString());

        for (Test item:tests)
            System.out.println(item.getTitle());
    }
}
