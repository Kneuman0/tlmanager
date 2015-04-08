/**
 * TL Manager
 * Copyright (C) 2015 European Commission, provided under the CEF programme
 *
 * This file is part of the "TL Manager" project.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */
package eu.europa.ec.markt.tlmanager.view.certificate;

import eu.europa.ec.markt.tlmanager.core.Configuration;

import java.util.ResourceBundle;

/**
 * A Panel for controlling the handling of properties of a certificate.
 *
 *
 */
public class CertificateProperty extends javax.swing.JPanel {

    protected static final ResourceBundle uiKeys = ResourceBundle.getBundle("eu/europa/ec/markt/tlmanager/uiKeysComponents",
            Configuration.getInstance().getLocale());
    private CertificatePropertyModel certificatePropertyModel;
    
    /** Creates new form CertificateProperty */
    public CertificateProperty() {
        initComponents();
    }

    /**
     * @return the certificatePropertyModel
     */
    public CertificatePropertyModel getCertificatePropertyModel() {
        return certificatePropertyModel;
    }

    /**
     * @param certificatePropertyModel the certificatePropertyModel to set
     */
    public void setCertificatePropertyModel(CertificatePropertyModel certificatePropertyModel) {
        this.certificatePropertyModel = certificatePropertyModel;
        refresh();
    }

    private void refresh() {
        boxSKI.setEnabled(certificatePropertyModel.isSkiAvailable());
        subjectName.setText(certificatePropertyModel.getSubjectName());
        subjectName.setCaretPosition(0);
        boxSN.setSelected(certificatePropertyModel.isSn());
        boxSKI.setSelected(certificatePropertyModel.isSki());
        boxCert.setSelected(certificatePropertyModel.isCert());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        subjectName = new javax.swing.JTextField();
        digitalIdLabel = new javax.swing.JLabel();
        boxSN = new javax.swing.JCheckBox();
        boxSKI = new javax.swing.JCheckBox();
        boxCert = new javax.swing.JCheckBox();

        setName("Form"); // NOI18N

        subjectName.setEnabled(false);
        subjectName.setName("subjectName"); // NOI18N

        digitalIdLabel.setText(uiKeys.getString("Certificate.label.useForTL")); // NOI18N
        digitalIdLabel.setName("digitalIdLabel"); // NOI18N

        boxSN.setText(uiKeys.getString("Certificate.label.subjectName")+" "+uiKeys.getString("Certificate.label.default"));
        boxSN.setName("boxSN"); // NOI18N
        boxSN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxSNActionPerformed(evt);
            }
        });

        boxSKI.setText(uiKeys.getString("Certificate.label.ski")); // NOI18N
        boxSKI.setName("boxSKI"); // NOI18N
        boxSKI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxSKIActionPerformed(evt);
            }
        });

        boxCert.setText(uiKeys.getString("Certificate.label.certificate")+" "+uiKeys.getString("Certificate.label.notRecommended"));
        boxCert.setName("boxCert"); // NOI18N
        boxCert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxCertActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(subjectName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(digitalIdLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boxSN)
                .addGap(18, 18, 18)
                .addComponent(boxSKI)
                .addGap(18, 18, 18)
                .addComponent(boxCert)
                .addContainerGap(130, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(subjectName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(digitalIdLabel)
                    .addComponent(boxSN)
                    .addComponent(boxSKI)
                    .addComponent(boxCert))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void boxSNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxSNActionPerformed
        certificatePropertyModel.setSn(boxSN.isSelected());
        refresh();
    }//GEN-LAST:event_boxSNActionPerformed

    private void boxSKIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxSKIActionPerformed
        certificatePropertyModel.setSki(boxSKI.isSelected());
        refresh();
    }//GEN-LAST:event_boxSKIActionPerformed

    private void boxCertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxCertActionPerformed
        certificatePropertyModel.setCert(boxCert.isSelected());
        refresh();
    }//GEN-LAST:event_boxCertActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox boxCert;
    private javax.swing.JCheckBox boxSKI;
    private javax.swing.JCheckBox boxSN;
    private javax.swing.JLabel digitalIdLabel;
    private javax.swing.JTextField subjectName;
    // End of variables declaration//GEN-END:variables

    /**
     * Determines, if the component is empty.
     * If there is a text in the subject name textfield, it is not empty.
     */
    public boolean isEmpty() {
        String text = subjectName.getText();
        return (text == null || text.isEmpty());
    }
}