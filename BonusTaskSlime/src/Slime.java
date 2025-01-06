public class Slime {
	
    private int x;
    private int y;
    private int xp;

    public Slime(int startX, int startY, int initialXp) {
        this.x = startX;
        this.y = startY;
        this.xp = initialXp;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getXp() {
        return xp;
    }

    public void move(int newX, int newY) {
        int distance = Math.abs(newX - x) + Math.abs(newY - y);
        if (distance <= xp) {
            x = newX;
            y = newY;
            xp -= distance;
        }
   }}
    
//    public static boolean canReachFood(Slime slime, Food food) {
//		int distance = Math.abs(slime.getX()- food.getX())+Math.abs(slime.getY()- food.getY());
//		
//		return distance <= slime.getXp();
//	}
//}