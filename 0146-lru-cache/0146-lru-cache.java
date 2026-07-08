class LRUCache {
    class Node{
        int key,value;
        Node prev,next;
        public Node(int key, int value){
            this.key=key;
            this.value=value;
        }
    }
    HashMap<Integer,Node> hm= new HashMap<>();
    int capacity;
    Node head= new Node(0,0);
    Node tail= new Node(0,0);
    
    public LRUCache(int capacity) {
        this.capacity=capacity;
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        if(!hm.containsKey(key))return -1;
        Node node = hm.get(key);
        remove(node);
        insert(node);

        return node.value;
    }
    
    public void put(int key, int value) {
        if(hm.containsKey(key)){
            Node node = hm.get(key);
            node.value=value;
            remove(node);
            insert(node);
            return ;
        }
        if(hm.size()==capacity){
            Node node=tail.prev;
            remove(node);
            hm.remove(node.key);
        }
        Node n= new Node(key,value);
        insert(n);
        hm.put(key,n);

    }
    public void insert(Node node){
        node.next=head.next;
        node.prev=head;
        head.next.prev=node;
        head.next=node;
    }
    public void remove(Node node){
       node.prev.next=node.next;
       node.next.prev=node.prev;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */