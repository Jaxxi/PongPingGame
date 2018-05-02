import java.awt.*;
import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class GameCanvas extends Canvas implements Runnable, KeyListener {

    private static final long serialVersionUID = 1L;

    public static final int WIDTH = 500;
    public static final int HEIGHT = 500;

    public static Dimension size = new Dimension(WIDTH, HEIGHT);

    public boolean Running = false;

    private int FPS = 60;
    private long targetTime = 1000 / FPS;

    private Play play;

    public GameCanvas(){
        setMinimumSize(size);
        setPreferredSize(size);
        setMaximumSize(size);

        start();
    }
    public void start(){
        addKeyListener(this);
        setFocusable(true);
        Running= true;
        new Thread(this, "Loop").start();
    }
    public void stop(){
        Running = false;
        System.exit(0);
    }
    public void run(){

            long start;
            long elapsed;
            long wait;

            play = new Play();

        while(Running){
                start = System.nanoTime();

                tick();
                repaint();

                elapsed = System.nanoTime() - start;
                wait = targetTime - elapsed;

                if(wait < 0) {
                    wait = 5;
                }
                    try {
                        Thread.sleep(5);
                    }
                    catch(Exception e){
                        e.printStackTrace();
                    }
            }
        }

    public void tick(){
        play.update();
    }
    public void paint(Graphics g) {
        play.draw(g);

        g.fillRect(10, 10, 10, 10);
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        play.keyPressed(key);
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        play.keyReleased(key);
    }

    public void keyTyped(KeyEvent e) {

    }
}
