
package Vista;

import Controlador.ControladorProduccion;
import Modelo.Componente;
import Modelo.Produccion;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class JFReportes extends javax.swing.JFrame {

   private ControladorProduccion controlador;
    
    public JFReportes(ControladorProduccion controlador) {
        initComponents();
        this.controlador = controlador;
        setLocationRelativeTo(null);
        cargarCombo();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstReporte = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtResponsable = new javax.swing.JTextField();
        cboComponente = new javax.swing.JComboBox<>();
        btnResponsables = new javax.swing.JButton();
        btnComponente = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(lstReporte);

        jLabel1.setText("Responsable:");

        jLabel2.setText("Componente:");

        btnResponsables.setText("Responsable");
        btnResponsables.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResponsablesActionPerformed(evt);
            }
        });

        btnComponente.setText("Componente");
        btnComponente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComponenteActionPerformed(evt);
            }
        });

        jButton1.setText("Ambos Filtros");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnResponsables)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnComponente)
                .addGap(55, 55, 55)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboComponente, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txtResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboComponente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(btnSalir)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnResponsables)
                            .addComponent(btnComponente)
                            .addComponent(jButton1))
                        .addGap(23, 23, 23))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnResponsablesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResponsablesActionPerformed
        if (!validarResp()) {
            JOptionPane.showMessageDialog(this, "Jorge, Pedro, Miguel");
        }else{
        cargarListaResp();
        }
    }//GEN-LAST:event_btnResponsablesActionPerformed

    private void btnComponenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComponenteActionPerformed
       cargarListaComp();
    }//GEN-LAST:event_btnComponenteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if (!validarResp()) {
            JOptionPane.showMessageDialog(this, "Jorge, Pedro, Miguel");
        }else{
        cargarListaAmbos();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public void cargarCombo(){
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        List<Componente> lst = controlador.obtenerComponentes();
        for (Componente componente : lst) {
            model.addElement(componente);
        }
        cboComponente.setModel(model);
    }
    
    public void cargarListaResp(){
        DefaultListModel model = new DefaultListModel();
        List<Produccion> lst = controlador.obtenerProduccionesXResp(txtResponsable.getText());
        for (Produccion produccion : lst) {
            model.addElement(produccion);
        }
        lstReporte.setModel(model);
    }
    
    public void cargarListaComp(){
        DefaultListModel model = new DefaultListModel();
        List<Produccion> lst = controlador.obtenerProduccionesXComp(cboComponente.getSelectedItem().toString());
        for (Produccion produccion : lst) {
            model.addElement(produccion);
        }
        lstReporte.setModel(model);
    }
    
    public void cargarListaAmbos(){
        DefaultListModel model = new DefaultListModel();
        List<Produccion> lst = controlador.obtenerProduccionesX2Filtros(txtResponsable.getText(),cboComponente.getSelectedItem().toString());
        for (Produccion produccion : lst) {
            model.addElement(produccion);
        }
        lstReporte.setModel(model);
    }
    
    public boolean validarResp(){
        return (txtResponsable.getText().equals("Jorge")
                ||txtResponsable.getText().equals("Pedro")
                ||txtResponsable.getText().equals("Martin"));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComponente;
    private javax.swing.JButton btnResponsables;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cboComponente;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Produccion> lstReporte;
    private javax.swing.JTextField txtResponsable;
    // End of variables declaration//GEN-END:variables
}
