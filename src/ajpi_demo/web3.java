/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajpi_demo;

import java.io.IOException;
import java.util.Stack;
import javax.swing.JOptionPane;
import javax.swing.event.HyperlinkEvent;

public class web3 extends javax.swing.JFrame 
{
    public web3(String abc)
    {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        jtf.setText("file:///"+abc);
        edp.setEditable(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        edp = new javax.swing.JEditorPane();
        jtf = new java.awt.TextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        edp.setEditable(false);
        edp.addHyperlinkListener(new javax.swing.event.HyperlinkListener() {
            public void hyperlinkUpdate(javax.swing.event.HyperlinkEvent evt) {
                edpHyperlinkUpdate(evt);
            }
        });
        jScrollPane1.setViewportView(edp);

        jtf.setText("file:///");
        jtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfActionPerformed(evt);
            }
        });

        jLabel1.setText("URL");

        jButton1.setText("Load");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtf, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButton1)
                .addGap(42, 42, 42)
                .addComponent(jButton2)
                .addGap(0, 255, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addComponent(jtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private Stack urlStack = new Stack();
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
if(jtf==null)
        {
            JOptionPane.showMessageDialog(null," Nothing to load","Error",JOptionPane.ERROR_MESSAGE);
        }
else
{
        
        try
                    {
                         urlStack.push(jtf.getText());
                         edp.setPage(jtf.getText());
                    }
                    catch(Exception e)
                    {
                         
                          JOptionPane.showMessageDialog(edp,"Nothing to show here pleease check url");
                    }
}
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(urlStack.size()<=1) return;
                    try
                    {
                         urlStack.pop();
                         String urlString = (String)urlStack.peek();
                         jtf.setText(urlString);
                         edp.setPage(urlString);
                    }
                    catch(IOException e)
                    {
                         JOptionPane.showMessageDialog(edp,"No such file or directory");
                    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void edpHyperlinkUpdate(javax.swing.event.HyperlinkEvent evt) {//GEN-FIRST:event_edpHyperlinkUpdate
         
        if(evt.getEventType() == HyperlinkEvent.EventType.ACTIVATED)
                    {
                         try
                         {
                              urlStack.push(evt.getURL().toString());
                              jtf.setText(evt.getURL().toString());

                              edp.setPage(evt.getURL());
                         }
                         catch(IOException e)
                         {
                            
                              edp.setText("Error: " + e);
                         }
                    }
         edp.setEditable(false);
    }//GEN-LAST:event_edpHyperlinkUpdate

    private void jtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfActionPerformed
        
    }//GEN-LAST:event_jtfActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() 
            {
                new web3("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JEditorPane edp;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.TextField jtf;
    // End of variables declaration//GEN-END:variables
}
