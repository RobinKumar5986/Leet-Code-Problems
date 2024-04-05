class Solution {
    void max_heapify(List<Node> heap,int i) {
        if (heap.size() <= 0) return;
        
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        int largest = i;

        if (l < heap.size() && heap.get(l).val > heap.get(i).val) {
            largest = l;
        }

        if (r < heap.size() && heap.get(r).val > heap.get(largest).val) {
            largest = r;
        }

        if (largest != i) {
            Node temp = heap.get(i);
            heap.set(i, heap.get(largest));
            heap.set(largest, temp);

            max_heapify(heap,largest);
        }
    }

    Node getMax(List<Node> heap) {
        Node max = heap.get(0);

        heap.set(0, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);

        max_heapify(heap,0);
        return max;
    }

    public int[] topKFrequent(int[] nums, int k) {
        if (nums.length < k) return new int[0];

        int[] ans = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Node> heap = new ArrayList<>();

        for (int ele : nums)
            map.put(ele, map.getOrDefault(ele, 0) + 1);

        for (Map.Entry<Integer, Integer> ele : map.entrySet()) {
            int key = ele.getKey();
            int val = ele.getValue();
            Node n = new Node(key, val);
            heap.add(n);
        }

        for (int i = (heap.size() / 2) - 1 ; i >= 0; i--) {
            max_heapify(heap,i);
        }

        for(int i=0;i<k;i++){
            ans[i]=getMax(heap).key;
        }
        
        return ans;
    }

    class Node {
        int key;
        int val;
        Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }
}
