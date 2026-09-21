package Lesson2;

import java.util.Random;

public class User {
    static String hash;
    
    static {
        hash = "";
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            char s = (char) random.nextInt(100);
            while (s == '\n' || s == ' ') {
                s = (char) random.nextInt(100);
            }

            sb.append(s);
        }
        hash = sb.toString();
    }
}
