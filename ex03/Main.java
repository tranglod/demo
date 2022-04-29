package tut10.ex03;

import tut10.ex01.Child;
import tut10.ex01.Person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student's first name : ");
        String studentFirstName = sc.nextLine();
        System.out.print("Enter student's last name: ");
        String studentLastName = sc.nextLine();
        System.out.print("Enter student's faculty number: ");
        String facultyNumber = sc.nextLine();
        try {
            Student st = new Student(studentFirstName, studentLastName, facultyNumber);
            System.out.print(st.toString());
        }
        catch(IllegalArgumentException error) {
                System.err.println(error.getMessage());
            }

        System.out.print("Enter worker's first name : ");
        String workerFirstName = sc.nextLine();
        System.out.print("Enter worker's last name: ");
        String workerLastName = sc.nextLine();
        System.out.print("Enter worker's salary: ");
        double weekSalary = sc.nextDouble();
        System.out.print("Enter worker's working hours: ");
        double hoursPerDay = sc.nextDouble();
        try {
            Worker worker = new Worker(workerFirstName, workerLastName, hoursPerDay, weekSalary);
            System.out.print(worker.toString());
        } catch(IllegalArgumentException error) {
            System.err.println(error.getMessage());
        }
    }
}
