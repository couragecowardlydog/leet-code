package com.lld.lru.workingdir;

public class Node {

    Node next;
    Node prev;
    Object value;
    String key;

    Node(String key, Object value) {
        this.value = value;
        this.key = key;
    }

    @Override
    public String toString() {
        return this.value.toString();
    }
}
