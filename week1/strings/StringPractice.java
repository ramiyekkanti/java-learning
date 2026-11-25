package week1.strings;

import java.util.Arrays;

public class StringPractice {
    public static void main(String[] args){
        String normalizedEmail = normalizeEmail("  Rami.Yekkanti@Example.COM ");
        System.out.println(normalizedEmail);
        System.out.println(username(normalizedEmail));
        System.out.println(domain(normalizedEmail));


        System.out.println(isValidEmail("a@b.com"));
        System.out.println(isValidEmail("ab.com"));
        System.out.println(isValidEmail("a@@b.com"));
        System.out.println(isValidEmail("@b.com"));
        System.out.println(isValidEmail("a@b"));
        System.out.println(isValidEmail("a@.com"));
        System.out.println("------------------------------------------------------");

        System.out.println(characterReport("Hello World 2026!"));
        System.out.println(characterReport("Java 21"));
        System.out.println(characterReport(""));
        System.out.println(characterReport("!!!"));
        System.out.println("------------------------------------------------------");

        
        System.out.println(formatName("  rami   yEKKANTI "));
        System.out.println(initials("  rami   yEKKANTI "));
        System.out.println(formatName("ravi kumar sharma"));
        System.out.println(initials("ravi kumar sharma"));
        System.out.println(formatName("ASHA"));
        System.out.println(initials("ASHA"));
        System.out.println("------------------------------------------------------");


        System.out.println(describeRecord("Asha,28,Pune"));
        
    }

    // Functions
    public static String describeRecord(String line){
        String[] words = line.trim().split(",");
        
        System.out.println(Arrays.toString(words));
        if(words.length != 3) {
            System.out.println(words.length);
            return "Invalid record";
        }
        else{
            return words[0].trim() + " is " + Integer.parseInt(words[1].trim()) + " years old and lives in " + words[2].trim();
        }
    }

    public static String formatName(String raw){
        StringBuilder sb = new StringBuilder();
        String[] words = raw.trim().split("\\s+");

        for(int i = 0; i < words.length; i++){

            if(i > 0) sb.append(" ");
            sb.append(words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase());
        }
        return sb.toString();
    }

    public static String initials(String raw){
        StringBuilder sb = new StringBuilder();
        String[] words = raw.trim().split("\\s+");

        for(int i = 0; i < words.length; i++){
            sb.append(words[i].substring(0, 1).toUpperCase() + ".");
        }
        return sb.toString();
    }

    public static String normalizeEmail(String raw){
        return raw.trim().toLowerCase();
    }

    public static String username(String email){
        return email.substring(0, email.indexOf('@'));
    }

    public static String domain(String email){
        return email.substring(email.indexOf('@') + 1);
    }

    // "a@b.com", "ab.com", "a@@b.com", "@b.com", "a@b", "a@.com"
    public static boolean isValidEmail(String email){
        if(
            (email.indexOf('@') != email.lastIndexOf('@')) || 
            email.indexOf('@') == 0 ||
            email.indexOf('@') == -1 ||
            email.indexOf('@') == email.length() - 1 ||
            domain(email).indexOf('.') == 0 ||
            domain(email).indexOf('.') == -1||
            domain(email).indexOf('.') == domain(email).length()-1  
        ){
            return false;
        }
        return true;
    }

    public static String characterReport(String s){
        int spaces = 0;
        int digits = 0;
        int letters = 0;

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isLetter(ch)){
                letters++;
            }else if(Character.isDigit(ch)){
                digits++;
            }else if(ch == ' '){
                spaces++;
            }
        }
        return "Letters: " + letters + ", Digits: " + digits + ", Spaces: " + spaces;
    }
}
