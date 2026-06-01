public class Main {
    public static void main(String[] args) {
        String s = "banana";
        int[] a = new int[128];
        for (char c : s.toCharArray()) a[c]++;
        char max = 0;
        for (char c : s.toCharArray()) if (a[c] > a[max]) max = c;
        System.out.println(max); 
    }
}