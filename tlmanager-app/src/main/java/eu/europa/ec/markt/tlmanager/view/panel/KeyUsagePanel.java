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
package eu.europa.ec.markt.tlmanager.view.panel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.*;

import eu.europa.ec.markt.tlmanager.core.KeyUsageBits;
import eu.europa.ec.markt.tlmanager.view.common.TitledPanel;
import eu.europa.ec.markt.tsl.jaxb.ecc.KeyUsageBitType;

/**
 * A small panel for holding the values for key usages
 *
 *
 */

public class KeyUsagePanel extends JPanel {
    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(KeyUsagePanel.class);

    private class TrueFalseUndefinedModel extends DefaultComboBoxModel {

        @Override
        public int getIndexOf(Object anObject) {
            if (anObject == null) {
                return 2;
            } else if (anObject == Boolean.TRUE) {
                return 0;
            } else if (anObject == Boolean.FALSE) {
                return 1;
            }
            throw new IllegalArgumentException("Unrecognized: " + anObject);
        }

        @Override
        public Object getElementAt(int index) {
            return new Object[]{Boolean.TRUE, Boolean.FALSE, null}[index];
        }

        @Override
        public int getSize() {
            return 3;
        }

    }

    private class TrueFalseUndefinedRenderer extends DefaultListCellRenderer {

