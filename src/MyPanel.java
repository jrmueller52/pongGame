import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MyPanel extends JPanel {
    Ball ball;
Slider slider1;
//Slider slider2;
    public MyPanel() {
        setBackground(Color.pink);
        ball = new Ball(this);
        slider1 = new Slider(this, 225, 430);
       // slider2 = new Slider(this, 225, 50);

        setFocusable(true);
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                //System.out.println(e.getKeyCode());
                int key = e.getKeyCode();
                if (key == 39){
                    //System.out.println("moving right");
                    slider1.moveRight();
                }
                else if(key ==37){
                    //System.out.println("moving left");
                    slider1.moveLeft();
                }
//                else if(key ==68){
//                    slider2.moveRight();
//                }
//                else if(key ==65){
//                    slider2.moveLeft();
//                }
            }
        });
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        slider1.draw(g);
        ///slider2.draw(g);
        ball.draw(g);
        ball.move(slider1);

        try {
            Thread.sleep(10);
        }
        catch(Exception e) {
            System.out.println(e);
        }
        repaint();
    }
}
