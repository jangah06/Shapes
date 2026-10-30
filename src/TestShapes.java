public class TestShapes {

	public static void main(String[] args) {
		Rect r = new Rect();
		r.makeVisible();
		r.slowMoveHorizontal(100);
		r.changeColor("magenta");
		r.changeSize(100, 200);
		
		Square u = new Square();
		u.makeVisible();
		u.changeColor("black");
		u.slowMoveHorizontal(-100);
		u.changeSize(100, 200);

		Oval o = new Oval();
		o.makeVisible();
		o.changeColor("green");
		o.slowMoveDiagonal(125, 1, 1);
		o.changeSize(80, 160);
		
		Pentagon p = new Pentagon();
		p.makeVisible();
		p.changeColor("red");
		p.changeSize(70, 70);
		p.slowMoveDiagonal(15, 83, 50);

//		Rect s = new Rect();
//		s.makeVisible();
//		s.slowMoveVertical(50);
//		s.changeColor("red");
//		s.changeSize(200, 100);

		Triangle t = new Triangle();
		t.makeVisible();
		t.slowMoveVertical(50);
		t.changeColor("blue");
		t.changeSize(200, 50);
		t.slowMoveDiagonal(100, 1, -1);
		
//		Triangle q = new Triangle();
//		q.makeVisible();
//		q.slowMoveHorizontal(50);
//		q.changeColor("yellow");
//		q.changeSize(123, 77);
//		q.slowMoveDiagonal(100, 1, -1);
//		
//		Oval g = new Oval();
//		g.makeVisible();
//		g.changeColor("magenta");
//		g.changeSize(80, 160);
//		g.slowMoveDiagonal(30, 21, 5);
//		g.slowMoveVertical(-23);
		
		
	}

}