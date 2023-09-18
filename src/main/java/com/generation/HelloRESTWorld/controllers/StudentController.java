package com.generation.HelloRESTWorld.controllers;

import com.generation.HelloRESTWorld.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;


@RestController
public class StudentController {

    @GetMapping(value = "/student")//serve quando l'utente farà richiesta di questo http
    public Iterable<Student> getAllStudents(){

        Student s1 = new Student(1 ,"mario" , "rossi" , LocalDate.of(1990,2,20 ));

        Student s2= new Student(2 ,"luigi" , "morandi" ,LocalDate.of(1995,5,15 ));

        Collection<Student> students=new ArrayList<>();

        students.add(s1);
        students.add(s2);

        return students;

    }
}
