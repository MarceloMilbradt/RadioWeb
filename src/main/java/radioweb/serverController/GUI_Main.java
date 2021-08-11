package radioweb.serverController;

import com.jtattoo.plaf.hifi.HiFiLookAndFeel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import radioweb.client.GUIClient;

public class GUI_Main extends javax.swing.JFrame {

    public GUI_Main() {
        initComponents();
        this.setLocationRelativeTo(null); //coloca o frame centralizado na tela
        this.ip = "127.0.0.1";
    }
    private String ip;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbMusica = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jbPlaylist = new javax.swing.JButton();
        jbReproduzir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rádio Web");

        jbMusica.setText("Música");
        jbMusica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbMusicaMouseClicked(evt);
            }
        });

        jLabel1.setText("Bom dia, RadioWeb pronto pra dale.");

        jbPlaylist.setText("Playlist");
        jbPlaylist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbPlaylistMouseClicked(evt);
            }
        });

        jbReproduzir.setText("Reproduzir ▶");
        jbReproduzir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbReproduzirMouseClicked(evt);
            }
        });

        jButton1.setText("IP");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jbMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbReproduzir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(444, 444, 444)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbReproduzir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Metodo jbMusicaMouseClicked Abre a GUI_Musica
     *
     * @param evt MouseEvent
     */
    private void jbMusicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbMusicaMouseClicked
        //Vai chamar a tela de musica
        GUI_Musica musica = new GUI_Musica();
        musica.addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent e) {
                Show();
            }
        });
        musica.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbMusicaMouseClicked
    /**
     * Metodo jbPlaylistMouseClicked Abre a GUI_Playlist
     *
     * @param evt MouseEvent
     */
    private void jbPlaylistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbPlaylistMouseClicked
        //Vai chamar a tela de playlist
        GUI_Playlist playlist = new GUI_Playlist();
        playlist.addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent e) {
                Show();
            }
        });
        playlist.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbPlaylistMouseClicked
    /**
     * Metodo jbReproduzirMouseClicked Abre a GUI_Reproduzir
     *
     * @param evt MouseEvent
     */
    private void jbReproduzirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbReproduzirMouseClicked
        //Vai chamar a tela de reproduzir playlist
        GUI_Reproduzir reproduzir = new GUI_Reproduzir((this.ip==null?"127.0.0.1":this.ip));
        reproduzir.addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent e) {
                Show();
            }
        });
        reproduzir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbReproduzirMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String newip = JOptionPane.showInputDialog(null, "Endereço IPV4 do servidor\n Endereço atual: "+this.ip, "Informe o IP", JOptionPane.INFORMATION_MESSAGE);
        if (newip != null) {
            if (validateIP(newip)) {
                this.ip = newip;
            } else {
                JOptionPane.showMessageDialog(null, "Endereço IPV4 invalido", "Erro", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    /**
     * Metodo Show mostra o gui_main novamente
     */
    public void Show() {
        this.setVisible(true);
    }

    private static final String PATTERN
            = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
            + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
            + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
            + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

    /**
     * Metodo validateIP Varifica se o IP é valido
     *
     * @param ip String IP
     * @return boolean
     */
    public static boolean validateIP(String ip) {
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher matcher = pattern.matcher(ip);
        return matcher.matches();
    }

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
            Properties props = new Properties();
            props.put("logoString", "Rádio Webson Controller");
            HiFiLookAndFeel.setCurrentTheme(props);
            UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(GUIClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbMusica;
    private javax.swing.JButton jbPlaylist;
    private javax.swing.JButton jbReproduzir;
    // End of variables declaration//GEN-END:variables
}
