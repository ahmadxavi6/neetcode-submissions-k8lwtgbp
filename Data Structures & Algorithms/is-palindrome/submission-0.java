class Solution {
    public boolean isPalindrome(String s) {
     String word = "";
    for (char c : s.toCharArray()) {
    if (Character.isLetterOrDigit(c)) {
        word+= Character.toLowerCase(c);
        }
    }
    int j = word.length()-1;
    for(int i = 0; i < word.length() ; i++){
        if(j<=i){
            break;
        }
        if(word.charAt(i) == word.charAt(j)){
            j--;
            continue;
        }
    
        return false;

    }
    return true;
    }
}
