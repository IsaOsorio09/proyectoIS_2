/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz_grafica;
import helados_pa_todos.Inventario;
import helados_pa_todos.Usuario;
import helados_pa_todos.ListaSimple;
import helados_pa_todos.NodoSimple;
import helados_pa_todos.Pedido;
import helados_pa_todos.Producto;
import helados_pa_todos.Queue;
import helados_pa_todos.RegistroModificaciones;
import helados_pa_todos.Usuario;
import java.util.Map;
import java.util.HashMap;
import javax.swing.JOptionPane;
/**
 *
 * @author Pc1
 */
public class ProgramarProductoProximoPedido extends javax.swing.JFrame {
    private Menu v1;
    public Inventario inv;
    public Usuario user;
    /**
     * Creates new form ProgramarProximoPedido
     */
    public ProgramarProductoProximoPedido(Inventario inv, Usuario user) {
        this.inv = inv;
        this.user = user;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtprogramar1 = new javax.swing.JLabel();
        txtprogramar2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtSku = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnAutomatico = new javax.swing.JButton();
        btnAyuda = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCant = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtProd = new javax.swing.JTextArea();
        BtnVolverMenuPPPP = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Programar Producto Para el Proximo Pedido");

        txtprogramar1.setText("Ingresa el codigo SKU del producto que deseas programar para");

        txtprogramar2.setText("el próximo pedido:");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnAutomatico.setText("Programar pedido autómaticamente");
        btnAutomatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutomaticoActionPerformed(evt);
            }
        });

        btnAyuda.setText("Ayuda SKU");
        btnAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaActionPerformed(evt);
            }
        });

        jLabel4.setText("Sku");

        jLabel5.setText("Cantidad");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(txtprogramar2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(btnAgregar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(btnAyuda))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtprogramar1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtSku, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCant, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(btnAutomatico)))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(60, 60, 60))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(txtprogramar1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtprogramar2)
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(btnAgregar)
                .addGap(38, 38, 38)
                .addComponent(btnAutomatico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(btnAyuda)
                .addGap(32, 32, 32))
        );

        txtProd.setColumns(20);
        txtProd.setRows(5);
        jScrollPane1.setViewportView(txtProd);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        BtnVolverMenuPPPP.setText("Volver al Menú Principal");
        BtnVolverMenuPPPP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVolverMenuPPPPActionPerformed(evt);
            }
        });

        jLabel2.setText("Seleccione los productos que desea agendar para el próximo pedido.");

        jLabel3.setText("Estos se verán reflejados en el recuadro de la derecha.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BtnVolverMenuPPPP)
                        .addGap(342, 342, 342))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(259, 259, 259))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(215, 215, 215))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(258, 258, 258))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(3, 3, 3)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BtnVolverMenuPPPP)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void setv1(Menu v1){
        this.v1 = v1;
    }
    
    private void BtnVolverMenuPPPPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVolverMenuPPPPActionPerformed
        v1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnVolverMenuPPPPActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
       try {
        // Convertir el SKU y la cantidad de texto a enteros
        String sku = txtSku.getText();
        int sku_ = Integer.parseInt(sku);
        if(inv.getTablaSku().containsKey(sku_)){
            String cantidad = txtCant.getText();
        int cant = Integer.parseInt(cantidad);

        // Intentar registrar el pedido
        if (inv.registrarPedido(sku_, cant, user)) {
            // Obtener el mapa de pedidos programados
            Map<Integer, Integer> mapa = inv.getPedidoProgramado();
            StringBuilder sb = new StringBuilder();

            // Recorrer el mapa e imprimir los valores
            for (Map.Entry<Integer, Integer> entry : mapa.entrySet()) {
                sb.append("Código SKU: ").append(entry.getKey())
                  .append(", Cantidad: ").append(entry.getValue())
                  .append("\n");
            }

            // Mostrar los pedidos en el JTextArea
            txtProd.setText(sb.toString());
        } else {
            // Mensaje si el usuario no tiene permisos
            JOptionPane.showMessageDialog(null, "Ooops, no tienes los permisos para realizar esto", "Error de permiso", JOptionPane.ERROR_MESSAGE);
        }
        } else {
            JOptionPane.showMessageDialog(null, "Ingresa un SKU existente", "Error de permiso", JOptionPane.ERROR_MESSAGE);
        }
        
        
    } catch (NumberFormatException e) {
        // Capturar si el SKU o la cantidad no son números válidos
        JOptionPane.showMessageDialog(null, "Por favor, ingresa un SKU y una cantidad válidos.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
    } catch (Exception e) {
        // Capturar cualquier otro error inesperado
        JOptionPane.showMessageDialog(null, "Ha ocurrido un error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnAutomaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutomaticoActionPerformed
        if(inv.PedidoProgramado(user)){
            Map<Integer,Integer> mapa = inv.getPedidoProgramado();
            StringBuilder sb = new StringBuilder();
            for(Map.Entry<Integer, Integer> entry : mapa.entrySet()) {
                    sb.append("Código SKU: ").append(entry.getKey()).append(", Cantidad: ").append(entry.getValue()).append("\n");
                }
            txtProd.setText(sb.toString());
        } else {
            JOptionPane.showMessageDialog(null, "Ooops, no tienes los permisos para realizar esto", "Error de permiso", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnAutomaticoActionPerformed

    private void btnAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaActionPerformed
        JOptionPane.showMessageDialog(null, inv.mostrarSku(), "Información", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnAyudaActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnVolverMenuPPPP;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAutomatico;
    private javax.swing.JButton btnAyuda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtCant;
    private javax.swing.JTextArea txtProd;
    private javax.swing.JTextField txtSku;
    private javax.swing.JLabel txtprogramar1;
    private javax.swing.JLabel txtprogramar2;
    // End of variables declaration//GEN-END:variables
}
