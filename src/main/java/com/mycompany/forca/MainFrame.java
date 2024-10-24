/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.forca;

import javax.swing.JFrame;
import javax.swing.JPanel;
import screens.TelaInicial;

/**
 *
 * @author nicol
 */
public class MainFrame extends JFrame {
    private JPanel currentPanel;
    private Forca mainClass;

    public MainFrame(Forca mainClass) {
        this.mainClass = mainClass;
        setTitle("Jogo da Forca");
        setSize(650, 400);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        mostraTelaInicial();
    }
    
    public void setCurrentPanel(JPanel panel){
        this.currentPanel = panel;
    }
    
    public JPanel getCurrentPanel(){
        return this.currentPanel;
    }

    private void mostraTelaInicial() {
        if (currentPanel != null) {
            remove(currentPanel);
        }
        currentPanel = new TelaInicial(this.mainClass);
        add(currentPanel);
        revalidate();
        repaint();
    }

    public void trocaTela(JPanel tela) {
        if (currentPanel != null) {
            remove(currentPanel);
        }
        currentPanel = tela;
        add(currentPanel);
        revalidate();
        repaint();
    }


}

