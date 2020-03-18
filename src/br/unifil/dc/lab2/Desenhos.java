package br.unifil.dc.lab2;

//import sun.print.PathGraphics;

import javax.swing.*;
import java.awt.*;


/**
 * Write a description of class Desenhos here.
 * 
 * @author Leonardo Vinícius Rocha de Lima
 * @version 1.0 - 11/03/2020
 */
public class Desenhos extends JFrame
{
    public static void desenhoLivre(Graphics2D pincel, Dimension dim) {
    }
    
    public static void desenharAsterisco(Graphics2D g2d) {
        g2d.drawLine(55, 55, 95, 95);
        g2d.drawLine(95, 55, 55, 95);
        g2d.drawLine(75, 50, 75, 100);
        g2d.drawLine(50, 75, 100, 75);
    }

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
        g2d.drawLine(220, 118, 280, 118);





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
    
}
