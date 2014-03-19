/*
 * DSS - Digital Signature Services
 *
 * Copyright (C) 2013 European Commission, Directorate-General Internal Market and Services (DG MARKT), B-1049 Bruxelles/Brussel
 *
 * Developed by: 2013 ARHS Developments S.A. (rue Nicolas Bové 2B, L-1253 Luxembourg) http://www.arhs-developments.com
 *
 * This file is part of the "DSS - Digital Signature Services" project.
 *
 * "DSS - Digital Signature Services" is free software: you can redistribute it and/or modify it under the terms of
 * the GNU Lesser General Public License as published by the Free Software Foundation, either version 2.1 of the
 * License, or (at your option) any later version.
 *
 * DSS is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty
 * of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License along with
 * "DSS - Digital Signature Services".  If not, see <http://www.gnu.org/licenses/>.
 */

package eu.europa.ec.markt.tlmanager.view.panel;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileInputStream;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javax.security.auth.x500.X500Principal;
import javax.swing.*;

import org.apache.commons.lang.StringUtils;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import eu.europa.ec.markt.dss.DSSUtils;
import eu.europa.ec.markt.tlmanager.core.Configuration;
import eu.europa.ec.markt.tlmanager.util.Util;
import eu.europa.ec.markt.tlmanager.view.certificate.DigitalIdentityModel;
import eu.europa.ec.markt.tlmanager.view.common.ContentDialogCloser;
import eu.europa.ec.markt.tlmanager.view.multivalue.ContentWatcher;

/**
 * A panel which allows uploading a certificate and displays its data.
 *
 * @version $Revision: 2497 $ - $Date: 2013-09-05 17:30:51 +0200 (Thu, 05 Sep 2013) $
 */

public class DigitalIdentitySubjectNamePanel extends JPanel implements ContentDialogCloser {

    private static final Logger LOG = LoggerFactory.getLogger(DigitalIdentityCertificatePanel.class);
    private static final ResourceBundle uiKeys = ResourceBundle.getBundle("eu/europa/ec/markt/tlmanager/uiKeysComponents", Configuration.getInstance().getLocale());

    private List<ContentWatcher> contentWatcherListener;
    private JFileChooser fileChooser;
    private DigitalIdentityModel digitalIdentityModel;

    /**
     * The default constructor for DigitalIdentityPanel.
     */
    public DigitalIdentitySubjectNamePanel() {
        this.fileChooser = new JFileChooser();
        contentWatcherListener = new ArrayList<ContentWatcher>();

        initComponents();

    }

    /**
     * Another constructor for DigitalIdentityPanel.
     */
    public DigitalIdentitySubjectNamePanel(JFileChooser fileChooser) {
        this.fileChooser = fileChooser;
        contentWatcherListener = new ArrayList<ContentWatcher>();

        initComponents();

    }

    private void loadCertificate(File file) {
        FileInputStream inputStream = null;

        Security.addProvider(new BouncyCastleProvider());

        try {
            inputStream = new FileInputStream(file);

            X509Certificate certificate = DSSUtils.loadCertificate(inputStream);

            final X500Principal subjectX500Principal = certificate.getSubjectX500Principal();
            if (subjectX500Principal != null) {
                final String subjectX500PrincipalName = subjectX500Principal.getName(X500Principal.RFC2253);
                // System.out.println(">>> RFC2253: " + subjectX500Principal);
                digitalIdentityModel.setSubjectName(subjectX500PrincipalName);
                refresh();
            } else {
                digitalIdentityModel.setSubjectName(null);
            }

        } catch (Exception ex) {
            String message = uiKeys.getString("DigitalIdentityPanel.error.message");
            JOptionPane.showMessageDialog(this, message, uiKeys.getString("DigitalIdentityPanel.error.title"), JOptionPane.INFORMATION_MESSAGE);
            LOG.warn(message + " " + ex.getMessage(), ex);
        }
    }

    /**
     *
     */
    public void refresh() {
        // clean data
        subject.setText("");

        if (digitalIdentityModel != null) {

            final String subjectName = digitalIdentityModel.getSubjectName();
            if (subjectName != null) {
                subject.setText(subjectName);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
     * content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selectCertificate = new javax.swing.JButton();
        subjectScrollPane = new javax.swing.JScrollPane();
        subject = new javax.swing.JTextArea();
        subjectLabel = new javax.swing.JLabel();

        setName("DigitalIdentityPanel"); // NOI18N

        selectCertificate.setText(uiKeys.getString("DigitalIdentityPanel.loadFromCertificate")); // NOI18N
        selectCertificate.setName("selectCertificate"); // NOI18N
        selectCertificate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectCertificateActionPerformed(evt);
            }
        });

        subject.setColumns(5);
        subject.setLineWrap(true);
        subject.setRows(3);
        subject.setWrapStyleWord(true);
        subjectScrollPane.setViewportView(subject);

        subjectLabel.setText(uiKeys.getString("DigitalIdentityPanel.subject")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(selectCertificate)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup().addComponent(subjectLabel).addGap(42, 42, 42)
                          .addComponent(subjectScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(subjectLabel)
                      .addComponent(subjectScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(selectCertificate)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void selectCertificateActionPerformed(ActionEvent evt) {// GEN-FIRST:event_selectCertificateActionPerformed
        int returnValue = fileChooser.showOpenDialog(getRootPane());
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            loadCertificate(selectedFile);
        }
    }// GEN-LAST:event_selectCertificateActionPerformed

    private void closeButtonActionPerformed(ActionEvent evt) {// GEN-FIRST:event_closeButtonActionPerformed
        boolean closed = Util.closeDialog(evt);
        if (closed) {
            dialogWasClosed();
        }
    }// GEN-LAST:event_closeButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton selectCertificate;
    private javax.swing.JTextArea subject;
    private javax.swing.JLabel subjectLabel;
    private javax.swing.JScrollPane subjectScrollPane;
    // End of variables declaration//GEN-END:variables
    /*
     * (non-Javadoc)
     * 
     * @see eu.europa.ec.markt.tlmanager.view.common.ContentDialogCloser#dialogWasClosed()
     */

    /**
     * {@inheritDoc}
     */
    @Override
    public void dialogWasClosed() {
        digitalIdentityModel.updateDigitalIdentity();
    }

    /**
     * @return the digitalIdentityModel
     */
    public DigitalIdentityModel getDigitalIdentityModel() {
        return digitalIdentityModel;
    }

    /**
     * Sets the certificate model. Used by Binding !
     *
     * @param digitalIdentityModel the new certificate model
     */
    public void setDigitalIdentityModel(DigitalIdentityModel digitalIdentityModel) {
        this.digitalIdentityModel = digitalIdentityModel;
        refresh();
    }

    /**
     * Provides the current content information.
     *
     * @return the content information
     */
    public String retrieveContentInformation() {
        String info = null;
        final String subjectText = subject.getText();
        if (StringUtils.isNotBlank(subjectText)) {
            info = subjectText;
        } return info;
    }

}
