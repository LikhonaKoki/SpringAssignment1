package com.example.springassigment1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import  java.util.ArrayList;
import  java.util.List;


@SpringBootApplication
public class SpringAssigment1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringAssigment1Application.class, args);
    }

}
@RestController
class  CourseController{
    @GetMapping("/courses")
    public List<String> getCourses() {
        List<String> courses = new ArrayList<>();

        // Adding Foundation courses
        courses.add("Foundation Course one: intro to computer science ");
        courses.add("Foundation Course two :Fundamental of programming");

        // Adding Undergraduate courses
        courses.add("Undergraduate Course one:algorithm and data structures");
        courses.add("Undergraduate Course Two:Programming language and Paradigms");
        courses.add("Undergraduate Course three:Soft engineering");
        courses.add("Undergraduate Course four:Computer System and architecture");
        courses.add("Undergraduate Course five:Database and information management");

        // Adding Honours courses
        courses.add("Honours Course one:Advanced in algorithm ");
        courses.add("Honours Course two:Machine learning and Artificial intelligence");
        courses.add("Honours Course three:Theory of computation");
        courses.add("Honours Course four:Advanced and software engineering");

        return courses;
    }
}
