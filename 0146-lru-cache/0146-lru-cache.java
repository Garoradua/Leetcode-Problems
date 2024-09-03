class LRUCache {
    Map<Integer, Node> map = new HashMap<>();
    Node head = new Node(0,0);
    Node tail = new Node(0,0);
    int capacity;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            Node data = map.get(key);

            //remove
            remove(data);

            //add
            addnode(data);

            return data.value;
        }
        else{
            return -1;
        }
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            //remove
            remove(map.get(key));
        }
        if(capacity==map.size()){
            remove(tail.prev);
        }
        addnode(new Node(key,value));
    }

    public  void addnode(Node data){
        map.put(data.key, data);
        data.next = head.next;
        head.next.prev = data;
        head.next = data;
        data.prev = head;

    }

    public  void remove(Node data){
        map.remove(data.key);
        data.prev.next = data.next;
        data.next.prev = data.prev;
    }

}
    class Node{
        int value;
        Node next;
        Node prev;
        int key;

        Node(int key, int value){
            this.key = key;
            this.value = value;
        }
    }
/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */