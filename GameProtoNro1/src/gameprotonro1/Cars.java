/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameprotonro1;

import java.awt.Color;
import java.awt.Graphics;
import static java.lang.Math.floor;

/**
 *
 * @author s1601396
 */
public class Cars extends GameObject {

    private Handler handler;

    public Cars(float x, float y, ID id, Handler handler, float velX, float velY) {
        super(x, y, id);

        this.handler = handler;

        this.velX = velX;
        this.velY = velY;
    }

    public void tick() {
        x += velX;
        y += velY;
        
        if (x >= GameProtoNro1.WIDTH) {
            x = -40;
        }
    }

    public void render(Graphics g) {
        g.setColor(Color.blue);
        g.fillRoundRect((int) x, (int) y, 30, 30, 10, 10);
    }
}
