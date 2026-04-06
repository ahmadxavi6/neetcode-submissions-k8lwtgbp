class LRUCache {
    int maxCapacity;
    int currentSize;
    Map<Integer, ListNode> map;
    ListNode head;
    ListNode tail;

    public LRUCache(int capacity) {
        maxCapacity = capacity;
        currentSize = 0;
        map = new HashMap<>();
        head = new ListNode(-1, -1);
        tail = new ListNode(-1, -1);
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }

        // Game plan
        // If the node is presnt in the map, we want to move the node next to head;

        // step1: Get the node
        ListNode current = map.get(key);

        // Step 2: Delete the node from current position;
        // Point thre previous node to next node;
        current.prev.next = current.next;
        current.next.prev = current.prev;

        // Step 3: Move the node next to head
        current.next = head.next;
        head.next.prev = current;
        head.next = current;
        current.prev = head;

        // Step 4: Return the value
        return current.value;
    }
    
    public void put(int key, int value) {
        // Case 1: Node already exists in the map
        if(map.containsKey(key)){
            int currentValue = get(key);
            if(currentValue != value){
                map.get(key).value = value;
            }
            return;
        }

        // case 2a:currentSize is eqaul to maxSize
        if(currentSize == maxCapacity){
            ListNode lastNode = tail.prev;
            lastNode.prev.next = tail;
            tail.prev = lastNode.prev;
            map.remove(lastNode.key);
            currentSize--;
        }

        // Case 2b: CurrentSize is less than MaxSize
        ListNode current = new ListNode(key, value);
        // Add ths to head;
        current.next = head.next;
        current.prev = head;
        head.next.prev = current;
        head.next = current;
        // Add to map
        map.put(key, current);

        // Increase the size
        currentSize++;

    }

    class ListNode{
        ListNode next;
        ListNode prev; 
        int key;
        int value;

        ListNode(int k, int v){
            next = null;
            prev = null;
            key = k;
            value= v;
        }
    }
}