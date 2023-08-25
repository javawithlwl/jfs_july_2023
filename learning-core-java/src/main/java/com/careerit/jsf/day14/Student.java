package com.careerit.jsf.day14;

public class Student {
    private long regno;
    private String name;
    private int std;

    public Student(long regno, String name, int std) {
        this.regno = regno;
        this.name = name;
        this.std = std;
    }

    public void promote() {
        this.std++;
    }

    public void showInfo() {
        System.out.println("Regno :" + regno + "\nName :" + name + "\nStd :" + std);
    }

    public long getRegno() {
        return regno;
    }

    public String getName() {
        return name;
    }

    public int getStd() {
        return std;
    }
}
