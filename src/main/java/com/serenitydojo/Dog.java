package com.serenitydojo;

public class Dog {
    private final String name;
    private final String favToy;
    private final int age;

    public Dog(String name, String favToy, int age) {
        this.name = name;
        this.favToy = favToy;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getFavoriteToy() {
        return favToy;
    }

    public int getAge() {
        return age;
    }
}
