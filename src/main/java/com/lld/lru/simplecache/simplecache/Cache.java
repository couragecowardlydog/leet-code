package com.lld.lru.simplecache.simplecache;

public interface Cache {

    void put(String key, Object value);

    Object get(String key);

    void remove(String key);

}
