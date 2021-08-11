/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Automovil;
import modelo.Moto;
import modelo.Avion;
import modelo.Helicoptero;
/**
 *
 * @author olive
 */
public class frm_vahiculo extends javax.swing.JFrame {

    
    /**
     * Creates new form frm_vahiculo
     */
   DefaultTableModel t_vehiculos;
    Automovil obj_Automovil;
    Moto obj_Moto;
    Avion obj_Avion;
    Helicoptero obj_Helicoptero;
    public frm_vahiculo() {
        initComponents();
        obj_Automovil= new Automovil();
        obj_Moto=new Moto();
        obj_Avion =new Avion();
        obj_Helicoptero=new Helicoptero();
        
        cmb_vehiculos.addItem("Automovil");
         cmb_vehiculos.addItem("Motocicleta");
         cmb_vehiculos.addItem("Avion");
         cmb_vehiculos.addItem("Helicoptero");
         t_vehiculos = new DefaultTableModel ();
         String encabezado []={"uso","Tipo","Linea","Chasis","Serie","Asientos","Color","Placa","Marca","Modelo","Vin","Motor","cilindraje"};
         t_vehiculos.setColumnIdentifiers(encabezado);
         tbl_vehiculos.setModel(t_vehiculos);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_tipo = new javax.swing.JLabel();
        lbl_linea = new javax.swing.JLabel();
        lbl_chasis = new javax.swing.JLabel();
        lbl_serie = new javax.swing.JLabel();
        lbl_asientos = new javax.swing.JLabel();
        lbl_color = new javax.swing.JLabel();
        lbl_placa = new javax.swing.JLabel();
        lbl_marca = new javax.swing.JLabel();
        lbl_modelo = new javax.swing.JLabel();
        lbl_vin = new javax.swing.JLabel();
        lbl_Motor = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btn_aceptar = new javax.swing.JButton();
        txt_tipo = new javax.swing.JTextField();
        txt_linea = new javax.swing.JTextField();
        txt_chasis = new javax.swing.JTextField();
        txt_serie = new javax.swing.JTextField();
        txt_asientos = new javax.swing.JTextField();
        txt_color = new javax.swing.JTextField();
        txt_placa = new javax.swing.JTextField();
        txt_marca = new javax.swing.JTextField();
        txt_modelo = new javax.swing.JTextField();
        txt_vin = new javax.swing.JTextField();
        txt_motor = new javax.swing.JTextField();
        txt_cilindraje = new javax.swing.JTextField();
        tbd_secundaria = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_vehiculos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txt_uso = new javax.swing.JTextField();
        cmb_vehiculos = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_tipo.setText("Tipo");

        lbl_linea.setText("Linea");

        lbl_chasis.setText("Chasis");

        lbl_serie.setText("Serie");

        lbl_asientos.setText("Asientos");

        lbl_color.setText("Color");

        lbl_placa.setText("Placa");

        lbl_marca.setText("Marca");

        lbl_modelo.setText("Modelo");

        lbl_vin.setText("Vin");

        lbl_Motor.setText("Motor");

        jLabel12.setText("Cilindraje");

        btn_aceptar.setText("Aceptar");
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });

        tbl_vehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbl_vehiculos);

        tbd_secundaria.addTab("Vehiculos", jScrollPane1);

        jLabel1.setText("uso");

        jLabel2.setText("Tipo de vehiculo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_linea)
                            .addComponent(lbl_chasis)
                            .addComponent(lbl_serie)
                            .addComponent(lbl_color)
                            .addComponent(lbl_placa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_placa, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(txt_color, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_tipo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_linea, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_chasis, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_serie, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_marca)
                            .addComponent(lbl_modelo))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_uso, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_vin)
                            .addComponent(jLabel12)
                            .addComponent(lbl_Motor))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_vin)
                                    .addComponent(txt_motor, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txt_cilindraje, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tbd_secundaria, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_aceptar)
                        .addGap(185, 185, 185))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_asientos)
                        .addGap(18, 18, 18)
                        .addComponent(txt_asientos, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmb_vehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_tipo)
                    .addComponent(lbl_vin)
                    .addComponent(txt_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_vin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_uso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_linea)
                    .addComponent(txt_linea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Motor)
                    .addComponent(txt_motor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_chasis)
                    .addComponent(txt_chasis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txt_cilindraje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_serie)
                    .addComponent(txt_serie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_asientos)
                    .addComponent(jLabel2)
                    .addComponent(cmb_vehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_asientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_color))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_placa)
                            .addComponent(txt_placa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_marca)
                            .addComponent(txt_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(tbd_secundaria, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_modelo)
                    .addComponent(txt_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_aceptar))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
        // TODO add your handling code here:
        obj_Automovil = new Automovil(txt_uso.getText(),txt_tipo.getText(),txt_linea.getText(),txt_chasis.getText(),txt_serie.getText(),txt_asientos.getText(),txt_color.getText(),txt_placa.getText(),txt_marca.getText(),txt_modelo.getText(),txt_vin.getText(),txt_motor.getText(),txt_cilindraje.getText());
        obj_Automovil.agregar();
        obj_Moto=new Moto(txt_uso.getText(),txt_tipo.getText(),txt_linea.getText(),txt_chasis.getText(),txt_serie.getText(),txt_asientos.getText(),txt_color.getText(),txt_placa.getText(),txt_marca.getText(),txt_modelo.getText(),txt_vin.getText(),txt_motor.getText(),txt_cilindraje.getText());
        obj_Moto.agregar();
        obj_Avion=new Avion(txt_uso.getText(),txt_tipo.getText(),txt_linea.getText(),txt_chasis.getText(),txt_serie.getText(),txt_asientos.getText(),txt_color.getText(),txt_placa.getText(),txt_marca.getText(),txt_modelo.getText(),txt_vin.getText(),txt_motor.getText(),txt_cilindraje.getText());
        obj_Avion.agregar();
        obj_Helicoptero=new Helicoptero(txt_uso.getText(),txt_tipo.getText(),txt_linea.getText(),txt_chasis.getText(),txt_serie.getText(),txt_asientos.getText(),txt_color.getText(),txt_placa.getText(),txt_marca.getText(),txt_modelo.getText(),txt_vin.getText(),txt_motor.getText(),txt_cilindraje.getText());
        obj_Helicoptero.agregar();
        
         String datos [] = new String [14];
        datos[0]=txt_uso.getText();
        datos[1]=txt_tipo.getText();
        datos[2]=txt_linea.getText();
        datos[3]=txt_chasis.getText();
        datos[4]=txt_serie.getText();
        datos[5]=txt_asientos.getText();
        datos[6]=txt_color.getText();
        datos[7]=txt_placa.getText();
        datos[8]=txt_marca.getText();
        datos[9]=txt_modelo.getText();
        datos[10]=txt_vin.getText();
        datos[11]=txt_motor.getText();
        datos[12]=txt_cilindraje.getText();
        datos[13]=cmb_vehiculos.getSelectedItem().toString();
        t_vehiculos.addRow(datos);
       JOptionPane.showMessageDialog(rootPane,"Ingreso Correcto","Mensaje",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btn_aceptarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frm_vahiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_vahiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_vahiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_vahiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_vahiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JComboBox<String> cmb_vehiculos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_Motor;
    private javax.swing.JLabel lbl_asientos;
    private javax.swing.JLabel lbl_chasis;
    private javax.swing.JLabel lbl_color;
    private javax.swing.JLabel lbl_linea;
    private javax.swing.JLabel lbl_marca;
    private javax.swing.JLabel lbl_modelo;
    private javax.swing.JLabel lbl_placa;
    private javax.swing.JLabel lbl_serie;
    private javax.swing.JLabel lbl_tipo;
    private javax.swing.JLabel lbl_vin;
    private javax.swing.JTabbedPane tbd_secundaria;
    private javax.swing.JTable tbl_vehiculos;
    private javax.swing.JTextField txt_asientos;
    private javax.swing.JTextField txt_chasis;
    private javax.swing.JTextField txt_cilindraje;
    private javax.swing.JTextField txt_color;
    private javax.swing.JTextField txt_linea;
    private javax.swing.JTextField txt_marca;
    private javax.swing.JTextField txt_modelo;
    private javax.swing.JTextField txt_motor;
    private javax.swing.JTextField txt_placa;
    private javax.swing.JTextField txt_serie;
    private javax.swing.JTextField txt_tipo;
    private javax.swing.JTextField txt_uso;
    private javax.swing.JTextField txt_vin;
    // End of variables declaration//GEN-END:variables
}
