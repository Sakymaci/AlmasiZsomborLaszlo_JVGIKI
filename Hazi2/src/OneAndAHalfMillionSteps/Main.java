/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OneAndAHalfMillionSteps;

import java.util.*;

/**
 *
 * @author Saky
 */

class Datas{
    String name;
    int countryWide;
    int local;

    public Datas(String name, int countryWide, int local) {
        this.name = name;
        this.countryWide = countryWide;
        this.local = local;
    }

    public String getName() {
        return name;
    }

    public int getCountryWide() {
        return countryWide;
    }

    public int getLocal() {
        return local;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}

public class Main {
    public static void main(String[] args) {
        
        ArrayList<Datas> list = new ArrayList<>();
        
        Scanner sc = new Scanner(System.in);
        
        String line = sc.nextLine();
        
        int n = Integer.parseInt(line);
        
        for(int i=0;i<n;i++){
            line = sc.nextLine();
            String[] parts = line.split(";");
            
            int helyi = 0;
            int orszagos = 0;
        
            for(int j=0;j<parts[1].length();j++){
                if(parts[1].charAt(j) == 'P' || parts[1].charAt(j) == 'S' || parts[1].charAt(j) == 'Z'){
                    helyi++;
                }
            
                if(parts[1].charAt(j) == 'K'){
                    orszagos++;
                }
            }
            
            list.add(new Datas(parts[0], orszagos, helyi));
        }
        
        Collections.sort(list, Comparator.comparing(Datas::getCountryWide, Comparator.reverseOrder())
        .thenComparing(Datas::getLocal, Comparator.reverseOrder())
        .thenComparing(Datas::getName));
        
        list.forEach((adatok) -> {
            System.out.println(adatok.toString());
        });
    }
}
