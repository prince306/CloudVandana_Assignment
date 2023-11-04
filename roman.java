import java.util.Scanner;

public class roman {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    char ar[]={'I','V','X','L','C','D','M'};
    int arr[]={1,5,10,50,100,500,1000};
    int sum=0;
    int index1=0;
    // int index2=0;
    char ch=str.charAt(str.length()-1);
    for(int i=0;i<ar.length;i++){
        if(ch==ar[i]){
            sum+=arr[i];
            index1=i;
            break;
        }
    }
    for(int i=str.length()-2;i>=0;i--){
         ch=str.charAt(i);
        for(int j=0;j<ar.length;j++){
            if(ch==ar[j] && index1<=j){
                sum+=arr[j];
                index1=j;
                break;
            }
            else if(ch==ar[j] && index1>j){
                index1=j;
                sum-=arr[j];
                break;
            }
        }
    }
    System.out.println(sum);
   
}
}
