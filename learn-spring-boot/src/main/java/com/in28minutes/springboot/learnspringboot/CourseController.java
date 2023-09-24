package com.in28minutes.springboot.learnspringboot;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;



@RestController
public class CourseController {
    //Courses//Course : id, name, author

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
                new Course(1,"Learn AWS","Raju"),
                new Course(2,"Learn DevOps","Hari")
        );
    }

}
