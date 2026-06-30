class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
    for (int num: nums) {
      if (map.containsKey(num)) {
        map.replace(num, map.get(num) + 1);
      } else {
        map.put(num, 1);
      }
    }
    return map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).mapToInt(Map.Entry::getKey).limit(k).toArray();
    }
}
