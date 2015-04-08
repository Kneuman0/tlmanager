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
package eu.europa.ec.markt.tlmanager.view.pages;

import javax.swing.*;

import eu.europa.ec.markt.dss.common.TooltipHelper;
import eu.europa.ec.markt.tlmanager.core.Configuration;
import eu.europa.ec.markt.tlmanager.core.QNames;
import eu.europa.ec.markt.tlmanager.model.treeNodes.TSLDataNode;
import eu.europa.ec.markt.tlmanager.util.Util;
import eu.europa.ec.markt.tlmanager.view.binding.BindingManager;
import eu.europa.ec.markt.tlmanager.view.binding.InternationalNamesConverter;
import eu.europa.ec.markt.tlmanager.view.binding.NonEmptyMultiLangURIListConverter;
import eu.europa.ec.markt.tlmanager.view.binding.ServiceDigitalIdentityConverter;
import eu.europa.ec.markt.tlmanager.view.binding.ServiceSupplyPointsConverter;
import eu.europa.ec.markt.tlmanager.view.binding.StringConverter;
import eu.europa.ec.markt.tlmanager.view.binding.XMLGregorianCalendarConverter;
import eu.europa.ec.markt.tlmanager.view.multivalue.MultiMode;
import eu.europa.ec.markt.tsl.jaxb.tsl.TSPServiceInformationType;
import eu.europa.ec.markt.tsl.jaxb.tsl.TSPServiceType;

/**
 * Content page for managing all below a <tsl:ServiceInformation/>.
 *
 *
 */

public class ServiceCurrentStatusInformationPage extends TreeDataPublisher {

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(ServiceCurrentStatusInformationPage.class);

    private DefaultComboBoxModel serviceTypeIdentifierModel;
    private DefaultComboBoxModel serviceCurrentStatusModel;

