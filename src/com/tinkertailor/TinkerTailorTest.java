package com.tinkertailor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TinkerTailorTest {

    private TinkerTailor tinkerTailor;
    private static final List<Integer> expectedOutcomeWith5PlayerAnd3Excluded = new ArrayList<>(Arrays.asList(3, 1, 5, 2, 4));
    private static final List<Integer> expectedOutcomeWith7PlayerAnd4Excluded = new ArrayList<>(Arrays.asList(4, 1, 6, 5, 7, 3, 2));
    private static final List<Integer> expectedOutcomeWith11PlayerAnd2Excluded = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 1, 5, 9, 3, 11, 7));
    private static final List<Integer> expectedOutcomeWith3PlayerAnd5Excluded = new ArrayList<>(Arrays.asList(2, 3, 1));


    @BeforeEach
    void setUp() {
        tinkerTailor = new TinkerTailor();
    }


    @Test
    void solveWith5PlayerEvery3Excluded() {
        assertEquals(tinkerTailor.solve(5, 3), expectedOutcomeWith5PlayerAnd3Excluded);
    }

    @Test
    void solveWith7PlayerEvery4Excluded() {
        assertEquals(tinkerTailor.solve(7, 4), expectedOutcomeWith7PlayerAnd4Excluded);
    }

    @Test
    void solveWith11PlayerEvery2Excluded() {
        assertEquals(tinkerTailor.solve(11, 2), expectedOutcomeWith11PlayerAnd2Excluded);
    }

    @Test
    void solveWith3PlayerEvery5excluded() {
        assertEquals(tinkerTailor.solve(3, 5), expectedOutcomeWith3PlayerAnd5Excluded);
    }


}