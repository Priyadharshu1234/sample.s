public class LargestWordCount {
    public static void main(String[] args) {
        String str = "Java is a powerful";
        String[] words = str.split(" ");

        int maxLength = 0;

        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
            }
        }

        System.out.println("Largest word count: " + maxLength);
    }
}