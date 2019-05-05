package com.guessnumber.furrki.guessnumber;

import java.util.Random;

public class Game {
    private int pickedNumber;
    public int tryCount;

    public Game() {
        tryCount = 0;

        Random rand = new Random();
        pickedNumber = rand.nextInt(100);
    }

    public String hit(int number) {
        tryCount += 1;
        if (number > pickedNumber) {
            return "İn";
        } else if (number < pickedNumber) {
            return "Çık";
        } else {
            return "AFERİİİİİN, "+tryCount+" deneme sonucunda bulundu.";
        }
    }
}
