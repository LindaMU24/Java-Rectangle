public class App {

    public void run (){
        Rectangle myRectangle = new Rectangle(5, 10);

        //Set-metoder för att ändra position och storlek
        myRectangle.setXY(2,3);
        myRectangle.setWidth(7);
        myRectangle.setHeight(8);

        //Beräkna arean
        double area = myRectangle.calculateArea();
        System.out.println("Arean av rektangeln är: " + area);

        //Beräkna omkretsen
        double perimeter = myRectangle.calculatePerimeter();
        System.out.println("Omkretsen av rektangeln: " + perimeter);

    }
}
