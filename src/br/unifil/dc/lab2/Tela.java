package br.unifil.dc.lab2;

import javax.swing.*;
import java.awt.*;
import java.util.*;

class Tela extends JPanel {
    
    /**
     * Construtor padrão da classe. Configura algumas opções de cores da tela e atribibutos do
     * pincel.
     * 
     */
    public Tela() {
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
        setBackground(Color.WHITE);
    }
    
    /**
     * Outro construtor para a Tela.
     * 
     * @param desenho Nome do desenho a ser pintado inicialmente.
     */
    public Tela(String desenho) {
        this();
        
        this.desenhoEscolhido = desenho;
    }
    
    
    /**
     * Define um novo desenho para ser pintado na tela.
     * 
     * @para desenho Nome do novo desenho a ser pintado.
     */
    public void setDesenho(String desenho) {
        this.desenhoEscolhido = desenho;
    }
    
    
    /**
     * Método que escreve informações auxiliares úteis:
     *  - Dimensões da tela
     *  - Desenho Escolhido
     * 
     * @param g2d Pincel utilizado para desenhar na tela.
     */
    private void exibirInfosUteis(Graphics2D g2d) {
        Dimension dim = getSize();
        StringBuilder txtDim = new StringBuilder("Dimensões da tela: ");
        txtDim.append(dim.width).append(" X ").append(dim.height);
        g2d.drawString(txtDim.toString(), TAMANHO_MARGEM_TXT, TAMANHO_LINHA_TXT);
        
        StringBuilder txtDesenho = new StringBuilder("Pintura: ");
        txtDesenho.append(this.desenhoEscolhido);
        g2d.drawString(txtDesenho.toString(), TAMANHO_MARGEM_TXT, TAMANHO_LINHA_TXT * 2);
    }
    
    
    /**
     * Método responsável por desenhar tudo o que irá aparecer na tela. É aqui que os alunos deverão
     * trabalhar. Porém devem evitar de fazerem um código demasiadamente grande, devem separar em
     * métodos auxiliares (subrotinas) sempre que possível.
     * 
     * @param g Pincel do desenhista.
     * @see java.awt.Graphics, java.swing.Graphics2D
     */
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        exibirInfosUteis(g2d);
        
        switch(desenhoEscolhido) {
            case "Asterisco":
                Desenhos.desenharAsterisco(g2d);
                break;
            case "Smiles":
                Desenhos.desenharSmile(g2d);
                break;
            case "Computador":
                Desenhos.desenharPC(g2d);
                break;
            case "Bandeira do Brasil":
                Desenhos.desenharBandeira(g2d);
                break;
            case "Prédios":
                Desenhos.desenharPredios(g2d, 9, 3, 50, 50);
            default:
                Desenhos.desenhoLivre(g2d, getSize());
                break;
        }
        
    }
    
    // Constantes importantes
    private final int TAMANHO_MARGEM_TXT = 10;
    private final int TAMANHO_LINHA_TXT = 15;
    
    // Atributos da classe
    private String desenhoEscolhido = "";
}