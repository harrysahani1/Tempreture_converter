
package javaapplication13;

/**
 *
 * @author harry sahani
 */
public class Convert extends javax.swing.JFrame {

    public Convert() {
        setBounds(300,100,800,600);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tempreture Conversion\n");
        setBackground(new java.awt.Color(204, 255, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setText("Tempreture Converter");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, 30));

        jComboBox1.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celsius", "Fahrenheit", "Kelvin" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 110, 30));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 160, 30));

        jButton1.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jButton1.setText("Convert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, -1, -1));

        jComboBox2.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celsius", "Fahrenheit", "Kelvin" }));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 110, 30));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 160, 30));

        jButton2.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 80, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTextField1.setText("");
        jTextField2.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String b1 = (String)jComboBox1.getSelectedItem();
       String b2 = (String)jComboBox2.getSelectedItem();
       
       if(b1.equals("Celsius") && b2.equals("Fahrenheit")){
           double c = Double.parseDouble(jTextField1.getText());
           
           double f = (double)(c * 1.8 + 32);
           jTextField2.setText(String.valueOf(f));
           
       }
       
       if(b1.equals("Celsius") && b2.equals("Kelvin")){
           double c = Double.parseDouble(jTextField1.getText());
           
           double k = (double)(c + 273.15);
           jTextField2.setText(String.valueOf(k));
           
       }
       if(b1.equals("Celsius") && b2.equals("Celsius")){
           double c = Double.parseDouble(jTextField1.getText());
           jTextField2.setText(String.valueOf(c));
           
       }
       
       
       if(b1.equals("Fahrenheit") && b2.equals("Fahrenheit")){
           double f = Double.parseDouble(jTextField1.getText());
           jTextField2.setText(String.valueOf(f));
           
       }
       
       if(b1.equals("Fahrenheit") && b2.equals("Kelvin")){
           double f = Double.parseDouble(jTextField1.getText());
           
           double k = (double)((f -32)*5/9 + 273.15);
           jTextField2.setText(String.valueOf(k));
           
       }
       if(b1.equals("Fahrenheit") && b2.equals("Celsius")){
           double f = Double.parseDouble(jTextField1.getText());
           double c = (double)((f -32)*5/9);
           jTextField2.setText(String.valueOf(c));
           
       }
       
       
       
           if(b1.equals("Kelvin") && b2.equals("Fahrenheit")){
           double k = Double.parseDouble(jTextField1.getText());
           double f = (double)(0 - 273.15) * 9/5 + 32;
           jTextField2.setText(String.valueOf(f));
           
       }
       
       if(b1.equals("Kelvin") && b2.equals("Kelvin")){
           double k = Double.parseDouble(jTextField1.getText());
           jTextField2.setText(String.valueOf(k));
           
       }
       if(b1.equals("Kelvin") && b2.equals("Celsius")){
           double f = Double.parseDouble(jTextField1.getText());
           double c = (double)(0 - 273.15);
           jTextField2.setText(String.valueOf(c));
           
       }
          
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Convert().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
