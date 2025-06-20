package com.lld.lru.workingdir;

public interface Cache {

    void put(String key, Object value);

    Object get(String key);

    void remove(String key);

}
