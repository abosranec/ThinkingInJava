package head_11.example11_20;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by Pasha on 04.10.2016.
 */
public class WorkClass {
    public static void main(String[] args) {
        Character[] vowels = {'a','e','i','o','u','y'};
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(Character character: vowels){
            hashMap.put(character, 0);
        }
        String str = "Help people interested in this repository understand your project by adding a README.";
        System.out.println("Values: " + str);
        //added vowels and their number in Map
        for (Character ch : str.toCharArray()) {
            if (hashMap.containsKey(ch)){
                hashMap.put(ch,hashMap.get(ch)+1);
            }
        }
        //vowels are sorted by their number
        LinkedHashMap<Character, Integer> linkedHashMap2 = new LinkedHashMap<>();
        Character[] arrayChar = new Character[hashMap.size()];
        for (int i = 0; i < hashMap.size(); i++)
            arrayChar[i] = (Character) hashMap.keySet().toArray()[i];
        Integer[] array = new Integer[hashMap.size()];
        for (int i = 0; i < array.length; i++)
            array[i] = (Integer) hashMap.values().toArray()[i];
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j+1]){
                    int in = array[j];
                    array[j] = array[j+1];
                    array[j+1] = in;
                    char ch = arrayChar[j];
                    arrayChar[j] = arrayChar[j+1];
                    arrayChar[j+1] = ch;
                }
            }
        }
        for (int i = 0; i < arrayChar.length; i++)
            linkedHashMap2.put(arrayChar[i],array[i]);

        System.out.println("Added vowels and their number in Map:  " + hashMap);
        System.out.println("Vowels are sorted by their number:     " + linkedHashMap2);
    }
}
