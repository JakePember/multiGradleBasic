package application;

import MessageOfDay.MessageOfDay;
import org.json.simple.parser.JSONParser;

public class Application {
    public static void main(String[] args) {
        System.out.println("Goodbye cruel world ...");
        MessageOfDay.message();

        JSONParser json = new JSONParser();
        System.out.println(json);
    }
}
