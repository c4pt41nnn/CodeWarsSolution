public class Troll {
    public static String disemvowel(String str) {
       String regex = "(?i)[aeiou]";
       return (str.replaceAll(regex, ""));
    }
}
