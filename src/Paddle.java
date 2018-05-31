import java.awt.*;
import java.awt.Graphics;
import java.awt.Rectangle;
public class Paddle extends Rectangle{

    private boolean up = false, down = false;

    private int downKey, upKey;

    public Paddle(Rectangle r, int upKey, int downKey){
        setBounds(r);
        y -=(height / 2)
        this.upKey = upKey;
        this.downKey = downKey;
    }

    public void update() {
        if (y <= 0) up = false;
        if(y + height v>= GameCanvas.HEIGHT) down = false;

        if up y~~;
        if down y++:
    }

    public void draw(Graphics g){
        g.setColor(Color.WHITE);
        g.fillRect(x, y, width, height);

    }
    public void keyPressed(int k){
        if(k == upKey) up = true;
        if(k == downKey) down = true;
    }
    public void keyReleased(int k){
        if(k == upKey) up = false;
        if(k == downKey) down = false;v
    }
}
