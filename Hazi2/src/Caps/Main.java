package Caps;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Saky
 */

class Data{
    String name;
    String before;

    public Data(String name, String before) {
        this.name = name;
        this.before = before;
    }

    public String getName() {
        return name;
    }

    public String getBefore() {
        return before;
    }
    
}

public class Main {
    
    public static void main(String[] args) {
        
        ArrayList<Data> list = new ArrayList<>();
        
        Scanner sc = new Scanner(System.in);        
        
        String line = sc.nextLine();
        
        String[] parts = line.split(";");
         
        int n = Integer.parseInt(parts[0]);
        
        String first = parts[1];
        
        String whatches = parts[2];
        
        String[] block = new String[n];
        block[0] = first;
        
        for(int i=0;i<n-1;i++){
            line = sc.nextLine();
            
            String[] parts2 = line.split(";");
            
            list.add(new Data(parts2[0], parts2[1]));
        }
        
           
        for (int i = 1; i < block.length; i++) {
            for (int j = 0; j < list.size(); j++) {
                if(block[i-1].equals(list.get(j).getBefore())){
                    block[i] = list.get(j).getName();
                    break;
                }
            }
        }
        
        int red = 0;
        int blue = 0;
        int counter = 0;
        
        
        while(!block[counter].equals(whatches)){
            if( (counter % 2) == 0){
                red++;
            }
            else{
                blue++;
            }
            counter++;
        }

        System.out.println(red + " " + blue);
        
        }
    }