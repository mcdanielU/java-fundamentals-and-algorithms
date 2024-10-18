package DSandAlgorithms.DataStructures.Arrays;

import java.util.ArrayList;
import java.util.*;   

// @SuppressWarnings("unchecked")
// public class Array <T> implements Iterable <T> {

// private T[] arr;
// private int len = 0;
// private int capacity = 0;

// public Array()
// {
//     this(16);
// }

// public Array(int capacity)
// {
//     if (capacity < 0) throw new IllegalArgumentException("Illegal Capacity: "+ capacity);
//     this.capacity = capacity;
//     arr = (T[]) new Object[capacity];
// }

// public int size() { return len; }

// public boolean isEmpty(){
//     return size() == 0; 
// }

// public T get(int index)
// {
//     return arr[index];
// }

// public void set(int ind\ex, T elem)
// {
//     arr[index] = elem;
// }
//
// public void clear()
// {
//     for(int i =0; i< capacity; i++)
//         arr[i] = null;
//     len = 0;x
//
// }

// public void add(T elem)
// {
//     if (len+1 >= capacity)
//     {
//         if (capacity == 0) capacity =1;
//         else capacity *=2; //Double the array capacity
//         T[] newArr = (T[]) new Object[capacity];
//         for (int i = 0; i < len; i++)
//             newArr[i] = arr[i];
//         arr = newArr;
        
//     }
//     arr[len++] = elem;


// }
// }

public class Array_2
{
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(19); 
        a.add(11);
        a.add(15);
        a.add(16);
        a.add(17);
        a.add(18);
        a.add(2, 45);

        Collections.sort(a);

        
        System.out.println(a.subList(1, 4));

        
        
        }
}