package com.eba.digo.api;

import com.google.gson.annotations.Expose;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by m-ehrenberg on 4/29/2014.
 */
public class Sizes {

    @Expose
    private String status;

    @Expose
    private List<Size> sizes = new ArrayList<Size>();


    public List<Size> getSizes() {
        return sizes;
    }

    public void setSizes(List<Size> regions) {
        this.sizes = regions;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Size getById(Integer id) {

        if (id != null) {
            for (Size s : getSizes()) {
                if (s.getId().compareTo(id) == 0) {
                    return s;
                }
            }
        }

        return null;
    }

}
