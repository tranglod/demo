package tut10.ex02;

import java.lang.instrument.IllegalClassFormatException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalArgumentException {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter author: ");
            String author = sc.nextLine();
            System.out.print("Enter title: ");
            String title = sc.nextLine();
            System.out.print("Enter price: ");
            double price = Double.valueOf(sc.nextLine());

            Book book = new Book(author, title, price);

            GoldenEditionBook goldenEditionBook = new GoldenEditionBook(author, title, price);

            Method[] bookDeclaredMethods = Book.class.getDeclaredMethods();
            Method[] goldenBookDeclaredMethods = GoldenEditionBook.class.getDeclaredMethods();

            if (goldenBookDeclaredMethods.length > 1) {
                throw new IllegalClassFormatException(
                        "Code duplication in GoldenEditionBook!");
            }

            System.out.println(book.toString());
            System.out.println(goldenEditionBook.toString());
        } catch (IllegalArgumentException error) {
            System.out.println(error.getMessage());
        } catch (IllegalClassFormatException e) {
            e.printStackTrace();
        }
    }
}
