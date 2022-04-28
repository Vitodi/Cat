import java.util.Scanner;

public class Main {
       public static void main (String[] args) {
           Scanner sc = new Scanner(System.in);

           Cat vasia = new Cat();
            System.out.println("How old he?");
            vasia.age =sc.nextDouble();
            vasia.color = "red";
            vasia.pows = 4;
            vasia.weight = 12;
            vasia.destroyer();
            vasia.oldCat();
            vasia.voice();
            vasia.print();


       }
}
