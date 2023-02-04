package soal6;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author aulaw
 */
public class Soal6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger a = new BigInteger(scan.nextLine().trim());
        BigInteger b = new BigInteger(scan.nextLine().trim());

        // Menambahkan dua angka besar
        BigInteger sum = a.add(b);
        System.out.println(sum.toString());

        // Mengalikan dua angka besar
        BigInteger product = a.multiply(b);
        System.out.println(product.toString());
    }
    
}