/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllocateArray;

import java.util.Scanner;

/**
 *
 * @author Miss Filipova
 */
public class AllocateArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr= new int[n];
        
        for (int i = 0; i <arr.length; i++) {
            arr[i]= i*5;
        }
        for (int i = 0; i <arr.length; i++) {
            System.out.println(arr[i]);
            
        }
    }

}
