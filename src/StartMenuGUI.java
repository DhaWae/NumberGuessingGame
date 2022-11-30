
import java.awt.Color;
import java.io.IOException;
import java.util.Random;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author jesper.rudegran
 */
public class StartMenuGUI extends javax.swing.JFrame {

    
    GameGUI gameGUI = new GameGUI();

    String difficulty = "";

    /**
     * Creates new form GameGUI
     */
    public StartMenuGUI() {
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

        jPanel1 = new javax.swing.JPanel();
        playButton = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        chosenDifficulty = new javax.swing.JLabel();
        easyBtn = new javax.swing.JButton();
        hardBtn = new javax.swing.JButton();
        impBtn = new javax.swing.JButton();
        mediumBtn = new javax.swing.JButton();
        chosenDifficultyLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        playButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        playButton.setText("PLAY");
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    playButtonActionPerformed(evt);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        titleLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(153, 153, 153));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Can you guess the number?");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Choose your difficulty!");

        chosenDifficulty.setForeground(new java.awt.Color(255, 255, 255));
        chosenDifficulty.setText("Chosen difficulty:");

        easyBtn.setBackground(new java.awt.Color(0, 255, 0));
        easyBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        easyBtn.setForeground(new java.awt.Color(0, 0, 0));
        easyBtn.setText("Easy");
        easyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                easyBtnActionPerformed(evt);
            }
        });

        hardBtn.setBackground(new java.awt.Color(255, 0, 0));
        hardBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        hardBtn.setForeground(new java.awt.Color(0, 0, 0));
        hardBtn.setText("Hard");
        hardBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hardBtnActionPerformed(evt);
            }
        });

        impBtn.setBackground(new java.awt.Color(0, 0, 0));
        impBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        impBtn.setForeground(new java.awt.Color(255, 0, 0));
        impBtn.setText("IMPOSSIBLE");
        impBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                impBtnActionPerformed(evt);
            }
        });

        mediumBtn.setBackground(new java.awt.Color(255, 255, 0));
        mediumBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mediumBtn.setForeground(new java.awt.Color(0, 0, 0));
        mediumBtn.setText("Medium");
        mediumBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mediumBtnActionPerformed(evt);
            }
        });

        chosenDifficultyLabel.setForeground(new java.awt.Color(255, 255, 255));
        chosenDifficultyLabel.setText("       ");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("1 - 10");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("1-10.000");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("1-1000");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("1 - 100");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(titleLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jLabel2)
                                    .addComponent(easyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jLabel5)
                                    .addComponent(mediumBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jLabel4)
                                    .addComponent(hardBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jLabel3)
                                    .addComponent(impBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(chosenDifficulty)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chosenDifficultyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(24, 24, 24))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addComponent(playButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(easyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mediumBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hardBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(impBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)
                        .addComponent(jLabel5)))
                .addGap(28, 28, 28)
                .addComponent(playButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chosenDifficulty)
                    .addComponent(chosenDifficultyLabel))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mediumBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mediumBtnActionPerformed
        chosenDifficultyLabel.setText("medium");
        chosenDifficultyLabel.setForeground(Color.yellow);
        difficulty = "medium";
        // TODO add your handling code here:
    }//GEN-LAST:event_mediumBtnActionPerformed

    private void impBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_impBtnActionPerformed
        chosenDifficultyLabel.setText("IMPOSSIBLE");
        chosenDifficultyLabel.setForeground(new java.awt.Color(148, 40, 148));
        difficulty = "IMPOSSIBLE";
        // TODO add your handling code here:
    }//GEN-LAST:event_impBtnActionPerformed

    private void hardBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hardBtnActionPerformed
        chosenDifficultyLabel.setText("hard");
        chosenDifficultyLabel.setForeground(Color.red);
        difficulty = "hard";
        // TODO add your handling code here:
    }//GEN-LAST:event_hardBtnActionPerformed

    private void easyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_easyBtnActionPerformed
        chosenDifficultyLabel.setText("easy");
        chosenDifficultyLabel.setForeground(Color.green);
        difficulty = "easy";
        // TODO add your handling code here:
    }//GEN-LAST:event_easyBtnActionPerformed

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) throws IOException {//GEN-FIRST:event_playButtonActionPerformed
        gameGUI.createHighscoreFile();
        gameGUI.filePath(difficulty);
        gameGUI.readFile(gameGUI.filePath);
        Random random = new Random();

        switch (difficulty) {
            case "easy" -> gameGUI.numberToGuess = random.nextInt(1, 11);
            case "medium" -> gameGUI.numberToGuess = random.nextInt(1, 101);
            case "hard" -> gameGUI.numberToGuess = random.nextInt(1, 1001);
            case "IMPOSSIBLE" -> gameGUI.numberToGuess = random.nextInt(1, 10001);
        }

        System.out.println(gameGUI.numberToGuess);
        gameGUI.readHashMap();
        setVisible(false);
        gameGUI.setVisible(true);
        gameGUI.difficultyLabel.setText(difficulty);
        gameGUI.highscoreMode.setText(difficulty);
        gameGUI.startTime = System.currentTimeMillis();

        // TODO add your handling code here:
    }//GEN-LAST:event_playButtonActionPerformed

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
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
            java.util.logging.Logger.getLogger(StartMenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartMenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartMenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartMenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartMenuGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel chosenDifficulty;
    public javax.swing.JLabel chosenDifficultyLabel;
    private javax.swing.JButton easyBtn;
    private javax.swing.JButton hardBtn;
    private javax.swing.JButton impBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mediumBtn;
    private javax.swing.JButton playButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
