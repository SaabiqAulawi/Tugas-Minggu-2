package soal2;

import java.util.Scanner;

/**
 *
 * @author aulaw
 */

public class Soal2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputs = new String[3];

        for (int i = 0; i < 3; i++) {
            inputs[i] = sc.nextLine();
        }

        System.out.println("===============");
        for (int i = 0; i < 3; i++) {
            String[] parts = inputs[i].split(" ");
            String firstPart = parts[0].toLowerCase();
            int secondPart = Integer.parseInt(parts[1]);
            
            System.out.printf("%-15s%03d\n", firstPart, secondPart);
        }
        System.out.println("===============");
    }   
}