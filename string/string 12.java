public class SpecialCharacterCounter {
    public static int countSpecialChars(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!Character.isLetterOrDigit(ch)) {
                count++;
            }
        }
       return count;
    }
    public static void main(String[] args) {
        System.out.println(countSpecialChars("venky@123"));  
        System.out.println(countSpecialChars("#AI$2026"));   
        System.out.println(countSpecialChars("Hello123"));   
    }
}