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

        //desenhando e pintando os olhos
        g2d.setColor(Color.BLACK);
        g2d.drawOval(75, 75, 15, 15);
        g2d.fillOval(75, 75, 15, 15);
        g2d.drawOval(110, 75, 15, 15);
        g2d.fillOval(110, 75, 15, 15);

        g2d.drawArc(60, 75, 180, 180, 50, 50);


        //yellow smile
        g2d.drawOval(200, 50, 100, 100);
        g2d.setColor(Color.YELLOW);
        g2d.fillOval(200, 50, 100, 100);
        g2d.setColor(Color.BLACK);

        //red smile
        g2d.drawOval(350, 50, 100, 100);
        g2d.setColor(Color.RED);
        g2d.fillOval(350, 50, 100, 100);
        g2d.setColor(Color.BLACK);
    }
    
}
