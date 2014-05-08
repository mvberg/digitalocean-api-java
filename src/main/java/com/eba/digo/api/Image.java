package com.eba.digo.api;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by m-ehrenberg on 4/30/2014.
 *
 * @author Mike Ehrenberg
 */

public class Image {

    @Expose
    private Integer id;
    @Expose
    private String name;
    @Expose
    private String slug;
    @Expose
    private String distribution;
    @SerializedName("public")
    @Expose
    private Boolean _public;
    @Expose
    private List<Integer> regions = new ArrayList<Integer>();
    @Expose
    private List<String> region_slugs = new ArrayList<String>();

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

    public Boolean getPublic() {
        return _public;
    }

    public void setPublic(Boolean _public) {
        this._public = _public;
    }

    public List<Integer> getRegions() {
        return regions;
    }

    public void setRegions(List<Integer> regions) {
        this.regions = regions;
    }

    public List<String> getRegion_slugs() {
        return region_slugs;
    }

    public void setRegion_slugs(List<String> region_slugs) {
        this.region_slugs = region_slugs;
    }

}