/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package display;

        
/**
 *
 * @author phank
 */
public class display {
    public void display(int index, int key, String mess, String messError){
        if(index==-1){
            System.out.println(messError);
        }else{
            System.out.println(mess+index);
        }
        
    }
}
