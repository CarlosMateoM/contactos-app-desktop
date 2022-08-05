/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import javax.swing.JLabel;
import swing.buttons.Button;
import swing.checkboxs.CheckBox;
import swing.table.Table;
import swing.textfields.TextFieldSuggestion;

/**
 *
 * @author mateo
 */
public class Dashboard extends swing.panels.GradientPanel {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        table1.fixTable(jScrollPane2);
    }

    public Button getRegistrarBtn() {
        return registrarBtn;
    }

    public Table getTable() {
        return table1;
    }

    public JLabel getTotalContacts() {
        return totalContacts;
    }

    public TextFieldSuggestion getBuscarInput() {
        return buscarInput;
    }

    public Button getBuscarBtn() {
        return buscarBtn;
    }

    public Button getActualizarBtn() {
        return actualizarBtn;
    }

    public CheckBox getInvertirOrdenCheck() {
        return invertirOrdenCheck;
    }

    public Button getPdfBtn() {
        return pdfBtn;
    }

    public Button getExcelBtn() {
        return excelBtn;
    }

    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollBarCustom1 = new swing.table.ScrollBarCustom();
        jLabel2 = new javax.swing.JLabel();
        registrarBtn = new swing.buttons.Button();
        jScrollPane2 = new javax.swing.JScrollPane();
        table1 = new swing.table.Table();
        gradientPanel1 = new swing.panels.GradientPanel();
        jLabel1 = new javax.swing.JLabel();
        totalContacts = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        buscarInput = new swing.textfields.TextFieldSuggestion();
        buscarBtn = new swing.buttons.Button();
        actualizarBtn = new swing.buttons.Button();
        invertirOrdenCheck = new swing.checkboxs.CheckBox();
        pdfBtn = new swing.buttons.Button();
        excelBtn = new swing.buttons.Button();
        jLabel4 = new javax.swing.JLabel();

        scrollBarCustom1.setBlockIncrement(20);
        scrollBarCustom1.setForeground(new java.awt.Color(109, 213, 237));

        setColor1(new java.awt.Color(255, 255, 255));
        setColor2(new java.awt.Color(255, 255, 255));
        setRound(20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(110, 112, 118));
        jLabel2.setText("LISTA DE CONTACTOS");

        registrarBtn.setBackground(new java.awt.Color(109, 213, 237));
        registrarBtn.setForeground(new java.awt.Color(255, 255, 255));
        registrarBtn.setText("Nuevo");
        registrarBtn.setBackgroundColor(new java.awt.Color(109, 213, 237));
        registrarBtn.setFont(new java.awt.Font("DejaVu Sans", 1, 16)); // NOI18N
        registrarBtn.setHoverColor(new java.awt.Color(33, 147, 176));
        registrarBtn.setRound(35);

        jScrollPane2.setBorder(null);
        jScrollPane2.setVerticalScrollBar(scrollBarCustom1);

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Telefono", "Carrera", "Universidad", " "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table1.setHeaderFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        table1.setHeaderForeground(new java.awt.Color(110, 112, 118));
        table1.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(table1);
        if (table1.getColumnModel().getColumnCount() > 0) {
            table1.getColumnModel().getColumn(0).setMinWidth(280);
            table1.getColumnModel().getColumn(0).setPreferredWidth(300);
            table1.getColumnModel().getColumn(0).setMaxWidth(400);
            table1.getColumnModel().getColumn(1).setMinWidth(100);
            table1.getColumnModel().getColumn(1).setPreferredWidth(150);
            table1.getColumnModel().getColumn(1).setMaxWidth(200);
            table1.getColumnModel().getColumn(4).setMinWidth(80);
            table1.getColumnModel().getColumn(4).setPreferredWidth(100);
            table1.getColumnModel().getColumn(4).setMaxWidth(150);
        }

        gradientPanel1.setRound(30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(243, 242, 242));
        jLabel1.setText("TOTAL CONTACTOS");

        totalContacts.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        totalContacts.setForeground(new java.awt.Color(245, 242, 242));
        totalContacts.setText("1.000.000");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-contacts-50.png"))); // NOI18N

        javax.swing.GroupLayout gradientPanel1Layout = new javax.swing.GroupLayout(gradientPanel1);
        gradientPanel1.setLayout(gradientPanel1Layout);
        gradientPanel1Layout.setHorizontalGroup(
            gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalContacts)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        gradientPanel1Layout.setVerticalGroup(
            gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel1Layout.createSequentialGroup()
                .addGroup(gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gradientPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(totalContacts)))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4))
        );

        jSeparator1.setForeground(new java.awt.Color(110, 112, 118));

        buscarInput.setForeground(new java.awt.Color(110, 112, 118));
        buscarInput.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buscarInput.setHint("Ingrese el nombre del contacto a buscar");
        buscarInput.setHintColor(new java.awt.Color(110, 112, 118));
        buscarInput.setRound(5);
        buscarInput.setSelectionColor(new java.awt.Color(109, 213, 237));

        buscarBtn.setBackground(new java.awt.Color(153, 255, 153));
        buscarBtn.setForeground(new java.awt.Color(255, 255, 255));
        buscarBtn.setText("Buscar");
        buscarBtn.setBackgroundColor(new java.awt.Color(153, 255, 153));
        buscarBtn.setFont(new java.awt.Font("DejaVu Sans", 1, 16)); // NOI18N
        buscarBtn.setHoverColor(new java.awt.Color(0, 204, 0));
        buscarBtn.setRound(35);

        actualizarBtn.setBackground(new java.awt.Color(204, 204, 204));
        actualizarBtn.setForeground(new java.awt.Color(255, 255, 255));
        actualizarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-refresh-30.png"))); // NOI18N
        actualizarBtn.setBackgroundColor(new java.awt.Color(204, 204, 204));
        actualizarBtn.setFont(new java.awt.Font("DejaVu Sans", 1, 16)); // NOI18N
        actualizarBtn.setHoverColor(new java.awt.Color(153, 153, 153));
        actualizarBtn.setRound(35);

        invertirOrdenCheck.setBackground(new java.awt.Color(109, 213, 237));
        invertirOrdenCheck.setForeground(new java.awt.Color(110, 112, 118));
        invertirOrdenCheck.setText("Invertir Orden");
        invertirOrdenCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invertirOrdenCheckActionPerformed(evt);
            }
        });

        pdfBtn.setBackground(new java.awt.Color(255, 255, 255));
        pdfBtn.setForeground(new java.awt.Color(255, 255, 255));
        pdfBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-pdf-20.png"))); // NOI18N
        pdfBtn.setFont(new java.awt.Font("DejaVu Sans", 1, 16)); // NOI18N
        pdfBtn.setHoverColor(new java.awt.Color(228, 231, 234));
        pdfBtn.setRound(35);

        excelBtn.setBackground(new java.awt.Color(255, 255, 255));
        excelBtn.setForeground(new java.awt.Color(255, 255, 255));
        excelBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-microsoft-excel-20.png"))); // NOI18N
        excelBtn.setFont(new java.awt.Font("DejaVu Sans", 1, 16)); // NOI18N
        excelBtn.setHoverColor(new java.awt.Color(228, 231, 234));
        excelBtn.setRound(35);

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Los reportes generados no aplican filtros");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buscarInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(pdfBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(excelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                        .addComponent(invertirOrdenCheck, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(actualizarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(registrarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(buscarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(gradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(gradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(invertirOrdenCheck, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(buscarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(actualizarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(registrarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(excelBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(pdfBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(buscarInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void invertirOrdenCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invertirOrdenCheckActionPerformed
        // TODO add your handling code here:
        boolean i = invertirOrdenCheck.isSelected();
        configurations.Config.setPropertyValue("invertirOrden", String.valueOf(i));
    }//GEN-LAST:event_invertirOrdenCheckActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.buttons.Button actualizarBtn;
    private swing.buttons.Button buscarBtn;
    private swing.textfields.TextFieldSuggestion buscarInput;
    private swing.buttons.Button excelBtn;
    private swing.panels.GradientPanel gradientPanel1;
    private swing.checkboxs.CheckBox invertirOrdenCheck;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private swing.buttons.Button pdfBtn;
    private swing.buttons.Button registrarBtn;
    private swing.table.ScrollBarCustom scrollBarCustom1;
    private swing.table.Table table1;
    private javax.swing.JLabel totalContacts;
    // End of variables declaration//GEN-END:variables
}
