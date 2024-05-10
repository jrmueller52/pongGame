import java.awt.*;
import java.awt.Color.*;
public class Slider {

    private Color color;
    private int x,y;
    private int speedx;
    private MyPanel panel;

    public Slider(MyPanel panel, int xx, int yy){
        x= xx;
        y= yy;
        speedx = 25;
        color = new Color(250,250,250);
        this.panel = panel;
    }
    public int getSlideX(){
        return x;
    }
    public int getSlideY(){
        return y;
    }

    public void draw(Graphics g2){
        g2.setColor(color);
        g2.fillRect(x,y,80, 10);
    }
public void moveRight(){
        x+=speedx;
}
    public void moveLeft(){
        x-=speedx;
    }

}
