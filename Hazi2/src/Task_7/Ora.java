/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task_7;

/**
 *
 * @author Saky
 */
public class Ora {
    public int code;
    public String name;
    public int start;

    public Ora() {
    }
    
    public Ora(int code, String name, int start) {
        this.code = code;
        this.name = name;
        if(start < 8 || start > 19){
            this.start = 8;
        }
        else{
            this.start = start;
        }
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    @Override
    public String toString() {
        return "Ora{" + "kod:" + code + ", nev=" + name + ", start=" + start + '}';
    }
    
}
