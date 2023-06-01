import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so lượng phần tử");
        n= scanner.nextInt();
        int array[] = new int[n];
        for (int i=0;i<n;i++){
            System.out.println("nhap giá trị phần tử : "+i);
            array[i] = scanner.nextInt();
        }
        for (int i=0;i<n;i++){
            if (i%2!=0){
//                System.out.println("giá trị ở vị trí chẳn là : "+array[i]);
                System.out.println("giá trị ở vi trí lẽ là : "+array[i]);

            }
        }
    }
}