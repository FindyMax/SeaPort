package com.example.seaport;

public class income {
    private int id;
    private String name;

    public income(int id, String name) {
        this.id = id;
        this.name = name;
    }

//    getters
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

//    setters
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int allIncome() {
        return 0;
    }
}
