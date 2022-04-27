/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gi.utilities;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.text.JTextComponent;

/**
 *
 * @author DELL
 */
public class UIUtility {

    public static void setPlaceHolder(JTextComponent component, String hint) {
        System.out.println("msg from setplaceholder");
        component.setForeground(Color.GRAY);
        component.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (component.getText().equals(hint)) {
                    component.setText("");
                    component.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (component.getText().isEmpty()) {
                    component.setForeground(Color.GRAY);
                    component.setText(hint);
                }
            }
        });
    }
}
