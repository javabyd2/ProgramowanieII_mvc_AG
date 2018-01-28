package com.iluwatar;

import com.iluwatar.controller.GiantController;
import com.iluwatar.model.*;
import com.iluwatar.view.GiantView;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GiantModel giantOne = new GiantModel(Health.HEALTHY, Fatigue.NO, Nourishment.NOTHUNGRY);
        GiantModel giantTwo = new GiantModel(Health.HEALTHY, Fatigue.SLEEPING, Nourishment.NOTHUNGRY);
        GiantModel giantThree = new GiantModel(Health.NOTHEALTHY, Fatigue.SLEEPING, Nourishment.HUNGRY);
        GiantView giantView = new GiantView();

        List<GiantModel> giantModelsList = new ArrayList<>();

        giantModelsList.add(giantOne);
        giantModelsList.add(giantTwo);
        giantModelsList.add(giantThree);

        GiantController giantCon = new GiantController(giantModelsList, giantView);

        giantCon.updateView(0);
        giantCon.setHealth(0, Health.DEAD);
        giantCon.updateView(0);

        giantCon.updateView(1);
        giantCon.setFatigue(1, Fatigue.NO);
        giantCon.updateView(1);

        giantCon.updateView(2);
        giantCon.setFatigue(2, Fatigue.NO);
        giantCon.updateView(2);

    }
}