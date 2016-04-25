/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Accueil;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


/**
 *
 * @author Utilisateur
 */
public class essaiSolo extends javax.swing.JFrame{
    
    public essaiSolo(){
        initialise();
    }
    
    private void initialise(){
        
        setSize(800,500);
        desktopPane = new javax.swing.JDesktopPane();
        type = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        marque = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        test = new javax.swing.JComboBox<>();
        
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        
        desktopPane.setBackground(new java.awt.Color(206, 206, 206));
        
        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Voiture", "Moto", "Voiture ou Moto" }));
        desktopPane.add(type);
        type.setBounds(320, 90, 120, 20);
        
        jLabel1.setText("Type de véhicule");
        desktopPane.add(jLabel1);
        jLabel1.setBounds(210, 90, 90, 20);
      
        
        marque.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Audi", "BMW", "Buick", "Honda", "Hyundai", "Kia", "Lexus", "Mazda", "Mini", "Peugeot", "Porsches", "Subaru", "Toyota" }));
        desktopPane.add(marque);
        marque.setBounds(320, 90, 120, 20);
        
        type.setSelectedItem(null);
        
        type.addItemListener(new ItemListener() {          
            @Override
            public void itemStateChanged(ItemEvent e){
                Object item = type.getSelectedItem();
                if("Voiture".equals(item)){
                       
                    marque.removeAllItems();
                    marque.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Audi", "BMW", "Buick", "Honda", "Hyundai", "Kia", "Lexus", "Mazda", "Mini", "Peugeot", "Porsches", "Subaru", "Toyota" }));
                    
                  
                }
                else if("Moto".equals(item)){
                        
                    marque.removeAllItems();
                    marque.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aprilia", "Beta", "BMW-Moto", "Derbi", "Ducati", "Harley-Davidson", "Honda-Moto", "Kawasaki", "KTM", "Kymco", "MBK", "Peugeot-Moto", "Suzuki", "Triumph", "Yamaha" }));
                    
                 
                }
                else if("Voiture ou Moto".equals(item)){
                       
                    marque.removeAllItems();
                    marque.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aprilia", "Audi", "Beta", "BMW", "BMW-Moto", "Buick", "Derbi", "Ducati", "Harley-Davidson", "Honda", "Honda-Moto", "Hyundai", "Kawasaki", "Kia", "KTM", "Kymco", "Lexus", "Mazda", "MBK", "Mini", "Peugeot", "Porsches", "Peugeot-Moto", "Subaru", "Suzuki", "Toyota", "Triumph", "Yamaha" }));
                    
                     
                }
            }
        });
        getContentPane().add(marque);
        
        
        jLabel2.setText("Marque du véhicule");
        desktopPane.add(jLabel2);
        jLabel2.setBounds(210, 90, 90, 20);
        
        
        
        menuBar.setBackground(new java.awt.Color(206, 206, 206));
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(type, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marque, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(413, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(261, Short.MAX_VALUE))
        );
        
    }
    
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JComboBox<String> type;
    private javax.swing.JComboBox<String> marque;
    private javax.swing.JComboBox<String> test;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar menuBar;
    

    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(essaiSolo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(essaiSolo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(essaiSolo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(essaiSolo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new essaiSolo().setVisible(true);
            }
        });
    }
}
