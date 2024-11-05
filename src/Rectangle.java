public class Rectangle {
    //Medlemsvariabler
    private int x;
    private int y;
    private int width;
    private int height;

    //Konstruktörer
    public Rectangle() {
        this.x = 0;
        this.y = 0;
        this.width = 0;
        this.height = 0;
    }
    public Rectangle(int width, int height) {
        this.x = 0;
        this.y = 0;
        this.width = width;
        this.height = height;

    }

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    //setters
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public void setHeight(int height) {
        this.height = height;
    }
//Beräkningsmetoder
    public double calculateArea() {
        return width * height;
    }
    public double calculatePerimeter() {
        return 2 * width + 2 * height;
    }
}


