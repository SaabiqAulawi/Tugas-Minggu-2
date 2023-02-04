package soal3;

import java.util.Scanner;

/**
 *
 * @author aulaw
 */
public class Soal3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int value = 0;
        Scanner sc = new Scanner(System.in);
        String aritmethic = sc.nextLine();
        String parts[] = aritmethic.split(" ");
        int value1 = Integer.parseInt(parts[0]);
        int value2 = Integer.parseInt(parts[2]);
        switch(parts[1]){
            case("+") -> value = value1 + value2;
            case("-") -> value = value1 - value2;
            case("*") -> value = value1 * value2;
            case("/") -> value = value1 / value2;
            case("%") -> value = value1 % value2;
        }
        System.out.println(value);
    }
    
}
