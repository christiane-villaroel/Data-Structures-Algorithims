//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Array numbers = new Array(10);
        for(int i=1;i<=10;i++){
            numbers.insert(i);
        }

        numbers.print();
    }
}