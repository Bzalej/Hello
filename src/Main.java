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
    }
}
