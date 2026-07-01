class Solution {

    public String encode(List<String> strs) {
      StringBuilder encoded = new StringBuilder();
    for (String str : strs) {
      encoded.append(str).append("#");
    }
    return encoded.toString();
    }

    public List<String> decode(String str) {
      List<String> decodedList = new ArrayList<>();
    int i = 0;
    
    while (i < str.length()) {
      String addedStr = "";
      while (str.charAt(i) != '#') {
        addedStr += str.charAt(i);
        i++;
      }
      decodedList.add(addedStr);
      i++;
    }
    return decodedList;
    }
}
