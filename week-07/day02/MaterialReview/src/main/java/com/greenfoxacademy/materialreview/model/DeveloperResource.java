package com.greenfoxacademy.materialreview.model;

public final class DeveloperResource {
    private final String name;
    private final String url;
    private final boolean recommended;

    public DeveloperResource(String name, String url, boolean recommended) {
        this.name = name;
        this.url = url;
        this.recommended = recommended;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public boolean isRecommended() {
        return recommended;
    }
}
