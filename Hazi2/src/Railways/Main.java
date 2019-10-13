package Railways;

import java.util.*;

/**
 *
 * @author Saky
 */

class Datas{
    String railwayName;
    String worldName;
    int minHeight;
    int waitTime;

    public Datas(String railwayName, String worldName, int minHeight, int waitTime) {
        this.railwayName = railwayName;
        this.worldName = worldName;
        this.minHeight = minHeight;
        this.waitTime = waitTime;
    }

    public String getRailwayName() {
        return railwayName;
    }

    public String getWorldName() {
        return worldName;
    }

    public int getMinHeight() {
        return minHeight;
    }

    public int getWaitTime() {
        return waitTime;
    }



    @Override
    public String toString() {
        return railwayName + " (" + worldName + "): " + waitTime;
    }
    
    
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String line = sc.nextLine();
        
        int n = Integer.parseInt(line);
        
        ArrayList<Datas> list = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            line = sc.nextLine();
            String[] parts = line.split(";");
            
            list.add(new Datas(parts[0], parts[1], Integer.parseInt(parts[2]), Integer.parseInt(parts[3])));
            
        }
             
        Collections.sort(list, Comparator.comparing(Datas::getWaitTime)
        .thenComparing(Datas::getMinHeight, Comparator.reverseOrder())
        .thenComparing(Datas::getRailwayName)
        );
        
        Collections.sort(list, Comparator.comparing(Datas::getWaitTime) );
        
        list.forEach((adatok) -> {
            System.out.println(adatok.toString());
        });
        
    }
}
