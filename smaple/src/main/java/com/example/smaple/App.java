package com.example.smaple;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
        List<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(10);
        list.add(15);
        System.out.println(list);
        
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()){
            for (int i=0; i<list.size()-1; i++)
            {
                if (itr.next().equals(list.get(i))){
                    itr.remove();
                }
            }
        }
        System.out.println(list);
        System.out.println("New Statement");
    }
}
