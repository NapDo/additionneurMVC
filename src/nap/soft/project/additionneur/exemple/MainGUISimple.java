/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nap.soft.project.additionneur.exemple;

import nap.soft.project.additionneur.architecturemvc.AdditionneurModele;
import nap.soft.project.additionneur.implementation.Additionneur;
import nap.soft.project.additionneur.vue.AdditionneurVueSimple;
import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author Alain
 */
public class MainGUISimple extends JFrame{
        private AdditionneurModele modele ; 

    public MainGUISimple() {
	modele = new Additionneur() ; 
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setTitle("Additionneur");
	add(new AdditionneurSaisieCurseur(modele), BorderLayout.NORTH); 
	add(new AdditionneurVueSimple(modele), BorderLayout.CENTER); 
	pack() ; 
    }
    
        /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGUISimple().setVisible(true);
            }
        });
    }
}
