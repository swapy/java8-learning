Things to learn


## basics
- allows 1 null key and n null values
- In HashMap, hashCode() is used to calculate the bucket and therefore calculate the index.
- hashmap is a contagious array of N elements(capacity), each element is called bucket. Each bucket further points to linkedlist(<j8) and now points to balanced binary tree(=j8and greater) 
- hashmap can accept 1 null key while hashtable cannot. hashmap is not synchronized, hashtable is.
- HashMap in Java stores **both key and value** object as Map.Entry in a bucket which is essential to understand the retrieving logic. 

Read more: https://javarevisited.blogspot.com/2011/02/how-hashmap-works-in-java.html#ixzz6l6sbD0iB


## hashcode()
    - part of Object class.

## equals()
    - part of Object class.

equals method is used to check that 2 objects are equal or not. This method is provided by Object class. You can override this in your class to provide your own implementation.
HashMap uses equals() to compare the key whether the are equal or not. If equals() method return true, they are equal otherwise not equal.


## hashcode working



## changes in java 8

# buckets


A single bucket can have more than one nodes, it depends on hashCode() method. The better your hashCode() method is, the better your buckets will be utilized.
defaults:
```
    DEFAULT_INITIAL_CAPACITY =16
    DEFAULT_LOAD_FACTOR = 0.75f
    TREEIFY_THRESHOLD = 8
```
    capacity = number of buckets * load factor

## collions

Since the internal array of HashMap is of fixed size, and if you keep storing objects, at some point in time hash function will return the same bucket location for two different keys, this is called collision in HashMap. In this case, a linked list is formed at that bucket location and a new entry is stored as the next node.

If we try to retrieve an object from this linked list, we need an extra check to search the correct value, this is done by equals() method. Since each node contains an entry, HashMap keeps comparing entry's key object with the passed key using equals() and when it returns true, Map returns the corresponding value.

Read more: https://javarevisited.blogspot.com/2011/02/how-hashmap-works-in-java.html#ixzz6l6rRMbcu


## questions

## hashmap methods
    get()
    put()
    putAll()
    putIfAbsent()
    containsKey()
    containsValue()
    
## creating custom object as key
- ideal candidates for key are immutable classes like wrapper classes(String,Integer)
- Immutability is required, in order to prevent changes on fields used to calculate hashCode() because if key object returns different hashCode during insertion and retrieval than it won't be possible to get an object from HashMap.

Read more: https://javarevisited.blogspot.com/2011/02/how-hashmap-works-in-java.html#ixzz6l747MzzV

- to create custom object as key
    - ensure it properly overrides hashcode and equals without breaking the contract
    - good if its immutable class.