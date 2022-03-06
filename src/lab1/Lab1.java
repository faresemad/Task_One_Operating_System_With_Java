package lab1;
import java.util.Scanner;

public class Lab1 {

    public static void main(String[] args) {
        // TODO code application logic here
            mariopyramid mp = new mariopyramid();
            mp.marioPyramid();
//=================================================================
          String sequance = "fares";
          vowelRemove ne = new vowelRemove();
          ne.removeVowel(sequance);
//=================================================================
          charLocator n = new charLocator();
          n.locatorChar("this is javaSript", "i");
//=================================================================
            appendmiddle am = new appendmiddle();
            am.appendMiddle("fares", "emad");
//=================================================================
            eraeOfChape aoc = new eraeOfChape();
            aoc.areaChape(12, 3);
            aoc.area();
    }
   
}
