/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arduinoguicontrol;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSlider;

/**
 *
 * @author mark
 */
public class mainFrame extends javax.swing.JFrame {

    /**
     * Creates new form mainFrame
     */
    ArrayList<String>portslist   ;
    
    //600, 1200, 2400, 4800, 9600, 14400, 19200, 38400, 57600, 115200, 128000 , 256000
    String []baudlist = {"600","1200" ,"2400","4800","9600","19200","38400" ,
                         "57600","115200","128000","256000"} ;
    
    private final MyComPort serialport = new MyComPort() ;
    @SuppressWarnings("unchecked")
    public mainFrame() {
        initComponents();
       
        portslist = serialport.getPorts() ;
        this.baudCombo.setModel(new DefaultComboBoxModel(baudlist));
        
        for (int x = 0 ; x < portslist.size(); x++){
        this.portsCombo.addItem(portslist.get(x));
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        portsPanel = new javax.swing.JPanel();
        portsCombo = new javax.swing.JComboBox<>();
        labelPorts = new javax.swing.JLabel();
        baudCombo = new javax.swing.JComboBox<>();
        baudLabel = new javax.swing.JLabel();
        btnPortOpen = new javax.swing.JButton();
        btnClosePort = new javax.swing.JButton();
        controlsPanel = new javax.swing.JPanel();
        redPanel = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        rSlider = new javax.swing.JSlider();
        greenPanel = new javax.swing.JPanel();
        gSlider = new javax.swing.JSlider();
        jButton2 = new javax.swing.JButton();
        bluePanel = new javax.swing.JPanel();
        bSlider = new javax.swing.JSlider();
        jButton1 = new javax.swing.JButton();
        pnlLCDDisplay = new javax.swing.JPanel();
        lcdPnlred = new javax.swing.JPanel();
        redLabel = new javax.swing.JLabel();
        lcdPnlgreen = new javax.swing.JPanel();
        greenLabel = new javax.swing.JLabel();
        lcdPnlblue = new javax.swing.JPanel();
        blueLabel = new javax.swing.JLabel();
        TitlePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Serial Desktop Controller for Arduino MD Harrington");
        setBackground(new java.awt.Color(0, 0, 0));
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(681, 586));
        setName("mainF"); // NOI18N
        setSize(new java.awt.Dimension(400, 587));

        portsPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        portsCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                portsComboActionPerformed(evt);
            }
        });

        labelPorts.setText("Serial Ports");

        baudCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baudComboActionPerformed(evt);
            }
        });

        baudLabel.setText("Baud Rate");

        btnPortOpen.setText("Open Com Port");
        btnPortOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPortOpenActionPerformed(evt);
            }
        });

        btnClosePort.setText("Close Com Port");

        javax.swing.GroupLayout portsPanelLayout = new javax.swing.GroupLayout(portsPanel);
        portsPanel.setLayout(portsPanelLayout);
        portsPanelLayout.setHorizontalGroup(
            portsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, portsPanelLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(portsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(portsPanelLayout.createSequentialGroup()
                        .addGroup(portsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelPorts, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(baudLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(portsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(baudCombo, 0, 180, Short.MAX_VALUE)
                            .addComponent(portsCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, portsPanelLayout.createSequentialGroup()
                        .addComponent(btnPortOpen, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnClosePort, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        portsPanelLayout.setVerticalGroup(
            portsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(portsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(portsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(portsCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPorts))
                .addGap(18, 18, 18)
                .addGroup(portsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(baudCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(baudLabel))
                .addGap(39, 39, 39)
                .addGroup(portsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPortOpen)
                    .addComponent(btnClosePort))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        controlsPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        redPanel.setBackground(new java.awt.Color(220, 126, 33));

        jButton3.setText("Red");
        jButton3.setMaximumSize(new java.awt.Dimension(55, 29));
        jButton3.setMinimumSize(new java.awt.Dimension(55, 29));

        rSlider.setMajorTickSpacing(51);
        rSlider.setMaximum(255);
        rSlider.setMinorTickSpacing(5);
        rSlider.setOrientation(javax.swing.JSlider.VERTICAL);
        rSlider.setPaintLabels(true);
        rSlider.setPaintTicks(true);
        rSlider.setValue(0);
        rSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rSliderStateChanged(evt);
            }
        });

        javax.swing.GroupLayout redPanelLayout = new javax.swing.GroupLayout(redPanel);
        redPanel.setLayout(redPanelLayout);
        redPanelLayout.setHorizontalGroup(
            redPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(redPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(rSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        redPanelLayout.setVerticalGroup(
            redPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(redPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(rSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        greenPanel.setBackground(new java.awt.Color(213, 127, 40));

        gSlider.setMajorTickSpacing(51);
        gSlider.setMaximum(255);
        gSlider.setMinorTickSpacing(5);
        gSlider.setOrientation(javax.swing.JSlider.VERTICAL);
        gSlider.setPaintLabels(true);
        gSlider.setPaintTicks(true);
        gSlider.setValue(0);
        gSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                gSliderStateChanged(evt);
            }
        });

        jButton2.setText("Green");

        javax.swing.GroupLayout greenPanelLayout = new javax.swing.GroupLayout(greenPanel);
        greenPanel.setLayout(greenPanelLayout);
        greenPanelLayout.setHorizontalGroup(
            greenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(greenPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(gSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        greenPanelLayout.setVerticalGroup(
            greenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(greenPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(gSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jButton2))
        );

        bluePanel.setBackground(new java.awt.Color(221, 128, 35));
        bluePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bSlider.setMajorTickSpacing(51);
        bSlider.setMaximum(255);
        bSlider.setMinorTickSpacing(5);
        bSlider.setOrientation(javax.swing.JSlider.VERTICAL);
        bSlider.setPaintLabels(true);
        bSlider.setPaintTicks(true);
        bSlider.setValue(0);
        bSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                bSliderStateChanged(evt);
            }
        });
        bluePanel.add(bSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 60, 300));

        jButton1.setText("Blue");
        bluePanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 80, -1));

        javax.swing.GroupLayout controlsPanelLayout = new javax.swing.GroupLayout(controlsPanel);
        controlsPanel.setLayout(controlsPanelLayout);
        controlsPanelLayout.setHorizontalGroup(
            controlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(redPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(greenPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(bluePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        controlsPanelLayout.setVerticalGroup(
            controlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlsPanelLayout.createSequentialGroup()
                .addGroup(controlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(redPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(greenPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bluePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pnlLCDDisplay.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lcdPnlred.setBackground(new java.awt.Color(0, 0, 0));
        lcdPnlred.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lcdPnlred.setPreferredSize(new java.awt.Dimension(100, 100));
        lcdPnlred.setLayout(new java.awt.BorderLayout(5, 5));

        redLabel.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        redLabel.setForeground(new java.awt.Color(255, 0, 0));
        redLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        redLabel.setText("0");
        lcdPnlred.add(redLabel, java.awt.BorderLayout.CENTER);

        lcdPnlgreen.setBackground(new java.awt.Color(0, 0, 0));
        lcdPnlgreen.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lcdPnlgreen.setPreferredSize(new java.awt.Dimension(100, 100));
        lcdPnlgreen.setLayout(new java.awt.BorderLayout(5, 5));

        greenLabel.setBackground(new java.awt.Color(0, 0, 0));
        greenLabel.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        greenLabel.setForeground(new java.awt.Color(0, 255, 0));
        greenLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        greenLabel.setText("0");
        lcdPnlgreen.add(greenLabel, java.awt.BorderLayout.CENTER);

        lcdPnlblue.setBackground(new java.awt.Color(0, 0, 0));
        lcdPnlblue.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lcdPnlblue.setPreferredSize(new java.awt.Dimension(100, 100));
        lcdPnlblue.setLayout(new java.awt.BorderLayout(5, 5));

        blueLabel.setBackground(new java.awt.Color(1, 1, 1));
        blueLabel.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        blueLabel.setForeground(new java.awt.Color(0, 0, 255));
        blueLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        blueLabel.setText("0");
        lcdPnlblue.add(blueLabel, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout pnlLCDDisplayLayout = new javax.swing.GroupLayout(pnlLCDDisplay);
        pnlLCDDisplay.setLayout(pnlLCDDisplayLayout);
        pnlLCDDisplayLayout.setHorizontalGroup(
            pnlLCDDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLCDDisplayLayout.createSequentialGroup()
                .addComponent(lcdPnlred, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lcdPnlgreen, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lcdPnlblue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlLCDDisplayLayout.setVerticalGroup(
            pnlLCDDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lcdPnlred, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lcdPnlgreen, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lcdPnlblue, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        TitlePanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(5, 0, 255));
        jLabel1.setText("Marks Arduino Serial Contoller");

        javax.swing.GroupLayout TitlePanelLayout = new javax.swing.GroupLayout(TitlePanel);
        TitlePanel.setLayout(TitlePanelLayout);
        TitlePanelLayout.setHorizontalGroup(
            TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitlePanelLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel1)
                .addContainerGap(82, Short.MAX_VALUE))
        );
        TitlePanelLayout.setVerticalGroup(
            TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TitlePanelLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlLCDDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(controlsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(portsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(TitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlLCDDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(controlsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(portsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rSliderStateChanged
        // TODO add your handling code here:
          JSlider source = (JSlider)evt.getSource();
            if (!source.getValueIsAdjusting()) {
                 int value = (int)source.getValue();
                 String s ="r" ;
                 this.redLabel.setText(Integer.toString(value)) ;
                 
                 if (serialport.is_open()==true)
                 {
                 serialport.sendData(s, value);
                 }
                 
             }
        
        
    }//GEN-LAST:event_rSliderStateChanged

    private void gSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_gSliderStateChanged
         JSlider source = (JSlider)evt.getSource();
            if (!source.getValueIsAdjusting()) {
                 int value = (int)source.getValue();
                 String s ="g" ;
                 this.greenLabel.setText(Integer.toString(value)) ;
                 if (serialport.is_open()==true)
                 {
                
                 serialport.sendData(s, value);
                 }
             }// TODO add your handling code here:
        
        
    }//GEN-LAST:event_gSliderStateChanged

    private void bSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_bSliderStateChanged
        // TODO add your handling code here:
         JSlider source = (JSlider)evt.getSource();
            if (!source.getValueIsAdjusting()) {
                 int value = (int)source.getValue();
                 String s ="b" ;
                 this.blueLabel.setText(Integer.toString(value)) ;
                 if (serialport.is_open()==true)
                 {
                 serialport.sendData(s, value);
                 }
             }
        
        
    }//GEN-LAST:event_bSliderStateChanged

    private void portsComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_portsComboActionPerformed
        // TODO add your handling code here:
        int selected = portsCombo.getSelectedIndex();//get the selected item  
        System.out.println("Selected Port was " + selected);
        serialport.setPort(selected);
    }//GEN-LAST:event_portsComboActionPerformed

    private void baudComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baudComboActionPerformed
        // TODO add your handling code here:
        
        String baudsetting = baudCombo.getSelectedItem().toString().trim() ;
        System.out.println("Current baud rate is now  " +  baudsetting ) ;
        serialport.setBaud(Integer.parseInt(baudsetting));
        

    }//GEN-LAST:event_baudComboActionPerformed

    private void btnPortOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPortOpenActionPerformed
        // TODO add your handling code here:
        serialport.m_OpenComport(serialport.getPortNumber(), serialport.getBaud(), 8, 1);
        
        int valr = rSlider.getValue() ;
        int valg=  gSlider.getValue() ;
        int valb = bSlider.getValue();
        if (serialport.is_open()==true)
        {
                 serialport.sendData("r", valr);
                 serialport.sendData("g" ,valg) ;
                 serialport.sendData("b", valb) ;
        }
        
        
    }//GEN-LAST:event_btnPortOpenActionPerformed

    /**
     * @param args the command line arguments
     */
   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TitlePanel;
    private javax.swing.JSlider bSlider;
    private javax.swing.JComboBox<String> baudCombo;
    private javax.swing.JLabel baudLabel;
    private javax.swing.JLabel blueLabel;
    private javax.swing.JPanel bluePanel;
    private javax.swing.JButton btnClosePort;
    private javax.swing.JButton btnPortOpen;
    private javax.swing.JPanel controlsPanel;
    private javax.swing.JSlider gSlider;
    private javax.swing.JLabel greenLabel;
    private javax.swing.JPanel greenPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelPorts;
    private javax.swing.JPanel lcdPnlblue;
    private javax.swing.JPanel lcdPnlgreen;
    private javax.swing.JPanel lcdPnlred;
    private javax.swing.JPanel pnlLCDDisplay;
    private javax.swing.JComboBox<String> portsCombo;
    private javax.swing.JPanel portsPanel;
    private javax.swing.JSlider rSlider;
    private javax.swing.JLabel redLabel;
    private javax.swing.JPanel redPanel;
    // End of variables declaration//GEN-END:variables
}
