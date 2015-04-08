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
package eu.europa.ec.markt.tlmanager.view.common;

import eu.europa.ec.markt.dss.common.TooltipHelper;
import eu.europa.ec.markt.tlmanager.core.Configuration;
import eu.europa.ec.markt.tlmanager.util.Util;

import javax.swing.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ResourceBundle;

/**
 * Provides input elements for a new current status and a new status starting date. Its used, when a new history has to
 * be created.
 * 
 *
 *
 */

public class NewServiceStatusPanel extends javax.swing.JPanel {
    private static final ResourceBundle uiKeysComponents = ResourceBundle.getBundle(
            "eu/europa/ec/markt/tlmanager/uiKeysComponents", Configuration.getInstance().getLocale());

    private DefaultComboBoxModel serviceCurrentStatusModel;

    /**
     * Instantiates a new new service status panel.
     */
    public NewServiceStatusPanel() {
        String[] serviceStatus = Util.addNoSelectionEntry(Configuration.getInstance().getTL().getTslServiceStatus());
        serviceCurrentStatusModel = new DefaultComboBoxModel(serviceStatus);

        initComponents();
        newServiceTitle.setTitle(uiKeysComponents.getString("NewServiceStatusPanel.title"));

        dateLabel.setToolTipText(Configuration.getInstance().getTimeZoneName());
        TooltipHelper.registerComponentAtTooltipManager(dateLabel);
        
        // status.setRenderer(new DefaultListCellRenderer() {
        // @Override
        // public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected,
        // boolean cellHasFocus) {
        // String s = value.toString();
        // if(s.indexOf("/") > 0) {
        // s = s.substring(s.lastIndexOf("/"));
        // }
        // return super.getListCellRendererComponent(list, s, index, isSelected, cellHasFocus);
        // }
        // });
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
     * content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        newServiceTitle = new eu.europa.ec.markt.tlmanager.view.common.TitledPanel();
        descriptionLabel = new javax.swing.JLabel();
        statusLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        status = new javax.swing.JComboBox();
        dateTimePicker = new eu.europa.ec.markt.tlmanager.view.common.DateTimePicker();

        descriptionLabel.setText(uiKeysComponents.getString("NewServiceStatusPanel.text")); // NOI18N

        statusLabel.setText(uiKeysComponents.getString("NewServiceStatusPanel.status")); // NOI18N

        dateLabel.setText(uiKeysComponents.getString("NewServiceStatusPanel.date")); // NOI18N

        status.setEditable(!Configuration.getInstance().isEuMode());
        status.setModel(serviceCurrentStatusModel);

        javax.swing.GroupLayout newServiceTitleLayout = new javax.swing.GroupLayout(newServiceTitle);
        newServiceTitle.setLayout(newServiceTitleLayout);
        newServiceTitleLayout.setHorizontalGroup(
            newServiceTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newServiceTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(newServiceTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descriptionLabel)
                    .addGroup(newServiceTitleLayout.createSequentialGroup()
                        .addGroup(newServiceTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(statusLabel)
                            .addComponent(dateLabel))
                        .addGap(18, 18, 18)
                        .addGroup(newServiceTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateTimePicker, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                            .addComponent(status, 0, 538, Short.MAX_VALUE))))
                .addContainerGap())
        );
        newServiceTitleLayout.setVerticalGroup(
            newServiceTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newServiceTitleLayout.createSequentialGroup()
                .addComponent(descriptionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(newServiceTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statusLabel)
                    .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(newServiceTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dateLabel)
                    .addComponent(dateTimePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newServiceTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newServiceTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dateLabel;
    private eu.europa.ec.markt.tlmanager.view.common.DateTimePicker dateTimePicker;
    private javax.swing.JLabel descriptionLabel;
    private eu.europa.ec.markt.tlmanager.view.common.TitledPanel newServiceTitle;
    private javax.swing.JComboBox status;
    private javax.swing.JLabel statusLabel;
    // End of variables declaration//GEN-END:variables

    /**
     * Gets the values.
     *
     * @return the values
     */
    public Values getValues() {
        Object item;
        if (status.isEditable()) {
            item = status.getEditor().getItem();
        } else {
            item = status.getSelectedItem();
        }
        return new Values((String) item, Util.createXMGregorianCalendar(dateTimePicker.getDateTime()));
    }

    /**
     * The Class Values.
     */
    public static class Values {

        /** The status. */
        private String status;

        /** The date. */
        private XMLGregorianCalendar date;

        /**
         * Instantiates a new values.
         * 
         * @param status the status
         * @param date the date
         */
        public Values(String status, XMLGregorianCalendar date) {
            this.status = status;
            this.date = date;
        }

        /**
         * Gets the status.
         * 
         * @return the status
         */
        public String getStatus() {
            return status;
        }

        /**
         * @return the date
         */
        public XMLGregorianCalendar getDate() {
            return date;
        }
    }
}