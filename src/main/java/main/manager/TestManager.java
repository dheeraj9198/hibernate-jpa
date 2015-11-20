package main.manager;

import main.models.Test;

import java.util.List;

/**
 * Created by dheeraj on 19/11/15.
 */
public interface TestManager {
    void insertTest(Test test);

    List<Test> findAllTests();

    Test find(int id);
}
