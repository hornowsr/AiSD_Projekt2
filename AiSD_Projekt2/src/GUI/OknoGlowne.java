/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Struktury.BazaMiast;
import Struktury.Miasto;
import aisd_projekt2.Dijkstra;

/**
 *
 * @author kuzniarg
 */
public class OknoGlowne extends javax.swing.JFrame {

    private BazaMiast baza = new BazaMiast();
    private OknoWybierzN oknoWyboruN = new OknoWybierzN(baza);

    public OknoGlowne() {
        initComponents();
        init();
    }

    private void init() {

        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRysuj = new GUI.OknoRysuj();
        przyciskRysowania = new javax.swing.JButton();
        przyciskGeneracjiDanych = new javax.swing.JButton();
        przyciskWyznaczTrase = new javax.swing.JButton();
        poleSkad = new javax.swing.JTextField();
        poleDokad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AiSD Projekt 2");

        javax.swing.GroupLayout panelRysujLayout = new javax.swing.GroupLayout(panelRysuj);
        panelRysuj.setLayout(panelRysujLayout);
        panelRysujLayout.setHorizontalGroup(
            panelRysujLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 709, Short.MAX_VALUE)
        );
        panelRysujLayout.setVerticalGroup(
            panelRysujLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 637, Short.MAX_VALUE)
        );

        przyciskRysowania.setText("Rysuj");
        przyciskRysowania.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                przyciskRysowaniaActionPerformed(evt);
            }
        });

        przyciskGeneracjiDanych.setText("Generuj dane");
        przyciskGeneracjiDanych.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                przyciskGeneracjiDanychActionPerformed(evt);
            }
        });

        przyciskWyznaczTrase.setText("Wyznacz Trasę");
        przyciskWyznaczTrase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                przyciskWyznaczTraseActionPerformed(evt);
            }
        });

        poleSkad.setText("Początek");
        poleSkad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                poleSkadMouseClicked(evt);
            }
        });
        poleSkad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poleSkadActionPerformed(evt);
            }
        });

        poleDokad.setText("Koniec");
        poleDokad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                poleDokadMouseClicked(evt);
            }
        });

        jLabel1.setText("Wykonali:");

        jLabel2.setText("Grzegorz Kuźniarski");

        jLabel3.setText("Rafał Hornowski");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(panelRysuj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(przyciskGeneracjiDanych, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                        .addComponent(przyciskRysowania, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                        .addComponent(poleDokad, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(poleSkad)
                        .addComponent(przyciskWyznaczTrase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(przyciskGeneracjiDanych)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(przyciskRysowania)
                        .addGap(23, 23, 23)
                        .addComponent(poleSkad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(poleDokad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(przyciskWyznaczTrase)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addComponent(panelRysuj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void przyciskRysowaniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_przyciskRysowaniaActionPerformed
        if (baza.getN() > 0) {
            panelRysuj.rysuj(baza);
        }
    }//GEN-LAST:event_przyciskRysowaniaActionPerformed

    private void przyciskGeneracjiDanychActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_przyciskGeneracjiDanychActionPerformed
        oknoWyboruN.setVisible(true);
    }//GEN-LAST:event_przyciskGeneracjiDanychActionPerformed

    public int wynik[];
    private void przyciskWyznaczTraseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_przyciskWyznaczTraseActionPerformed
        przyciskRysowania.doClick();
        
        if (baza.getN() < 1) {
            return;
        }

        int poczatek = baza.znajdzMiasto(poleSkad.getText());
        int trasa = baza.znajdzMiasto(poleDokad.getText());

        if (poczatek < 0 || trasa < 0) {
            if (poczatek < 0) {
                poleSkad.setText("Błąd");
            }
            if (trasa < 0) {
                poleDokad.setText("Błąd");
            }
            return;
        }

        wynik = new int[baza.getN()];
        Dijkstra algo = new Dijkstra();
        wynik = algo.Dijktra(baza, poczatek);

        while (trasa != -1) {
            int stara = trasa;
            trasa = wynik[stara];
            if (trasa != -1) {
                this.panelRysuj.zaznaczDroge(stara, trasa);
            } else {
                this.panelRysuj.zaznaczDroge(stara, poczatek);
            }
        }
    }//GEN-LAST:event_przyciskWyznaczTraseActionPerformed

    private void poleSkadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poleSkadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_poleSkadActionPerformed

    private void poleSkadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_poleSkadMouseClicked
        poleSkad.setText(null);
    }//GEN-LAST:event_poleSkadMouseClicked

    private void poleDokadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_poleDokadMouseClicked
        poleDokad.setText(null);
    }//GEN-LAST:event_poleDokadMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private GUI.OknoRysuj panelRysuj;
    private javax.swing.JTextField poleDokad;
    private javax.swing.JTextField poleSkad;
    private javax.swing.JButton przyciskGeneracjiDanych;
    private javax.swing.JButton przyciskRysowania;
    private javax.swing.JButton przyciskWyznaczTrase;
    // End of variables declaration//GEN-END:variables
}
