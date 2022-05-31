/** Implement Stack data structure using Linked List  **/ 

import java.util.Iterator;
import java.util.LinkedList;

class Stack
{

    private LinkedList <Integer> st = new LinkedList <Integer>();

//    add element in stack
    public void push(int ele)
    {
        st.addLast(ele);
    }

//    remove element from stack
    public void pop()
    {
        if (!st.isEmpty())
        {
            System.out.println("pop element is :" + st.removeLast());
        }
        else
        {
            System.out.println("Stack is empty");
        }
    }

//    display element of stack
    public void show()
    {
        if (!st.isEmpty())
        {
            Iterator it = st.iterator();
            while (it.hasNext())
            {
                System.out.println(it.next());
            }
        }
        else
        {
            System.out.println("Stack is empty");
        }
    }
}

public class TestStack
{

    public static void main(String[] args)
    {
        Stack s = new Stack();

        s.show();
        s.pop();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.show();
        s.pop();
        s.show();
        s.pop();
    }
}
