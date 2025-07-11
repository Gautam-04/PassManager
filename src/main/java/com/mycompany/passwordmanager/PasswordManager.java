/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.passwordmanager;

/**
 *
 * @author Gautam
 */
public class PasswordManager {

    public static void main(String[] args) {
       javax.swing.SwingUtilities.invokeLater(() -> {
            new PasswordUI().setVisible(true);
        });
    }
}
