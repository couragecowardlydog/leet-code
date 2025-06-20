package com.lld.lru.simplecache.simplecache;

public abstract class CacheEvictionPolicy {

    public abstract void evict(SimpleCache simplCache);

    public abstract void update(String key);

    public abstract void remove(String key);

    public abstract void add(String key);
}
