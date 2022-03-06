/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

/**
 *
 * @author Fares Emad
 */
public class vowelRemove {
    public void removeVowel(String sequance){
    String[] newStr = sequance.toLowerCase().split("");
    String[] vowels = {"a","e","o","i","u"};
    for (String letr : newStr){
        for (String lt:vowels){
            if(letr.contains(lt)){
                letr = letr.replace(lt,"");
            }
        }
        System.out.println(letr);
    }
    }
}
