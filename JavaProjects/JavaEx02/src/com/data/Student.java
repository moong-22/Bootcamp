package com.data;

public class Student {
    public String name;
    public String hakbun;

    public Student() {
        System.out.println( "Hello Student" );
    }

    public Student( String hakbun, String name ) {
        this.name = name;
        this.hakbun = hakbun;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getHakbun() {
        return hakbun;
    }

    public void setHakbun(String hakbun) {
        this.hakbun = hakbun;
    }
}
