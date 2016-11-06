/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samochod;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractButton;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author student
 */

public class Ramka extends JFrame{
 
 public Ramka(){
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel buttonPanel = new JPanel(new GridLayout(0,2));
        
        JMenuBar pasekMenu = new JMenuBar();
        JMenu menuPlik = new JMenu("Polisa");
        pasekMenu.add(menuPlik);
        
        JMenuItem opcjaDrukuj = new JMenuItem("Drukuj");
        menuPlik.add(opcjaDrukuj);
        
        JMenuItem opcjaZapisz = new JMenuItem("Zapisz");
        menuPlik.add(opcjaZapisz);
        menuPlik.addSeparator();
        
        JMenuItem opcjaWyjdz = new JMenuItem("Wyjdz");
        opcjaWyjdz.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
               System.exit(0);
            }
        });
        menuPlik.add(opcjaWyjdz);
        

        
        
        JLabel label = new JLabel("Imie: ");
        label.setDisplayedMnemonic(KeyEvent.VK_N);
        JLabel label1 = new JLabel("Nazwisko: ");
        label1.setDisplayedMnemonic(KeyEvent.VK_N);
        JLabel label2 = new JLabel("Marka auta: ");
        label2.setDisplayedMnemonic(KeyEvent.VK_N);
        JLabel label3 = new JLabel("Tapicerka: ");
        label3.setDisplayedMnemonic(KeyEvent.VK_N);
        
        
        JTextField textField = new JTextField();
        textField.setHorizontalAlignment(JTextField.CENTER);
        JTextField textField1 = new JTextField();
        textField1.setHorizontalAlignment(JTextField.CENTER);
        
        String[]sList = new String[]{"Alfa Romeo","BMW","Citroen","Mazeda","Opel","Peugeot","Volkswagen"};
        JComboBox<String> seasons = new JComboBox<>(sList);
        seasons.addItemListener((ItemEvent e)->{
            Object item = e.getItem();
            if (e.getStateChange()== ItemEvent.SELECTED){
            }
        });
        /*
        ButtonGroup tapicerka = new ButtonGroup();
        JRadioButton[] rodzaj = new JRadioButton[6];
        rodzaj[0]= new JRadioButton("Skorzana");
        rodzaj[1]= new JRadioButton("Material");
        for(int i=0; i<rodzaj.length;i++) tapicerka.add((AbstractButton) rodzaj[i]);
        Box b1 = Box.createVerticalBox();
        for(int i=0; i<rodzaj.length;i++)b1.add(rodzaj[i]);
        */
        JCheckBox jCheckBox = new JCheckBox("ABS");
        JCheckBox jCheckBox1 = new JCheckBox("Klimatyzacja");
        
        TextArea poletekst = new TextArea( "", 5, 30 );
        
        label.setLabelFor(textField);
        add(pasekMenu,BorderLayout.PAGE_START);
        add(buttonPanel, BorderLayout.CENTER);
        buttonPanel.add(label);
        buttonPanel.add(textField);
        buttonPanel.add(label1);
        buttonPanel.add(textField1);
        buttonPanel.add(label2);
        buttonPanel.add(seasons);
        buttonPanel.add(label3);
       // buttonPanel.add(ButtonGroup,tapicerka);
        buttonPanel.add(jCheckBox);
        buttonPanel.add(jCheckBox1);

        buttonPanel.add(poletekst,BorderLayout.PAGE_END);
        
        setLocation(500,500);
        setSize(500,500);
        setTitle("POLISA UBEZPIECZENIOWA");
        setVisible(true);
 }
 
    
}
