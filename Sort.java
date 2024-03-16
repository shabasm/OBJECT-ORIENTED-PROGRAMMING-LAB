import java.util.Arrays;
import java.util.Scanner;
public class Sort{
public static void main(String args[]){
int n1;
Scanner read=new Scanner(System.in);
System.out.print("Enter the size of array:");
n1=read.nextInt();
System.out.print("Enter the value:");
String[] arr=new String[n1];
for(int i=0;i<n1;i++){
arr[i]=read.next();
}

Arrays.sort(arr);
for(int i=0;i<n1;i++){
System.out.print(arr[i]+",");
}
}
}
