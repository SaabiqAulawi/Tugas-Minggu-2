
package soal4;

import java.util.Scanner;



/**
 *
 * @author aulaw
 */
public class Soal4 {
    private static final int SALARY = 500000;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int salary;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value :");
        int totalGoods = sc.nextInt();
        int totalMoney =  totalGoods * 50000;
        if(totalGoods > 80){
            salary = SALARY + (totalMoney * 35 / 100);
        }else if(totalGoods >= 40){
            salary = SALARY + (totalMoney * 25 / 100);
        }else if(totalGoods < 15){
            salary = SALARY + ( (totalGoods - 15) *50000* 15 / 100 );
        }else{
            salary = SALARY + ( 5000 * totalGoods );
        }
        System.out.println(salary);
    }
    
}
