/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longestsequenceofequal_2;

import java.util.Scanner;

/**
 *
 * @author Miss Filipova
 */
public class LongestSequenceofEqual_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = 0;// пази най-дългата редица
        int current = 1;//текуща дължина

        for (int i = 0; i <arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {//сегашното число = на предишното
                current++;
               max = Math.max(max, current);

            } else {
                max = Math.max(max, current);
                current = 1;
            }
        }
        System.out.println(max);

    }

}
