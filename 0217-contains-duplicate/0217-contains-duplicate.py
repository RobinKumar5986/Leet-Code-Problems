class Solution(object):
    def containsDuplicate(self, nums):
        map=set()
        for ele in nums:
            if ele in  map:
                return True
            map.add(ele)
        return False