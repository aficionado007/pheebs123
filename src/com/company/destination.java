package com.company;

import java.util.HashMap;
import java.util.Map;

public class destination {
    private final int id ;
    public final Map<String, Integer> exits;

    public destination(int ident,Map<String, Integer>exits ) {
        this.id= ident;
        if(exits!=null)
        this.exits = new HashMap<String, Integer>(exits);
        else
            this.exits=new HashMap<String, Integer>();
        this.exits.put("Q", 0);
    }

    public void addExit(String direction, int destination) {
        exits.put(direction, destination);
    }
    public int getLocationID() {
        return id;
    }


    public Map<String, Integer> getExits() {
        return new HashMap<>(exits);
    }
}
