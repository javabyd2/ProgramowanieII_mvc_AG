package com.iluwatar.controller;

import com.iluwatar.model.*;
import com.iluwatar.view.GiantView;

import java.util.List;

public class GiantController {
    private GiantView giantView;
    private List<GiantModel> giantModel;

    public GiantController(List<GiantModel> giantModel, GiantView giantView) {
        this.giantModel = giantModel;
        this.giantView = giantView;
    }

    public Health getHealth(int giant) {
        return giantModel.get(giant).getHealth();
    }

    public void setHealth(int giant, Health health) {
        this.giantModel.get(giant).setHealth(health);
    }

    public Fatigue getFatigue(int giant) {
        return giantModel.get(giant).getFatigue();
    }

    public void setFatigue(int giant, Fatigue fatigue) {
        this.giantModel.get(giant).setFatigue(fatigue);
    }

    public Nourishment getNourishment(int giant) {
        return giantModel.get(giant).getNourishment();
    }

    public void setNourishment(int giant, Nourishment nourishment) {
        this.giantModel.get(giant).setNourishment(nourishment);
    }

    public void updateView(int giant) {
        this.giantView.displayGiant(giantModel.get(giant));
    }
}