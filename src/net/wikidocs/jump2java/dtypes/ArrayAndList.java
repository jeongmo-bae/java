package net.wikidocs.jump2java.dtypes;

import java.util.ArrayList;
public class ArrayAndList {
    public static void main(String[] args){
        ArrayList pitches = new ArrayList();
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");
        pitches.add(0, "133");
        System.out.println(pitches);

    }
}
