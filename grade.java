package java_homework;

import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个百分制成绩:");
        int grade = scan.nextInt();
        System.out.println("该成绩所属的等级为:");
        if(grade < 60) System.out.println("fail");
        else if(grade < 80) System.out.println("pass");
        else if(grade < 90) System.out.println("good");
        else System.out.println("Excellent good"); 
        scan.close();
    }
}
