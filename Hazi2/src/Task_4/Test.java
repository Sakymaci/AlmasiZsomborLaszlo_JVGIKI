/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task_4;

/**
 *
 * @author Saky
 */
public class Test {
    
    public static void rendezMaxSzallithatoTeherCsokkenoleg( TeherAuto[] teher ){
    
        for (int i=0;i<teher.length-1;i++) {
            for (int j=i+1;j<teher.length;j++) {
                if(teher[i].getMaxSzallithatoTeher() < teher[j].getMaxSzallithatoTeher()) {
                    TeherAuto tmp = teher[j];
                    teher[j] = teher[i];
                    teher[i] = tmp;
                }
            }
        }
        
    }
    
    public static int keresMaxMotorTeljesitmeny(Auto[] auto){
        
        int max = Integer.MIN_VALUE;
        
        for (Auto auto1 : auto) {
            if (max < auto1.getMotorTelljesitmeny()) {
                max = auto1.getMotorTelljesitmeny();
            }
        }
        
        return max;
    }
    
    public static void main(String[] args) {
        Auto[] autoArray = new Auto[10];
        
        autoArray[0] = new Auto("ASD123", 4);
        autoArray[1] = new Auto("SDF234", 3);
        autoArray[2] = new Auto("DFG345", 6);
        autoArray[3] = new Auto("FGH456", 2);
        autoArray[4] = new Auto("GHJ567", 4);
        autoArray[5] = new TeherAuto("QWE123", 9, 8);
        autoArray[6] = new TeherAuto("WER234", 20, 15);
        autoArray[7] = new TeherAuto("ERT345", 13, 10);
        autoArray[8] = new TeherAuto("RTZ456", 11, 7);
        autoArray[9] = new TeherAuto("TZU567", 3, 7);
        
        TeherAuto[] teherArray = new TeherAuto[10];
        teherArray[0] = new TeherAuto("ZUI678", 10, 9);
        teherArray[1] = new TeherAuto("UIO789", 6, 10);
        teherArray[2] = new TeherAuto("IOP891", 9, 7);
        teherArray[3] = new TeherAuto("OPA912", 2, 12);
        teherArray[4] = new TeherAuto("PAS641", 5, 6);
        teherArray[5] = new TeherAuto("YXC789", 24, 43);
        teherArray[6] = new TeherAuto("XCV852", 7, 7);
        teherArray[7] = new TeherAuto("CVB741", 9, 11);
        teherArray[8] = new TeherAuto("VBN963", 13, 7);
        teherArray[9] = new TeherAuto("BNM159", 12, 8);
        
        System.out.println("Biggest performance:");
        System.out.println(keresMaxMotorTeljesitmeny(autoArray));
        
        System.out.println("Sorted:");
        rendezMaxSzallithatoTeherCsokkenoleg(teherArray);
        for (TeherAuto teherArray1 : teherArray) {
            System.out.print(teherArray1.getMaxSzallithatoTeher() + " ");
        }
        
    }
}
