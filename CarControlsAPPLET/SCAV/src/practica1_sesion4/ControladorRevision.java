/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_sesion4;

public class ControladorRevision extends javax.swing.JPanel {

    /**
     * Creates new form ControladorRevision
     */
    
    boolean cambiarAceite = false, cambiarFrenos = false, cambiarGeneral = false;
    
    public ControladorRevision() {
        initComponents();
    }

    public void ejecutar(double pAceite, double rAceite, double pFrenos, double rFrenos, double pGeneral, double rGeneral) {

        porcentajeAceite.setLcdValue(pAceite);
        porcentajeFrenos.setLcdValue(pFrenos);
        porcentajeGeneral.setLcdValue(pGeneral);
        
        revolucionesAceite.setLcdValue(rAceite);
        revolucionesFrenos.setLcdValue(rFrenos);
        revolucionesGeneral.setLcdValue(rGeneral);
        
        if (pAceite <= 20.0) {
            ledAceite.setLedOn(true);
        } else {
            ledAceite.setLedOn(false);
        }
        
        if (pFrenos <= 20.0) {
            ledFrenos.setLedOn(true);
        } else {
            ledFrenos.setLedOn(false);
        }
        
        if (pGeneral <= 20.0) {
            ledGeneral.setLedOn(true);
        } else {
            ledGeneral.setLedOn(false);
        }

    }

    public boolean isCambiarAceite() {
        boolean aDevolver = cambiarAceite;
        cambiarAceite = false;
        return aDevolver;
    }

    public boolean isCambiarFrenos() {
        boolean aDevolver = cambiarFrenos;
        cambiarFrenos = false;
        return aDevolver;
    }

    public boolean isCambiarGeneral() {
        boolean aDevolver = cambiarGeneral;
        cambiarGeneral = false;
        return aDevolver;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ledAceite = new eu.hansolo.steelseries.extras.Led();
        ledFrenos = new eu.hansolo.steelseries.extras.Led();
        ledGeneral = new eu.hansolo.steelseries.extras.Led();
        botonAceite = new javax.swing.JButton();
        botonFrenos = new javax.swing.JButton();
        botonGeneral = new javax.swing.JButton();
        porcentajeAceite = new eu.hansolo.steelseries.gauges.DisplaySingle();
        porcentajeFrenos = new eu.hansolo.steelseries.gauges.DisplaySingle();
        porcentajeGeneral = new eu.hansolo.steelseries.gauges.DisplaySingle();
        revolucionesAceite = new eu.hansolo.steelseries.gauges.DisplaySingle();
        revolucionesFrenos = new eu.hansolo.steelseries.gauges.DisplaySingle();
        revolucionesGeneral = new eu.hansolo.steelseries.gauges.DisplaySingle();

        javax.swing.GroupLayout ledAceiteLayout = new javax.swing.GroupLayout(ledAceite);
        ledAceite.setLayout(ledAceiteLayout);
        ledAceiteLayout.setHorizontalGroup(
            ledAceiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );
        ledAceiteLayout.setVerticalGroup(
            ledAceiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ledFrenosLayout = new javax.swing.GroupLayout(ledFrenos);
        ledFrenos.setLayout(ledFrenosLayout);
        ledFrenosLayout.setHorizontalGroup(
            ledFrenosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );
        ledFrenosLayout.setVerticalGroup(
            ledFrenosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ledGeneralLayout = new javax.swing.GroupLayout(ledGeneral);
        ledGeneral.setLayout(ledGeneralLayout);
        ledGeneralLayout.setHorizontalGroup(
            ledGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );
        ledGeneralLayout.setVerticalGroup(
            ledGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );

        botonAceite.setBackground(new java.awt.Color(1, 1, 1));
        botonAceite.setForeground(new java.awt.Color(254, 254, 254));
        botonAceite.setText("Revision Aceite");
        botonAceite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceiteActionPerformed(evt);
            }
        });

