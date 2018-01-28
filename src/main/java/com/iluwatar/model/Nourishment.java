package com.iluwatar.model;

public enum Nourishment {

    HUNGRY("hungry"), NOTHUNGRY("nothungry"), STRAVING("straving");

    private String title;

    Nourishment(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Nourishment{" +
                "title='" + title + '\'' +
                '}';
    }
}