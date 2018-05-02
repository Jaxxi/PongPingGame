import java.awt.*;
import java.awt.event.KeyEvent;

public class Play {

    public Scull p1, p2;

    public Play(){
        init();
    }
    public void init(){
        p1 = new Scull(new Rectangle(0, GameCanvas.HEIGHT / - 2, 20, 100, KeyEvent.VK_W, KeyEvent.VK_S));
        p2 = new Scull(new Rectangle(GameCanvas.WIDTH - 20, GameCanvas.HEIGHT / 2, 20, 100), KeyEvent.VK_UP, KeyEvent.VK_DOWN);
    }
    public void update(){
        p1.update();
        p2.update();
    }
    public void draw(Graphics g){
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, GameCanvas.WIDTH, GameCanvas.HEIGHT);
        p1.draw(g);
        p2.draw(g);
    }
    public void keyPressed(int k){
        p1.keyPressed(k);
        p2.keyPressed(k);
    }
    public void keyReleased(int k){
        p1.keyReleased(k);
        p2.keyReleased(k);
    }
}
