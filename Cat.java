import java.util.Scanner;

class Cat {
    Scanner sc = new Scanner(System.in);
    Cat cat;
    Main main;
    String color;
    double age;
    int pows;
    double weight;
    String destroy;

    void voice() {
            System.out.println("Mijau-Mijau");
    }

    void destroyer() {
        if (destroy.equals("no")) {
            System.out.println("You will be without feeding");
        }else if(destroy.equals("yes")) {
            System.out.println("You are good cat. I will give your a favorite dish");
        } else {
            System.out.println("Wrong answer");
            destroyer();
        }
        void isAgoodCat(){
            System.out.println("Is he a good cat?" + "Answer mast have yes or no.");
            vasia.destroy = sc.next();
        }


    }

    void oldCat (){
        if (age<=1.0){
            System.out.println("It is a tiny kitten");
        }else if (age>=15.0){
            System.out.println("It is an old cat. He can not have a walk from a lot time.");
        }else if (age>1.0 && age<15.0){
            System.out.println("Good cat for live.");
        }
    }
    void print (){
        System.out.println("Color: " + color);
        System.out.println("Pows: " + pows);
        System.out.println("Weight: " + weight);
    }
}