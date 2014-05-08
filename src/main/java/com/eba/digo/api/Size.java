
package com.eba.digo.api;

import com.google.gson.annotations.Expose;


public class Size {

    @Expose
    private Integer id;
    @Expose
    private String name;
    @Expose
    private String slug;
    @Expose
    private Integer memory;
    @Expose
    private Integer cpu;
    @Expose
    private Integer disk;
    @Expose
    private Double cost_per_hour;
    @Expose
    private String cost_per_month;


    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public Integer getCpu() {
        return cpu;
    }

    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }

    public Integer getDisk() {
        return disk;
    }

    public void setDisk(Integer disk) {
        this.disk = disk;
    }

    public Double getCost_per_hour() {
        return cost_per_hour;
    }

    public void setCost_per_hour(Double cost_per_hour) {
        this.cost_per_hour = cost_per_hour;
    }

    public String getCost_per_month() {
        return cost_per_month;
    }

    public void setCost_per_month(String cost_per_month) {
        this.cost_per_month = cost_per_month;
    }

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
