/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;
import java.util.ArrayList;
/**
 *
 * @author Fares Emad
 */
public class charLocator {
    public void locatorChar(String sequance , String k){
        String[] seq = sequance.split("");
        ArrayList<Integer> pos =new ArrayList<Integer>();
//        pos.add(4);
        for(int i = 0 ; i<seq.length;i++){
            if(seq[i].equals(k)){
                pos.add(i);
            }
        }
        System.out.println(pos);
        
    }
}
