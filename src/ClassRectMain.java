import java.util.Scanner;

public class ClassRectMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the width: ");
        double width = sc.nextDouble();
        System.out.println("enter the height: ");
        double height = sc.nextDouble();

        ClassRectangle rectangle = new ClassRectangle(width, height);
        System.out.println("your Rectangle \n"+ rectangle.display());
        System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rectangle.getArea());
    }
}
