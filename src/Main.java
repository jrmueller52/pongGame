import javax.swing.*;
public class Main {
    public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setSize(500,500);

    MyPanel panel = new MyPanel();

    frame.add(panel);

    frame.setVisible(true);

    }
}