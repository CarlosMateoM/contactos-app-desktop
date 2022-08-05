package main;

import components.WindowTitleBar;
import controller.MainController;
import java.awt.Color;
import javax.swing.Icon;
import service.ContactService;
import swing.panels.GradientPanel;

public class View extends javax.swing.JFrame {

    public View() {
        initComponents();
        init();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane = new javax.swing.JOptionPane();
        scrollBarCustom1 = new swing.table.ScrollBarCustom();
        background = new swing.panels.GradientPanel();
        formLoader = new swing.panels.GradientPanel();
        jLabel1 = new javax.swing.JLabel();
        windowTitleBar = new components.WindowTitleBar();

        jOptionPane.setBackground(new java.awt.Color(255, 255, 255));

        scrollBarCustom1.setForeground(new java.awt.Color(109, 213, 237));
        scrollBarCustom1.setRound(12);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Contactos App");
        setUndecorated(true);

        background.setOpaque(true);
        background.setRound(20);

        formLoader.setColor1(new java.awt.Color(255, 255, 255));
        formLoader.setColor2(new java.awt.Color(255, 255, 255));
        formLoader.setRound(20);
        formLoader.setLayout(new java.awt.BorderLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cargando...");
        formLoader.add(jLabel1, java.awt.BorderLayout.CENTER);

        windowTitleBar.setJFrame(this);

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(windowTitleBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(formLoader, javax.swing.GroupLayout.DEFAULT_SIZE, 983, Short.MAX_VALUE))
                .addContainerGap())
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(windowTitleBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(formLoader, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(background, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        
        
      try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
      java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                View view = new View();
                ContactService contactService = new ContactService();
                new MainController(view, contactService);
            }
        });
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.panels.GradientPanel background;
    private swing.panels.GradientPanel formLoader;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JOptionPane jOptionPane;
    private swing.table.ScrollBarCustom scrollBarCustom1;
    private components.WindowTitleBar windowTitleBar;
    // End of variables declaration//GEN-END:variables

    private void init() {
        this.setBackground(new Color(0, 0, 0, 0));
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-contacts-50.png")).getImage());
    }

    public GradientPanel getBackgroundPanel() {
        return background;
    }

    public GradientPanel getFormLoader() {
        return formLoader;
    }

    public WindowTitleBar getWindowTitleBar() {
        return windowTitleBar;
    }

}
