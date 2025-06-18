package com.lld.lru.simplecache.simplecache;


public class LRUPolicy extends CacheEvictionPolicy {

    DoublyLinkedList linkedList;

    LRUPolicy() {
        this.linkedList = new DoublyLinkedList();
    }

    @Override
    public void evict(SimpleCache cache) {
        // which key has to be evicted
        Node node = this.linkedList.removeHead();
        cache.remove(node.key, true);

    }

    @Override
    public void update(String key) {
        // which key has to be preseved
        Node node = this.linkedList.remove(key);
        if (null == node)
            this.linkedList.add(node);

    }

    @Override
    public void remove(String key) {
        // which key has to be evicted
        Node node = this.linkedList.remove(key);
    }

    @Override
    public void add(String key) {
        this.linkedList.add(new Node(key));
    }
}
