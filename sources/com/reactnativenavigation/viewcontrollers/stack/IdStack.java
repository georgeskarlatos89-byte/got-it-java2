package com.reactnativenavigation.viewcontrollers.stack;

import com.reactnativenavigation.utils.CollectionUtils;
import com.reactnativenavigation.utils.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class IdStack<E> implements Iterable<String> {
    private final ArrayList<String> deque = new ArrayList<>();
    private final Map<String, E> map = new HashMap();

    public void push(String str, E e) {
        this.deque.add(str);
        this.map.put(str, e);
    }

    public void set(String str, E e, int i) {
        this.deque.add(i, str);
        this.map.put(str, e);
    }

    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return this.map.get(CollectionUtils.last(this.deque));
    }

    public E pop() {
        if (isEmpty()) {
            return null;
        }
        return this.map.remove(CollectionUtils.removeLast(this.deque));
    }

    public boolean isEmpty() {
        return this.deque.isEmpty();
    }

    public int size() {
        return this.deque.size();
    }

    public String peekId() {
        return (String) CollectionUtils.last(this.deque);
    }

    public void clear() {
        this.deque.clear();
        this.map.clear();
    }

    public E get(String str) {
        return this.map.get(str);
    }

    public E get(int i) {
        return this.map.get(this.deque.get(i));
    }

    public boolean containsId(String str) {
        return this.deque.contains(str);
    }

    public E remove(String str) {
        if (!containsId(str)) {
            return null;
        }
        this.deque.remove(str);
        return this.map.remove(str);
    }

    public boolean isTop(String str) {
        return StringUtils.isEqual(str, peekId());
    }

    public Iterator<String> iterator() {
        return this.deque.iterator();
    }

    public List<E> values() {
        ArrayList<String> arrayList = this.deque;
        Map<String, E> map2 = this.map;
        Objects.requireNonNull(map2);
        return CollectionUtils.map(arrayList, new IdStack$$ExternalSyntheticLambda0(map2));
    }

    public void remove(Iterator<String> it, String str) {
        it.remove();
        this.map.remove(str);
    }
}
