class Solution(object):
    def twoSum(self, nums, target):
        map={}
        for i in range(0,len(nums)):
            map[nums[i]]=i
        ans=[]
        for i in range(0,len(nums)):
            d=target-nums[i]
            if(d in map and i != map.get(d)):
                ans.append(i)
                ans.append(map.get(d))
                return ans

        