package com.github.ththory.TddProject;

public class Dollar {
    private int amount;

    Dollar(int amount){
        this.amount = amount;
    }

    Dollar times(int multiplier){
        return new Dollar(this.amount * multiplier);
    }

    @Override
    public boolean equals(Object object){
        Dollar dollar = (Dollar) object;
        return this.amount == dollar.amount;
    }
}
