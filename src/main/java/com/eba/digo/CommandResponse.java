package com.eba.digo;

import com.google.gson.annotations.Expose;

/**
 * Created by m-ehrenberg on 4/30/2014.
 */

public class CommandResponse {

    @Expose
    protected String status;
    @Expose
    protected Integer event_id;
    @Expose
    protected String error_message;
    @Expose
    protected String message;


    public Integer getEvent_id() {
        return event_id;
    }

    public void setEvent_id(Integer event_id) {
        this.event_id = event_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getError_message() {
        return error_message;
    }

    public void setError_message(String error_message) {
        this.error_message = error_message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean isValid() {
        if (status == null || status.toUpperCase().equalsIgnoreCase("ERROR")) {
            return false;
        }
        return true;
    }

    public String getAnyMessage() {

        if (isValid()) {
            if (getMessage() != null) {
                return getMessage();
            }
        } else {
            if (getError_message() != null) {
                return getError_message();
            }

            if (getMessage() != null) {
                return getMessage();
            }
        }

        return "N/A";
    }

}
