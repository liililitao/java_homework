package java_homework;

public class sort {
    public static void main(String[] args) {
        int[] a = {20,10,50,40,30,70,60,80,90,100};
        sorting(a);
        System.out.println("该数组从大到小排好序为:");
        for(int i : a) {
            System.out.print(i + " ");
        }
    }
    static void sorting(int[] a) {
        int l = a.length, t;
        for(int i = 0; i < l - 1; i++) {
            for(int j = i + 1; j < l; j++) {
                if(a[i] < a[j]) {
                    t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
    }
}
