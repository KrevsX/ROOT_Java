/*******************************************************************************
 * Copyright (c) 2022. By.Kevin Alas
 * All rights reserved
 * Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 ******************************************************************************/

package JAVA_VIII.EventosJava;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MainForm {
    private JTextPane pricenName;
    private JTextPane taxPane;
    private JTextPane totalPane;
    private JButton btnCalculate;
    private JPanel taxTaxPanel;

    public ActionListener botonPulsado(){

        System.out.println("Holaa");
        return null;
    }
    public MainForm() {
        btnCalculate.addActionListener(botonPulsado());
        pricenName.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);

                String valorePrecio = pricenName.getText() + "t";
                pricenName.setText(valorePrecio);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("SwingTax");
        frame.setContentPane(new MainForm().taxTaxPanel);
        frame.setSize(600, 800);
        frame.setVisible(true);

    }
}