        botonFrenos.setBackground(new java.awt.Color(1, 1, 1));
        botonFrenos.setForeground(new java.awt.Color(254, 254, 254));
        botonFrenos.setText("Revision Frenos");
        botonFrenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFrenosActionPerformed(evt);
            }
        });

        botonGeneral.setBackground(new java.awt.Color(1, 1, 1));
        botonGeneral.setForeground(new java.awt.Color(254, 254, 254));
        botonGeneral.setText("Revision General");
        botonGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGeneralActionPerformed(evt);
            }
        });

        porcentajeAceite.setLcdColor(eu.hansolo.steelseries.tools.LcdColor.CUSTOM);
        porcentajeAceite.setLcdUnitString("%");

        javax.swing.GroupLayout porcentajeAceiteLayout = new javax.swing.GroupLayout(porcentajeAceite);
        porcentajeAceite.setLayout(porcentajeAceiteLayout);
        porcentajeAceiteLayout.setHorizontalGroup(
            porcentajeAceiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 114, Short.MAX_VALUE)
        );
        porcentajeAceiteLayout.setVerticalGroup(
            porcentajeAceiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        porcentajeFrenos.setLcdColor(eu.hansolo.steelseries.tools.LcdColor.CUSTOM);
        porcentajeFrenos.setLcdUnitString("%");

        javax.swing.GroupLayout porcentajeFrenosLayout = new javax.swing.GroupLayout(porcentajeFrenos);
        porcentajeFrenos.setLayout(porcentajeFrenosLayout);
        porcentajeFrenosLayout.setHorizontalGroup(
            porcentajeFrenosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 114, Short.MAX_VALUE)
        );
        porcentajeFrenosLayout.setVerticalGroup(
            porcentajeFrenosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        porcentajeGeneral.setLcdColor(eu.hansolo.steelseries.tools.LcdColor.CUSTOM);
        porcentajeGeneral.setLcdUnitString("%");

        javax.swing.GroupLayout porcentajeGeneralLayout = new javax.swing.GroupLayout(porcentajeGeneral);
        porcentajeGeneral.setLayout(porcentajeGeneralLayout);
        porcentajeGeneralLayout.setHorizontalGroup(
            porcentajeGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 114, Short.MAX_VALUE)
        );
        porcentajeGeneralLayout.setVerticalGroup(
            porcentajeGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        revolucionesAceite.setLcdColor(eu.hansolo.steelseries.tools.LcdColor.CUSTOM);
        revolucionesAceite.setLcdUnitString("revoluciones ultima revision");

        javax.swing.GroupLayout revolucionesAceiteLayout = new javax.swing.GroupLayout(revolucionesAceite);
        revolucionesAceite.setLayout(revolucionesAceiteLayout);
        revolucionesAceiteLayout.setHorizontalGroup(
            revolucionesAceiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 272, Short.MAX_VALUE)
        );
        revolucionesAceiteLayout.setVerticalGroup(
            revolucionesAceiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        revolucionesFrenos.setLcdColor(eu.hansolo.steelseries.tools.LcdColor.CUSTOM);
        revolucionesFrenos.setLcdUnitString("revoluciones ultima revision");

        javax.swing.GroupLayout revolucionesFrenosLayout = new javax.swing.GroupLayout(revolucionesFrenos);
        revolucionesFrenos.setLayout(revolucionesFrenosLayout);
        revolucionesFrenosLayout.setHorizontalGroup(
            revolucionesFrenosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 272, Short.MAX_VALUE)
        );
        revolucionesFrenosLayout.setVerticalGroup(
            revolucionesFrenosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        revolucionesGeneral.setLcdColor(eu.hansolo.steelseries.tools.LcdColor.CUSTOM);
        revolucionesGeneral.setLcdUnitString("revoluciones ultima revision");

        javax.swing.GroupLayout revolucionesGeneralLayout = new javax.swing.GroupLayout(revolucionesGeneral);
        revolucionesGeneral.setLayout(revolucionesGeneralLayout);
        revolucionesGeneralLayout.setHorizontalGroup(
            revolucionesGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 272, Short.MAX_VALUE)
        );
        revolucionesGeneralLayout.setVerticalGroup(
            revolucionesGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(botonGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .addComponent(botonAceite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonFrenos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ledFrenos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ledAceite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ledGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(porcentajeGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(porcentajeFrenos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(porcentajeAceite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(revolucionesAceite, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(revolucionesFrenos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(revolucionesGeneral, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonAceite, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ledAceite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(porcentajeAceite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(revolucionesAceite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(porcentajeFrenos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(revolucionesFrenos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(porcentajeGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(revolucionesGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ledFrenos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonFrenos, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ledGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(166, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonAceiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceiteActionPerformed
        cambiarAceite = true;
    }//GEN-LAST:event_botonAceiteActionPerformed

    private void botonFrenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFrenosActionPerformed
        cambiarFrenos = true;
    }//GEN-LAST:event_botonFrenosActionPerformed

    private void botonGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGeneralActionPerformed
        cambiarGeneral = true;
    }//GEN-LAST:event_botonGeneralActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceite;
    private javax.swing.JButton botonFrenos;
    private javax.swing.JButton botonGeneral;
    private eu.hansolo.steelseries.extras.Led ledAceite;
    private eu.hansolo.steelseries.extras.Led ledFrenos;
    private eu.hansolo.steelseries.extras.Led ledGeneral;
    private eu.hansolo.steelseries.gauges.DisplaySingle porcentajeAceite;
    private eu.hansolo.steelseries.gauges.DisplaySingle porcentajeFrenos;
    private eu.hansolo.steelseries.gauges.DisplaySingle porcentajeGeneral;
    private eu.hansolo.steelseries.gauges.DisplaySingle revolucionesAceite;
    private eu.hansolo.steelseries.gauges.DisplaySingle revolucionesFrenos;
    private eu.hansolo.steelseries.gauges.DisplaySingle revolucionesGeneral;
    // End of variables declaration//GEN-END:variables
}
