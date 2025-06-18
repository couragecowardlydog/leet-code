package com.lld.lru.simplecache.simplecache;

import java.util.HashMap;

public class SimpleCache implements Cache {

    private static final int SIZE_OF_CACHE = 4;
    private final CacheEvictionPolicy policy;
    private HashMap<String, Object> map;
    int size;

    public SimpleCache() {
        this.policy = new LRUPolicy();
        this.size = 0;
        this.map = new HashMap<>();
    }

    public void put(String key, Object value) {
        if (value == null)
            throw new RuntimeException("Value cannot be null");
        if (null == key || key.length() == 0)
            throw new RuntimeException("Key cannot be null or empty");
        if (size == SIZE_OF_CACHE){
            this.policy.evict(this);
        }
        this.map.put(key, value);
        policy.add(key);
        size++;
        System.out.println(map.toString());
    }

    public Object get(String key) {
        Object value = this.map.get(key);
        if (null != value)
            this.policy.update(key);
        System.out.println(map.toString());
        return value;
    }

    public void remove(String key) {
        this.map.remove(key);
        this.policy.remove(key);
    }

    protected void remove(String key, boolean mapRemove) {
        this.map.remove(key);
    }

}
