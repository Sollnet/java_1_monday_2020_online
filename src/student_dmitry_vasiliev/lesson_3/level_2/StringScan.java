package student_dmitry_vasiliev.lesson_3.homework.Level_2;

import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class StringScan {
    public static void main(String[] args) {
        System.out.println("Enter Yor name please...");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Hello " + name + "!");
    }
}
