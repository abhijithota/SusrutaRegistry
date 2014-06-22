/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NewJFrame.java
 *
 * Created on Jun 9, 2012, 10:53:25 AM
 */
/**
 *
 * @author Abhijit
 */
import java.util.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;


public class NewJFrame extends javax.swing.JFrame {

    int Q = 1;
    int X = 2;
    int W = 3;
    private JTable Qtable;
    private JTable Xtable;
    private JTable Wtable;
    
    static int selectedQ;
    static int Qcount;
    
    static int selectedW;
    static int Wcount;
    
    static int selectedX;
    static int Xcount;
    
    int IndexQ;
    int IndexW;
    int IndexX;
    
    int [] indexBookQ =  new int[200];
    int [] indexBookX =  new int[200];
    int [] indexBookW =  new int[200];
    
    String[] columnNames = { "Name", "Age", "Gender", "Consult", "Time" };
    String[][] tableData = {{"Name", "Age", "Gender", "Consult", "Time"}};

    /** Creates new form NewJFrame */
    public NewJFrame() {
        Qtable = new JTable(tableData, columnNames);
        Xtable = new JTable(tableData, columnNames);
        Wtable = new JTable(tableData, columnNames);
        
        ListSelectionModel lsmQ = Qtable.getSelectionModel();
        lsmQ.addListSelectionListener(new ListSelectionHandlerClassQ());
        Qtable.setSelectionModel(lsmQ);
        
        ListSelectionModel lsmW = Wtable.getSelectionModel();
        lsmW.addListSelectionListener(new ListSelectionHandlerClassW());
        Wtable.setSelectionModel(lsmW);
        
        ListSelectionModel lsmX = Xtable.getSelectionModel();
        lsmX.addListSelectionListener(new ListSelectionHandlerClassX());
        Xtable.setSelectionModel(lsmX);
        
        SusrutaApp initsa = new SusrutaApp();
        initsa.setLastTable();
        ResultSet initrsQ = initsa.getData(Q);
        ResultSet initrsiQ = initsa.getIndex(Q);
        ResultSet initrsX = initsa.getData(X);
        ResultSet initrsiX = initsa.getIndex(X);
        ResultSet initrsW = initsa.getData(W);
        ResultSet initrsiW = initsa.getIndex(W);
        initComponents();
        fillQTablePanel(initrsQ, initrsiQ);
        fillXTablePanel(initrsX, initrsiX);
        fillWTablePanel(initrsW, initrsiW);
        
        clockThread p = new clockThread();
        p.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane(Qtable);
        jScrollPane2 = new javax.swing.JScrollPane(Xtable);
        jButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane(Wtable);
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel1.setText("Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel2.setText("Age");

        jButton1.setText("Add");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel3.setText("Gender");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("M");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("F");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel4.setText("Consultation");

        buttonGroup2.add(jRadioButton3);
        jRadioButton3.setText("1st");

        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setText("2nd");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arrowL.png"))); // NOI18N
        jButton2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arrowU.png"))); // NOI18N
        jButton3.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arrowD.png"))); // NOI18N
        jButton4.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24));
        jLabel5.setText("QUEUE");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24));
        jLabel6.setText("DONE");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24));
        jLabel7.setText("BACKLOG");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        jLabel8.setText("jLabel8");

        jMenu1.setText("File");

        jMenuItem1.setText("New");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseReleased(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Exit");
        jMenuItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuItem2MouseReleased(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem3.setText("Delete");
        jMenuItem3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuItem3MouseReleased(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton1)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jRadioButton3)
                                            .addGap(18, 18, 18)
                                            .addComponent(jRadioButton4)))
                                    .addGap(5, 5, 5)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel8)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(jLabel7))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton4)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(267, 267, 267))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(jButton3))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jButton2)
                        .addGap(63, 63, 63)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(353, 353, 353)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 464, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(152, 152, 152))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jScrollPane1, jScrollPane2, jScrollPane3});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jRadioButton3)
                                .addComponent(jRadioButton4)))
                        .addGap(44, 44, 44)
                        .addComponent(jButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4)
                            .addComponent(jButton3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addComponent(jButton2)
                                .addGap(117, 117, 117))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jScrollPane1, jScrollPane2, jScrollPane3});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        String nm = jTextField1.getText();
        String ags = jTextField2.getText();
        int ag = Integer.parseInt(ags);
        char gn = 0;
        int cn = 0;
        if (jRadioButton1.isSelected()) {
            gn = 'M';
        } else if (jRadioButton2.isSelected()) {
            gn = 'F';
        }

        if (jRadioButton3.isSelected()) {
            cn = 1;
        } else if (jRadioButton4.isSelected()) {
            cn = 2;
        }

        SusrutaApp sa = new SusrutaApp();
        sa.addEntry(nm, ag, gn, cn);
        ResultSet rsQ = sa.getData(Q);
        ResultSet rsiQ = sa.getIndex(Q);
        fillQTablePanel(rsQ, rsiQ);
        

        jTextField1.setText("");
        jTextField2.setText("");
        buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        SusrutaApp samX = new SusrutaApp();
        int rowsAffected = samX.moveTo(selectedQ, 2);
        if (rowsAffected > 0)
        {
            ResultSet rsmQ = samX.getData(Q);
            ResultSet rsimQ = samX.getIndex(Q);
            ResultSet rsmX = samX.getData(X);
            ResultSet rsimX = samX.getIndex(X);
            fillQTablePanel(rsmQ, rsimQ);
            fillXTablePanel(rsmX, rsimX);
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        SusrutaApp samW1 = new SusrutaApp();
        int rowsAffected = samW1.moveTo(selectedQ, 3);
        if (rowsAffected > 0)
        {
            ResultSet rsmQ = samW1.getData(Q);
            ResultSet rsimQ = samW1.getIndex(Q);
            ResultSet rsmW = samW1.getData(W);
            ResultSet rsimW = samW1.getIndex(W);
            fillQTablePanel(rsmQ, rsimQ);
            fillWTablePanel(rsmW, rsimW);
        }
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        SusrutaApp samW2 = new SusrutaApp();
        int rowsAffected = samW2.moveTo(selectedW, 2);
        if (rowsAffected > 0)
        {
            ResultSet rsmW = samW2.getData(W);
            ResultSet rsimW = samW2.getIndex(W);
            ResultSet rsmX = samW2.getData(X);
            ResultSet rsimX = samW2.getIndex(X);
            fillWTablePanel(rsmW, rsimW);
            fillXTablePanel(rsmX, rsimX);
        }
    }//GEN-LAST:event_jButton4MouseClicked

    private void jMenuItem1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseReleased
        // TODO add your handling code here:
        SusrutaApp saNew = new SusrutaApp();
        saNew.newTable();
        saNew.setLastTable();
        fillQTablePanel(null, null);
        fillXTablePanel(null, null);
    }//GEN-LAST:event_jMenuItem1MouseReleased

    private void jMenuItem2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem2MouseReleased
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2MouseReleased

    private void jMenuItem3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem3MouseReleased
        // TODO add your handling code here:
        int reply = JOptionPane.showConfirmDialog(null, "Are u sure you want to delete the record???", "Confirm delete...", JOptionPane.YES_NO_CANCEL_OPTION);
        if(reply == JOptionPane.YES_OPTION)
        {
            SusrutaApp samXr = new SusrutaApp();
            int rowsAffected = samXr.deleteEntry(selectedX);
            if (rowsAffected > 0)
            {
                ResultSet rsmX = samXr.getData(X);
                ResultSet rsimX = samXr.getIndex(X);
                fillXTablePanel(rsmX, rsimX);
            }
        }
    }//GEN-LAST:event_jMenuItem3MouseReleased

    private void fillQTablePanel(ResultSet rsQ, ResultSet rsiQ) {
        DefaultTableModel QTableModel = new DefaultTableModel();
        Qcount = 0;
        for(int i = 0; i < 5; i++)
        {
            QTableModel.addColumn(columnNames[i]);
        }
        Qtable.setModel(QTableModel);  
        try {
            while (rsQ.next()) {
                rsiQ.next();
                indexBookQ[rsiQ.getRow()-1] = rsiQ.getInt(1);
                Object[] rowData = new Object[5];
                Qcount++;
                for (int i = 0; i < 5; i++) {
                    rowData[i] = rsQ.getObject(i + 1);
                }
                QTableModel.addRow(rowData);
                Qtable.setModel(QTableModel);
            }
        }
        catch (Exception e) {}
        Qtable.repaint();
        jScrollPane1.repaint();
        if(Qcount > 0)
        {
            selectedQ = indexBookQ[0];
        }
        else
        {
            selectedQ = -1;
        }
    }
    
    
    private void fillXTablePanel(ResultSet rsX, ResultSet rsiX) {
        DefaultTableModel XTableModel = new DefaultTableModel();
        for(int i = 0; i < 5; i++)
        {
            XTableModel.addColumn(columnNames[i]);
        }
        Xtable.setModel(XTableModel);
        try {
            while (rsX.next()) {
                rsiX.next();
                indexBookX[rsiX.getRow()-1] = rsiX.getInt(1);
                Object[] rowData = new Object[5];
                for (int i = 0; i < 5; i++) {
                    rowData[i] = rsX.getObject(i + 1);
                }
                XTableModel.addRow(rowData);
                Xtable.setModel(XTableModel);
            }
        }
        catch (Exception e) {}
        Xtable.repaint();
        jScrollPane2.repaint();
    }
    
    private void fillWTablePanel(ResultSet rsW, ResultSet rsiW) {
        DefaultTableModel WTableModel = new DefaultTableModel();
        Wcount = 0;
        for(int i = 0; i < 5; i++)
        {
            WTableModel.addColumn(columnNames[i]);
        }
        Wtable.setModel(WTableModel);
        try {
            while (rsW.next()) {
                rsiW.next();
                indexBookW[rsiW.getRow()-1] = rsiW.getInt(1);
                Object[] rowData = new Object[5];
                Wcount++;
                for (int i = 0; i < 5; i++) {
                    rowData[i] = rsW.getObject(i + 1);
                }
                WTableModel.addRow(rowData);
                Wtable.setModel(WTableModel);
            }
        }
        catch (Exception e) {}
        Wtable.repaint();
        jScrollPane3.repaint();
        if(Wcount > 0)
        {
            selectedW = indexBookW[0];
        }
        else
        {
            selectedW = -1;
        }
    }
    
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

