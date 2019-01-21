package com;

import com.tinkertailor.TinkerTailor;

public class Main {

    private static final int PLAYER_NUM = 5;
    private static final int CHOSEN_NUM_POSITION = 3;

    public static void main(String[] args) {

        TinkerTailor tinkerTailor = new TinkerTailor();
        System.out.println(tinkerTailor.solve(PLAYER_NUM, CHOSEN_NUM_POSITION));

    }

}
