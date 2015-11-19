package main.dao;

import main.models.Test;

import java.util.List;

/**
 * Created by dheeraj on 19/11/15.
 */
public interface TestDao {

    void insertTest(Test test);

    List<Test> findAllTests();
}