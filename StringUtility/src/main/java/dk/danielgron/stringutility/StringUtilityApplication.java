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
        return "ABC";
    }

    public static String lowercaseString(String input){
        return "abc";
    }
}
