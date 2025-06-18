package com.lld.lru.simplecache.simplecache;

public class Node {

    String key;
    Node next;
    Node prev;

    Node(String key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return this.key;
    }
}
