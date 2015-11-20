package main.controllers;

import main.Main;
import main.models.Test;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by dheeraj on 20/11/15.
 */

@RestController
public class TestController {

    @RequestMapping(value = "/tests", method = RequestMethod.GET)
    public List<Test> tests(@RequestParam(value = "name", defaultValue = "World") String name) {
        return Main.testManager.findAllTests();
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public Test test(@RequestParam(value = "id", defaultValue = "1") int id) {
        return Main.testManager.find(id);
    }
}
