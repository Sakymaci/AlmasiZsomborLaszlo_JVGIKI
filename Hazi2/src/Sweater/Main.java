/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sweater;

import java.util.*;

/**
 *
 * @author Saky
 */

class Datas{
    String cityName;
    int temperature;

    public Datas(String cityName, int temperature) {
        this.cityName = cityName;
        this.temperature = temperature;
    }

    public String getCityName() {
        return cityName;
    }

    public int getTemperature() {
        return temperature;
    }


    @Override
    public String toString() {
        return cityName + " (" + temperature + ")";
    }
    
    
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String line = sc.nextLine();
        
        String[] parts = line.split(" ");
        
        int n = Integer.parseInt(parts[0]);
        
        String varos = parts[1];
        
        int temperature = 0;
        
        ArrayList<Datas> list = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            line = sc.nextLine();
            String[] parts2 = line.split(":");
            
            list.add(new Datas(parts2[0], Integer.parseInt(parts2[1])));
            
        }
        
        boolean benneVan = false;
        for(Datas adatok : list){
            if(adatok.getCityName().equals(varos)){
                benneVan = true;
                temperature = adatok.getTemperature();
                break; 
            }
        }
        
        if(!benneVan){
            System.out.println("Missing data");
        }
        else{
            Collections.sort(list, Comparator.comparing(Datas::getTemperature, Comparator.reverseOrder()).thenComparing(Datas::getCityName)); //sorba rendezes: homerseklet csokkeno, varosnev novekvo
            for(Datas adatok : list){
                if(adatok.getTemperature() > temperature){
                    System.out.println(adatok.toString());
                }
            }
        }
    }
}
