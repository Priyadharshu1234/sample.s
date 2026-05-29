import java.util.Scanner;
public class TwoDArray1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        for(int i=0;i<n;i++)
        for(int j=0;j<m;j++){
            arr[i][j]=in.nextInt();
           }
        }
        System.out.println("MATRIX:");
        int sum=0;
        for(int i=0;i<n;i++){
            sum=0;
           for(int j=0;j<m;j++){
            sum+=arr[i][j];
           }
           System.out.println(sum+" ");    
        }
           for(int i=0;i<n;i++){
             for(int j=0;j<m;j++){
              System.out.printl(arr[i][j]+" ");
            }
       }
  }