public class String2 {

    /**Given a string, return a string where for every char in the original,
     * there are two chars.
     * @param str not null string
     * @return a string where for every char in the original
     */
    public String doubleChar(String str) {
        String string = "";
        for (int n = 0; n < str.length(); n++) {
            string = string + str.charAt(n) + str.charAt(n);
        }
        return string;
    }

    /**Return the number of times that the string "hi"
     * appears anywhere in the given string.
     * @param str not null string
     * @return the count of hi*/
    public int countHi(String str) {
        int n = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i).startsWith("hi")) {
                n++;
            }
        }
        return n;
    }

    /**Return true if the string "cat" and "dog" appear
     * the same number of times in the given string.
     * @param not null string
     * @return  true if the string "cat" and "dog" appear
     * the same number of times in the given string.*/
    public boolean catDog(String str) {
        int i = 0;
        int c = 0;
        for (int n = 0; n < str.length(); n++) {
            if (str.substring(n).startsWith("cat")) {
                c++;
            }
            if (str.substring(n).startsWith("dog")) {
                i++;
            }
        }
        return i == c;
    }

    /**Return the number of times that the string "code"
     * appears anywhere in the given string,
     * except we'll accept any letter for the 'd',
     * so "cope" and "cooe" count.
     * @param str not null string
     * @return the number of times that the string "code"
     * appears anywhere in the given string*/
    public int countCode(String str) {
        int i = 0;
        for (int n = 0; n < str.length()-3; n++) {
            if (str.charAt(n)== 'c' && str.charAt(n+1)=='o' && str.charAt(n+3)=='e') {
                i++;
            }
        }
        return i;
    }

    /**Given two strings, return true if either of the strings appears at the very end of the other string,
     * ignoring upper/lower case differences (in other words,
     * the computation should not be "case sensitive").
     * Note: str.toLowerCase() returns the lowercase version of a string.
     * @param a not null string
     * @param b  not null string
     * @return true if either of the strings appears at the very end of the other string,
     * ignoring upper/lower case differences.*/
    public boolean endOther(String a, String b) {
        String a1 = a.toLowerCase();
        String b1 = b.toLowerCase();
        if (a1.endsWith(b1) || b1.endsWith(a1)) {
            return true;
        }
        else {
            return false;
        }
    }

    /**Return true if the given string contains an appearance of "xyz"
     * where the xyz is not directly preceeded by a period (.).
     * So "xxyz" counts but "x.xyz" does not.
     * @param str not null string
     * @return true if the given string contains an appearance of "xyz"
     * where the xyz is not directly preceeded by a period (.).*/
    public boolean xyzThere(String str) {
        for (int n = 0; n < str.length(); n++) {
            if (n > 0 && str.substring(n).startsWith("xyz") && str.charAt(n-1) != '.') {
                return true;
            }
            else if ( str.startsWith("xyz")) {
                return true;
            }
        }
        return false;
    }

    /**Return true if the given string contains a "bob" string,
     * but where the middle 'o' char can be any char.
     * @param str not null string
     * @return true if the given string contains a "bob" string,
     * but where the middle 'o' char can be any char.*/
    public boolean bobThere(String str) {
        for (int n = 0; n < str.length()-2; n++) {
            if (str.charAt(n)=='b' && str.charAt(n+2)=='b') {
                return true;
            }
        }
        return false;
    }

    /**We'll say that a String is xy-balanced if for all the 'x' chars in the string,
     * there exists a 'y' char somewhere later in the string. So "xxy" is balanced,
     * but "xyx" is not. One 'y' can balance multiple 'x's.
     * @param str not null string
     * @Return true if the given string is xy-balanced.*/
    public boolean xyBalance(String str) {
        for (int n = 0; n < str.length(); n++) {
            if (str.charAt(n) == 'x' && !str.substring(n).contains("y")) {
                return false;
            }
        }
        return true;
    }

    /**Given two strings, a and b, create a bigger string made of the first char of a,
     * the first char of b, the second char of a,
     * the second char of b, and so on.
     * Any leftover chars go at the end of the result.
     * @param b not null string
     * @param a not null string
     * @return a mixed string*/
    public String mixString(String a, String b) {
        String string = "";
        for (int n = 0; n < Math.min(a.length(), b.length()); n++) {
            string = string + a.charAt(n) + b.charAt(n);
        }
        if (a.length() > b.length()) {
            string = string + a.substring(b.length());
        }
        else {
            string = string + b.substring(a.length());
        }
        return string;
    }

    /**Given a string and an int n,
     * return a string made of n repetitions of the repetitions of the last n characters of the string.
     * You may assume that n is between 0 and the length of the string, inclusive.
     * @param str not null string
     * @param n last n characters of the string
     * @return a string made of n repetitions of the repetitions of the last n characters of the string.*/
    public String repeatEnd(String str, int n) {
        String string = "";
        for (int i = 0; i < n; i++) {
            string = string + str.substring(str.length()-n);
        }
        return string;
    }

    /**Given a string and an int n,
     * return a string made of the first n characters of the string,
     * followed by the first n-1 characters of the string, and so on.
     * You may assume that n is between 0 and the length of the string,
     * inclusive (i.e. n >= 0 and n <= str.length()).
     * @param n first n characters of the string
     * @param str not null string
     * @return a string made of the first n characters of the string,
     * followed by the first n-1 characters of the string*/
    public String repeatFront(String str, int n) {
        String string = "";
        for (int i = n; i >0; i--) {
            string = string + str.substring(0,i);
        }
        return string;
    }

    /**Given two strings, word and a separator sep,
     * return a big string made of count occurrences of the word,
     * separated by the separator string.
     * @param word not null string
     * @param count occurrences of the word
     * @param sep separator string
     * @return return a big string made of count occurrences of the word,
     * separated by the separator string.*/
    public String repeatSeparator(String word, String sep, int count) {
        String string = "";
        for (int i = 0; i < count; i++) {
            string = string + word + sep;
        }
        return string.substring(0,string.length()-sep.length());

    }

    /**Given a string, consider the prefix string made of the first N chars of the string.
     * Does that prefix string appear somewhere else in the string?
     * Assume that the string is not empty and that N is in the range 1..str.length().
     * @param str not null string
     * @param n first N chars of the string
     * @return true if prefix string appear somewhere else in the string*/
    public boolean prefixAgain(String str, int n) {
        return str.substring(n).contains(str.substring(0,n));
    }

    /**Given a string, does "xyz" appear in the middle of the string?
     * To define middle, we'll say that the number of chars to the left and right of the "xyz" must differ by at most one.
     * This problem is harder than it looks.
     * @param str not null string
     * @return true if "xyz" appear in the middle of the string*/
    public boolean xyzMiddle(String str) {
        for (int n = 0; n < str.length(); n++) {
            if (str.substring(n).startsWith("xyz")) {
                if (Math.abs(n - (str.length() - n - 3)) <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    /**A sandwich is two pieces of bread with something in between.
     * Return the string that is between the first and last appearance of "bread" in the given string,
     * or return the empty string "" if there are not two pieces of bread.
     * @param str not null string
     * @return the string that is between the first and last appearance of "bread" in the given string*/
    public String getSandwich(String str) {
        boolean frontStart = true;
        boolean endStart = true;
        int front = 0;
        int end = 0;
        for (int n = 0; n < str.length(); n++) {
            if (str.substring(n).startsWith("bread") && frontStart) {
                front = n+5;
                frontStart = false;
            }
            if (str.substring(0, str.length()-n).endsWith("bread") && endStart) {
                end = str.length() - n - 5;
                endStart = false;
            }
        }
        if (end < front) {
            return "";
        }
        else {
            return str.substring(front, end);
        }
    }

    /**Returns true if for every '*' (star) in the string,
     * if there are chars both immediately before and after the star, they are the same.
     * @param str not null string
     * @return true if for every '*' (star) in the string*/
    public boolean sameStarChar(String str) {
        for (int n = 0; n < str.length(); n++) {
            if (str.substring(n).startsWith("*") && n >0 && n<str.length()-1) {
                if (str.charAt(n-1) != str.charAt(n+1)) {
                    return false;
                }
            }
        }
        return true;
    }

    /**Given a string, compute a new string by moving the first char to come after the next two chars,
     * so "abc" yields "bca". Repeat this process for each subsequent group of 3 chars,
     * so "abcdef" yields "bcaefd". Ignore any group of fewer than 3 chars at the end.
     * @param str not null string
     * @return a new string by moving the first char to come after the next two chars*/
    public String oneTwo(String str) {
        String string = "";
        for (int n = 0; n < str.length() - 2; n = n + 3) {
            string = string + str.charAt(n+1) + str.charAt(n+2) + str.charAt(n);
        }
        return string;
    }

    /**Look for patterns like "zip" and "zap" in the string --
     * length-3, starting with 'z' and ending with 'p'.
     * Return a string where for all such words, the middle letter is gone,
     * so "zipXzap" yields "zpXzp".
     * @param str not null string
     * @return a string where for all such words, the middle letter is gone*/
    public String zipZap(String str) {
        String string = "";
        if (str.length() < 3) {
            return str;
        }
        for (int n = 0; n < str.length(); n++) {
            if (str.charAt(n) == 'z' && str.charAt(n+2) == 'p') {
                string = string + "zp";
                n = n+2;
            }
            else {
                string = string + str.charAt(n);
            }
        }
        return string;
    }

    /**Return a version of the given string,
     * where for every star (*) in the string the star and the chars immediately to its left and right are gone.
     * So "ab*cd" yields "ad" and "ab**cd" also yields "ad".
     * @param str not null string
     * @return a new string*/
    public String starOut(String str) {
        String string = "";
        for (int n = 0; n < str.length(); n++) {
            if (str.charAt(n)=='*') {
                continue;
            }
            if (n < str.length()-1 && str.charAt(n+1)=='*') {
                continue;
            }
            if (n > 0 && str.charAt(n-1)=='*') {
                continue;
            }
            string = string + str.charAt(n);
        }
        return string;
    }

    /**Given a string and a non-empty word string,
     * return a version of the original String where all chars have been replaced by pluses ("+"),
     * except for appearances of the word string which are preserved unchanged.
     * @param str not null string
     * @param word not null string
     * @return a version of the original String where all chars have been replaced by pluses*/
    public String plusOut(String str, String word) {
        String string = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i).startsWith(word)) {
                string = string + word;
                i = i + word.length() - 1;
            }
            else {
                string = string + "+";
            }
        }
        return string;
    }

    /**Given a string and a non-empty word string,
     * return a string made of each char just before
     * and just after every appearance of the word in the string.
     * Ignore cases where there is no char before or after the word,
     * and a char may be included twice if it is between two words.
     * @param str not null string
     * @param word not null string
     * @return a string made of each char just before
     * and just after every appearance of the word in the string*/
    public String wordEnds(String str, String word) {
        String string = "";
        if (str.length() <= word.length()) {
            return string;
        }
        for (int n = 0; n < str.length(); n++) {
            if (str.substring(n).startsWith(word)) {
                if (n == 0) {
                    string = string + str.charAt(n+word.length());
                }
                else if (n == str.length() - word.length()) {
                    string = string + str.charAt(n-1);
                }
                else {
                    string = string + str.charAt(n-1) + str.charAt(n+word.length());
                }
            }
        }
        return string;
    }








}
