/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samochod;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author student
 */

public class Ramka extends JFrame{
 
 public Ramka(){
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        /*JMenuBar pasekMenu = new JMenuBar();
        JMenu menuPlik = new JMenu("Plik");
        pasekMenu.add(menuPlik);
        
        JMenuItem opcjaPolisa = new JMenuItem("Polisa");
        menuPlik.add(opcjaPolisa);
        
        JMenuItem opcjaDrukuj = new JMenuItem("Drukuj");
        menuPlik.add(opcjaDrukuj);
        menuPlik.addSeparator();
        
        JMenuItem opcjaZapisz = new JMenuItem("Zapisz");
        menuPlik.add(opcjaZapisz);
        */

        
        JPanel buttonPanel = new JPanel(new BorderLayout());
        JLabel label = new JLabel("imie: ");
        label.setDisplayedMnemonic(KeyEvent.VK_N);
        
        JTextField textField = new JTextField();
        textField.setHorizontalAlignment(JTextField.CENTER);
       
        label.setLabelFor(textField);
        buttonPanel.add(label, BorderLayout.WEST);
        buttonPanel.add(textField, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.NORTH);
        //add(pasekMenu,BorderLayout.NORTH);
        
        setLocation(500,500);
        setSize(500,500);
        setVisible(true);
 }
 
    
}
