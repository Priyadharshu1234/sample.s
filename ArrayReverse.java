public class ArrayReverse{
    public static void reverse(int[]arr){
        int n=arr.length;
        for(int i=0;i<n/2;i++)
        int temp =arr[i];
        arr[i]=arr[n-1-i];
        arr[n-1-i]=temp;
    }
}
public static void main(String[] args){
    int[] a={1,2,3,4,5};
    reverse(a);
    for(int i=0;i<a.length;i++){
    System.out.println(a[i]+" ");
}
}