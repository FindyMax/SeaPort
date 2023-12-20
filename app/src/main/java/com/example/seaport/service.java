package com.example.seaport;

public class service extends income{
    private int oneShipIncome;
    private int ships;
    public service(int id, String name, int oneShipIncome, int ships) {
        super(id, name);
        this.oneShipIncome = oneShipIncome;
        this.ships = ships;
    }
    @Override
    public int allIncome() {
        return oneShipIncome * ships;
    }
}
