package soal5;

/**
 *
 * @author aulaw
 */
import java.util.Scanner;

public class Soal5 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String plat = scan.nextLine();
    String parts[] = plat.split(" ");
    String platConvert = parts[0]+ parts[1] + parts[2] + parts [3];
    long value = Long.parseLong(platConvert);
    if (( value- 999999) % 5 == 0) {
      System.out.println("Berhenti");
    } else {
      System.out.println("Jalan");
    }
  }
}

