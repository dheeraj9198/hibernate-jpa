package main.daoImplementation;

import main.dao.TestDao;
import main.models.Test;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * Created by dheeraj on 19/11/15.
 */

@Repository
public class TestDaoImpl implements TestDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void insertTest(Test test) {
        entityManager.persist(test);
    }

    @Override
    public List<Test> findAllTests() {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Test> criteriaQuery = builder.createQuery(Test.class);
        Root<Test> root = criteriaQuery.from(Test.class);
        criteriaQuery.select(root);
        return entityManager.createQuery(criteriaQuery).getResultList();
    }

    @Override
    public Test find(int id) {
        return entityManager.find(Test.class,id);
    }
}
