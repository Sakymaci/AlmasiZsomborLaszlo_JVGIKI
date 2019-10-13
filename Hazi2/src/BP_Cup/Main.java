package BP_Cup;

import java.util.*;

/**
 *
 * @author Saky
 */

class Data{
    String year;
    String month;
    String day;
    String tourName;
    int[] secDist;

    public Data(String year, String month, String day, String tourName, int[] reszTav) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.tourName = tourName;
        this.secDist = reszTav;
    }

    public String getYear() {
        return year;
    }

    public String getMonth() {
        return month;
    }

    public String getDay() {
        return day;
    }

    public String getTourName() {
        return tourName;
    }

    public int[] getSecDist() {
        return secDist;
    }

    
    public int getDistAdded(){
        
        int added = 0;
        for(int i=0;i<secDist.length;i++){
            added += secDist[i];
        }
        
        return added;
    }
    
    @Override
    public String toString() {
        return year + ";" + month + ";" + day + ";" + tourName; 
    }
}

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String line = sc.nextLine();
        
        int n = Integer.parseInt(line);
        
        ArrayList <Data> list = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            line = sc.nextLine();
            String[] parts = line.split(";");
            
            int[] reszTavok = new int[parts.length-4];
            int counter = 0;
            for(int j = 4;j<parts.length;j++){
                reszTavok[counter] = Integer.parseInt(parts[j]);
                counter++;
            }
            
            list.add(new Data(parts[0], parts[1], parts[2], parts[3], reszTavok));
        }

        Collections.sort(list, Comparator.comparing(Data::getYear).thenComparing(Data::getMonth).thenComparing(Data::getDay).thenComparing(Data::getTourName));

        int max = 0;
        for(Data adatok : list){
            if(adatok.getDistAdded() > max){
                max = adatok.getDistAdded();
            }
        }
        
        for(Data adatok: list){
            if(adatok.getDistAdded() == max){
                System.out.println(adatok.toString());
            }
        }
        
        
    }
    
}
