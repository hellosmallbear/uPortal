/**
 * Licensed to Apereo under one or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information regarding copyright ownership. Apereo
 * licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use
 * this file except in compliance with the License. You may obtain a copy of the License at the
 * following location:
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apereo.portal.io.xml.permission;

import java.util.Arrays;
import java.util.List;
import javax.xml.namespace.QName;
import org.apereo.portal.io.xml.AbstractPortalDataType;
import org.apereo.portal.io.xml.IExportAllPortalDataType;
import org.apereo.portal.io.xml.PortalDataKey;
import org.springframework.stereotype.Component;

/** Describes a permission in the portal */
@Component("permissionSetPortalDataType")
public class PermissionSetPortalDataType extends AbstractPortalDataType
        implements IExportAllPortalDataType {

    public static final int ORDER = 110;

    public static final QName LEGACY_PERMISSION_SET_QNAME = new QName("permission-set");

    @Deprecated
    public static final PortalDataKey IMPORT_31_DATA_KEY =
            new PortalDataKey(
                    LEGACY_PERMISSION_SET_QNAME,
                    "classpath://org/jasig/portal/io/import-permission_set_v3-1.crn",
                    null);

    public static final PortalDataKey IMPORT_50_DATA_KEY =
            new PortalDataKey(
                    LEGACY_PERMISSION_SET_QNAME,
                    "classpath://org/apereo/portal/io/import-permission_set_v5-0.crn",
                    null);

    private static final List<PortalDataKey> PORTAL_DATA_KEYS =
            Arrays.asList(new PortalDataKey[] {IMPORT_31_DATA_KEY, IMPORT_50_DATA_KEY});

    public PermissionSetPortalDataType() {
        super(ORDER, LEGACY_PERMISSION_SET_QNAME);
    }

    @Override
    public List<PortalDataKey> getDataKeyImportOrder() {
        return PORTAL_DATA_KEYS;
    }

    @Override
    public String getTitleCode() {
        return "Permission Set";
    }

    @Override
    public String getDescriptionCode() {
        return "Permission Set";
    }
}
