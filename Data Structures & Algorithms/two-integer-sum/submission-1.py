class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        result = []
        for i in range(len(nums)):
            difference = target - nums[i]
            if difference in nums:
                result.append(i)
                result.append(nums.index(difference))
                break
        return result        

        