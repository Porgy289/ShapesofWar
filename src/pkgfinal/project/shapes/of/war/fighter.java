
package pkgfinal.project.shapes.of.war;

import java.awt.Color;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.event.*;
import java.awt.Image;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class fighter extends Minion {
    private int pos;
    private int x;
    private int y;
    private int width;
    private int height;

    int spawnx=300;
    int spawny=300;
    int homeradius=20;
    
    Player Player = new Player();
    
    public fighter (){
    }
    
    public void drawStuff(Graphics g) {
        //draw our player
        g.setColor(Color.BLACK);
        g.fillOval(player.x,player.y, player.radius, player.radius);
        //draw home base
        g.setColor(Color.GRAY);
        g.drawOval(homex, homey, homeradius, homeradius);
        //ask each thing to draw itself on the graphics object
        for(int k=0; k<things.size(); k++) {
            Thing t = things.get(k);
            t.draw(g);
            
        //leave the draw color black for any other drawing
        g.setColor(Color.BLACK);
        }
        
}
