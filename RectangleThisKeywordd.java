package Java;

public class RectangleThisKeywordd {
    private int length;
    private int width;
    public RectangleThisKeywordd(int length, int width) {
        this.length = length;
        this.width = width;   
    }
    public int calculateArea() {
        return this.length * this.width; 
    }
    public void display() {
        System.out.println("Length: " + this.length);
        System.out.println("Width: " + this.width);
        System.out.println("Area: " + this.calculateArea());
        
    }
    public static void main(String[] args) {
    	RectangleThisKeywordd rect = new RectangleThisKeywordd(5, 3);
        rect.display();
    }
}