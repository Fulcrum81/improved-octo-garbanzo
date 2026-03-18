public class Book {
    public String name;
    private String author;
    private String genre;
    private int numberOfPages;
    private int yearOfPublishing;

    private String stringInfo;

    public Book(String name, String author, String genre, int numberOfPages, int yearOfPublishing) {
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.numberOfPages = numberOfPages;
        this.yearOfPublishing = yearOfPublishing;

        this.stringInfo = String.format("=======\nBook name: %s\nAuthor: %s\nGenre: %s\nPages: %d\nYear of publishing: %d\n=======\n",
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

}
