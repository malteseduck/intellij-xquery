/*
 * Copyright 2013 Grzegorz Ligas <ligasgr@gmail.com> and other contributors (see the CONTRIBUTORS file).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.intellij.xquery.runner.ui.datasources;

import org.intellij.xquery.runner.state.datasources.XQueryDataSourceConfiguration;
import org.intellij.xquery.runner.ui.datasources.details.DataSourceConfigurationAggregatingPanel;

import javax.swing.JPanel;
import java.awt.BorderLayout;

/**
 * User: ligasgr
 * Date: 07/11/13
 * Time: 15:18
 */
public class DataSourceDetailsPanel extends JPanel {

    public DataSourceDetailsPanel() {
        super(new BorderLayout());
    }

    public void displayDetails(XQueryDataSourceConfiguration dataSourceConfiguration, ConfigurationChangeListener
            configurationChangeListener) {
        DataSourceConfigurationAggregatingPanel dataSourceConfigurationAggregatingPanel =
                new DataSourceConfigurationAggregatingPanel(dataSourceConfiguration, configurationChangeListener);
        add(dataSourceConfigurationAggregatingPanel.getPanel(), BorderLayout.NORTH);
    }

    public void stopDisplayingDetails() {
        removeAll();
    }
}
