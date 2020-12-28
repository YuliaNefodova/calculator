package com.company;

import javax.swing.*;

public class FrameApp extends JFrame {

    public FrameApp()
    {
        setBounds(100, 100, 265, 400);
        setTitle("Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add( new PanelApp());
        setVisible(true);
    }
}