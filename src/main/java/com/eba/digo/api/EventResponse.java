
package com.eba.digo.api;


import com.google.gson.annotations.Expose;


public class EventResponse {

    @Expose
    private String status;
    @Expose
    private Event event;
    @Expose
    private String message;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isValid() {
        if (getStatus() == null || getStatus().toUpperCase().equals("ERROR")) {
            return false;
        }

        if (getEvent() == null) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {

        return OceanUtil.toJson(this);
    }

}
