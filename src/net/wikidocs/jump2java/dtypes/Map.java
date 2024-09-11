package net.wikidocs.jump2java.dtypes;
import java.util.HashMap;

public class Map {
    public static void main(String[] args){
        HashMap<Character,Integer> asciiCodeMap = new HashMap<>();
        for (int i=0; i < 26; i++){
            char alphaLowerCase = (char) (65+i) ;
            char alphaUpperCase = (char) (97+i) ;
            asciiCodeMap.put(alphaUpperCase,97+i);
            asciiCodeMap.put(alphaLowerCase,65+i);
        }
        System.out.println(asciiCodeMap);
    }
}
