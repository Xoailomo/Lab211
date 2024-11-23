package doctor;

import java.util.Scanner;


public class validate {
    private static Scanner sc = new Scanner(System.in);
    public static int getInt(String mess, String regex){
        while(true){
            System.out.println(mess);
            String s = sc.nextLine().toUpperCase().trim();
            if(s.matches(regex)){
                return Integer.parseInt(s);
            }
            else{
                System.out.println("pls input follow regex: "+ regex);
            }
        }
    }
    public static String getString(String mess, String regex){
        while(true){
            System.out.println(mess);
            String s = sc.nextLine().toUpperCase().trim();
            if(s.matches(regex) || s.isEmpty()){
                return s;
            }
            else{
                System.out.println("pls input follow regex: "+regex);
            }
        }
    }
    
}
