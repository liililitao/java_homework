package java_homework;

import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("������һ���ٷ��Ƴɼ�:");
        int grade = scan.nextInt();
        System.out.println("�óɼ������ĵȼ�Ϊ:");
        if(grade < 60) System.out.println("fail");
        else if(grade < 80) System.out.println("pass");
        else if(grade < 90) System.out.println("good");
        else System.out.println("Excellent good"); 
        scan.close();
    }
}
