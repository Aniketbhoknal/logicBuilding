package forloop;

public class Multiplication {
    public static void main(String[] args) {
        int n = 5;
        int result=0;
        for (int i = 1; i <= 10; i++) {
            result = n * i;
            System.out.println(result);
        }
        System.out.println(result);
    }
}