package main.managerImplementation;

import main.dao.TestDao;
import main.manager.TestManager;
import main.models.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by dheeraj on 19/11/15.
 */
@Service
public class TestManagerImpl implements TestManager {

    @Autowired
    private TestDao testDao;

    @Override
    @Transactional
    public void insertTest(Test test) {
        testDao.insertTest(test);
    }

    @Override
    public List<Test> findAllTests() {
        return testDao.findAllTests();
    }

    @Override
    public Test find(int id) {
        return testDao.find(id);
    }

}
