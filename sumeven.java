package forloop;

import java.util.Scanner;


        public class sumeven{
            public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                System.out.println("Enter the number");
                int num = s.nextInt();
                int sum = 0;
                for (int i = 1; i <= num; i++) {
                    if (i % 2 == 0) {
                        sum += i;
                    }
                }
                System.out.println("The sum of even numbers from 1 to " + num + " is: " + sum);
            }
        }


