package doctor;

import java.util.ArrayList;

public class control {
 manager mn = new manager();
    public void add() {
        System.out.println("***********Add doctor **************");
        try {
             String code;
        while (true) {
            code = validate.getString("Enter code: ", cst.recode);
            if (mn.findByCode(code) == null) {
                break;  // Exit loop if code is unique
            } else {
                view.displayMess("This code is already in use. Please enter a unique code.");
            }
        }
             String name = validate.getString("Enter name: ", cst.rename);
            String spe = validate.getString("ERnter spe: ", cst.respe);
            int avai = validate.getInt("Enter avai: ", cst.reavai);
            mn.add(new Doctor(code, name, spe, avai));
            System.out.println("add ok");
        } catch (Exception e) {
            view.displayMess(e.getMessage());
        }

    }

    public void Update() throws Exception {
        System.out.println("**************** Update Doctor ****************");
        String code = validate.getString("Enter Code: ", cst.recode);
        Doctor doc;
        doc = manager.findByCode(code);
        try {
            if (doc != null) {
                String name = validate.getString("Enter name: ", cst.rename);
                String spe = validate.getString("ERnter spe: ", cst.respe);
                String avai = validate.getString("Enter avai: ", cst.reavai);
                manager.update(code, name, spe, avai);
            }else{
                throw new Exception("Doctor not exist");
            }
                    
        } catch (Exception e) {
            view.displayMess("Error pls enter again");
        }
    }

    public void Delete() {
        System.out.println("************ Delete Doctor *******************");
        try {
            String code = validate.getString("Enter Code: ", cst.recode);
            manager.Delete(code);
        }catch(Exception e){
            view.displayMess(e.getMessage());
        }
    }
    public void search(){
        System.out.println("********* Search Doctor *******************");
        try{
        String text = validate.getString("Enter Text: ", cst.retext);
        ArrayList<Doctor> res = new ArrayList<>();
        res = manager.Search(text);
        
        if(res.isEmpty()){
            System.out.println("Doctor not exist");
        } else{
            System.out.println("Search results");
            
                view.displayList(res);
            
                    
        }
            
        }catch(Exception e){
            view.displayMess(e.getMessage());
        }
    }
}
