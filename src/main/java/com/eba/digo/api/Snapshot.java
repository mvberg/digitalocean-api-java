package com.eba.digo.api;

import com.google.gson.annotations.Expose;

/**
 * Created by Mike on 5/5/2014.
 */
public class Snapshot {

    @Expose
    private Integer id;
    @Expose
    private String name;
    @Expose
    private String slug;
    @Expose
    private String distribution;

    private Droplet droplet;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getDistribution() {
        return distribution;
    }

    public void setDistribution(String distribution) {
        this.distribution = distribution;
    }

    public Droplet getDroplet() {
        return this.droplet;
    }

    public void setDroplet(final Droplet droplet) {
        this.droplet = droplet;
    }
}
