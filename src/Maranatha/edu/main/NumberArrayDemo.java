package Maranatha.edu.main;
// nama : Khresna Mulia Putra
// nrp  : 2572032
import java.util.Scanner;
import Maranatha.edu.data.NumberArray;
import Maranatha.edu.exception.ArrayException;

public class NumberArrayDemo {
    public static void main(String[] args) throws ArrayException {
        Scanner input=new Scanner(System.in);
        NumberArray numberArray=new NumberArray();
        int choice;

        do{
            System.out.println("1. addnumberarray");
            System.out.println("2. printarray");
            System.out.println("3. deletelastentry");
            System.out.println("4. exit");
            System.out.println("choice");
            choice=input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("enternmber");
                    int number=input.nextInt();
                    numberArray.addnumber((number));
                    break;
                case 2:
                    numberArray.showArray();
                    break;
                case 3:
                    numberArray.deletelast();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;

            }
        }while (choice != 4);
    }
}
