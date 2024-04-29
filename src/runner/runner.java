package runner;

import controller.Remote;

public class runner {

    public static void main(String [] name){
        Remote rem = new Remote();
        Remote tv = new Remote();
        double  w = rem.getWidth();
        rem.setColor(55);
        System.out.println(w);
        System.out.println(rem.getColor());
        System.out.println(tv.getDepth());
        System.out.println(tv.turnOff());
    }
}
