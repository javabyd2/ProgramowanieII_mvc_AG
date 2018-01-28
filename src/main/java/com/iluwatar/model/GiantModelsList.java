package com.iluwatar.model;

import java.util.ArrayList;
import java.util.List;

public class GiantModelsList {
    private List<GiantModel> giantModelsList = new ArrayList<>();

    public void setGiantModelsList(GiantModel giantModel){
        this.giantModelsList.add(giantModel);
    }
}