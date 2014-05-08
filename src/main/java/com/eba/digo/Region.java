package com.eba.digo;

import com.google.gson.annotations.Expose;

/**
 * @author Mike Ehrenberg
 *         <p/>
 *         https://developers.digitalocean.com/regions/
 *         <p/>
 *         https://api.digitalocean.com/regions/?client_id=[client_id]&api_key=[api_key]
 */

public class Region {

    @Expose
    private Integer id;
    @Expose
    private String name;
    @Expose
    private String slug;

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

}
