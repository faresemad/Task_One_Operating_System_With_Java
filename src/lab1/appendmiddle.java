/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

/**
 *
 * @author Fares Emad
 */
public class appendmiddle {
    public void appendMiddle(String originalString, String stringToBeInserted){
        String newString = "";
        int index = originalString.length() / stringToBeInserted.length();
        for (int i = 0; i < originalString.length(); i++){
            newString += originalString.charAt(i);
            if (i == index){
                newString += stringToBeInserted;
            }
        }
          System.out.println(newString);
    }
}
