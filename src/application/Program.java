package application;

import entities.Person;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.CANADA);
        Scanner scan = new Scanner(System.in);

        System.out.print("How many people will you add: ");
        int num = scan.nextInt();
        double sumOfHeights = 0;

        Person[] people = new Person[num];
        for (int i = 0; i < people.length; i++){
            System.out.println("Person #" + (i + 1) + ": ");
            scan.nextLine();
            System.out.print("Name: ");
            String name = scan.nextLine();
            System.out.print("Age: ");
            int age = scan.nextInt();
            System.out.print("Height: ");
            double height = scan.nextDouble();

            people[i] = new Person(name, age, height);

            sumOfHeights += people[i].getHeight();
        }

        System.out.printf("Average Height: %.2f", (sumOfHeights / people.length));
        System.out.println("\nPerson with less than 16 years old: ");
        for (int i = 0; i < people.length; i++){
            if (people[i].getAge() < 16){
                System.out.println(people[i].getName());
            }
        }

        scan.close();
    }
}
