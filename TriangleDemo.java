import java.util.Scanner; // class Scanner

public class TriangleDemo
{
    public static void main(String[] args)
    {

        double height, base;
        //create a Scanner object
        Scanner input = new Scanner(System.in);

        // Create a Triangle object.
        Triangle tri = new Triangle();

        // Prompt user to input value for height and base
        System.out.print("Triangle height: ");
        height = input.nextDouble();
        System.out.print("Triangle base: ");
        base = input.nextDouble();

        //Set the height and base (use mutator)
        tri.set(height, base);

        // Display the height, base and area (use accessor)
        System.out.println("The pyramid's height is "
                + tri.getHeight());
        System.out.println("The pyramid's base is "
                + tri.getBase());

        System.out.println("The pyramid's area is "
                + tri.getArea());

    }
}
