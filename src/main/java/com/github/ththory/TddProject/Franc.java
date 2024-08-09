package com.github.ththory.TddProject;

public class Franc {
    private int amount;

    Franc(int amount){
        this.amount = amount;
    }

    Franc times(int multiplier){
        return new Franc(this.amount * multiplier);
    }

    @Override
    public boolean equals(Object object){
        Franc dollar = (Franc) object;
        return this.amount == dollar.amount;
    }
}
