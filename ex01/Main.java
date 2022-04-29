package tut10.ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter age: ");
        int age = Integer.valueOf(sc.nextLine());
        try {
            Child child = new Child(name, age);
            System.out.print(child.toString());
            String personClassName = Person.class.getSimpleName();
            String childClassName = Child.class.getSimpleName();
        } catch(IllegalArgumentException error) {
            System.err.println(error.getMessage());
        }
    }
}
