class Solution {
    public boolean isPalindrome(String s) {
      String editedString =  s.replaceAll("[^a-zA-Z0-9]", "");
        editedString = editedString.toLowerCase();
      for (int i = 0; i < editedString.length() / 2; i++) {
          if (editedString.charAt(i) != editedString.charAt(editedString.length() - i - 1)) {
              return false;
          }
      }
      return true;
    }
}
