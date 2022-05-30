import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1
{

    public static void main(String[] args)
    {

//        ArrayList<Integer> al=new <Integer>ArrayList(); //store Integer type of elements

        ArrayList ar = new ArrayList(); //store all type of elements
        ar.add("priyanshu gupta");
        ar.add('M');
        ar.add(22);

        System.out.println(ar);   //[priyanshu gupta, M, 22]

        ar.add(1, true);
        System.out.println(ar);   //[priyanshu gupta, true, M, 22]

        ar.remove("priyanshu gupta"); //give object
        System.out.println(ar);   //[true, M, 22]

        ar.remove(1); //give index
        System.out.println(ar);   //[true, 22]

        System.out.println(ar.get(1)); //get element at given index

        ar.set(0, "priyanshu gupta"); //replace 0 index element
        System.out.println(ar); //[priyanshu gupta, 22]

        System.out.println(ar.contains(1)); //check object is present or not in array list 
        System.out.println("Size of array list :" + ar.size()); //2

        System.out.println(ar.isEmpty()); //list is empty or not

//        retrive data through for loop
        System.out.println("\n\nretrive data through for loop");
        for (int i = 0; i < ar.size(); i++)
        {
            System.out.println(ar.get(i));
        }

//        retrive data through for each loop
        System.out.println("\n\nretrive data through for each loop");
        for (Object o : ar)
        {
            System.out.println(o);
        }
        
        //        retrive data through Iterator
        System.out.println("\n\nretrive data through Iterator");
        Iterator it=ar.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        
        ar.clear();  //clear array list
        System.out.println("after clear arrayList : "+ar);
    }

}
