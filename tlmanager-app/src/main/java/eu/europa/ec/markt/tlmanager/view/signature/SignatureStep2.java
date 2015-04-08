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
package eu.europa.ec.markt.tlmanager.view.signature;

import eu.europa.ec.markt.dss.common.SignatureTokenType;
import eu.europa.ec.markt.tlmanager.core.Configuration;
import eu.europa.ec.markt.tlmanager.util.Util;
import eu.europa.ec.markt.tlmanager.view.MainFrame;

import java.io.File;
import java.util.ResourceBundle;

import javax.swing.ButtonGroup;
import javax.swing.JFileChooser;

/**
 * Panel that wraps the controls for the second signature step.
 * 
 *
 *
 */

public class SignatureStep2 extends javax.swing.JPanel {
    private static final ResourceBundle uiKeys = ResourceBundle.getBundle("eu/europa/ec/markt/tlmanager/uiKeys",
            Configuration.getInstance().getLocale());

    private SignatureWizardStep2 wizard;

    /**
     * Instantiates a new signature step2.
     */
    public SignatureStep2() {
        buttonGroup = new ButtonGroup();
        initComponents();
        certificateSourceTitle.setTitle(uiKeys.getString("SignatureStep2.certificateSourceTitle.title"));
        signatureMethodTitle.setTitle(uiKeys.getString("SignatureStep2.signatureMethodTitle.title"));

        // setup with state of pkcs11 - changes are controlled by events
        radioPKCS11.setSelected(true);
        signatureMethodTitle.setVisible(true);
        passwordArea.setVisible(false);
    }

    /**
     * Instantiates a new signature step2.
     * 
     * @param wizard the related wizard
     */
    public SignatureStep2(final SignatureWizardStep2 wizard) {
        this();
        this.wizard = wizard;

        setSourceFile(wizard.getSourceFile());
        
        radioMSCAPI.setVisible(Util.isWindows());
    }

    private void setSourceFile(File source) {
        String file = "";
        if (source != null) {
            file = source.getAbsolutePath();
        }
        sourceTextField.setText(file);
    }

