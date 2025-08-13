package com.mycompany.aula01;
/**
 *
 * @Beatriz Matiello 
 * @Eduarda Duarte
 */

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Aula01 {

    public static void main(String[] args) {
        JFrame janela = new JFrame();
        JLabel texto = new JLabel("Olá mundo", SwingConstants.CENTER);
        JFrame janela02 = new JFrame();
        JButton botao = new JButton();
        
        janela02.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela02.setSize(800, 800);
        janela02.setVisible(true);
        janela02.setTitle("Novo");
        janela02.add(texto);
        
        botao.setSize(50,50);
        janela02.add(botao);
        
        
        
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
        janela.setSize(1000, 1000);
        janela.setLocationRelativeTo(null);
        janela.setTitle("Quebrando a maldição");
        
        janela.add(texto);
    }
}
