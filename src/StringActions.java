package TestStingActions;
import java.util.Scanner;
public class StringActions {
    public static void main(String[] args) {
        ///TASK 1///
        String assigment1  = "My Name is Vladi";
        System.out.println(assiment1.replace("Vladi","Georgi"));
        ///TASK 2///
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Hello, what is your name?");
        String MyName = Scanner.nextLine();
        System.out.println("Can you please repeat your name");
        String SecondTry = Scanner.nextLine();
        System.out.println(MyName.equals(SecondTry));
        ///TASK 3///
        String assigmentSplit = "How many words are in here?";
        String[] Count= assigmentSplitSplitSplit.split(" ");
        System.out.println(Count.length);
        ///TASK 4///
        System.out.println(assigment1 + "-" + assigmentSplit);

    }
}