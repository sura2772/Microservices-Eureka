package com.micro.bean;

public class Student {
	private String name;
    private String Course;
     
    public Student(String name, String className) {
        super();
        this.name = name;
        this.Course = className;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getClassName() {
        return Course;
    }
 
    public void setClassName(String className) {
        this.Course = className;
    }
}
