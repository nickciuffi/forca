/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.forca;

import screens.TelaJogo;
import java.util.Scanner;
import javax.swing.JFrame;

/**
 *
 * @author nicol
 */
public class Forca {
    
    private static MainFrame frame;
    private static Forca mainClass;

     public static void main(String[] args) {
       Forca.mainClass = new Forca();
       Forca.frame = new MainFrame(mainClass);
       
     }
     
     public void startGame(String code){
         TelaJogo jogo = new TelaJogo(mainClass, code);
         Forca.frame.trocaTela(jogo);
     }
     
}
