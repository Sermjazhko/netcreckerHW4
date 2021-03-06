package com.netcracker.task1;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* Пока реализовала двусвязный список для сравнения с LickedList */

public class MyLinkedList<E> implements ILinkedList<E> {

    private class Node<E> {
        E element;
        Node<E> previous;
        Node<E> next;

        public Node(E element) {
            this.element = element;
        }

        public Node(E element, Node<E> previous, Node<E> next) {
            this.element = element;
            this.previous = previous;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getPrevious() {
            return previous;
        }

        public void setPrevious(Node<E> previous) {
            this.previous = previous;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

    }

    private Node<E> first;
    private Node<E> last;
    private int size;

    public void add(E e) {
        // add to end
        final Node<E> l = last;
        final Node<E> newNode = new Node<>(e, l, null);
        last = newNode;
        // не было элементов в списке
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
    }

    public void add(int index, E element) {
        if (index > size || index < 0)
            System.out.println("Error");
        else if (size == index)
            add(element);
        else {
            Node cur = first;
            for (int i = 0; i < index; i++)
                cur = cur.getNext();
            Node temp = new Node(element, cur.getPrevious(), cur);
            // даем ссылку старому элементу на новый "предыдущий"
            cur.setPrevious(temp);
            // предыдущий для старого элемента ссылается на новый "следующий"
            cur = temp.getPrevious();
            cur.setNext(temp);
            size++;
        }
    }

    public void clear() {
        for (Node<E> cur = first; cur != null; ) {
            Node<E> next = cur.next;
            cur.element = null;
            cur.next = null;
            cur.previous = null;
            cur = next;
        }
        first = last = null;
        size = 0;
    }

    public E get(int index) {
        if (!isElementIndex(index))
            return null;
        Node<E> cur = getNode(index);
        return cur.getElement();
    }

    public int indexOf(E element) {
        int index = 0;
        if (element == null) {
            for (Node<E> x = first; x != null; x = x.next) {
                if (x.element == null)
                    return index;
                index++;
            }
        } else {
            for (Node<E> x = first; x != null; x = x.next) {
                if (element.equals(x.element))
                    return index;
                index++;
            }
        }
        return -1;
    }

    public E remove(int index) {
        if (!isElementIndex(index))
            return null;
        Node<E> cur = first;
        if (index == 0) {
            first = cur.getNext();
            cur.getNext().setPrevious(null);
            size--;
            return cur.getElement();
        }
        cur = getNode(index);
        // забываем о элементе в списке
        cur.getPrevious().setNext(cur.getNext());
        if (index == size - 1)
            last = cur.getPrevious();
        else
            cur.getNext().setPrevious(cur.getPrevious());
        size--;
        return cur.getElement();
    }

    public E set(int index, E element) {
        if (!isElementIndex(index))
            return null;
        Node<E> cur = getNode(index);
        E oldElement = cur.getElement();
        cur.setElement(element);
        return oldElement;
    }

    public int size() {
        return size;
    }

    public Object[] toArray() {
        Object[] result = new Object[size];
        int i = 0;
        for (Node<E> x = first; x != null; x = x.next)
            result[i++] = x.element;
        return result;
    }

    public <T> T[] toArray(T[] a) {
        if (a.length < size)
            a = (T[]) java.lang.reflect.Array.newInstance(
                    a.getClass().getComponentType(), size);
        int i = 0;
        Object[] result = a;
        for (Node<E> x = first; x != null; x = x.next)
            result[i++] = x.element;

        if (a.length > size)
            a[size] = null;

        return a;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private boolean isElementIndex(int index) {
        return index >= 0 && index < size;
    }

    public Node<E> getNode(int index) {
        Node<E> cur = first;
        for (int i = 0; i < index; i++)
            cur = cur.getNext();
        return cur;
    }

    @Override
    public String toString() {
        String result = "{";
        if (isEmpty()) result += "}";
        else {
            result += first.getElement().toString();
            for (Node<E> cur = first.getNext(); cur != null; cur = cur.getNext())
                result += ", " + cur.getElement().toString();
            result += "}";
        }
        return result;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private Node<E> node = first;
            private Node<E> prev;
            @Override
            public boolean hasNext() {
                return node != null;
            }

            @Override
            public E next() throws NoSuchElementException {
                if (!hasNext())
                    throw new NoSuchElementException("End of list");
                prev = node;
                node = node.getNext();
                return prev.getElement();
            }
        };
    }
}
