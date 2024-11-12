class Node{
    int key;
    int value;
    Node next;
    Node prev;

    Node(int key, int val){
        this.key = key;
        this.value = val;
    }
}
class LRUCache {
    Node head = new Node(0,0);
    Node tail = new Node(0,0);
    int capacity;
    Map<Integer, Node> map;
    public LRUCache(int capacity) {
        map = new HashMap<>();
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            Node data = map.get(key);
            removeNode(data);
            addNode(data);
            return data.value;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node data = map.get(key);

            //remove
            removeNode(data);

        }
        if(map.size()==capacity){
            removeNode(tail.prev);
        }
            addNode(new Node(key, value));
    }

    public void removeNode(Node data){
        map.remove(data.key);
        data.next.prev = data.prev;
        data.prev.next = data.next;
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