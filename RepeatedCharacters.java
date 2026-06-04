public class RepeatedCharacters {
    public static void main(String[] args) {
        String str = "Banana";

        Set<Character> unique = new HashSet<>();
        Set<Character> repeated = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (!unique.add(ch)) {
                repeated.add(ch);
            }
        }

        System.out.println("Repeated characters: " + repeated);
    }
}