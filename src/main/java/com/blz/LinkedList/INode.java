package com.blz.LinkedList;

public interface INode<K> {

        void setKey(K key);

        K getKey();

        void setNext(INode<K> next);

        INode<K> getNext();
    }

