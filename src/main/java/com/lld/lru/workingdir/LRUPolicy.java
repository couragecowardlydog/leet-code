package com.lld.lru.workingdir;


public class LRUPolicy extends CacheEvictionPolicy {

    DoublyLinkedList linkedList;

    LRUPolicy() {
        this.linkedList = new DoublyLinkedList();
    }

    @Override
    public void evict(CoupledCache cache) {
        // which key has to be evicted
        Node node = this.linkedList.removeHead();
        System.out.println("Evicting  " + node);
        cache.remove(node.key, true);

    }

    @Override
    public void update(Node node) {
        this.linkedList.remove(node);
        this.linkedList.add(node);
    }

    @Override
    public void remove(Node node) {
        this.linkedList.remove(node);
    }

    @Override
    public void add(Node node) {
        linkedList.add(node);
    }
}
