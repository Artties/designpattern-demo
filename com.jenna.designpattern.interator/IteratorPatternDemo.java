package com.jenna.designpattern.iterator;

import java.util.Iterator;

public class IteratorPatternDemo {
    public interface Iterator{
        public abstract boolean hasNext();
        
    }
    public interface Aggreate{
        public abstract Iterator iterator();
    }
}


