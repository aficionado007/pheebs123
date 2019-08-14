package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static  Map<Integer, destination > mymap = new HashMap<Integer, destination>();
    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);

        mymap.put(0, new destination(0,null));
        mymap.put(1, new destination(1,null));
        mymap.put(2, new destination(2,null));
        mymap.put(3 ,new destination(3,null));

        mymap.get(1).addExit("W", 2);
        mymap.get(2).addExit("N", 5);

        mymap.get(3).addExit("W", 1);


        String msg = scanner.nextLine().toUpperCase();
        Map<String, String> dictionary =new HashMap <String, String>();
        dictionary.put("QUIT", "Q");
        dictionary.put("NORTH", "N");
        dictionary.put("SOUTH", "S");
        dictionary.put("WEST", "W");
        dictionary.put("EAST", "E");
        String[] input= msg.split(" ");
        //String ans;
        for(String word: input) {
            if(dictionary.containsKey(word)) {
                msg= dictionary.get(word);
                break;
                }
        }
       // int loc=5;
        Map<String, Integer> exits = mymap.get(1).getExits();
        if(exits.containsKey(msg)) {
            System.out.println( exits.get(msg));

        } else {
            System.out.println("You cannot go in that direction");
        }


    }

}
