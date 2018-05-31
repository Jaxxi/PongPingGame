import java.awt.Graphics;

public class Ball {

	private int x;
	private int y;
	private int xSpeed;
	private int ySpeed;
	
	private final int WIDTH;
	private final int HEIGHT;

	private Game;
	
	public Ball() {
		this.= ;
		xSpeed = -1;
		ySpeed = -1;
		loadSprite();
		centerBallPosition();
		WIDTH = ball.getWidth();
		HEIGHT = ball.getHeight();
	}
	
	public void updatePosition() {
		x = x + xSpeed;
		y = y + ySpeed;
}
	public void checkCollision(Paddle) {

	if (this.x > paddle.getX() && this.x < paddle.getX() + paddle.getWIDTH()) {
			if (this.y > paddle.getY() && this.y < paddle.getY() + paddle.getHEIGHT()) {
				reverseXDirection();
			}
}
