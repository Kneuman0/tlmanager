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
package eu.europa.ec.markt.tlmanager.view.binding;

import java.util.List;

import org.jdesktop.beansbinding.Converter;

import eu.europa.ec.markt.tlmanager.model.PoliciesListAdapter;
import eu.europa.ec.markt.tsl.jaxb.ecc.PoliciesListType;

/**
 * Does the conversion between a <code>PoliciesListType</code> and a <code>PoliciesListAdapter</code>
 *
 *
 *
 */

public class PoliciesListConverter extends Converter<List<PoliciesListType>, PoliciesListAdapter> {

    /** {@inheritDoc} */
    @Override
    public PoliciesListAdapter convertForward(List<PoliciesListType> source) {
        return new PoliciesListAdapter(source);
    }

    /** {@inheritDoc} */
    @Override
    public List<PoliciesListType> convertReverse(PoliciesListAdapter target) {
        return target.getKeyUsageTypeList();
    }
}