/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Core.Utils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author user
 */
public class CorpusStatistics extends javax.swing.JInternalFrame {

    /**
     * Creates new form CorpusStatistics
     */
    public CorpusStatistics() throws FileNotFoundException, IOException {
        initComponents();
         Utils utils = new Utils();        
        File PLStatistics = new File("F:\\tmp\\321\\PLStatistics.txt");
        File PLdictionnary = new File("F:\\tmp\\321\\PLdictionnary.txt");
        
        ArrayList<String> Statistics = utils.LoadFileToArrayList(PLStatistics);
        Map<String, Integer> Dictionnary = utils.LoadFileToMapStringIntegerList(PLdictionnary);
        
                
        NumberOfDocuments.setText(String.valueOf(Statistics.size()));
        
        double  TotalLength = 0.0;
        for(String w : Statistics){
            TotalLength +=  Integer.parseInt(w.split(",")[1]);
        }
        AverageDocumentLength.setText(String.valueOf(TotalLength/Statistics.size()).split("\\.")[0]);
        
        CollectionSize.setText(String.valueOf(TotalLength).split("\\.")[0]);
        
        VocabularySize.setText(String.valueOf(Dictionnary.size()));
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        NumberOfDocuments = new javax.swing.JLabel();
        AverageDocumentLength = new javax.swing.JLabel();
        VocabularySize = new javax.swing.JLabel();
        CollectionSize = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1024, 700));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Statistics"));

        jLabel1.setText("Number of Documents");

        jLabel2.setText("Average Document Length (words)");

        jLabel3.setText("Vocabulary Size (words)");

        jLabel4.setText("Collection size (words)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CollectionSize)
                    .addComponent(VocabularySize)
                    .addComponent(AverageDocumentLength)
                    .addComponent(NumberOfDocuments))
                .addContainerGap(765, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(NumberOfDocuments))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(AverageDocumentLength))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(VocabularySize))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CollectionSize))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(517, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AverageDocumentLength;
    private javax.swing.JLabel CollectionSize;
    private javax.swing.JLabel NumberOfDocuments;
    private javax.swing.JLabel VocabularySize;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
