/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package millestokilometers;

import java.util.Scanner;

/**
 *
 * @author Miss Filipova
 */
public class MillesToKilometers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter milles: ");
        int m = sc.nextInt();
        int km = m * 1609;
        System.out.println("Km: "+km);
    }
    
}
