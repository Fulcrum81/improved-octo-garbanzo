import objects.Book;
import objects.Goods;
import objects.Movie;
import shapes.Circle;
import shapes.Rectangle;
import shapes.Shape;
import shapes.Square;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static final double PI_IS_A_GREAT_NUMBER = 3.14159265359;

    public static void main(String[] args) {
        Circle circle1 = new Circle(10);
        Circle circle2 = new Circle(25);
        Square square = new Square(15);
        Rectangle rectangle = new Rectangle(45, 20);

        double sumOfAreas = addUpAreas(circle2, circle1, square, rectangle);

        System.out.println(sumOfAreas);



//        String myName = "Vadim";

//        sayHello(myName);
//        System.out.println(myName);

//        objects.Book.printGenericBookInfo();
//
//        String myString = "Hi, I am a string!";
//        System.out.println(myString.length());
//
//        String myFormattedString = String.format("My string value is: %s", myString);
//
//
//        System.out.println(PI_IS_A_GREAT_NUMBER);
//
//        Scanner scanner = new Scanner(System.in);
//        int userInput;
//
//        do {
//            printMenu();
//            userInput = scanner.nextInt();
//            scanner.nextLine();
//
//            switch (userInput) {
//                case 1 -> enterTask();
//                case 2 -> printTasksInfo();
//            }
//
//        } while(userInput != 0);
//
          // class objects.Book is used to create a book object
//        Book harryPotter = new Book("Harry Potter", "Joanne Rowling",
//                "Fantasy", 300, 2026, 50, 5);
//
////        sayHello(myName, harryPotter);
//
//        System.out.println(myName);
////
//        System.out.println(harryPotter);
//
////        sayHello("Joanne Rowling");
////
////        sayHello("Vadim", harryPotter);
////
////        sayHello();
//
//        sum(4);

//        objects.Book lotr = new objects.Book();
//        lotr.name = "Lord of the Rings";
//
//        harryPotter.printInfo();
//        System.out.println();
//        lotr.printInfo();


//        Scanner scanner = new Scanner(System.in);

//        System.out.print("Наш курс называется \"Java для автоматизаторов\", Как тебя зовут?");
//        String userName = scanner.nextLine();
//
//        System.out.println("Привет, " + userName);
//        String input;
//
//         do {
//            System.out.print("Enter something: ");
//            input = scanner.nextLine();
//        } while (input.isEmpty());

//        int language = scanner.nextInt();
//        String helloMessage = switch (language) {
//            case 1 -> {
//                System.out.println("English:");
//                yield "Hello!";
//            }
//            case 2 -> {
//                System.out.println("Spanish:");
//                yield "Hola!";
//            }
//            case 3 -> {
//                System.out.println();
//                yield "Ciao!";
//            }
//            default -> "Sorry, wrong language";
//        };
//        System.out.println(helloMessage);
//

//        if (score >= 90) {
//            System.out.println("Congrats! You're the best");
//        } else if (score >= 60) {
//            System.out.println("You did ok!");
//        } else if (score >= 30) {
//            System.out.println("So-so");
//        } else {
//            System.out.println("Fail!");
//        }



//        System.out.println("Bye!");
//        System.out.print("Введи размер массива: ");
//        int arraySize = scanner.nextInt();
//        scanner.nextLine();
//
//        String[] favoriteBooks = new String[arraySize];
//
//        for (int i = 0; i < favoriteBooks.length; i++) {
//            System.out.print("Введи любимый фильм: ");
//            favoriteBooks[i] = scanner.nextLine();
//        }
//
//        for (String book : favoriteBooks) {
//            System.out.println(book);
//        }

//        String[][] twoDimensionArray = new String[10][3];
//
//        twoDimensionArray[0][0] = "Task1";
//        twoDimensionArray[0][1] = "Description of Task1";
//        twoDimensionArray[0][2] = "priority of Task1";
//
//        twoDimensionArray[1][0] = "Task2";
//        twoDimensionArray[1][1] = "Description of Task2";
//        twoDimensionArray[1][2] = "priority of Task2";
//
//        for (int i = 0; i < twoDimensionArray.length; i++) {
//            for (int j = 0; j < twoDimensionArray[i].length; j++) {
//                System.out.println(twoDimensionArray[i][j]);
//            }
//            System.out.println();
//        }
//
//        for (String[] taskInfo : twoDimensionArray) {
//            for(String infoString : taskInfo) {
//                System.out.println(infoString);
//            }
//        }

        //int stringLength = helloMessage.length();
    }

    public static void sayHello(String name) {
        name = "Vasya";
        System.out.println("Hello, " + name);
    }

    public static void sayHello(String name, Book book) {
//        book.name = "Pulp Fiction";
        name = "Petya";
        System.out.println("Hello, " + name);
        System.out.println("Your favorite book is: " + book.getName());
    }

    public static void sayHello() {
        System.out.println("Hi!");
    }

    public static void sum(int a, int... numbers) {
        int sum = a;

        for(int number : numbers) {
            sum += number;
        }

        System.out.println(sum);
    }

    public static void printMenu(){
        System.out.println("Menu:\n1 - Enter task\n2 - Print tasks info\n0 - Exit");
    }

    public static void enterTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter task name");
        String taskName = scanner.nextLine();

    }

    public static void printTasksInfo() {

    }

    public static double addUpAreas(Shape... shapes) {
        double sum = 0;
        for (Shape shape : shapes) {
            sum += shape.getArea();
            shape.hello();
        }
        return sum;
    }
}