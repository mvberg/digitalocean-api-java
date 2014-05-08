
package com.eba.digo;


import com.google.gson.annotations.Expose;

public class Event {

    @Expose
    private Integer id;
    @Expose
    private String action_status;
    @Expose
    private Integer droplet_id;
    @Expose
    private Integer event_type_id;
    @Expose
    private String percentage;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAction_status() {
        return action_status;
    }

    public void setAction_status(String action_status) {
        this.action_status = action_status;
    }

    public Integer getDroplet_id() {
        return droplet_id;
    }

    public void setDroplet_id(Integer droplet_id) {
        this.droplet_id = droplet_id;
    }

    public Integer getEvent_type_id() {
        return event_type_id;
    }

    public void setEvent_type_id(Integer event_type_id) {
        this.event_type_id = event_type_id;
    }

    public String getPercentage() {
        return percentage;
    }

    public void setPercentage(String percentage) {
        this.percentage = percentage;
    }

}