class ListSelectionHandlerClassQ implements ListSelectionListener   {
    
        public void valueChanged(ListSelectionEvent e) {
            ListSelectionModel elsm = (ListSelectionModel)e.getSource();
            IndexQ = elsm.getMaxSelectionIndex();
            if (IndexQ >= 0)
            {
                selectedQ = indexBookQ[IndexQ];
            }
            else
            {
                selectedQ = indexBookQ[0];
            }
        }
}


class ListSelectionHandlerClassW implements ListSelectionListener   {
    
        public void valueChanged(ListSelectionEvent e) {
            ListSelectionModel elsm = (ListSelectionModel)e.getSource();
            IndexW = elsm.getMaxSelectionIndex();
            if (IndexW >= 0)
            {
                selectedW = indexBookW[IndexW];
            }
            else
            {
                selectedW = indexBookW[0];
            }
        }
}


class ListSelectionHandlerClassX implements ListSelectionListener   {
    
        public void valueChanged(ListSelectionEvent e) {
            ListSelectionModel elsm = (ListSelectionModel)e.getSource();
            IndexX = elsm.getMaxSelectionIndex();
            if (IndexX >= 0)
            {
                selectedX = indexBookX[IndexX];
            }
            else
            {
                selectedX = indexBookX[0];
            }
        }
}


class clockThread extends Thread {
         public void run() {
             Date date;
		SimpleDateFormat formatter;
		String strdate;
		while(true)
		{
                    try{
                        date=new Date();
                        formatter = new SimpleDateFormat("h:mm:ss a   dd-MM-yyyy");
                        strdate=formatter.format(date);
                        jLabel8.setText(strdate);
                        Thread.sleep(1000);
                    }
                    catch(InterruptedException e){}
		}
         }
     }

}