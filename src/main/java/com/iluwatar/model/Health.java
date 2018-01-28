package com.iluwatar.model;

public enum Health {

    HEALTHY("healty"), NOTHEALTHY("nothealty"), DEAD("dead");

    private String title;

    Health(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Health{" +
                "title='" + title + '\'' +
                '}';
    }
}