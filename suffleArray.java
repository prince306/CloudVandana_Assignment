import java.util.Random;
import java.util.Scanner;

public class suffleArray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr_len=sc.nextInt();
        int arr[]=new int[arr_len];
        for(int i=0;i<arr_len;i++){
            arr[i]=sc.nextInt();
        }
        Random random=new Random();
        for(int i=0;i<arr_len;i++){
            int temp=random.nextInt(arr_len);
            int arr_value=arr[i];
            arr[i]=arr[temp];
            arr[temp]=arr_value;
        }
        for(int i=0;i<arr_len;i++){
            System.out.print(arr[i]+"  ");
        }
        
    }
}