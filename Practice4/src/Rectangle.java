public class Rectangle extends Shape {
    Rectangle(int position, Color color) {
        super(position, color);
    }

    @Override
    public String symbol() {
        return this.color.asciiCode + (char) 9650 + ""; 
    }
}