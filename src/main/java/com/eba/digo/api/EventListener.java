package com.eba.digo.api;

/**
 * Created by m-ehrenberg on 4/30/2014.
 */
public interface EventListener {

    void onCommandResponse(String originalCommand, Integer dropletId, CommandResponse response);

    void onNewDropletResponse(NewDropletResponse response);

    void onEvent(Event event);

    void onEventError(Exception e);

    void onEventComplete(Event event);
}
