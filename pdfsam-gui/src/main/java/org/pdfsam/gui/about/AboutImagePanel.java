/* 
 * This file is part of the PDF Split And Merge source code
 * Created on 08/feb/2013
 * Copyright 2013 by Andrea Vacondio (andrea.vacondio@gmail.com).
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.pdfsam.gui.about;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Panel displaying the PDFsam image in the about panel.
 * 
 * @author Andrea Vacondio
 * 
 */
@Named
class AboutImagePanel extends JPanel {

    @Inject
    private Image appImage;

    @PostConstruct
    void init() {
        JLabel image = new JLabel(new ImageIcon(appImage));
        image.setMinimumSize(new Dimension(128, 128));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        Dimension fillerSize = new Dimension(10, 0);
        add(new Box.Filler(fillerSize, fillerSize, fillerSize));
        add(Box.createVerticalGlue());
        setBackground(Color.WHITE);
        add(image);
        add(Box.createVerticalGlue());
    }
}
