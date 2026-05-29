import java.util.Scanner;
public class Diagonal{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] arr= new int[3][3];
        System.out.println("Enter 9 elements for 3*3 matrix:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
            }
            System.out.println("Main diagonal elements:");
            for(int i=0;i<3;i++){
                System.out.print(arr[i][i]+" ");
            }
            sc.close();
            }
        }    