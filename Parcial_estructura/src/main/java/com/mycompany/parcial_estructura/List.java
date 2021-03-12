package com.mycompany.parcial_estructura;

import com.mycompany.parcial_estructura.ListInterface;
import com.mycompany.parcial_estructura.ListNode;
import java.util.Iterator;

import static java.lang.System.*;

public class List implements ListInterface, Iterable<ListNode> {

    private ListNode inode;
    private int size;

    public ListNode head;
    public ListNode tail;


    public List() {
        clear();
    }


    public List(Object object) {
        add(object);
    }


    public boolean isEmpty() {
        return head == null;
    }


    @Override
    public int getSize() {
        return size;
    }


    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public Object getHead() {
        return head;
    }

    @Override
    public Object getTail() {
        return tail;
    }


    @Override
    public ListNode search(Object object) {
        Iterator<ListNode> i = this.iterator();
        ListNode inode;
        while ((inode = i.next()) != null) {
            if (inode.getObject().toString().equals(object.toString())) {
                return inode;
            }
        }
        return null;
    }

    @Override
    public boolean add(Object object) {
        return insertTail(object);
    }

    @Override
    public boolean insert(ListNode node, Object object) {
        try {
            if (node.next == null) {
                add(object);
            } else {
                ListNode newNode = new ListNode(object);
                newNode.next = node.next;
                node.next = newNode;
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }


    @Override
    public boolean insert(Object ob, Object object) {
        try {
            if (ob != null) {
                ListNode node = this.search(ob);
                if (node != null) {
                    return insert(node, object);
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    /*
    ok
     */
    @Override
    public boolean insertHead(Object object) {
        try {
            if (isEmpty()) {
                head = new ListNode(object);
                tail = head;
            } else {
                head = new ListNode(object, head);
            }
            this.size++;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /*
    ok
     */
    @Override
    public boolean insertTail(Object object) {
        try {
            if (isEmpty()) {
                head = new ListNode(object);
                tail = head;
            } else {
                tail.next = new ListNode(object);
                tail = tail.next;
            }
            this.size++;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /*
    ok
     */
    @Override
    public boolean remove(ListNode node) {
        return true;
    }

    /*
    ok
     */
    @Override
    public boolean remove(Object object) {
        return false;

    }

    @Override
    public boolean contains(Object object) {
        return false;
    }


    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public Object[] toArray(Object[] object) {
        return new Object[0];
    }

    @Override
    public Object getBeforeTo() {
        return null;
    }

    /*
    ok
     */
    @Override
    public ListNode getBeforeTo(ListNode node) {
        return null;
    }

    @Override
    public Object getNextTo() {
        return null;
    }

    @Override
    public Object getNextTo(ListNode node) {
        return null;
    }

    @Override
    public List subList(ListNode from, ListNode to) {
        return null;
    }

    @Override
    public List sortList() {
        return null;
    }

    @Override
    public Iterator<ListNode> iterator() {
        inode = head;
        return new Iterator<ListNode>() {
            @Override
            public boolean hasNext() {
                return inode.next != null;
            }

            @Override
            public ListNode next() {
                if (inode != null) {
                    ListNode tmp = inode;
                    inode = inode.next;
                    return tmp;
                } else {
                    return null;
                }
            }
        };
    }

    public void rec(ListNode node) {
        if (node.next != null) {
            rec(node.next);
            // <- ;) ->
        }
        out.println(node.toString());
    }

}
