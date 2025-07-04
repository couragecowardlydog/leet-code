package com.lld.lru.coupledds;

import java.util.HashMap;

public class CoupledCache implements Cache {

    private static final int SIZE_OF_CACHE = 4;
    private final CacheEvictionPolicy policy;
    private HashMap<String, Node> map;
    int size;

    public CoupledCache() {
        this.policy = new LRUPolicy();
        this.size = 0;
        this.map = new HashMap<>();
    }

    public void put(String key, Object value) {
        if (value == null)
            throw new RuntimeException("Value cannot be null");
        if (null == key || key.length() == 0)
            throw new RuntimeException("Key cannot be null or empty");
        if (size == SIZE_OF_CACHE) {
            this.policy.evict(this);
        }
        Node node = new Node(key, value);
        this.map.put(key, node);
        policy.add(node);
        size++;
        System.out.println(map.toString());
    }

    public Object get(String key) {
        Node node = this.map.get(key);
        if (null != node)
            this.policy.update(node);
        return node.value;
    }

    public void remove(String key) {
        Node node = this.map.remove(key);
        this.policy.remove(node);
    }

    protected void remove(String key, boolean mapRemove) {
        this.map.remove(key);
        System.out.println("remove " + key);
    }

}
