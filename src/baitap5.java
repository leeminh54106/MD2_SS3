import java.beans.beancontext.BeanContextChild;
import java.util.Arrays;
import java.util.Scanner;

public class baitap5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập size");
        int arr = Integer.parseInt(scanner.nextLine());
        int [] arr1 = new int[arr];
        for(int i = 0; i < arr1.length;i++){
            System.out.println("nhập phần tử");
            arr1[i] = Integer.parseInt(scanner.nextLine());
        }
        int min = arr1[0];
        for (int element : arr1){
            if(min > element){
                min = element;
            }
        }
        System.out.println("min là: " +min);
    }
}
