/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EngHunDicti;

/**
 *
 * @author Saky
 */


import java.util.*;


class Datas{
    String english;
    String hungarian;

    public Datas(String angol, String magyar) {
        this.english = angol;
        this.hungarian = magyar;
    }

    public String getEnglish() {
        return english;
    }

    public String getHungarian() {
        return hungarian;
    }
    
    
    
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String line = sc.nextLine();
        
        int n = Integer.parseInt(line);
        
        ArrayList<Datas> list;
        list = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            line = sc.nextLine();
            
            String[] parts = line.split(":");
            
            list.add(new Datas(parts[0], parts[1]));
            
        }
        
        Collections.sort(list, Comparator.comparing(Datas::getEnglish).thenComparing(Datas::getHungarian));
        
        list.forEach((adatok) -> {
            System.out.println(adatok.getEnglish() + ";" + adatok.getHungarian());
        });
        
    }
    
}
