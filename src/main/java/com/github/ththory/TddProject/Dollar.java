package com.github.ththory.TddProject;

public class Dollar {
    int amount;

    Dollar(int amount){
        this.amount = amount;
    }

    Dollar times(int multiplier){
        return new Dollar(this.amount * multiplier);
    }
}
