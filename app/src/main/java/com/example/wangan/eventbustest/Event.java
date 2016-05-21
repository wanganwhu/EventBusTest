package com.example.wangan.eventbustest;

/**
 * Created by 10394 on 2016/5/21.
 */
public class Event {
    private String msg;
    Event(String msg){
        this.msg = msg;
    }
    public String getEvent(){
        return msg;
    }
}
