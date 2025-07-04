package com.lld.lru.coupledds;

public interface Cache {

    void put(String key, Object value);

    Object get(String key);

    void remove(String key);

}
