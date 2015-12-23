/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Struktury;

/**
 *
 * @author kuzniarg
 */
public class Miasto {
    
    private Polaczenie [] polaczenia;
    private int postoj;
    
    public Miasto(int n, int postoj){
        polaczenia = new Polaczenie[n];
        this.postoj=postoj;
    }
    
    public Polaczenie[] polaczeniaW(){
        return this.polaczenia;
    }
    
    public int postujW(){
        return this.postoj;
    }
    
}
