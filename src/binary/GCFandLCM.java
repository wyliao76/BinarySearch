package binary;
import java.awt.Toolkit;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * GCFandLCM.java
 * @author nculevsk
 * Created on Feb 16, 2011, 10:43:10 AM
 */

public class GCFandLCM extends javax.swing.JFrame
{

    /** Creates new form GCFandLCM */
    public GCFandLCM()
    {
        initComponents();
        this.getRootPane().setDefaultButton(calculateJButton);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("src\\some.jpg"));
        this.setLocationRelativeTo(null);
        setDate();
    }
    private void setDate()
    {
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date date = new Date();
        this.setTitle("GCF and LCM " + dateFormat.format(date));
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gcflcmJuttonGroup = new javax.swing.ButtonGroup();
        firstJLabel = new javax.swing.JLabel();
        firstJTextField = new javax.swing.JTextField();
        secondJLabel = new javax.swing.JLabel();
        secondJTextField = new javax.swing.JTextField();
        gcfJRadioButton = new javax.swing.JRadioButton();
        lcmJRadioButton = new javax.swing.JRadioButton();
        calculateJButton = new javax.swing.JButton();
        resultJTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GCF and LCM");
        setResizable(false);

        firstJLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        firstJLabel.setText("First Number:");

        firstJTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        secondJLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        secondJLabel.setText("Second Number:");

        secondJTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        gcflcmJuttonGroup.add(gcfJRadioButton);
        gcfJRadioButton.setMnemonic('G');
        gcfJRadioButton.setSelected(true);
        gcfJRadioButton.setText("GCF");
        gcfJRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gcfJRadioButtonActionPerformed(evt);
            }
        });

        gcflcmJuttonGroup.add(lcmJRadioButton);
        lcmJRadioButton.setMnemonic('L');
        lcmJRadioButton.setText("LCM");
        lcmJRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lcmJRadioButtonActionPerformed(evt);
            }
        });

        calculateJButton.setBackground(new java.awt.Color(204, 204, 255));
        calculateJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        calculateJButton.setMnemonic('C');
        calculateJButton.setText("Calculate");
        calculateJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateJButtonActionPerformed(evt);
            }
        });

        resultJTextField.setEditable(false);
        resultJTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gcfJRadioButton)
                            .addComponent(lcmJRadioButton))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(resultJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addComponent(calculateJButton, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(secondJLabel)
                            .addComponent(firstJLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                            .addComponent(secondJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))))
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstJLabel)
                    .addComponent(firstJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(secondJLabel)
                    .addComponent(secondJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gcfJRadioButton)
                    .addComponent(calculateJButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lcmJRadioButton)
                    .addComponent(resultJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calculateJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateJButtonActionPerformed
        // Calculate the grestes common factor and the least common multiple
        int first = 0, second = 0, result = 0;
        first = Integer.parseInt(firstJTextField.getText());
        second = Integer.parseInt(secondJTextField.getText());
        if (gcfJRadioButton.isSelected())
            result = gcf(first, second);
        else
            result = lcm(first, second);
        resultJTextField.setText(String.valueOf(result));
    }//GEN-LAST:event_calculateJButtonActionPerformed

    private void gcfJRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gcfJRadioButtonActionPerformed
        // Call calculateJButtonActionPerformed
        calculateJButtonActionPerformed(evt);
    }//GEN-LAST:event_gcfJRadioButtonActionPerformed

    private void lcmJRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lcmJRadioButtonActionPerformed
         // Call calculateJButtonActionPerformed
        calculateJButtonActionPerformed(evt);
    }//GEN-LAST:event_lcmJRadioButtonActionPerformed

    // gcf recursive method to calculate greatest common factor
    private int gcf(int first, int second)
    {
        if(second == 0)
            return first;
        else
            return gcf(second, first % second);
    }

  // lcm method to calculate least common multiple
    private int lcm(int first, int second)
    {
        return (first * second)/nonrecursiveGCF(first, second);
    }

    private int nonrecursiveGCF(int number1, int number2)
    {
        int greatest = 1;
        int minimum = Math.min(number1, number2);
        for (int z = 2; z <= minimum; z++)
        {
            if((number1 % z == 0) && (number2 % z == 0))
              
                greatest = z;
        }
        return greatest;
    }
    /**
    * @param args the command line arguments
    */
    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new GCFandLCM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculateJButton;
    private javax.swing.JLabel firstJLabel;
    private javax.swing.JTextField firstJTextField;
    private javax.swing.JRadioButton gcfJRadioButton;
    private javax.swing.ButtonGroup gcflcmJuttonGroup;
    private javax.swing.JRadioButton lcmJRadioButton;
    private javax.swing.JTextField resultJTextField;
    private javax.swing.JLabel secondJLabel;
    private javax.swing.JTextField secondJTextField;
    // End of variables declaration//GEN-END:variables

}