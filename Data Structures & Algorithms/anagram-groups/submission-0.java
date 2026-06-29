class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      List<List<String>> result = new ArrayList<>();
    Map<Map<Character, Long>, List<String>> map = new HashMap<>();
    for (int i = 0; i < strs.length; i++) {
      Map<Character, Long> charMap = strs[i].chars()
        .mapToObj(c -> (char) c)
        .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
      if (map.containsKey(charMap)) {
        map.get(charMap).add(strs[i]);
      } else {
        map.put(charMap, new ArrayList<>());
        map.get(charMap).add(strs[i]);
      }
    }
    for (Map.Entry<Map<Character, Long>, List<String>> entry : map.entrySet()) {
      List<String> resultList = entry.getValue();
      result.add(resultList);
    }
    return result;  
    }
}
