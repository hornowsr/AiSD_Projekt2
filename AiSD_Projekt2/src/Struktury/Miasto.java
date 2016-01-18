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

    private Polaczenie[] polaczenia;
    private String nazwa;
    private int postoj;

    public Miasto(String nazwa, int postoj) {
        this.nazwa = nazwa;
        this.postoj = postoj;
    }

    public Polaczenie[] getPolaczenia() {
        return this.polaczenia;
    }

    public int getPostoj() {
        return this.postoj;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void dodajPolaczenie() {

    }

}
