package com.github.ththory.TddProject;

public class Dollar {
    int amount;

    Dollar(int amount){
        this.amount = amount;
    }

    void times(int number){
        this.amount *= number;
    }
}
