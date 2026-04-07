package objects;

import automation.Browser;

import static automation.Browser.chrome;

public class Book extends Goods {
    private String name;
    private String author;
    private String genre;
    private int numberOfPages;
    private int yearOfPublishing;

    private String stringInfo;

    public Book(String name, String author, String genre, int numberOfPages, int yearOfPublishing, double price, int qty) {
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.numberOfPages = numberOfPages;
        this.yearOfPublishing = yearOfPublishing;
        this.price = price;
        this.qty = qty;

        this.stringInfo = String.format("=======\nobjects.Book name: %s\nAuthor: %s\nGenre: %s\nPages: %d\nYear of publishing: %d\n=======\n",
                name, author, genre, numberOfPages, yearOfPublishing);
    }

    public String getName() {
        return name;
    }


    public void printInfo() {
        System.out.print(stringInfo);
    }

    public String getInfo() {
        return stringInfo;
    }

    public static void printGenericBookInfo() {
        System.out.println("A book is something that contains series of pages");
    }

    public String getDataForFileWriter() {
        return String.format("%s/%s/%s/%d/%d/%f/%d", name, author, genre, numberOfPages, yearOfPublishing, price, qty);
    }

    @Override
    public String toString() {
        return stringInfo;
    }
}
