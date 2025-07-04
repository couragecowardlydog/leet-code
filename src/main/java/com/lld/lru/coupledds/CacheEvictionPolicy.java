package com.lld.lru.coupledds;

public abstract class CacheEvictionPolicy {

    public abstract void evict(CoupledCache simplCache);

    public abstract void update(Node node);

    public abstract void remove(Node node);

    public abstract void add(Node key);
}
