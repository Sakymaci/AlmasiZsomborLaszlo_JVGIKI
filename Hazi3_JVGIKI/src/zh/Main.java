/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zh;

import java.util.Scanner;

/**
 *
 * @author Saky
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hallgato[] t = new Hallgato[Integer.parseInt(sc.nextLine())];
        for (Hallgato hallgato : t) {
            String[] tmp = sc.nextLine().split(" ");
            Boolean bol = false;
            if(tmp[1].equals("igaz"))
                        bol = true;
            hallgato = new Hallgato(Integer.parseInt(tmp[0]), bol);
        }
        
        for (Hallgato hallgato : t) {
            if(hallgato.dolgozatotIr().megfelelt())
                System.out.println("Megfelelt");
            else
                System.out.println("Nem felelt meg");
        }
    }
}
