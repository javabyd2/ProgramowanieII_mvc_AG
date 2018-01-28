package com.iluwatar;

import com.iluwatar.controller.GiantController;
import com.iluwatar.model.Fatigue;
import com.iluwatar.model.GiantModel;
import com.iluwatar.model.Health;
import com.iluwatar.model.Nourishment;
import com.iluwatar.view.GiantView;

public class Main {
    public static void main(String[] args) {
        GiantModel giantOne = new GiantModel(Health.HEALTHY, Fatigue.NO, Nourishment.NOTHUNGRY);
        GiantModel giantTwo = new GiantModel(Health.HEALTHY, Fatigue.SLEEPING, Nourishment.NOTHUNGRY);
        GiantView giantView = new GiantView();
        GiantController giantConOne = new GiantController(giantOne, giantView);
        GiantController giantConTwo = new GiantController(giantTwo, giantView);

        giantConOne.updateView();

        giantConOne.setHealth(Health.DEAD);
        giantConOne.updateView();

        giantConTwo.updateView();
        giantConTwo.setFatigue(Fatigue.NO);

    }
}