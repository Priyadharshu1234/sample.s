public class Main {
    public static void main(String[] args) {
        String s = "Mississippi";
        System.out.println(s.chars()
           .mapToObj(c -> (char)c)
           .collect(HashMap<Character, Integer>::new, (m,c) -> m.put(c, m.getOrDefault(c,0)+1), Map::putAll)
           .entrySet().stream()
           .max(Map.Entry.comparingByValue())
           .get().getKey()); 
    }
}