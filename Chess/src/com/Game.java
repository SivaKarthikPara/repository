package com;

import javax.swing.*;

public class Game implements Runnable {
    public void run() {
        SwingUtilities.invokeLater(new StartMenu());
    }
    
    public static void main(String[] args) {
       
        System.out.println("--------------Started----------------");
        SwingUtilities.invokeLater(new Game());
       
    }
}