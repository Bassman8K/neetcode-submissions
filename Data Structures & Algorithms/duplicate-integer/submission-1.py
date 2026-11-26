class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        temp_array = []
        for i in range(len(nums)):
            if nums[i] not in temp_array:
                temp_array.append(nums[i])
            else:
                temp_array.remove(nums[i])
        if len(temp_array) == len(nums):
            return False
        else:
            return True                