    /**
     * Instantiates a new service current status information page.
     */
    public ServiceCurrentStatusInformationPage(JTree jtree) {
        super(jtree);
        String[] serviceIdentifier = Util.addNoSelectionEntry(Configuration.getInstance().getTL().getTslServiceIdentifier());
        serviceTypeIdentifierModel = new DefaultComboBoxModel(serviceIdentifier);

        String[] serviceStatus = Util.addNoSelectionEntry(Configuration.getInstance().getTL().getTslServiceStatus());
        serviceCurrentStatusModel = new DefaultComboBoxModel(serviceStatus);

        setName("ServiceCurrentStatusInformationPage");
        initComponents();
        serviceTitle.setTitle(uiKeys.getString("ServiceCurrentStatusInformationPage.serviceTitle.title"));
        initBinding();

        additionalSetup();

        currentStatusStartingDateLabel.setToolTipText(Configuration.getInstance().getTimeZoneName());
        TooltipHelper.registerComponentAtTooltipManager(currentStatusStartingDateLabel);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setName() {
        setName(TreeDataPublisher.SERVICE_CURRENT_STATUS_INFORMATION_PAGE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void setupMandatoryLabels() {
        setMandatoryLabel(serviceTypeIdentifierLabel);
        setMandatoryLabel(serviceNameLabel);
        setMandatoryLabel(digitalIdLabel);
        setMandatoryLabel(serviceCurrentStatusLabel);
        setMandatoryLabel(currentStatusStartingDateLabel);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
     * content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        serviceTitle = new eu.europa.ec.markt.tlmanager.view.common.TitledPanel();
        serviceTypeIdentifierLabel = new javax.swing.JLabel();
        serviceTypeIdentifier = new javax.swing.JComboBox();
        serviceNameLabel = new javax.swing.JLabel();
        digitalIdLabel = new javax.swing.JLabel();
        serviceCurrentStatus = new javax.swing.JComboBox();
        serviceCurrentStatusLabel = new javax.swing.JLabel();
        currentStatusStartingDateLabel = new javax.swing.JLabel();
        schemeServiceInformation = new eu.europa.ec.markt.tlmanager.view.multivalue.MultivalueButton(MultiMode.MULTILANG_TEXT, Configuration.LanguageCodes.getEnglishLanguage(), null);
        schemeServiceInformationLabel = new javax.swing.JLabel();
        serviceSupplyPointsLabel = new javax.swing.JLabel();
        serviceDefinitionURI = new eu.europa.ec.markt.tlmanager.view.multivalue.MultivalueButton(MultiMode.MULTILANG_TEXT, Configuration.LanguageCodes.getEnglishLanguage(), null);
        serviceDefinitionURILabel = new javax.swing.JLabel();
        currentStatusStartingDate = new eu.europa.ec.markt.tlmanager.view.common.DateTimePicker();
        serviceName = new eu.europa.ec.markt.tlmanager.view.multivalue.MultivalueButton(MultiMode.MULTILANG_TEXT, Configuration.LanguageCodes.getEnglishLanguage(), null);
        serviceSupplyPoints = new eu.europa.ec.markt.tlmanager.view.multivalue.MultivalueButton(MultiMode.MULTI_ANYURI, Configuration.LanguageCodes.getEnglishLanguage(), null);
        serviceDigitalIdentityButton = new eu.europa.ec.markt.tlmanager.view.multivalue.MultivalueButton(MultiMode.MULTI_DIGITALID, null, null);

        serviceTitle.setName("serviceTitle"); // NOI18N

        serviceTypeIdentifierLabel.setLabelFor(serviceTypeIdentifier);
        serviceTypeIdentifierLabel.setText(uiKeys.getString("ServiceCurrentStatusInformationPage.serviceTypeIdentifierLabel.text")); // NOI18N

        serviceTypeIdentifier.setEditable(!Configuration.getInstance().isEuMode());
        serviceTypeIdentifier.setModel(serviceTypeIdentifierModel);
        serviceTypeIdentifier.setName("serviceTypeIdentifier"); // NOI18N

        serviceNameLabel.setLabelFor(serviceName);
        serviceNameLabel.setText(uiKeys.getString("ServiceCurrentStatusInformationPage.serviceNameLabel.text")); // NOI18N

        digitalIdLabel.setLabelFor(serviceDigitalIdentityButton);
        digitalIdLabel.setText(uiKeys.getString("ServiceCurrentStatusInformationPage.digitalIdLabel.text")); // NOI18N

        serviceCurrentStatus.setEditable(!Configuration.getInstance().isEuMode());
        serviceCurrentStatus.setModel(serviceCurrentStatusModel);
        serviceCurrentStatus.setName("serviceCurrentStatus"); // NOI18N

        serviceCurrentStatusLabel.setLabelFor(serviceCurrentStatus);
        serviceCurrentStatusLabel.setText(uiKeys.getString("ServiceCurrentStatusInformationPage.serviceCurrentStatusLabel.text")); // NOI18N

        currentStatusStartingDateLabel.setLabelFor(currentStatusStartingDate);
        currentStatusStartingDateLabel.setText(uiKeys.getString("ServiceCurrentStatusInformationPage.currentStatusStartingDateLabel.text")); // NOI18N

        schemeServiceInformation.setName("schemeServiceInformation"); // NOI18N

        schemeServiceInformationLabel.setLabelFor(schemeServiceInformation);
        schemeServiceInformationLabel.setText(uiKeys.getString("ServiceCurrentStatusInformationPage.schemeServiceInformationLabel.text")); // NOI18N

        serviceSupplyPointsLabel.setLabelFor(serviceSupplyPoints);
        serviceSupplyPointsLabel.setText(uiKeys.getString("ServiceCurrentStatusInformationPage.serviceSupplyPointsLabel.text")); // NOI18N

        serviceDefinitionURI.setName("serviceDefinitionURI"); // NOI18N

        serviceDefinitionURILabel.setLabelFor(serviceDefinitionURI);
        serviceDefinitionURILabel.setText(uiKeys.getString("ServiceCurrentStatusInformationPage.serviceDefinitionURILabel.text")); // NOI18N

        serviceName.setName("serviceName"); // NOI18N

        serviceSupplyPoints.setName("serviceDefinitionURI"); // NOI18N

        serviceDigitalIdentityButton.setName("serviceName"); // NOI18N

        javax.swing.GroupLayout serviceTitleLayout = new javax.swing.GroupLayout(serviceTitle);
        serviceTitle.setLayout(serviceTitleLayout);
        serviceTitleLayout.setHorizontalGroup(
            serviceTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(serviceTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(serviceTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(serviceTypeIdentifierLabel)
                    .addComponent(serviceNameLabel)
                    .addComponent(digitalIdLabel)
                    .addComponent(serviceCurrentStatusLabel)
                    .addComponent(currentStatusStartingDateLabel)
                    .addComponent(schemeServiceInformationLabel)
                    .addComponent(serviceSupplyPointsLabel)
                    .addComponent(serviceDefinitionURILabel))
                .addGap(20, 20, 20)
                .addGroup(serviceTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(serviceTypeIdentifier, 0, 558, Short.MAX_VALUE)
                    .addComponent(serviceCurrentStatus, 0, 558, Short.MAX_VALUE)
                    .addComponent(currentStatusStartingDate, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
                    .addGroup(serviceTitleLayout.createSequentialGroup()
                        .addGroup(serviceTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(serviceName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(schemeServiceInformation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(serviceSupplyPoints, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(serviceDefinitionURI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(serviceDigitalIdentityButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        serviceTitleLayout.setVerticalGroup(
            serviceTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(serviceTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(serviceTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(serviceTypeIdentifierLabel)
                    .addComponent(serviceTypeIdentifier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(serviceTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(serviceNameLabel)
                    .addComponent(serviceName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(serviceTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(digitalIdLabel)
                    .addComponent(serviceDigitalIdentityButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(serviceTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(serviceCurrentStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(serviceCurrentStatusLabel))
                .addGap(26, 26, 26)
                .addGroup(serviceTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(currentStatusStartingDateLabel)
                    .addComponent(currentStatusStartingDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(serviceTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(schemeServiceInformationLabel)
                    .addComponent(schemeServiceInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(serviceTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(serviceSupplyPoints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(serviceSupplyPointsLabel))
                .addGap(30, 30, 30)
                .addGroup(serviceTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(serviceDefinitionURI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(serviceDefinitionURILabel))
                .addContainerGap(98, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(serviceTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(serviceTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private eu.europa.ec.markt.tlmanager.view.common.DateTimePicker currentStatusStartingDate;
    private javax.swing.JLabel currentStatusStartingDateLabel;
    private javax.swing.JLabel digitalIdLabel;
    private eu.europa.ec.markt.tlmanager.view.multivalue.MultivalueButton schemeServiceInformation;
    private javax.swing.JLabel schemeServiceInformationLabel;
    private javax.swing.JComboBox serviceCurrentStatus;
    private javax.swing.JLabel serviceCurrentStatusLabel;
    private eu.europa.ec.markt.tlmanager.view.multivalue.MultivalueButton serviceDefinitionURI;
    private javax.swing.JLabel serviceDefinitionURILabel;
    private eu.europa.ec.markt.tlmanager.view.multivalue.MultivalueButton serviceDigitalIdentityButton;
    private eu.europa.ec.markt.tlmanager.view.multivalue.MultivalueButton serviceName;
    private javax.swing.JLabel serviceNameLabel;
    private eu.europa.ec.markt.tlmanager.view.multivalue.MultivalueButton serviceSupplyPoints;
    private javax.swing.JLabel serviceSupplyPointsLabel;
    private eu.europa.ec.markt.tlmanager.view.common.TitledPanel serviceTitle;
    private javax.swing.JComboBox serviceTypeIdentifier;
    private javax.swing.JLabel serviceTypeIdentifierLabel;
    // End of variables declaration//GEN-END:variables

    private void initBinding() {
        if (bindingManager == null) {
            bindingManager = new BindingManager(this);
        }

        bindingManager.createBindingForComponent(serviceTypeIdentifier, "serviceTypeIdentifier", QNames._ServiceTypeIdentifier_QNAME.getLocalPart());
        bindingManager.appendConverter(new StringConverter(), QNames._ServiceTypeIdentifier_QNAME.getLocalPart());

        bindingManager.createBindingForComponent(serviceName.getMultivaluePanel(), "serviceName", QNames._ServiceName);
        bindingManager.appendConverter(new InternationalNamesConverter(), QNames._ServiceName);

        bindingManager.createBindingForComponent(serviceDigitalIdentityButton.getMultivaluePanel(), "serviceDigitalIdentity",
              QNames._ServiceDigitalIdentity_QNAME.getLocalPart());
        bindingManager.appendConverter(new ServiceDigitalIdentityConverter(), QNames._ServiceDigitalIdentity_QNAME.getLocalPart());

        bindingManager.createBindingForComponent(serviceCurrentStatus, "serviceStatus", QNames._ServiceStatus_QNAME.getLocalPart());
        bindingManager.appendConverter(new StringConverter(), QNames._ServiceStatus_QNAME.getLocalPart());

        bindingManager.createBindingForComponent(currentStatusStartingDate, "statusStartingTime", QNames._StatusStartingTime);
        bindingManager.appendConverter(new XMLGregorianCalendarConverter(), QNames._StatusStartingTime);

        bindingManager.createBindingForComponent(schemeServiceInformation.getMultivaluePanel(), "schemeServiceDefinitionURI", QNames._SchemeServiceDefinitionURI);
        bindingManager.appendConverter(new NonEmptyMultiLangURIListConverter(), QNames._SchemeServiceDefinitionURI);

        bindingManager.createBindingForComponent(serviceSupplyPoints.getMultivaluePanel(), "serviceSupplyPoints", QNames._ServiceSupplyPoints_QNAME.getLocalPart());
        bindingManager.appendConverter(new ServiceSupplyPointsConverter(), QNames._ServiceSupplyPoints_QNAME.getLocalPart());

        bindingManager.createBindingForComponent(serviceDefinitionURI.getMultivaluePanel(), "TSPServiceDefinitionURI", QNames._TSPServiceDefinitionURI);
        bindingManager.appendConverter(new NonEmptyMultiLangURIListConverter(), QNames._TSPServiceDefinitionURI);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void updateViewFromData(TSLDataNode dataNode) {
        this.dataNode = dataNode;
        TSPServiceType service = (TSPServiceType) dataNode.getUserObject();
        TSPServiceInformationType serviceInformation = service.getServiceInformation();
        LOG.trace( "Value changed {}", serviceInformation);

        bindingManager.unbindAll();

        bindingManager.amendSourceForBinding(serviceInformation, QNames._ServiceTypeIdentifier_QNAME.getLocalPart());

        bindingManager.amendSourceForBinding(serviceInformation, QNames._ServiceName);

        bindingManager.amendSourceForBinding(serviceInformation, QNames._ServiceDigitalIdentity_QNAME.getLocalPart());

        bindingManager.amendSourceForBinding(serviceInformation, QNames._ServiceStatus_QNAME.getLocalPart());

        bindingManager.amendSourceForBinding(serviceInformation, QNames._StatusStartingTime);

        bindingManager.amendSourceForBinding(serviceInformation, QNames._SchemeServiceDefinitionURI);

        bindingManager.amendSourceForBinding(serviceInformation, QNames._ServiceSupplyPoints_QNAME.getLocalPart());

        bindingManager.amendSourceForBinding(serviceInformation, QNames._TSPServiceDefinitionURI);

        bindingManager.bindAll();

        // update all the preview information on the multivalue buttons
        schemeServiceInformation.refreshContentInformation();
        serviceDefinitionURI.refreshContentInformation();
        serviceName.refreshContentInformation();
        serviceSupplyPoints.refreshContentInformation();
        serviceDigitalIdentityButton.refreshContentInformation();
    }
}