public class StringsWarmup {
    public static void main(String args[]){
        System.out.println(countVowels("Ontario"));
        System.out.println(reverse("Java"));
        System.out.println(isPalindrome("Racecar"));
        System.out.println(isPalindrome("Java"));
        System.out.println(countCharacter("banana", 'a'));
    }

    static int countVowels(String text){
        int vowelCount = 0;
        text = text.toLowerCase();
        for (int i =0;i<text.length();i++){
            if(text.charAt(i) == 'a'|| text.charAt(i) == 'e'|| text.charAt(i) == 'i' || text.charAt(i) == 'o' || text.charAt(i) == 'u'){
                vowelCount++;
            }
        }
        return vowelCount;
    }

    static String reverse(String text){
        String rString="";
        for (int i = text.length()-1;i>=0;i--){
            rString+=text.charAt(i);
        }
        return rString;
    }

    static boolean isPalindrome(String text){
        text = text.toLowerCase();
        for (int i = 0;i<((text.length()/2));i++){
            if (text.charAt(i) != text.charAt(text.length()-(i+1))){
                return false;
            }
        }
        return true;
    }

    static int countCharacter(String text, char c){
        int charCount = 0;
        for (int i = 0; i<text.length();i++){
            if (text.charAt(i)==c){
                charCount++;
            }
        }

        return charCount; 
    }
}
