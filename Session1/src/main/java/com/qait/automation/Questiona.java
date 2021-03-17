package com.qait.automation;
import java.util.*;

public class Questiona {
    public void runner(){
        //ArrayList
        ArrayList<String> namesList = new ArrayList();
        namesList.add("Mac");
        namesList.add("Jony");
        namesList.add("Mary");
        namesList.add("Donald");
        namesList.add("Phoebe");
        namesList.remove(namesList.get(2));
        namesList.add(2, "Maryln");
        namesList.add(2, "Joseph");
        Collections.sort(namesList);
        System.out.println(namesList);

        //linkedList
        LinkedList<String> lnkdlst = new LinkedList<String>();
        lnkdlst.add("Mac");
        lnkdlst.add("Jony");
        lnkdlst.add("Mary");
        lnkdlst.add("Donald");
        lnkdlst.add("Phoebe");
        lnkdlst.add("Joe");
        System.out.println("The first element is - " + lnkdlst.get(0));
        System.out.println("The last element is - " + lnkdlst.get(lnkdlst.size()-1));
        Collections.sort(lnkdlst);
        System.out.println("Sorted linked list - " + lnkdlst);
        lnkdlst.add(1, "Joana");
        lnkdlst.remove("Mac");
        System.out.println("After additions and deletions - " + lnkdlst);

        //Stack using LinkedList
        LinkedList<Integer> stacky = new LinkedList<Integer>();
        stacky.push(1); System.out.println(stacky);
        stacky.push(2); System.out.println(stacky);
        stacky.push(3); System.out.println(stacky);
        stacky.push(4); System.out.println(stacky);
        System.out.println(stacky.pop());
        System.out.println(stacky.pop());
        System.out.println(stacky.pop());
        System.out.println(stacky.pop());
    }
}
