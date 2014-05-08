package com.eba.digo.api;

import com.google.gson.annotations.Expose;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by m-ehrenberg on 5/5/2014.
 */
public class Command {

    private final Date requestTime = new Date();

    @Expose
    private String id;
    @Expose
    private String name;
    @Expose
    private Integer dropletId;

    @Expose
    private Integer eventId;

    @Expose
    private final Map<String, String> extraParams = new HashMap<String, String>();

    @Expose
    private Event lastEvent;

    public Command(String id, String name, Integer dropletId) {
        setDropletId(dropletId);
        setId(id);
        setName(name);
    }

    public Date getRequestTime() {
        return requestTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDropletId() {
        return dropletId;
    }

    public void setDropletId(Integer dropletId) {
        this.dropletId = dropletId;
    }

    public Map<String, String> getExtraParams() {
        return extraParams;
    }

    public Event getLastEvent() {
        return lastEvent;
    }

    public void setLastEvent(Event lastEvent) {
        this.lastEvent = lastEvent;
    }

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }


}
