public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        if (str.length() == 0){
            return "";
        }
        String helper = "";
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);

            if (c >= 'A' && c <= 'Z'){
                c = (char) (c + 32);
                helper = helper + c;
            }
            else{
                helper = helper + c;
            }

        }
        return helper;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        if (str2.length() > str1.length()){
            return false;
        }
        else if (str2.length() == 0){
            return true;
        }
        else{
            int i = 0;
            while (i < str1.length()){
                if (str2.length() > str1.length() - i){
                    return false;
                }
                if(str1.charAt(i) == str2.charAt(0)){
                    int j = 0;
                    int m = i;
                    while (j < str2.length()){
                        if(str1.charAt(m) != str2.charAt(j)){
                            break;
                        }
                        else{
                            m++;
                            j++;
                        }
                    }
                    if (j == str2.length()){
                        return true;
                    }
                }
                i++;
            }
        }
        return true;
    }
}
