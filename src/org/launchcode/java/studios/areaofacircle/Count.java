package org.launchcode.java.studios.areaofacircle;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Count {
public static void main(String[] args){
    Scanner input;
    String text;

    HashMap<Character, Integer> characterCount =new HashMap<>();
    input = new Scanner(System.in);
    System.out.println("Give me a Text");

    text = input.nextLine();
char[] charactersInString = text.toCharArray();
input.close();
for (char character : charactersInString){
    if(Character.isLetter(character)){
        char characterUpper = Character.toUpperCase(character);
        if(characterCount.containsKey(characterUpper)) {
           // System.out.println(characterUpper);
            characterCount.put(character, characterCount.get(characterUpper) + 1);
        } else {
            //System.out.println(characterUpper + "created");
            characterCount.put((characterUpper),1);
        }
    }
}
for(Map.Entry<Character, Integer>eachChar :characterCount.entrySet()) {
    System.out.println(eachChar.getKey()+"happened"+ eachChar.getValue()+"time(s)");
    }
}
}
