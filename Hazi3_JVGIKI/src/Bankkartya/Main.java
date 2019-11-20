/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bankkartya;

import java.util.Scanner;

/**
 *
 * @author Saky
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] calc = new int[16];
        while(sc.hasNextLine()){
            int tmp = 0;
            String str = sc.nextLine();
            for (int i = 0; i < 16; i++) {
                if(i%2==0){
                    calc[i] = 2 * Integer.parseInt(str, i);
                    while(calc[i]>10)
                        calc[i] -= 9;
                }
                else
                    calc[i] = Integer.parseInt(str, i);
            }
            for (int i = 0; i < 16; i++) {
                tmp += calc[i];
                tmp = tmp % 10;
            }
            if(tmp == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }                
    }
}
