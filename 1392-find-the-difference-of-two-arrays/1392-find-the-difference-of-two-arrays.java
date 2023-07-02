class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        // Set<Integer> set1=new HashSet<>();
        // Set<Integer> set2=new HashSet<>();

        // for(int n : nums1) {set1.add(n);}
        // for(int n : nums2) {set2.add(n);}

        // List<Integer> diff1=new ArrayList<>();
        // List<Integer> diff2=new ArrayList<>();

        // for(int num : set1){
        //     if(!set2.contains(num)){
        //         diff1.add(num);
        //     }
        // }
        // for(int num : set2){
        //     if(!set1.contains(num)){
        //         diff2.add(num);
        //     }
        // }
        // System.out.println("diff1 : "+diff1);
        // System.out.println("diff2 : "+diff2);


        // List<List<Integer>> result = new ArrayList<List<Integer>>();

        // result.add(diff1);
        // result.add(diff2);

        // return result;

//-------more optmized solution--------//
        Set<Integer> set1= Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> set2= Arrays.stream(nums2).boxed().collect(Collectors.toSet());

        List<List<Integer>> resultList = new ArrayList<>();             
		resultList.add(new ArrayList<>());
		resultList.add(new ArrayList<>());

		for(int num : set1){                                            
			if(!set2.contains(num)){ resultList.get(0).add(num); }      
		}
		for(int num : set2){                                          
			if(!set1.contains(num)){ resultList.get(1).add(num); }      
		}
		return resultList;
        
    }
}