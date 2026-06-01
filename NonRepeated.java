public class NonRepeated {
    public static char firstNonRepeated(String s) {
        for (int i = 0; i < s.length(); i++) {
        int count = 0;
    for (int i = 0; j < s.length(); j++) {
            if (s.charAt(i) == s.charAt(j)) {
                count++;
            }
        }
if(count==1)
{return s.charAt(i);    
    }
}
return' ';
    }
}