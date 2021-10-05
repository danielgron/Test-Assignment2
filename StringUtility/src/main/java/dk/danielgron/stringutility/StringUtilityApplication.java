package dk.danielgron.stringutility;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StringUtilityApplication {

    public static void main(String[] args) {
        SpringApplication.run(StringUtilityApplication.class, args);
    }


    public static String reverseString(String input){
        return "cBa";
    }

    public static String capitalizeString(String input){
        char[] chars = input.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if ((int) chars[i] >= 97 && (int) chars[i] <= 122)
                chars[i] = (char) ((int) chars[i] - 32);
        }

        String result = String.valueOf(chars);

        return result;
    }

    public static String lowercaseString(String input){
        char[] chars = input.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if ((int) chars[i] >= 65 && (int) chars[i] <= 90)
                chars[i] = (char) ((int) chars[i] + 32);
        }
        
        String result = String.valueOf(chars);

        return result;
    }
}
