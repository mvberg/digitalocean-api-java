package com.eba.digo.api;

import com.google.gson.annotations.Expose;

/**
 * Created by m-ehrenberg on 5/7/2014.
 */

public class NewDropletResponse extends CommandResponse {

    @Expose
    private Droplet droplet;

    public Droplet getDroplet() {
        return droplet;
    }

    public void setDroplet(Droplet droplet) {
        this.droplet = droplet;
    }

}
