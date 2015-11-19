package main;

import main.manager.TestManager;
import main.models.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by dheeraj on 19/11/15.
 */
public class Main {
    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

        TestManager testManager = (TestManager) ctx.getBean("testManagerImpl");

        List<Test> list = testManager.findAllTests();
        System.out.println("Test count: " + list.size());

        Test test = new Test();
        test.setUsername("johndoe");
        test.setAge(10);
        test.setAddress("sdhvsdk");
        testManager.insertTest(test);

        System.out.println("Test inserted!");

        list = testManager.findAllTests();
        System.out.println("Test count: " + list.size());

    }

}