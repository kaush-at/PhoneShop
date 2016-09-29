/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycom.mytest1.view;

import com.mysql.jdbc.log.LogFactory;
import java.io.IOException;
import java.util.logging.FileHandler;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;



/**
 *
 * @author kaushika
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
    }

  static Logger logger=Logger.getLogger(MainWindow.class);
 // private static final Logger logger=LogFactory.getLogger(MainWindow.class);
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPaneMain = new javax.swing.JSplitPane();
        jPanelMenu = new javax.swing.JPanel();
        jButtonInvoice = new javax.swing.JButton();
        jButtonPurchase = new javax.swing.JButton();
        jButtonBank = new javax.swing.JButton();
        jButtonReports = new javax.swing.JButton();
        jButtonQuickStock = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonRepair = new javax.swing.JButton();
        jButtonDebtors = new javax.swing.JButton();
        jPanelContent = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPaneMain.setDividerLocation(140);
        jSplitPaneMain.setDividerSize(4);

        jPanelMenu.setBackground(new java.awt.Color(204, 204, 204));
        jPanelMenu.setPreferredSize(new java.awt.Dimension(1000, 1000));

        jButtonInvoice.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonInvoice.setText("Create Invoce");
        jButtonInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInvoiceActionPerformed(evt);
            }
        });

        jButtonPurchase.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonPurchase.setText("Purchase");
        jButtonPurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPurchaseActionPerformed(evt);
            }
        });

        jButtonBank.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonBank.setText("Bank Details");
        jButtonBank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBankActionPerformed(evt);
            }
        });

        jButtonReports.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonReports.setText("Reports");
        jButtonReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReportsActionPerformed(evt);
            }
        });

        jButtonQuickStock.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonQuickStock.setText("Quick Stock");
        jButtonQuickStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQuickStockActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Menu");

        jButtonRepair.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonRepair.setText("Repair");
        jButtonRepair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRepairActionPerformed(evt);
            }
        });

        jButtonDebtors.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonDebtors.setText("Debtors");
        jButtonDebtors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDebtorsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMenuLayout = new javax.swing.GroupLayout(jPanelMenu);
        jPanelMenu.setLayout(jPanelMenuLayout);
        jPanelMenuLayout.setHorizontalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButtonQuickStock, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonReports, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonBank, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonPurchase, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonInvoice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonRepair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonDebtors, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelMenuLayout.setVerticalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addComponent(jButtonInvoice)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonPurchase)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonBank)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonReports)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonQuickStock)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonRepair)
                .addGap(13, 13, 13)
                .addComponent(jButtonDebtors)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSplitPaneMain.setLeftComponent(jPanelMenu);

        jPanelContent.setBackground(new java.awt.Color(153, 153, 153));
        jPanelContent.setPreferredSize(new java.awt.Dimension(1000, 800));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("        The Phone House Manager");
        jLabel2.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout jPanelContentLayout = new javax.swing.GroupLayout(jPanelContent);
        jPanelContent.setLayout(jPanelContentLayout);
        jPanelContentLayout.setHorizontalGroup(
            jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContentLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelContentLayout.setVerticalGroup(
            jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(973, Short.MAX_VALUE))
        );

        jSplitPaneMain.setRightComponent(jPanelContent);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPaneMain)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPaneMain)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInvoiceActionPerformed
        InvoiceManager im=new InvoiceManager();
        jSplitPaneMain.setRightComponent(im);
    }//GEN-LAST:event_jButtonInvoiceActionPerformed

    private void jButtonRepairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRepairActionPerformed
        RepairManager rm=new RepairManager();
        jSplitPaneMain.setRightComponent(rm);
    }//GEN-LAST:event_jButtonRepairActionPerformed

    private void jButtonPurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPurchaseActionPerformed
        PurchaseManager1 pm=new PurchaseManager1();
        jSplitPaneMain.setRightComponent(pm);
    }//GEN-LAST:event_jButtonPurchaseActionPerformed

    private void jButtonQuickStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQuickStockActionPerformed
        StockManager sm= new StockManager();
        jSplitPaneMain.setRightComponent(sm);
                
    }//GEN-LAST:event_jButtonQuickStockActionPerformed

    private void jButtonBankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBankActionPerformed
        BankDetailManager bm= new BankDetailManager();
        jSplitPaneMain.setRightComponent(bm);
    }//GEN-LAST:event_jButtonBankActionPerformed

    private void jButtonReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReportsActionPerformed
        ReportManager rptm= new ReportManager();
        jSplitPaneMain.setRightComponent(rptm);
    }//GEN-LAST:event_jButtonReportsActionPerformed

    private void jButtonDebtorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDebtorsActionPerformed
        DebtorManager dm=new DebtorManager();
        jSplitPaneMain.setRightComponent(dm);
    }//GEN-LAST:event_jButtonDebtorsActionPerformed

    /**
     * @param args the command line arguments
     */
    
      	static FileHandler fileTxt;
    public static void main(String args[]) throws IOException {
     
        BasicConfigurator.configure();
        
        fileTxt =new FileHandler("F:\\Project\\1EMS\\myTest1\\src\\projectlog.log");
        logger.info("Logeer info********************");
			if(logger.isDebugEnabled()){
			logger.debug("This is debug : ");
		}
		
		if(logger.isInfoEnabled()){
			logger.info("This is info : " );
		}
		
		logger.warn("This is warn : " );
		logger.error("This is error : " );
		logger.fatal("This is fatal : " );
	

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBank;
    private javax.swing.JButton jButtonDebtors;
    private javax.swing.JButton jButtonInvoice;
    private javax.swing.JButton jButtonPurchase;
    private javax.swing.JButton jButtonQuickStock;
    private javax.swing.JButton jButtonRepair;
    private javax.swing.JButton jButtonReports;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanelContent;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JSplitPane jSplitPaneMain;
    // End of variables declaration//GEN-END:variables
}
