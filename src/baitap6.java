import java.util.Arrays;
import java.util.Scanner;

public class baitap6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập  số hàng");
        int row = Integer.parseInt(sc.nextLine());
        System.out.println("nhập  số cột");
        int col = Integer.parseInt(sc.nextLine());

        float[][] arr = new float[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("nhập giá trị cho row %d- col %d : ", i, j);
                arr[i][j] = Integer.parseInt(sc.nextLine());
            }
        }

        System.out.println("=====table=====");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col;j++){
                System.out.print(arr[i][j] + "\t\t");
            }
            System.out.println();
        }

        System.out.println("nhập col cần tính tổng");
        int sumcol =Integer.parseInt(sc.nextLine());
        int sum = 0;
        if(sumcol > col){
            System.out.println("vị trí vượt qua mảng rồi");
        }else {
            int j = sumcol -1;
            for(int i = 0; i< row;i++){
            sum += arr[i][j];
            }
        }
        System.out.println("tổng của cột" +sumcol +" là: "+sum);
    }
}
