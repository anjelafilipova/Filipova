/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catalannumbers;

import java.util.Scanner;

/**
 *
 * @author Miss Filipova
 */
public class CatalanNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        if (1 <= n && n <= 100)
        {
            int numerator = 1;

            for (int i = 1; i <= (2 * n); i++)
            {
                
                numerator *= i; 
            }

            int denominator = 1;

            for (int i = 1; i <= (n + 1); i++)
            {
               
                denominator *= i;
            }

            for (int i = 1; i <= n; i++)
            {
                
                denominator *= i;
            }

            System.out.print(numerator / denominator);
        }
        else           
        {
            //System.out.println(i);
        }

    }
    }
    

