package doctor;

import java.util.ArrayList;


public class view {
    public static void menu(){
        System.out.println("*****Doctor management*****");
        System.out.println("1. Add");
        System.out.println("2. Update");
        System.out.println("3. Delete");
        System.out.println("4. Search");
        System.out.println("5. Exist");
    }
    public static void displayMess(String mess){
        System.out.println(mess);
    }
    public static void displayList(ArrayList<Doctor> list){
        displayMess( String.format("%5s | %15s | %15s | %15s", "Code","Name","Specialization","Availability"));
        for(Doctor doc : list){
            displayMess(String.format("%5s  %15s  %15s  %15s", 
                    doc.getCode(),doc.getName(),
                    doc.getSpecialization(),
                    doc.getAvailability()));
        }
    }
}
