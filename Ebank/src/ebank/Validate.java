package ebank;

import java.util.Scanner;

public class Validate {

    private static final Scanner SCANNER = new Scanner(System.in);

    private Validate() {

    }

    public static String getString(String messageInfo) {

        System.out.print(messageInfo);
        String str = SCANNER.nextLine().trim();
        return str;
    }

    public static int getInt(String message) {
        System.out.println(message);
        String result;
        do {
            result = SCANNER.nextLine();
            if (!result.matches("\\d+")) {
                System.out.println("Please input an integer number:");
            }
        } while (!result.matches("\\d+"));
        return Integer.parseInt(result);

    }

}
