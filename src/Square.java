public class Square extends Rect{
	public Square() {
		super();
		super.changeSize(50, 50);
	}
	@Override
	public void changeSize(int l, int w) {
		if(l==w)
			super.changeSize(l, w);
	}
}
