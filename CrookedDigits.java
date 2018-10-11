/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crookeddigits;

import java.util.Scanner;

/**
 *
 * @author Miss Filipova
 */
public class CrookedDigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int N = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);// получаваме всеки от символите по отделно 
            if (Character.isDigit(ch)) {//проверява дали е цифра(true) или не
                N += ch - '0';//добавяне към променливата всеки символ
                //'0' в аски кода е 48, 
                //така получаваме първият ни N за когото сме сигурни, че е цяло число
            }
        }
        //System.out.println(N);
        while (N > 9) {
            int newN = 0;
//нова променлива към която ще се присвоява пресметнатите стойности
            while (N > 0)//последната цифра на N да се добав към новата newN
            {
                newN += N % 10;//остатъка при деленето на 10 е последната цифра
                N /= 10;//разделя числото докато на сатигне до остатък 0 
            }
            N = newN;
        }
        System.out.println(N);

    }
}
