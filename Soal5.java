package soal5;

/**
 *
 * @author aulaw
 */
import java.util.Scanner;

public class Soal5 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int[] plat = new int[4];
    int gabungan = 0;

    for (int i = 0; i < 4; i++) {
      plat[i] = scan.nextInt();
      gabungan += plat[i];
    }

    if ((gabungan - 999999) % 5 == 0) {
      System.out.println("Berhenti");
    } else {
      System.out.println("Jalan");
    }
  }
}

