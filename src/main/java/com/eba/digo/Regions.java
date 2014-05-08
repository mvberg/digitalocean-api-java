package com.eba.digo;

import com.google.gson.annotations.Expose;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by m-ehrenberg on 4/29/2014.
 */
public class Regions {

    @Expose
    private String status;

    @Expose
    private List<Region> regions = new ArrayList<Region>();


    public List<Region> getRegions() {
        return regions;
    }

    public void setRegions(List<Region> regions) {
        this.regions = regions;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Region getById(Integer regionId) {
        if (regionId != null) {
            for (Region r : getRegions()) {
                if (r.getId().compareTo(regionId) == 0) {
                    return r;
                }
            }
        }

        return null;
    }

}
