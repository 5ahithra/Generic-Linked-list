/*
 * sNode.java
 * Sahithra Kesavan
 * 
 * This file has a generic node class named sNode for a singlw linked list

 */

public class sNode<T> {
   
	T data;
    sNode<T> next;

    public sNode() 
    {
        this(null, null);
    }

    public sNode(T data) 
    {
        this(data, null);
    }

    public sNode(T data, sNode<T> next) 
    {
        this.data = data;
        this.next = next;
    }
}

