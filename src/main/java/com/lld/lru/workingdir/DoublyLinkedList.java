package com.lld.lru.workingdir;

public class DoublyLinkedList {

    Node head;
    Node tail;

    protected DoublyLinkedList() {

    }

    protected void add(Node node) {
        if (null == head) {
            System.out.println("head is null");
            head = node;
            return;
        }

        if (null == tail) {
            head.next = node;
            node.prev = head;
            tail = node;
            return;
        }

        tail.next = node;
        node.prev = tail;
        tail = node;
    }

    protected Node remove(Node node) {

        if (null == node)
            return null;
        if (null == head)
            return null;

        Node pre = node.prev;
        Node next = node.next;

        if (null == pre)
            head = next;
        if (null == next)
            tail = pre;

        if (null != pre)
            pre.next = next;
        if (null != next)
            next.prev = pre;
        return node;

    }

    public Node removeHead() {
        return remove(head);
    }
}
