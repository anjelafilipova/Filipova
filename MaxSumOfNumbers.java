/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxsumofnumbers;

import java.util.Scanner;

/**
 *
 * @author Miss Filipova
 */
public class MaxSumOfNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);      
        int N= sc.nextInt(); //желаното число
        int result=0;
        int count=0;
        int[] arr = new int[3];// запазваме пространство в масива за 3 елемента
        for (int i = 0; i <= N; i++) {
            while(N>0){
            N/=N/10;
            count++;
            }
            arr[i]=i;//въвежда желаните стойности
            
            /*/int first= arr[i];//234
            int second=arr[1];
            int last=arr[arr.length-1];            
            if (first<second) 
            {
            result=(first+second)* last;
            }
            else if (first>second) {
                result=first*(second+last);
            }
        }/*/
        System.out.println(arr);
        
    }
    }
}
