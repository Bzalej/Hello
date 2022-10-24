import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Wpisz swoje imię");
        String name=sc.nextLine();
        int year=2023;
        int age=28;
        System.out.println("Hello "+name+" mam lat "+age);
        System.out.println("Hello "+name+" in "+year);
        System.out.println("Podaj wartość nr 1");
        int number1 = sc.nextInt();
        System.out.println("Podaj wartość nr 2");
        int number2 = sc.nextInt();
    System.out.println("Wynik to: " + (number1 + number2));
}
}
