/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Core.Utils;
import java.awt.ComponentOrientation;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Mohamed Achraf BEN MOHAMED<mohamedachraf@wanadoo.fr>
 */
public class RulesManager extends javax.swing.JInternalFrame {

    /**
     * Creates new form RulesManager
     */
    public RulesManager() throws FileNotFoundException {
        initComponents();
        TableRules.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        //====================[ Rules List Manager ]============================
        String[] columnNames = {"Probability", "Left Side", "Right Side"};
        File file = new File("D:/Development/java_projects/AracPlatform_V0.1/data/PCFG/Total_rules.txt");
        Scanner x = new Scanner(file);        
        int size = 4000;               
        int i = 0;
        String[][] data = new String[size][3];
        while (x.hasNextLine()) {
            String r = x.nextLine().trim();
            data[i] = r.split("#");           
            i++;
        }
        
        TableRules.setModel(new javax.swing.table.DefaultTableModel(data, columnNames));
        jScrollPane2.setViewportView(TableRules);
        
        
        //====================[ Schemes List Manager ]==========================
        
        String[] columnNames1 = {"ف", "ع", "ل", "Schemes"};
        File file1 = new File("D:/Development/java_projects/AracPlatform_V0.1/data/include/schemesList.txt");
        Scanner x1 = new Scanner(file1);        
        int size1 = 4000;               
        i = 0;
        String[][] data1 = new String[size1][4];
        while (x1.hasNextLine()) {            
            String r = x1.nextLine().trim();
            if(r.contains(",")){
            data1[i] = r.split(",");           
            i++;
            }
        }
        
        TableSchemes.setModel(new javax.swing.table.DefaultTableModel(data1, columnNames1));        
        ScrollPane2.setViewportView(TableSchemes);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TabbedPaneCKYParser = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        PanelRules = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableRules = new javax.swing.JTable();
        ButtonDeletRow = new javax.swing.JButton();
        ButtonAddRow = new javax.swing.JButton();
        ButtonSaveToFile = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        ScrollPane2 = new javax.swing.JScrollPane();
        TableSchemes = new javax.swing.JTable();

        setBorder(null);
        setTitle("Parameters");

        PanelRules.setBorder(javax.swing.BorderFactory.createTitledBorder("Rules List Manager"));

        TableRules.setAutoCreateRowSorter(true);
        TableRules.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TableRules.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        TableRules.setRowHeight(21);
        TableRules.setShowVerticalLines(false);
        jScrollPane2.setViewportView(TableRules);

        ButtonDeletRow.setText("Delete Rule(s)");
        ButtonDeletRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDeletRowActionPerformed(evt);
            }
        });

        ButtonAddRow.setText("New Rule");
        ButtonAddRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAddRowActionPerformed(evt);
            }
        });

        ButtonSaveToFile.setText("Save to File");
        ButtonSaveToFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSaveToFileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelRulesLayout = new javax.swing.GroupLayout(PanelRules);
        PanelRules.setLayout(PanelRulesLayout);
        PanelRulesLayout.setHorizontalGroup(
            PanelRulesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRulesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 798, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(PanelRulesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ButtonDeletRow, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addComponent(ButtonAddRow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonSaveToFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        PanelRulesLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {ButtonAddRow, ButtonDeletRow});

        PanelRulesLayout.setVerticalGroup(
            PanelRulesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRulesLayout.createSequentialGroup()
                .addGroup(PanelRulesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
                    .addGroup(PanelRulesLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(ButtonAddRow)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonDeletRow)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonSaveToFile)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelRules, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelRules, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        TabbedPaneCKYParser.addTab("CKY Parser", jPanel1);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Schemes List Manager"));

        TableSchemes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TableSchemes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TableSchemes.setRowHeight(21);
        ScrollPane2.setViewportView(TableSchemes);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(439, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        TabbedPaneCKYParser.addTab("Schemes Converter", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TabbedPaneCKYParser)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TabbedPaneCKYParser)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonDeletRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDeletRowActionPerformed
        int[] rows = TableRules.getSelectedRows();
	TableModel tm= TableRules.getModel();
	while(rows.length>0)
	{
		((DefaultTableModel)tm).removeRow(TableRules.convertRowIndexToModel(rows[0]));

		rows = TableRules.getSelectedRows();
	}
	TableRules.clearSelection();
    }//GEN-LAST:event_ButtonDeletRowActionPerformed

    private void ButtonAddRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAddRowActionPerformed
        DefaultTableModel model = (DefaultTableModel) TableRules.getModel();
        model.insertRow(0, new Object[]{"","",""});
        
    }//GEN-LAST:event_ButtonAddRowActionPerformed

    private void ButtonSaveToFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSaveToFileActionPerformed
        try {
            Utils utils = new Utils();
            ArrayList<String> rules = new ArrayList<>();
            
            TableModel model = TableRules.getModel();
            for (int i = 0; i < model.getRowCount(); i++) {
                if (model.getValueAt(i, 0) != "") {
                    String rule = "";
                    for (int j = 0; j < model.getColumnCount(); j++) {
                        rule += model.getValueAt(i, j).toString();
                        if (j < model.getColumnCount() - 1) {
                            rule += "#";
                        }
                    }
                    rules.add(rule+"\n");
                }
            }
            
            utils.SaveArrayListToFile(rules, new File("D:/Development/java_projects/AracPlatform_V0.1/data/PCFG/rules.txt"));
        } catch (IOException ex) {
            Logger.getLogger(RulesManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ButtonSaveToFileActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAddRow;
    private javax.swing.JButton ButtonDeletRow;
    private javax.swing.JButton ButtonSaveToFile;
    private javax.swing.JPanel PanelRules;
    private javax.swing.JScrollPane ScrollPane2;
    private javax.swing.JTabbedPane TabbedPaneCKYParser;
    private javax.swing.JTable TableRules;
    private javax.swing.JTable TableSchemes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
