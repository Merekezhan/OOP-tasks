public class Triangle extends Shape {
       
	   public Triangle(int position, Color color) {
		      super(position, color);
	   }
	   
	   
	   @Override
	   public String symbol() {
		   return this.color.asciiCode + (char) 9644 + " ";
	   }
	   
	
}