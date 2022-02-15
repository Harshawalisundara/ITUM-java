package com.itum;

public class Student {
    private String name;

    public void setname(String name){
        this.name=name;
    }
    public String getname(){
        return name;
    }
}

class TestEncapsulation{
    public static void main (String[] args){
        Student s = new Student();
        s.setname("Tharaka");
        System.out.println(s.getname());
    }
}