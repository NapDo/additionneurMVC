/**
 * Td7 du cours d'ALG2G.
 */

package nap.soft.project.additionneur.vue.outils;

/**
 *  Présentation d'un nombre hexadécimal.
 */
public class MonNombreHexa extends javax.swing.JPanel {

    /**
     * Creates new form MonNombreDecimal
     */
    public MonNombreHexa() {
        initComponents();
    }

    /**
     * assigne la valeur fournie au nombre
     */
    public void setNombre(int i){ 
        jLabel1.setText(Integer.toHexString(i));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("111111111111");
        add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jLabel2.setText("16");
        add(jLabel2, java.awt.BorderLayout.LINE_END);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
