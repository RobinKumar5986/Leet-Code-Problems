class NumberContainers {
    HashMap<Integer,Integer> indMap = new HashMap<>();
    HashMap<Integer,TreeSet<Integer>> numMap = new HashMap<>();

    public NumberContainers() {
        
    }
    
    public void change(int index, int number) {
        Integer key = null;
        if(indMap.containsKey(index)){
            key = indMap.get(index);
        }
        indMap.put(index , number);

        if(key != null){
            TreeSet<Integer> set = numMap.get(key);
            set.remove(index);
            if(set.isEmpty()){
                numMap.remove(key);
            }else{
                numMap.put(key,set);
            }
        }

        if(numMap.get(number) == null){
            numMap.put(number,new TreeSet<>());
        }
        TreeSet<Integer> set = numMap.get(number);
        set.add(index);

        numMap.put(number,set);
    }
    
    public int find(int number) {
        if(!numMap.containsKey(number)){
            return -1;
        }
        
        return numMap.get(number).first();
    }
}
