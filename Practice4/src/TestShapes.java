import java.util.Vector;

public class TestShapes {

	public static void main(String[] args) {
		Shape s = new Rectangle(10, Color.RED);
		Shape o =  new Circle(5, Color.BLACK);
		Shape t = new Triangle(5, Color.WHITE);
		
		Vector<Shape> v = new Vector<Shape>();
		v.add(s);
		v.add(o);
		v.add(t); 
		
		for(Shape x: v) {
			x.draw();
		}

		
		System.out.println(Color.GREEN.asciiCode + "Hello, world");
	}

}