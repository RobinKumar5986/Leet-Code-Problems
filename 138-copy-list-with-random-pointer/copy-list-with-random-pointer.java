class Solution {
    public Node copyRandomList(Node head) {
        Map<Node, Node> map = new HashMap<>();
        Node temp = head;
        while(temp != null){
            Node copy = new Node(temp.val);
            map.put(temp, copy);
            temp = temp.next;
        }
        Node save = head;
        while(head != null){
            Node copy = map.get(head);
            copy.next = map.get(head.next);
            copy.random = map.get(head.random);

            head = head.next;
        }
        return map.get(save);
    }
}