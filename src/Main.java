import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        System.out.println(" Please enter index numder of Array = ");
         int index = scan.nextInt();
         int[] list = new int[index];
         for (int i=0 ; i < list.length; i++){
             System.out.println( i+1 +". number");
            list[i]=scan.nextInt();
         }
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

    }
}