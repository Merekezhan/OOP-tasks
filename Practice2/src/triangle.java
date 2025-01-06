public class triangle {
    private int width;

    public triangle(int width) {
        this.width = width;
    }

    public String toString() {
        StringBuilder triangle = new StringBuilder(); 

        
        for (int i = 1; i <= width; i++) {
           
            for (int j = 0; j < width - i; j++) {
                triangle.append(" "); 
            }
           
            for (int j = 0; j < i; j++) {
                triangle.append("[*]"); 
            }
            triangle.append("\n"); 
        }
        
        return triangle.toString(); 
    }

    
    public static void main(String[] args) {
       triangle small = new triangle(4);
        System.out.println(small.toString());
    }
}
