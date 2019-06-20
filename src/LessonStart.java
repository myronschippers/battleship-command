import java.util.Scanner;

public class LessonStart {

//    private static int age = 36;

    public static void main(String[] args) {
        // write your code here

        // Writing to the Terminal
        // System.out.println("Hail, Enhydra");
        // System.out.println("My name is Myron");
        // System.out.println("That's America's Ass!");

        // SHOWING - variable declaration
        // int someAwesomeNumber = 5;

        // System.out.println(someAwesomeNumber);

        // sayHello("Myron");
        //CHANGE METHOD - now it returns a string
        System.out.println(sayHello("Myron"));
        String age = getName();
        System.out.println("You are " + age + " years old.");
    }

    public static String sayHello(String name) {
        // System.out.println("HELLO, " + name);
        // CHANGE METHOD
        // - to - public static String sayHello(String name)
        // - from - public static void sayHello(String name)
        return "HELLO, " + name;
    }

    public static String getName() {
        System.out.println("Please enter your age:");
        Scanner input = new Scanner(System.in);
        String convertedInput = input.nextLine();
        return convertedInput;
    }
}
