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
public class Polaczenie {
    
    private int predkosc;
    private int droga;
    
    public Polaczenie(int predkosc, int droga){
        this.predkosc = predkosc;
        this.droga = droga;
    }
    
    public int getPredkosc(){
        return this.predkosc;
    }
    
    public int getDroga(){
        return this.droga;
    }
}
