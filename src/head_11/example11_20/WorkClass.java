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
        for (Character ch : str.toCharArray()) {
            if (hashMap.containsKey(ch)){
                hashMap.put(ch,hashMap.get(ch)+1);
            }
        }
        LinkedHashMap<Character, Integer> linkedHashMap = new LinkedHashMap<>(hashMap);
        Integer[] array = new Integer[linkedHashMap.size()];
        for (int i = 0; i < linkedHashMap.size(); i++)
            array[i] = (Integer) linkedHashMap.values().toArray()[i];
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j+1]){
                    int in = array[j];
                    array[j] = array[j+1];
                    array[j+1] = in;
                }
            }
        }
        LinkedHashMap<Character, Integer> linkedHashMap2 = new LinkedHashMap<>();

        System.out.println(hashMap);
        System.out.println(hashMap);
    }
}
