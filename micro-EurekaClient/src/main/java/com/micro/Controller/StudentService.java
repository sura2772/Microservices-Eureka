package com.micro.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.micro.bean.Student;

@RestController
public class StudentService {

	private static Map<String, List<Student>> schooDB = new HashMap<String, List<Student>>();
	 
    static {
        schooDB = new HashMap<String, List<Student>>();
 
        List<Student> lst = new ArrayList<Student>();
        Student std = new Student("Suraj", "Computers");
        lst.add(std);
        std = new Student("Raj", "Finance");
        lst.add(std);
 
        schooDB.put("abcschool", lst);
 
        lst = new ArrayList<Student>();
        std = new Student("Prem", "Economics");
        lst.add(std);
        std = new Student("Dan", "Chemistry");
        lst.add(std);
 
        schooDB.put("xyzschool", lst);
 
    }
 
    @RequestMapping(value = "/getStudentDetailsForSchool/{schoolname}", method = RequestMethod.GET)
    public List<Student> getStudents(@PathVariable String schoolname) {
        System.out.println("Getting Student details for " + schoolname);
 
        List<Student> studentList = schooDB.get(schoolname);
        if (studentList == null) {
            studentList = new ArrayList<Student>();
            Student std = new Student("Not Found", "N/A");
            studentList.add(std);
        }
        return studentList;
    }
	
}
