
package forms;

import javax.swing.JLabel;
import javax.swing.JTextField;
import swing.buttons.Button;
import swing.checkboxs.CheckBox;

public class NewContactForm extends swing.panels.GradientPanel {
    
    public NewContactForm() {
        initComponents();
    }

    public Button getGuardarBtn() {
        return guardarBtn;
    }

    public Button getRegresarBtn() {
        return regresarBtn;
    }

    public JTextField getCarreraInput() {
        return carreraInput;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public JTextField getNombreInput() {
        return nombreInput;
    }

    public JTextField getTelefonoInput() {
        return telefonoInput;
    }

    public JTextField getUniversidadInput() {
        return universidadInput;
    }

    public CheckBox getLimpiarCheck() {
        return limpiarCheck;
    }

    public CheckBox getRedireccionarCheck() {
        return redireccionarCheck;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        guardarBtn = new swing.buttons.Button();
        carreraInput = new javax.swing.JTextField();
        telefonoInput = new javax.swing.JTextField();
        nombreInput = new javax.swing.JTextField();
        universidadInput = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        regresarBtn = new swing.buttons.Button();
        limpiarCheck = new swing.checkboxs.CheckBox();
        redireccionarCheck = new swing.checkboxs.CheckBox();

        setColor1(new java.awt.Color(255, 255, 255));
        setColor2(new java.awt.Color(255, 255, 255));
        setRound(20);

        guardarBtn.setBackground(new java.awt.Color(109, 213, 237));
        guardarBtn.setForeground(new java.awt.Color(255, 255, 255));
        guardarBtn.setText("Guardar");
        guardarBtn.setBackgroundColor(new java.awt.Color(109, 213, 237));
        guardarBtn.setFont(new java.awt.Font("DejaVu Sans", 1, 16)); // NOI18N
        guardarBtn.setHoverColor(new java.awt.Color(33, 147, 176));
        guardarBtn.setRound(35);

        carreraInput.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(110, 112, 118)), "Carrera:", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(110, 112, 118))); // NOI18N

        telefonoInput.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(110, 112, 118)), "Telefono:", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(110, 112, 118))); // NOI18N

        nombreInput.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(110, 112, 118)), "Nombre:", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(110, 112, 118))); // NOI18N

        universidadInput.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(110, 112, 118), 1, true), "Universidad:", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(110, 112, 118))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(110, 112, 118));
        jLabel1.setText("Nuevo Contacto");

        regresarBtn.setBackground(new java.awt.Color(220, 55, 61));
        regresarBtn.setForeground(new java.awt.Color(255, 255, 255));
        regresarBtn.setText("Regresar");
        regresarBtn.setBackgroundColor(new java.awt.Color(220, 55, 61));
        regresarBtn.setFont(new java.awt.Font("DejaVu Sans", 1, 16)); // NOI18N
        regresarBtn.setHoverColor(new java.awt.Color(180, 55, 61));
        regresarBtn.setRound(35);

        limpiarCheck.setBackground(new java.awt.Color(109, 213, 237));
        limpiarCheck.setText("Limpiar Textos");

        redireccionarCheck.setBackground(new java.awt.Color(109, 213, 237));
        redireccionarCheck.setText("Redireccionar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(regresarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(guardarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 943, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(nombreInput)
                                    .addComponent(telefonoInput))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(universidadInput)
                                    .addComponent(carreraInput))))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(redireccionarCheck, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(limpiarCheck, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(135, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreInput, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(universidadInput, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefonoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carreraInput, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regresarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(limpiarCheck, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(redireccionarCheck, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField carreraInput;
    private swing.buttons.Button guardarBtn;
    private javax.swing.JLabel jLabel1;
    private swing.checkboxs.CheckBox limpiarCheck;
    private javax.swing.JTextField nombreInput;
    private swing.checkboxs.CheckBox redireccionarCheck;
    private swing.buttons.Button regresarBtn;
    private javax.swing.JTextField telefonoInput;
    private javax.swing.JTextField universidadInput;
    // End of variables declaration//GEN-END:variables
}
