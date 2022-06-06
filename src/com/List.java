package com;

public class List {
    private LinkList head;
    private LinkList tail;
    private int size;

    public List() {
        head = null;
        tail = null;
    }

    public boolean emptylist() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            System.out.println("List is not empty");
        }
        return head == null;
    }

    public void firstelem() {
        System.out.println("First element is " + head.data);
    }

    public void addhowstack(int key, int data) {
        LinkList temp = new LinkList(key, data);
        temp.next = head;
        head = temp;
        size++;
    }

    public void removeAt(int key) {
        LinkList cur = head;
        LinkList prev = head;

        while (cur != null && cur.key != key) {
            prev = cur;
            cur = cur.next;
        }
        if (cur != null) {
            if (cur == head) {
                head = head.next;
            } else {
                prev.next = cur.next;
            }
        }
    }

    public void print() {
        LinkList temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

