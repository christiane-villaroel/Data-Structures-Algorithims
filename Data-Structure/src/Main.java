import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Array numbers = new Array(10);
        for(int i=1;i<=10;i++){
            numbers.insert(i);
        }
        System.out.print("Enter a number you would like to find in the array: ");
        int number = input.nextInt();
       System.out.println("Index of "+number+" is "+ numbers.indexOf(number));

        numbers.print();
    }
}