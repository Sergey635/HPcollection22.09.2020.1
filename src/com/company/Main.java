package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        String harry = new String(Files.readAllBytes(Paths.get("C:\\Users\\Java01\\Desktop\\Harry.txt")));

    /*    System.out.println(harry.substring(0, 200));
        System.out.println(harry.length());*/

        harry = harry.toLowerCase().replaceAll("[^a-z ]", " ");

    /*    System.out.println(harry.substring(0, 200));*/

        String[] wordsArray = harry.split(" +");

     /*   for (int i = 0; i < 20; i++) {
            System.out.println(wordsArray[i]);
        }*/
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < wordsArray.length; i++) {
            if (map.containsKey(wordsArray[i])) {
                Integer value = map.get(wordsArray[i]);

                map.put(wordsArray[i], value + 1);
            } else {
                map.put(wordsArray[i], 1);
            }
        }
        map.entrySet().stream().forEach(item -> {
            if (item.getValue() == 111)
                System.out.println(item.getKey() + " - " + item.getValue());
        });
    }
}
