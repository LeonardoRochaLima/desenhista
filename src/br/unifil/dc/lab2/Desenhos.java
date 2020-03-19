package br.unifil.dc.lab2;

//import sun.print.PathGraphics;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;


/**
 * Write a description of class Desenhos here.
 * 
 * @author Leonardo Vinícius Rocha de Lima
 * @version 1.0 - 11/03/2020
 */
public class Desenhos extends JFrame
{

    /**
     * O método a seguir faz o desenho livre conforme solicitado no método.
     * @param pincel pincel que faz os desenhos, parâmetro da classe Graphics2D
     * @param dim dimensao do pincel
     */
    public static void desenhoLivre(Graphics2D pincel, Dimension dim) {
    }

    /**
     * O método a seguir faz o desenho de um asterisco, usando linhas comuns.
     * @param g2d pincel que faz os desenhos, parâmetro da classe Graphics2D
     */
    public static void desenharAsterisco(Graphics2D g2d) {
        g2d.drawLine(55, 55, 95, 95);
        g2d.drawLine(95, 55, 55, 95);
        g2d.drawLine(75, 50, 75, 100);
        g2d.drawLine(50, 75, 100, 75);
    }

    /**
     * O método a seguir faz o desenho dos smiles conforme solicitado no trabalho.
     * Um rosto com um sorriso, pintado com uma cor verde,
     * Um rosto com uma cara comum, pintado com a cor amarela,
     * E finalmente um rosto triste, pintado com a cor vermelha
     * @param g2d pincel que faz os desenhos, parâmetro da classe Graphics2D
     */
    public static void desenharSmile(Graphics2D g2d){
        g2d.setStroke(new BasicStroke(8));
        //Happy green smile
        g2d.drawOval(50, 50, 100, 100);
        //pintando o smile
        g2d.setColor(Color.GREEN);
        g2d.fillOval(50, 50, 100, 100);
        g2d.setColor(Color.BLACK);

        //desenhando e pintando os olhos do verde
        g2d.setColor(Color.BLACK);
        g2d.drawOval(75, 75, 15, 15);
        g2d.fillOval(75, 75, 15, 15);
        g2d.drawOval(110, 75, 15, 15);
        g2d.fillOval(110, 75, 15, 15);

        //desenhando a boca do verde
        g2d.setStroke(new BasicStroke(1));
        g2d.drawArc(70, 90, 58, 45, 180, 180);
        g2d.fillArc(70, 90, 58, 45, 180, 180);


        //yellow smile
        g2d.setStroke(new BasicStroke(8));
        g2d.drawOval(200, 50, 100, 100);
        g2d.setColor(Color.YELLOW);
        g2d.fillOval(200, 50, 100, 100);
        g2d.setColor(Color.BLACK);

        //desenhando e pintando os olhos do amarelo
        g2d.setColor(Color.BLACK);
        g2d.drawOval(225, 75, 15, 15);
        g2d.fillOval(225, 75, 15, 15);
        g2d.drawOval(260, 75, 15, 15);
        g2d.fillOval(260, 75, 15, 15);

        //desenhando boca do amarelo
        g2d.setStroke(new BasicStroke(5));
        g2d.drawLine(225, 118, 275, 118);


        //red smile
        g2d.setStroke(new BasicStroke(8));
        g2d.drawOval(350, 50, 100, 100);
        g2d.setColor(Color.RED);
        g2d.fillOval(350, 50, 100, 100);
        g2d.setColor(Color.BLACK);

        //desenhando e pintando os olhos do vermelho
        g2d.setColor(Color.BLACK);
        g2d.drawOval(375, 75, 15, 15);
        g2d.fillOval(375, 75, 15, 15);
        g2d.drawOval(410, 75, 15, 15);
        g2d.fillOval(410, 75, 15, 15);

        //desenhando boca do vermelho
        g2d.setStroke(new BasicStroke(5));
        g2d.drawArc(373, 108, 55, 40, 0, 180);
    }

    /**
     * O metodo a seguir desenha um computador comum com 3 baias
     * para CD/DVD, também 2 entradas para disquete,
     * 2 conectores USB, um conector de microfone e outro de fone de ouvido
     * e por fim um botão power.
     * @param g2d pincel que faz os desenhos, parâmetro da classe Graphics2D
     */
    public static void desenharPC(Graphics2D g2d){
        //desenhando base do pc
        g2d.drawRect(50, 50, 100, 200);
        //desenhando base das baias
        g2d.drawRect(55, 55, 90, 120);
        //desenhando baias
        //primeira baia
        g2d.drawRect(55, 55, 90, 30);
        // escrevendo a marca do pc
        //drawString(String str, int xBaselineLeft, int yBaselineLeft);
        g2d.drawString("Aluno TEC", 70, 75);
        //baias dos leitores de CD/DVD
        g2d.drawRect(55, 85, 90, 30);
        g2d.drawRect(55, 115, 90, 30);

        //baias dos leitores de disquete.
        g2d.drawRect(55, 145, 90, 30);
        //primeiro leitor de disquete
        g2d.drawRect(65, 150, 70, 5);

        g2d.drawRect(55, 160, 90, 15);
        //segundo leitor de disquete
        g2d.drawRect(65, 165, 70, 5);


        //USB
        g2d.drawRect(75, 180, 10, 5);
        g2d.drawRect(120, 180, 10, 5);

        //Conectores Microfone e Fones de ouvido
        //Microfone
        g2d.drawOval(95, 180, 5, 5);
        //Fone de ouvido
        g2d.drawOval(108, 180, 5, 5);


        //desenhando botão power.
        g2d.drawRect(50, 50, 100, 200);
        g2d.drawOval(92, 198, 20, 20);
    }

    /**
     * O método a seguir faz o desenho da bandeira do brasil com as corres corretas.
     * @param g2d pincel que faz os desenhos, parâmetro da classe Graphics2D
     */
    public static void desenharBandeira(Graphics2D g2d){

    }

    /**
     * O método a seguir faz o desenho de um prédio conforme os parâmetros recebidos.
     * @param g2d pincel que faz os desenhos, parâmetro da classe Graphics2D
     * @param andares quantidade de andares do prédio
     * @param apartamentosPorAndar quantidade de apartamentos por andar
     * @param x posicao inicial do eixo x do desenho
     * @param y posicao inicial do eixo y do desenho
     */
    public static void desenharPredios(Graphics2D g2d, int andares, int apartamentosPorAndar, int x, int y){
        int tamanhoPadraoAndar = 50;
        int tamanhoPadraoApartamento = 50;

        int tamanhoJanelaComprimento = 30;
        int tamanhoJanelaLargura = 35;

        int largura = tamanhoPadraoApartamento*apartamentosPorAndar;
        int altura = tamanhoPadraoAndar*andares;
        g2d.drawRect(x, y, largura, altura);
        x +=10;

        int yinicial = y + 10;
        y+=10;
        for(int i = 0; i < apartamentosPorAndar; i++) {
            for (int j = 0; j < andares; j++) {
                g2d.drawRect(x, y, tamanhoJanelaLargura, tamanhoJanelaComprimento);
                y += tamanhoJanelaComprimento + 15;
            }
            y = yinicial;
            x += tamanhoJanelaLargura + 10;
        }
    }


}
