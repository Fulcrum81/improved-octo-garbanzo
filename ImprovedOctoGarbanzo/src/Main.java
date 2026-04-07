import objects.Book;
import shapes.Circle;
import shapes.Shape;
import shapes.Square;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final String FILE_PATH = "D:\\books.txt";
    public static final double PI_IS_A_GREAT_NUMBER = 3.14159265359;


    private static ArrayList<Book> books;


    public static void main(String[] args) throws IOException {

//        fileReader();
//
//
//        fileWriter();


        readProperties();


//        collections();
//        TestBase test = new TestBase();
//        test.setup();

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the divided number");
//        try {
//            int a = scanner.nextInt();
//            System.out.println("Enter the divider");
//            int b = scanner.nextInt();
//            divideTwoNumbers(a, b);
//        } catch (InputMismatchException e) {
//            System.out.println("Sorry, but you should enter a number");
//        } catch (ArithmeticException e) {
//            System.out.println("Sorry, but I can't divide by zero: " + e.getMessage());
//        }
//        finally {
//            System.out.println("I am a finally block");
//        }
//
//        Circle circle1 = new Circle(10);
//        Circle circle2 = new Circle(25);
//        Square square = new Square(15);
//        Rectangle rectangle = new Rectangle(45, 20);
//
//        double sumOfAreas = addUpAreas(circle2, circle1, square, rectangle);
//
//
////        double sumOfAreas1 = addUpAreas(circle2, circle1, square);
//
//
//        System.out.println(sumOfAreas);
//


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

        Shape randomShape = shapes[3];

        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                ((Circle)shape).circleHello();
            } else if (shape instanceof Square) {
                ((Square)shape).sayHello();
            }
            sum += shape.getArea();
            shape.hello();
        }
        return sum;
    }

    public static void divideTwoNumbers(int a, int b) {
        System.out.println(a / b);
    }

    public static void collections() {


        ArrayList<String> names = new ArrayList<>();

        names.add("Vadim");
        names.add("Jack");
        names.add("Jill");

        names.add(2, "John");

        int jillIndex = names.indexOf("Jill");

        if (jillIndex == -1) {
            System.out.println("Couldn't find expected value in the list");
        }

        names.forEach(System.out::println);

    }

    public static void streamApi() {
        String a = "10";
        String b = "20";
        int z = Integer.parseInt(a);


        String y = a + b;

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(110);
        numbers.add(110);
        numbers.add(5);
        numbers.add(5);
        numbers.add(256);

        ArrayList<Integer> numbersGreaterThan100 = numbers.stream().distinct().filter(x -> x > 100)
                .collect(Collectors.toCollection(ArrayList::new));

        numbersGreaterThan100.forEach(System.out::println);
    }

    public static void fileWriter() throws IOException {

        Book harryPotter = new Book("Harry Potter", "Joanne Rowling",
                "Fantasy", 300, 2026, 50, 5);
        Book lotr = new Book("LOTR", "J. R. Tolkien",
                "Fantasy", 567, 2024, 40, 1);
        Book gameOfThrones = new Book("Game of Thrones", "George Martin",
                "Fantasy", 700, 2020, 60, 2);

        books.add(harryPotter);
        books.add(lotr);
        books.add(gameOfThrones);

        FileWriter file = new FileWriter(FILE_PATH, false);

        for (Book book : books) {
            file.write(book.getDataForFileWriter() + "\n");
        }

        file.close();
    }

    public static void fileReader() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(FILE_PATH));

        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] substrings = line.split("/");
            String bookName = substrings[0];
            String author = substrings[1];
            String genre = substrings[2];
            int numberOfPages = Integer.parseInt(substrings[3]);
            int year = Integer.parseInt(substrings[4]);
            double price = Double.parseDouble(substrings[5].replace(",", "."));
            int qty = Integer.parseInt(substrings[6]);

            Book book = new Book(bookName, author, genre, numberOfPages, year, price, qty);
            books.add(book);
        }
    }

    public static void readProperties() throws IOException {
        Properties props = new Properties();


        FileInputStream fis = new FileInputStream("resources/test.properties");
        props.load(fis);

        String url = props.getProperty("url");
        System.out.println(url);

    }

}