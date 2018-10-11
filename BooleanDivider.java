/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booleandivider;

import java.util.Scanner;

/**
 *
 * @author Miss Filipova
 */
public class BooleanDivider {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();//въведено число
        int div=2;//делител, ако се дели значи не е просто
        int MaxDiv= (int) Math.sqrt(N);//проверка
        boolean prime=true;
        
        if (div<=MaxDiv) {//
            if (N % div == 0) {
                prime=false; 
            }
            //div++;
            System.out.println(prime);
        }
    }
    
}