        @Override
        public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
            return super.getListCellRendererComponent(list, value == null ? "Undefined" : value, index, isSelected, cellHasFocus);
        }

    }


    private KeyUsageModel model;

    /**
     * Instantiates a new electronic panel.
     */
    public KeyUsagePanel() {
        model = new KeyUsageModel();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
     * content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        keyUsageTitle = new TitledPanel();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        jLabel8 = new JLabel();
        jLabel9 = new JLabel();
        digitalSignature = new JComboBox();
        nonRepudiation = new JComboBox();
        keyEncipherment = new JComboBox();
        keyCertSign = new JComboBox();
        keyAgreement = new JComboBox();
        dataEncipherment = new JComboBox();
        crlSign = new JComboBox();
        encipherOnly = new JComboBox();
        decipherOnly = new JComboBox();

        keyUsageTitle.setTitle("Key Usage");

        jLabel1.setText("Digital Signature");

        jLabel2.setText("Non Repudiation");

        jLabel3.setText("Key Encipherment");

        jLabel4.setText("Key Cert Sign");

        jLabel5.setText("Key Agreement");

        jLabel6.setText("Data Encipherment");

        jLabel7.setText("Crl Sign");

        jLabel8.setText("Encipher Only");

        jLabel9.setText("Decipher Only");

        digitalSignature.setModel(new TrueFalseUndefinedModel());
        digitalSignature.setRenderer(new TrueFalseUndefinedRenderer());
        digitalSignature.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                digitalSignatureActionPerformed(evt);
            }
        });

        nonRepudiation.setModel(new TrueFalseUndefinedModel());
        nonRepudiation.setRenderer(new TrueFalseUndefinedRenderer());
        nonRepudiation.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                nonRepudiationActionPerformed(evt);
            }
        });

        keyEncipherment.setModel(new TrueFalseUndefinedModel());
        keyEncipherment.setRenderer(new TrueFalseUndefinedRenderer());
        keyEncipherment.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                keyEnciphermentActionPerformed(evt);
            }
        });

        keyCertSign.setModel(new TrueFalseUndefinedModel());
        keyCertSign.setRenderer(new TrueFalseUndefinedRenderer());
        keyCertSign.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                keyCertSignActionPerformed(evt);
            }
        });

        keyAgreement.setModel(new TrueFalseUndefinedModel());
        keyAgreement.setRenderer(new TrueFalseUndefinedRenderer());
        keyAgreement.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                keyAgreementActionPerformed(evt);
            }
        });

        dataEncipherment.setModel(new TrueFalseUndefinedModel());
        dataEncipherment.setRenderer(new TrueFalseUndefinedRenderer());
        dataEncipherment.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                dataEnciphermentActionPerformed(evt);
            }
        });

        crlSign.setModel(new TrueFalseUndefinedModel());
        crlSign.setRenderer(new TrueFalseUndefinedRenderer());
        crlSign.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                crlSignActionPerformed(evt);
            }
        });

        encipherOnly.setModel(new TrueFalseUndefinedModel());
        encipherOnly.setRenderer(new TrueFalseUndefinedRenderer());
        encipherOnly.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                encipherOnlyActionPerformed(evt);
            }
        });

        decipherOnly.setModel(new TrueFalseUndefinedModel());
        decipherOnly.setRenderer(new TrueFalseUndefinedRenderer());
        decipherOnly.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                decipherOnlyActionPerformed(evt);
            }
        });

        GroupLayout keyUsageTitleLayout = new GroupLayout(keyUsageTitle);
        keyUsageTitle.setLayout(keyUsageTitleLayout);
        keyUsageTitleLayout.setHorizontalGroup(keyUsageTitleLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(
              keyUsageTitleLayout.createSequentialGroup().addGap(10, 10, 10).addGroup(keyUsageTitleLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(
                    keyUsageTitleLayout.createSequentialGroup().addComponent(jLabel3).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                          .addComponent(keyEncipherment, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE).addGap(18, 18, 18).addComponent(jLabel6))
                    .addGroup(keyUsageTitleLayout.createSequentialGroup().addComponent(jLabel1).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                          .addComponent(digitalSignature, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE).addGap(18, 18, 18)
                          .addComponent(jLabel4)).addGroup(
                          keyUsageTitleLayout.createSequentialGroup().addComponent(jLabel2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nonRepudiation, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE).addGap(18, 18, 18)
                                .addComponent(jLabel5))).addGap(10, 10, 10).addGroup(keyUsageTitleLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(dataEncipherment, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(keyCertSign, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(keyAgreement, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)).addGap(18, 18, 18).addGroup(
                    keyUsageTitleLayout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(GroupLayout.Alignment.LEADING,
                          keyUsageTitleLayout.createSequentialGroup().addComponent(jLabel9).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(decipherOnly, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                          .addGroup(GroupLayout.Alignment.LEADING, keyUsageTitleLayout.createSequentialGroup()
                                .addGroup(keyUsageTitleLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jLabel8).addComponent(jLabel7))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(keyUsageTitleLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                      .addComponent(crlSign, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                      .addComponent(encipherOnly, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        keyUsageTitleLayout.setVerticalGroup(keyUsageTitleLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(keyUsageTitleLayout.createSequentialGroup().addGroup(
              keyUsageTitleLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel1)
                    .addComponent(digitalSignature, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE).addComponent(jLabel4)
                    .addComponent(keyCertSign, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE).addComponent(jLabel7)
                    .addComponent(crlSign, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
              .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(keyUsageTitleLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel2)
                    .addComponent(nonRepudiation, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE).addComponent(jLabel5)
                    .addComponent(keyAgreement, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE).addComponent(jLabel8)
                    .addComponent(encipherOnly, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
              .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(keyUsageTitleLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel3)
                    .addComponent(keyEncipherment, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE).addComponent(jLabel6)
                    .addComponent(dataEncipherment, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE).addComponent(jLabel9)
                    .addComponent(decipherOnly, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
              .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 440, Short.MAX_VALUE).addGroup(
              layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(
                    layout.createSequentialGroup().addContainerGap().addComponent(keyUsageTitle, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                          .addContainerGap())));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 128, Short.MAX_VALUE).addGroup(
              layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(
                    layout.createSequentialGroup().addContainerGap().addComponent(keyUsageTitle, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                          .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))));
    }// </editor-fold>//GEN-END:initComponents

    private void decipherOnlyActionPerformed(ActionEvent evt) {//GEN-FIRST:event_decipherOnlyActionPerformed

    }//GEN-LAST:event_decipherOnlyActionPerformed

    private void encipherOnlyActionPerformed(ActionEvent evt) {//GEN-FIRST:event_encipherOnlyActionPerformed

    }//GEN-LAST:event_encipherOnlyActionPerformed

    private void crlSignActionPerformed(ActionEvent evt) {//GEN-FIRST:event_crlSignActionPerformed

    }//GEN-LAST:event_crlSignActionPerformed

    private void dataEnciphermentActionPerformed(ActionEvent evt) {//GEN-FIRST:event_dataEnciphermentActionPerformed

    }//GEN-LAST:event_dataEnciphermentActionPerformed

    private void keyAgreementActionPerformed(ActionEvent evt) {//GEN-FIRST:event_keyAgreementActionPerformed

    }//GEN-LAST:event_keyAgreementActionPerformed

    private void keyCertSignActionPerformed(ActionEvent evt) {//GEN-FIRST:event_keyCertSignActionPerformed

    }//GEN-LAST:event_keyCertSignActionPerformed

    private void keyEnciphermentActionPerformed(ActionEvent evt) {//GEN-FIRST:event_keyEnciphermentActionPerformed

    }//GEN-LAST:event_keyEnciphermentActionPerformed

    private void nonRepudiationActionPerformed(ActionEvent evt) {//GEN-FIRST:event_nonRepudiationActionPerformed

    }//GEN-LAST:event_nonRepudiationActionPerformed

    private void digitalSignatureActionPerformed(ActionEvent evt) {//GEN-FIRST:event_digitalSignatureActionPerformed

    }//GEN-LAST:event_digitalSignatureActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JComboBox crlSign;
    private JComboBox dataEncipherment;
    private JComboBox decipherOnly;
    private JComboBox digitalSignature;
    private JComboBox encipherOnly;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JComboBox keyAgreement;
    private JComboBox keyCertSign;
    private JComboBox keyEncipherment;
    private TitledPanel keyUsageTitle;
    private JComboBox nonRepudiation;
    // End of variables declaration//GEN-END:variables

    private void resetValuesFromModel() {
        if (model == null) {
            model = new KeyUsageModel();
        }
        final List<KeyUsageBitType> keyUsageBits = model.getKeyUsageType().getKeyUsageBit();

        digitalSignature.setSelectedItem(null);
        nonRepudiation.setSelectedItem(null);
        keyEncipherment.setSelectedItem(null);
        dataEncipherment.setSelectedItem(null);
        keyAgreement.setSelectedItem(null);
        keyCertSign.setSelectedItem(null);
        crlSign.setSelectedItem(null);
        encipherOnly.setSelectedItem(null);
        decipherOnly.setSelectedItem(null);

        for (KeyUsageBitType keyBit : keyUsageBits) {
            if (keyBit.getName().equals(KeyUsageBits.digitalSignature.toString())) {
                digitalSignature.setSelectedItem(keyBit.isValue());
            } else if (keyBit.getName().equals(KeyUsageBits.nonRepudiation.toString())) {
                nonRepudiation.setSelectedItem(keyBit.isValue());
            } else if (keyBit.getName().equals(KeyUsageBits.keyEncipherment.toString())) {
                keyEncipherment.setSelectedItem(keyBit.isValue());
            } else if (keyBit.getName().equals(KeyUsageBits.dataEncipherment.toString())) {
                dataEncipherment.setSelectedItem(keyBit.isValue());
            } else if (keyBit.getName().equals(KeyUsageBits.keyAgreement.toString())) {
                keyAgreement.setSelectedItem(keyBit.isValue());
            } else if (keyBit.getName().equals(KeyUsageBits.keyCertSign.toString())) {
                keyCertSign.setSelectedItem(keyBit.isValue());
            } else if (keyBit.getName().equals(KeyUsageBits.crlSign.toString())) {
                crlSign.setSelectedItem(keyBit.isValue());
            } else if (keyBit.getName().equals(KeyUsageBits.encipherOnly.toString())) {
                encipherOnly.setSelectedItem(keyBit.isValue());
            } else if (keyBit.getName().equals(KeyUsageBits.decipherOnly.toString())) {
                decipherOnly.setSelectedItem(keyBit.isValue());
            }
        }
    }

    private void resetModelFromValues() {
        model.getKeyUsageType().getKeyUsageBit().clear();
        resetModelFromView(digitalSignature.getSelectedItem(), KeyUsageBits.digitalSignature);
        resetModelFromView(nonRepudiation.getSelectedItem(), KeyUsageBits.nonRepudiation);
        resetModelFromView(keyEncipherment.getSelectedItem(), KeyUsageBits.keyEncipherment);
        resetModelFromView(dataEncipherment.getSelectedItem(), KeyUsageBits.dataEncipherment);
        resetModelFromView(keyAgreement.getSelectedItem(), KeyUsageBits.keyAgreement);
        resetModelFromView(keyCertSign.getSelectedItem(), KeyUsageBits.keyCertSign);
        resetModelFromView(crlSign.getSelectedItem(), KeyUsageBits.crlSign);
        resetModelFromView(encipherOnly.getSelectedItem(), KeyUsageBits.encipherOnly);
        resetModelFromView(decipherOnly.getSelectedItem(), KeyUsageBits.decipherOnly);
    }

    private void resetModelFromView(Object selectedItem, KeyUsageBits keyUsageBits) {
        if (selectedItem != null) {
            final KeyUsageBitType keyUsageBitType = new KeyUsageBitType();
            keyUsageBitType.setName(keyUsageBits.toString());
            keyUsageBitType.setValue(Boolean.TRUE.equals(selectedItem));
            model.getKeyUsageType().getKeyUsageBit().add(keyUsageBitType);
        }
    }

    /**
     * Empties all values in the model and resets ui components.
     */
    public void clearModel() {
        this.model.clear();
        resetValuesFromModel();
    }

    /**
     * Resets the component values to the one in the model.
     *
     * @param model the updated model
     */
    public void updateCurrentValues(KeyUsageModel model) {
        this.model = model;
        resetValuesFromModel();
    }

    /**
     * Resets the current values in the model and returns it.
     *
     * @return the most current model
     */
    public KeyUsageModel retrieveCurrentValues() {
        resetModelFromValues();
        return new KeyUsageModel(model);
    }
}