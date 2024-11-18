package ebank;

import java.util.Locale;

public class Main {

    public static Locale selectLanguage() {
        int choice;
        while (true) {
            System.out.println("---- Login Program ----");
            System.out.println("1. Vietnamese");
            System.out.println("2. English");
            System.out.println("3. Exit");
            choice = Validate.getInt("Your selection: ");
            switch (choice) {
                case 1:
                    return new Locale("vn", "VN");
                case 2:
                    return new Locale("en", "EN");

                default:
                    System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        Ebank e = new Ebank(new Locale("vn","VN"));
        String s = e.checkAccountNumber("123");
        System.out.println(s);
//        while (true) {
//            Locale locale = selectLanguage();
//            Ebank e = new Ebank(locale);
//            e.setLocale(locale);
//            Login.Login(e);
//            System.out.println("Login success! ");
//        }
    }
}
