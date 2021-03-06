/*
 * Copyright 2017 Patrick Ahlbrecht
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.onyxbits.raccoon.appimporter;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

import de.onyxbits.weave.swing.AbstractPanelBuilder;

public class ImportAppBuilder extends AbstractPanelBuilder {

	private JProgressBar progress;
	private JButton scan;
	private JButton imprt;
	private JList list;
	private JComboBox owner;

	@Override
	protected JPanel assemble() {
		return null;
	}

}
