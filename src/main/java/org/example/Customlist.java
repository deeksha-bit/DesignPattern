package org.example;
import java.util.ArrayList;

public class Customlist {

        ArrayList<Integer> al = new ArrayList<>();

        void addelement(int element)
        {
            al.add(element);
        }
        int getElement(int position)
        {
            return al.get(position);
        }
        int position(int element)
        {
            return al.indexOf(element);
        }
        void remove(int position)
        {
            al.remove(al.get(position));
        }
        void removelast()
        {
            al.remove(al.get(al.size()-1));
        }
        void print()
        {
            System.out.print(al);
            System.out.println();
    }
}
