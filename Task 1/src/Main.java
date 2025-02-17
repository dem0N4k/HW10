import java.util.Scanner;

public class Main {
    static String booksInfo = "";


    public static void main(String[] args) {
        while (true) {
            String name = inputBookName();
            int pageCount = inputPageCount();
            double priceBook = inputPriceBook();
            addBook(name, pageCount);
            addBookPrice(priceBook);
            printInfo();
        }
    }

    public static String inputBookName() {
        System.out.println("Введите название книги:");
        return new Scanner(System.in).nextLine();
    }

    public static int inputPageCount() {
        System.out.println("Введите кол-во страниц:");
        return new Scanner(System.in).nextInt();
    }

    public static void addBook(String bookName, int pageCount) {
        booksInfo = booksInfo + bookName + " - " + (pageCount > 0 ? pageCount : "N/A") + " стр.";
    }

    public static void addBookPrice(double priceBook) {
        booksInfo = booksInfo + " - " + (priceBook > 0 ? priceBook : "N/A") + " руб.\n";
    }

    public static double inputPriceBook() {
        System.out.println("Введите цену книги:");
        return new Scanner(System.in).nextDouble();
    }

    public static void printInfo() {
        System.out.println(booksInfo);
    }

}
