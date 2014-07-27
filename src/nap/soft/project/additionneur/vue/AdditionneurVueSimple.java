/*
 * Td7 du cours d'ALG2G.
 */

package nap.soft.project.additionneur.vue;

import nap.soft.project.additionneur.architecturemvc.AdditionneurModele;
import nap.soft.project.additionneur.architecturemvc.Etat;
import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *Représente la vue additionneurSimple.
 * @author  g35991(Tuncer Can.)
 */
public class AdditionneurVueSimple extends AbstractAdditionneurVue {

    /** Creates new form AdditionneurVueSimple */
    public AdditionneurVueSimple() {
        initComponents();
    }

     /** Creates new form AdditionneurVueSimple */
    public AdditionneurVueSimple(AdditionneurModele aModele) {
        initComponents();
        setModele(aModele); 
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        monNombreDecimal1 = new nap.soft.project.additionneur.vue.outils.MonNombreDecimal();
        jLabel6 = new javax.swing.JLabel();
        monNombreDecimal2 = new nap.soft.project.additionneur.vue.outils.MonNombreDecimal();
        jLabel7 = new javax.swing.JLabel();
        monNombreDecimal3 = new nap.soft.project.additionneur.vue.outils.MonNombreDecimal();

        setPreferredSize(new java.awt.Dimension(600, 50));
        setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 5));
        add(monNombreDecimal1);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("+");
        add(jLabel6);
        add(monNombreDecimal2);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("=");
        add(jLabel7);
        add(monNombreDecimal3);
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void notifieChangement() {
       Etat e =  getModele().getEtat() ;  
       monNombreDecimal1.setNombre(e.getTerme1());
       monNombreDecimal2.setNombre(e.getTerme2());
       monNombreDecimal3.setNombre(e.getSomme());
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private nap.soft.project.additionneur.vue.outils.MonNombreDecimal monNombreDecimal1;
    private nap.soft.project.additionneur.vue.outils.MonNombreDecimal monNombreDecimal2;
    private nap.soft.project.additionneur.vue.outils.MonNombreDecimal monNombreDecimal3;
    // End of variables declaration//GEN-END:variables

    public static void main (String[] args) {
        JFrame jf =  new JFrame() ; 
        jf.add(new AdditionneurVueSimple(), BorderLayout.CENTER) ; 
        jf.pack() ; 
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
              
    }
}