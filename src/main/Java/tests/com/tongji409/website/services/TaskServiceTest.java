package tests.com.tongji409.website.services;

import com.tongji409.website.service.TaskService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Project: SwQualityAssesment
 * Package: com.tongji409.website.service
 * Author:  Novemser
 * 2016/11/24
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TaskService.class)
public class TaskServiceTest {

    @Autowired
    private TaskService taskService;

    @Test
    public void addTask() throws Exception {
       // taskService.addTask();
    }

    @Test
    public void getAllTasks() throws Exception {

    }

    @Test
    public void addTask1() throws Exception {

    }

    @Test
    public void addTask2() throws Exception {

    }

}