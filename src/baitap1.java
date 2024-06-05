import java.util.Arrays;
import java.util.Scanner;

public class baitap1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhâp số lượng các phần  tử");
        int size = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = i;
        }
        System.out.println(Arrays.toString(numbers));

        System.out.println("nhập phần tử muốn xóa");
        int delete = Integer.parseInt(scanner.nextLine());
        int deleteIndex = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == delete) {
                deleteIndex = i;
                break;
            }
        }
        System.out.println(deleteIndex);

        //xóa

        for (int i = deleteIndex; i < numbers.length; i++) {
            if (i == numbers.length - 1) {
                numbers[i] = 0;
            } else {
                numbers[i] = numbers[i + 1];
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
