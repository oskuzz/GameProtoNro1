/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameprotonro1;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author s1601396
 */
public class Cars extends GameObject {

    private Handler handler;

    public Cars(float x, float y, ID id, Handler handler) {
        super(x, y, id);

        this.handler = handler;

        velX = 2;
        velY = 0;
    }

    public void tick() {
        x += velX;
        y += velY;
        
    }

    public void render(Graphics g) {
        g.setColor(Color.red);
        g.fillRect((int) x, (int) y, 20, 20);
    }

}
