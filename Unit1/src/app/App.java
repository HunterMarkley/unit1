package app;

public class App {
    public static void main(String[] args) throws Exception {
    
    int count = 5;
    String color = "black";

    while (count < 10){
        System.out.println("The count is " + count);
        count = count + 1;
    }

    while (color == "black"){
        System.out.println( "color is " + color);
        color = "blue";
    }

    }
}