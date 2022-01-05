package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        LinkedHashMap<Character, Integer> consonants = new LinkedHashMap<Character, Integer>();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.replaceAll("\\s", "");
        char[] strArray = s.toCharArray();

        for (char c : strArray){

            if(c == 'a'|| c == 'e'|| c == 'i'|| c == 'o'|| c == 'u')
                continue;


            else if(consonants.containsKey(c))
                    consonants.put(c, consonants.get(c) + 1);

            else
                consonants.put(c, 1);
        }

        for (Map.Entry entry : consonants.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue()+" ");
        }
    }
}