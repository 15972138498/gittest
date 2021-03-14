package com.kgc.hello.entity;

public class User {

    private String name;
    private Integer age;
    private Car car;

    public User(String name, Integer age, Car car) {
        this.name = name;
        this.age = age;
        this.car = car;
    }

    public User() {
        
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
          "name='" + name + '\'' +
          ", age=" + age +
          '}';
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
