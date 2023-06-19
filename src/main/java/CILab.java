//this is a test for pushing

public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {
        if (this.myString == null) {
            return null;
        }
        return myString;
    }

    @Override
    public void setString(String string) {
        this.myString = string;
    }

    @Override
    public boolean detectCapitalUse() {
        String string = this.myString;

        // check if the string is null or empty, if so then return false;
        if (string == null || string.length() == 0) {
            return false;
        }

        // initialize the count of both upper case letters and lower case letters to 0
        int upperCount = 0;
        int lowerCount = 0;

        // iterate through all the letters in the string and count the number of
        // upper case letters and lower case letters
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);

            if (Character.isUpperCase(c)) {
                upperCount++;
            } else if (Character.isLowerCase(c)) {
                lowerCount++;
            }
        }

        /* All letters in this word are capitals, like "USA".
           All letters in this word are not capitals, like "leetcode".

           if the number of upper case letters equals the length of the string OR
           if the number of lower case letters equals the length of the string THEN
           return true
        */
        if (upperCount == string.length() || lowerCount == string.length()) {
            return true;
        }

        /* Only the first letter in this word is capital, like "Google".

           if the number of upper case letters is only one AND
           if the first character in the string is upper case THEN
           return true
        */
        if (upperCount == 1 && Character.isUpperCase(string.charAt(0))) {
            return true;
        }

       return false;
    }
}

