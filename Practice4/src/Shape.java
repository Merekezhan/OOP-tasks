import java.util.Vector;

public abstract class Shape {
	
	public enum Color{
	       RED("Red", "\u001B[31m"),
	       BLACK("Black", "\u001B[30m"),
	       WHITE("White", "\u001B[37m"),
	       GREEN("Green", "\u001B[32m");
	       
	       String name;
		   String asciiCode;
		   
		   
		   Color(String name, String asciiCode){
			     this.name=name;
			     this.asciiCode=asciiCode;
		   }
	}
	
	int position;
	Color color;
	
	Shape(int position, Color color){
		this.position = position;
		this.color = color;
	}
	
	public abstract String symbol();
	
	public void draw() {
		for(int i=0; i < position; ++i) {
			System.out.print(" ");
		}
		System.out.println(this.symbol());
	}
}