    /**
     * Gets the password.
     * 
     * @return the password
     */
    public char[] getPassword() {
        return password.getPassword();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
     * content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        descriptionLabel = new javax.swing.JLabel();
        signatureMethodTitle = new eu.europa.ec.markt.tlmanager.view.common.TitledPanel();
        sourceTextField = new javax.swing.JTextField();
        sourceButton = new javax.swing.JButton();
        certificateSourceTitle = new eu.europa.ec.markt.tlmanager.view.common.TitledPanel();
        radioPKCS11 = new javax.swing.JRadioButton();
        radioPKCS12 = new javax.swing.JRadioButton();
        radioMSCAPI = new javax.swing.JRadioButton();
        passwordArea = new javax.swing.JPanel();
        passwordLabel = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("eu/europa/ec/markt/tlmanager/uiKeys"); // NOI18N
        descriptionLabel.setText(bundle.getString("SignatureStep2.descriptionLabel.text")); // NOI18N

        sourceTextField.setEditable(false);

        sourceButton.setText(bundle.getString("SignatureStep2.sourceButton.text")); // NOI18N
        sourceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sourceButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout signatureMethodTitleLayout = new javax.swing.GroupLayout(signatureMethodTitle);
        signatureMethodTitle.setLayout(signatureMethodTitleLayout);
        signatureMethodTitleLayout.setHorizontalGroup(signatureMethodTitleLayout.createParallelGroup(
                javax.swing.GroupLayout.Alignment.LEADING).addGroup(
                signatureMethodTitleLayout.createSequentialGroup().addContainerGap().addComponent(sourceButton)
                        .addGap(18, 18, 18)
                        .addComponent(sourceTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                        .addContainerGap()));
        signatureMethodTitleLayout.setVerticalGroup(signatureMethodTitleLayout.createParallelGroup(
                javax.swing.GroupLayout.Alignment.LEADING).addGroup(
                javax.swing.GroupLayout.Alignment.TRAILING,
                signatureMethodTitleLayout
                        .createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(
                                signatureMethodTitleLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(sourceButton)
                                        .addComponent(sourceTextField, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)).addContainerGap()));

        buttonGroup.add(radioPKCS11);
        radioPKCS11.setText(bundle.getString("SignatureStep2.radioPKCS11.text")); // NOI18N
        radioPKCS11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioPKCS11ActionPerformed(evt);
            }
        });

        buttonGroup.add(radioPKCS12);
        radioPKCS12.setText(bundle.getString("SignatureStep2.radioPKCS12.text")); // NOI18N
        radioPKCS12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioPKCS12ActionPerformed(evt);
            }
        });

        buttonGroup.add(radioMSCAPI);
        radioMSCAPI.setText(bundle.getString("SignatureStep2.radioMSCAPI.text")); // NOI18N
        radioMSCAPI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMSCAPIActionPerformed(evt);
            }
        });

        passwordLabel.setText(bundle.getString("SignatureStep2.passwordLabel.text")); // NOI18N

        javax.swing.GroupLayout passwordAreaLayout = new javax.swing.GroupLayout(passwordArea);
        passwordArea.setLayout(passwordAreaLayout);
        passwordAreaLayout.setHorizontalGroup(passwordAreaLayout.createParallelGroup(
                javax.swing.GroupLayout.Alignment.LEADING).addGroup(
                javax.swing.GroupLayout.Alignment.TRAILING,
                passwordAreaLayout
                        .createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(passwordLabel)
                        .addGap(18, 18, 18)
                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 210,
                                javax.swing.GroupLayout.PREFERRED_SIZE).addGap(68, 68, 68)));
        passwordAreaLayout.setVerticalGroup(passwordAreaLayout.createParallelGroup(
                javax.swing.GroupLayout.Alignment.LEADING).addGroup(
                passwordAreaLayout
                        .createSequentialGroup()
                        .addContainerGap()
                        .addGroup(
                                passwordAreaLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(passwordLabel)
                                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        javax.swing.GroupLayout certificateSourceTitleLayout = new javax.swing.GroupLayout(certificateSourceTitle);
        certificateSourceTitle.setLayout(certificateSourceTitleLayout);
        certificateSourceTitleLayout.setHorizontalGroup(certificateSourceTitleLayout.createParallelGroup(
                javax.swing.GroupLayout.Alignment.LEADING).addGroup(
                certificateSourceTitleLayout
                        .createSequentialGroup()
                        .addContainerGap()
                        .addGroup(
                                certificateSourceTitleLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(radioPKCS11)
                                        .addComponent(radioMSCAPI)
                                        .addGroup(
                                                certificateSourceTitleLayout
                                                        .createSequentialGroup()
                                                        .addComponent(radioPKCS12)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(passwordArea,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, 320,
                                                                Short.MAX_VALUE))).addContainerGap()));
        certificateSourceTitleLayout.setVerticalGroup(certificateSourceTitleLayout.createParallelGroup(
                javax.swing.GroupLayout.Alignment.LEADING).addGroup(
                certificateSourceTitleLayout
                        .createSequentialGroup()
                        .addContainerGap()
                        .addGroup(
                                certificateSourceTitleLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(passwordArea, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(
                                                certificateSourceTitleLayout.createSequentialGroup()
                                                        .addComponent(radioPKCS11).addGap(18, 18, 18)
                                                        .addComponent(radioPKCS12)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(radioMSCAPI)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
                layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(descriptionLabel)
                                        .addComponent(signatureMethodTitle, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(certificateSourceTitle, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
                layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(descriptionLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(certificateSourceTitle, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(signatureMethodTitle, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
    }// </editor-fold>//GEN-END:initComponents

    private void radioPKCS11ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_radioPKCS11ActionPerformed
        wizard.setSigProvider(SignatureTokenType.PKCS11);
        setSourceFile(wizard.getSourceFile());
        signatureMethodTitle.setVisible(true);
        passwordArea.setVisible(false);
    }// GEN-LAST:event_radioPKCS11ActionPerformed

    private void radioPKCS12ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_radioPKCS12ActionPerformed
        wizard.setSigProvider(SignatureTokenType.PKCS12);
        setSourceFile(wizard.getSourceFile());
        signatureMethodTitle.setVisible(true);
        passwordArea.setVisible(true);
    }// GEN-LAST:event_radioPKCS12ActionPerformed

    private void radioMSCAPIActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_radioMSCAPIActionPerformed
        wizard.setSigProvider(SignatureTokenType.MSCAPI);
        signatureMethodTitle.setVisible(false);
        passwordArea.setVisible(false);
    }// GEN-LAST:event_radioMSCAPIActionPerformed

    private void sourceButtonActionPerformed(java.awt.event.ActionEvent evt) {
        JFileChooser fileChooser = MainFrame.sigSourceFileChooser;
        int returnValue = fileChooser.showOpenDialog(getRootPane());
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            if (radioPKCS11.isSelected()) {
                wizard.setPkcs11Library(selectedFile);
            } else if (radioPKCS12.isSelected()) {
                wizard.setPkcs12File(selectedFile);
            }
            setSourceFile(selectedFile);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private eu.europa.ec.markt.tlmanager.view.common.TitledPanel certificateSourceTitle;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JPasswordField password;
    private javax.swing.JPanel passwordArea;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JRadioButton radioMSCAPI;
    private javax.swing.JRadioButton radioPKCS11;
    private javax.swing.JRadioButton radioPKCS12;
    private eu.europa.ec.markt.tlmanager.view.common.TitledPanel signatureMethodTitle;
    private javax.swing.JButton sourceButton;
    private javax.swing.JTextField sourceTextField;
    // End of variables declaration//GEN-END:variables
    private ButtonGroup buttonGroup;
}