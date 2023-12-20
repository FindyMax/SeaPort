package com.example.seaport;

public class rent extends income{
    private int rentIncome;
    public rent(int id, String name, int rentIncome) {
        super(id, name);
        this.rentIncome = rentIncome;
    }
    @Override
    public int allIncome() {
        return rentIncome;
    }
}
