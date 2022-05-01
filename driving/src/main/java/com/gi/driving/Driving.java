/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.gi.driving;

import com.gi.login.LoginFrame;
import javax.swing.JFrame;

/**
 *
 * @author DELL
 */
public class Driving {

    public static void main(String[] args) {
        
        LoginFrame lf = new LoginFrame();
        
        lf.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        lf.setVisible(true);
    }
}
