import java.awt.*;
public class Ball {

    private int size;
    private Color color;
    private int speedx;
    private int speedy;
    private int posx, posy;
    //add MyPanel
    private MyPanel panel;

    public Ball(MyPanel panel){
        posx = (int)(Math.random()*500+1);
        posy = 50;
        size = 30;
        speedx = 2;
        speedy = 2;
        color = new Color(20,175,250);
        this.panel = panel;

    }

    public void draw(Graphics g2){
        g2.setColor(color);
        g2.fillOval(posx,posy,size, size);
    }

    public void move(Slider s){
        int ballx = posx+15;
        int bally = posy+30;
        int slideLeft = s.getSlideX();
        int slideRight = s.getSlideX()+80;
        int slideTop = s.getSlideY();

        if((posx>= panel.getWidth()-20) || (posx<= 0)){
            speedx = speedx*-1;
            posx+=speedx;
            posy+=speedy;
        }

        else if((posy>= panel.getHeight()-20)){
            speedx=0;
            speedy=0;

        }
        else if((posy<=0)){
            speedy = speedy*-1;
            posx+=speedx;
            posy+=speedy;
        }
        else if((ballx>=slideLeft)&&(ballx<=slideRight)&&(bally==slideTop)){
            speedy = speedy*-1;
            posx+=speedx;
            posy+=speedy;
        }

        else{
            posx+=speedx;
            posy+=speedy;
        }
    }



}
