import java.awt.*;

public class Pentagon extends SimpleShape {
	private int height;
	private int width;

	public Pentagon() {
		super();
		height = 67;
		width = 32;
	}

	public void changeSize(int h, int w) {
		height = h;
		width = w;
		draw();

	public void draw() {
		if (isVisible()) {
			Canvas canvas = Canvas.getCanvas();
			int[] xPoints = { getxPosition(), getxPosition() + width / 2, getxPosition() + width / 4,
					getxPosition() - width / 4, getxPosition() - width / 2 };
			int[] yPoints = { getyPosition(), getyPosition() - height / 2, getyPosition() - height,
					getyPosition() - height, getyPosition() - height / 2 };
			canvas.draw(this, getColor(), new Polygon(xPoints, yPoints, 5));
			canvas.wait(10);
		}
	}
}
