import java.util.Scanner;

public class pangram {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        int arr[]=new int[26];
        str.toLowerCase();
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if((int)ch>=97&& (int)ch<=122){
                if(arr[ch-'a']==0){
                    count++;
                    arr[ch-'a']=(int)ch;
                }
            }
        }
        if(count!=26){
            System.out.println("Not pangram");
        }
        else{
            System.out.println("Pangram");
        }
    }
}
