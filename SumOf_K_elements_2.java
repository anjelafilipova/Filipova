/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumof_k_elements_2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Miss Filipova
 */
public class SumOf_K_elements_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n= sc.nextInt();
        int k=sc.nextInt();
        int [] arr= new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int sum=0;
        for (int i = arr.length-k; i <arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println(sum);
        
    }
    
}
