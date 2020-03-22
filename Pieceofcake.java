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
public class Pieceofcake {
        public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();   
        int h = sc.nextInt();
        int v = sc.nextInt();
        int area = Math.max(h, n-h)*Math.max(v, n-v)*4;
        System.out.println(area);
        }
    
    
}
