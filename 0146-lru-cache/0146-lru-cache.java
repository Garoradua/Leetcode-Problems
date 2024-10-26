class Node{
    int key;
    int value;
    Node next;
    Node prev;

    Node(int key, int value){
        this.key = key;
        this.value = value;
    }

}

class LRUCache {
    Map<Integer, Node> map;
    Node head= new Node(0, 0);
    Node tail = new Node(0, 0);
    int capacity = 0;;
    public LRUCache(int capacity) {
        map = new HashMap<>();
        head.next = tail;
        tail.prev = head;
        this.capacity = capacity;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            Node data = map.get(key);
            //remove
            removeNode(data);

            //add
            addNode(data);

            return data.value;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
             //remove
             Node data = map.get(key);
              removeNode(data);
        }
        if(map.size() == capacity){
            removeNode(tail.prev);
        }
        //add
        addNode(new Node(key, value));
        
    }
    public void removeNode(Node data){
        map.remove(data.key);
        data.prev.next = data.next;
        data.next.prev = data.prev;
    }
    public void addNode(Node data){
        map.put(data.key, data);
        data.next = head.next;
        head.next = data;
        data.next.prev = data;
        data.prev = head;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */