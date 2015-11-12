package db;

import db.entity.Test;

import java.sql.SQLException;
import java.util.List;
import java.util.*;

public interface DBControllerMethods {
    List<Test> getTests();
}
