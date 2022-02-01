/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package ch29_3tier.ui;

import ch29_3tier.business.BusinessFacade;

import javax.swing.*;
import java.awt.*;

public class EnginesFrame extends JFrame {
    
    private ManageEnginesPanel enginesPanel;
    
    public EnginesFrame() {
        super("Manage Engines");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        add(buildUI(), BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(null);
    }
    
    private Component buildUI() {
        JPanel uiPanel = new JPanel(new BorderLayout());
        
        enginesPanel = new ManageEnginesPanel(this);
        BusinessFacade.INSTANCE.addEngineListener(enginesPanel);
        uiPanel.add(enginesPanel, BorderLayout.CENTER);
        return uiPanel;
    }
    
}
