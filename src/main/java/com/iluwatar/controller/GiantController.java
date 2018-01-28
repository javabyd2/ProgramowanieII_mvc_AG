package com.iluwatar.controller;

import com.iluwatar.model.Fatigue;
import com.iluwatar.view.GiantView;
import com.iluwatar.model.Health;
import com.iluwatar.model.Nourishment;
import com.iluwatar.model.GiantModel;

public class GiantController {
    private GiantModel giantModel;
    private GiantView giantView;

    public GiantController(GiantModel giantModel, GiantView giantView) {
        this.giantModel = giantModel;
        this.giantView = giantView;
    }

    public Health getHealth() {
        return giantModel.getHealth();
    }

    public void setHealth(Health health) {
        this.giantModel.setHealth(health);
    }

    public Fatigue getFatigue() {
        return giantModel.getFatigue();
    }

    public void setFatigue(Fatigue fatigue) {
        this.giantModel.setFatigue(fatigue);
    }

    public Nourishment getNourishment() {
        return giantModel.getNourishment();
    }

    public void setNourishment(Nourishment nourishment) {
        this.giantModel.setNourishment(nourishment);
    }

    public void updateView() {

    }
}