/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;
import java.util.Scanner;
/**
 *
 * @author Fares Emad
 */
public class mariopyramid {
    public void marioPyramid(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Mario Pyramid Number: ");
        int mar = sc.nextInt();
        for(int i=0;i<=mar;i++){
        System.out.println(" ".repeat(mar-i)+"*".repeat(i));
        }
    }
}
