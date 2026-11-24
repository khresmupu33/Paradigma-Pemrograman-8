package Maranatha.edu.data;
// nama : Khresna Mulia Putra
// nrp  : 2572032
import Maranatha.edu.exception.ArrayException;

public class NumberArray {
    private Integer[] numbers;

    public NumberArray() {
        this.numbers=new Integer[0];
    }
    public void increaseArray(){
        Integer[] newarray=new Integer[this.numbers.length+1];
        for (int i =0;i<this.numbers.length;i++){
            newarray[i]=numbers[i];
        }
        this.numbers=newarray;
    }
    public void addnumber(int number) throws ArrayException {
        if (number<=0){
            throw new ArrayException("Negative number is not allowed");
        }
        increaseArray();
        this.numbers[this.numbers.length-1]=number;

    }
    public void deletelast() throws ArrayException{
        if (this.numbers.length==0){
            throw new ArrayException("Array is empty");
        }
        Integer[] newarray=new Integer[this.numbers.length-1];
        for (int i =0;i<this.numbers.length-1;i++){
            newarray[i]=numbers[i];
        }
        this.numbers=newarray;
    }
    public void showArray() {
        for (int i = 0; i < this.numbers.length; i++) {
            System.out.print(this.numbers[i]);
            if (i < this.numbers.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
