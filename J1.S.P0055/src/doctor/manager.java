package doctor;

import java.util.ArrayList;


public class manager {
private static ArrayList<Doctor> list;

    public manager() {
    list = new ArrayList<>();
    }
    public static ArrayList<Doctor> getList(){
        return new ArrayList<>(list);
    }
    public static Doctor findByCode(String code){
        code = code.trim().toUpperCase();
        for(Doctor doc : list){
            if(doc.getCode().equalsIgnoreCase(code)){
                return doc;
            }
        }
        return null;
    }
    public static void add(Doctor doc) throws Exception{
        if(findByCode(doc.getCode())==null){
            list.add(doc);
        }else{
            throw new Exception("doctor is existed");
        }
    }
    public static void update(String code, String name, String spe, String avai) throws Exception{
        Doctor doc;
        doc = findByCode(code);
        if(doc==null){
            throw new Exception("Doctor not existed");
        }else{
            if(!name.trim().isEmpty()){
                doc.setName(name);
            }
            if(!spe.trim().isEmpty()){
                doc.setSpecialization(avai);
            }
            if(!avai.trim().isEmpty()){
                try{
                    int n = Integer.parseInt(avai);
                    doc.setAvailability(n);
                }catch(Exception e){
                    throw new Exception("Digit only");
                }
            }
        }
        
    }
    public static void Delete(String code) throws Exception{
        Doctor doc;
        doc =findByCode(code);
        if(doc == null){
            throw new Exception("Doctor not exist");
        }else{
            list.remove(doc);
        }
    }
    public static ArrayList<Doctor> Search(String text)throws Exception{
        ArrayList<Doctor> nlist = new ArrayList<>();
        String info = text.trim().toUpperCase();
        if(info.isEmpty()){
            return getList();
        }
                
        for(int i = 0 ; i< list.size();i++){
            if(list.get(i).getCode().toUpperCase().contains(info)
                    || list.get(i).getName().toUpperCase().contains(info)
                    || list.get(i).getSpecialization().toUpperCase().contains(info)
                    || list.get(i).getAvailability() == Integer.parseInt(info)){
                nlist.add(list.get(i));
            }
        }
        
        return nlist;
    }
    

}
