/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.Scanner;
/**
 *
 * @author pscrusher101
 */
public class pot {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total= 0;
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            int pow = x%10;
            int num = x/10;
            
            total = (int) (total + Math.pow(num, pow));
        }
        System.out.println(total);
    }

}
