package app;

public class App {
    public static void main(String[] args) throws Exception {
    
        int count = 0;
        String color = "black";
        String vehicle = "240sx";

        while (count < 10) {
            System.out.println("The count is " + count);
            count = count + 1;
        }


        System.out.println("count finished");


        while (color == "black"){
            System.out.println("The color is " + color);
            color = "blue";
        }

        System.out.println("color finished");

        while (vehicle == "240sx"){
            System.out.println("The vehicle is " + vehicle);
            vehicle = "180sx";
        }

        System.out.println("vehicle is finished");

    }
}