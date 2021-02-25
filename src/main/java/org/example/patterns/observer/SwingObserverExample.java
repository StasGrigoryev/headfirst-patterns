package org.example.patterns.observer;

import javax.swing.*;
import java.awt.*;

public class SwingObserverExample {
    JFrame frame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    public void go() {
        frame = new JFrame();
        JButton button = new JButton("Should I do it?");

        //these two listeners are observers
        //when the button clicked objects of listeners
        //get notified about that action
        button.addActionListener(event ->
                System.out.println("Don't do it. You might regret it."));
        button.addActionListener(event ->
                System.out.println("Come on, do it!"));

        //frame properties
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
