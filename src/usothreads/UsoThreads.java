/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usothreads;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author usu21
 */
public class UsoThreads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       JFrame marco = new MarcoRebote();
       marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       marco.setVisible(true);
    }
    
}

class Pelota {
    
    
    private static final int TAMX = 15;
    private static final int TAMY = 15;
    private double x = 0;
    private double y = 0;
    private double dx = 1;
    private double dy = 1;
    
    
    public void mueve_pelota(Retangle2D limites) {
        
        x+ = dx;
        y+ = dy;
        
        
        if (x < limites.getMinX()) {
            x = limites.getMinX();
            dx = -dx;
            
        }
        
        if (x + TAMX >= limites.getMaxX) {
            x = limites.getMaxX - TAMX;
            dx = -dx;
            
        }
        
        if (y < limites.getMinY()) {
            y = limites.getMinY();
            dy = -dy;
        }
        
        if (y + TAMY >= limites.getMaxY) {
            y = limites.getMaxY -TAMY;
            dy = -dy;
        }
    }
    
    public Ellipse2D getShape() {
        return new Ellipse2D.Double(x, y, TAMX, TAMY);
    }
}


class LaminaPelota extends JPanel {
    
    
    public void add(Pelota b) {
        pelotas.add(b);
    }
    
    public void paintComponent(Graphics g) {
        
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        
        for (Pelota b : pelotas) {
            g2.fill(b.getShape());
            
        }
    }
    
    private ArrayList<Pelota> pelotas = new ArrayList <Pelota>(); 
    
}

class MarcoRebote extends JFrame {
    
    public MarcoRebote() {
        setBounds(600, 300, 400, 350);
        setTitle("Rebotes");
        lamina = new LaminaPelota();
        add(lamina, BorderLayout.CENTER);
        JPanel laminaBotones = new JPanel();
        ponerBoton(laminaBotones, "Dale!", new ActionListener()) {
        
        public void ActionPerformed(ActionEvent event) {
            
            comienza_el_juego;
        }
    }
    ponerBoton(laminaBotones, "salir", new ActionListener()) {
    public void ActionPerformed(ActionEvent evento) {
    system.exit(0);
}
}
    }
}


