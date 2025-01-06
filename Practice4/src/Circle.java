public class Circle extends Shape {

	public Circle(int position, Color color) {
		super(position, color);
	}



	@Override
	public String symbol() {
		return this.color.asciiCode + (char)(9679) + "";
	}

}