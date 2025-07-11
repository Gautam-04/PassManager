/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.passwordmanager;

/**
 *
 * @author Gautam
 */
import javax.swing.*;

public class AddPanelDialog extends JDialog {
    
    public AddPanelDialog(JFrame parent) {
        super(parent, "Add Credential", true); // true = modal
        AddPanel addPanel = new AddPanel();

        // Optional: set preferred size for the panel/dialog
        add(addPanel);
        pack(); // automatically size to fit content
        setLocationRelativeTo(parent); // center on screen
    }
}



