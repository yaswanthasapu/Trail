package task;

import java.util.*;

public class MaxMinArrayList {
    public static void main(String[] args) {
            ArrayList<Integer> aL = new ArrayList<Integer>();
            aL.add(53);
            aL.add(67);
            aL.add(89);
            aL.add(63);
            aL.add(45);
            aL.add(69);
            aL.add(53);
            Collections.sort(aL);
            for (Integer i:aL){
                System.out.println(i);
            }
            System.out.println( "ArrayList Min Value: " + Collections.min(aL) );
            System.out.println( "ArrayList Max Value: " + Collections.max(aL) );

        }
    }


