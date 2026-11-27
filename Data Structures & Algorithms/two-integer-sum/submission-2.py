class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        result = []
        for i in range(len(nums)):
            difference = target - nums[i]
            if difference in nums[:i] or difference in nums[i + 1:]:
                if len(result) < 2:
                    result.append(i)
        return result                

        