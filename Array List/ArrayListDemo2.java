import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListDemo2
{

    public static void main(String[] args)
    {
        ArrayList ar = new ArrayList();
        ar.add("priyanshu gupta");
        ar.add(22);

        System.out.println("ar elements :" + ar); // ar elements :[priyanshu gupta, 22]
        ArrayList arCopy = new ArrayList();

        arCopy.addAll(ar); //add all elements of ar in arCopy

        System.out.println("arCopy elements :" + ar); //arCopy elements :[priyanshu gupta, 22]

        System.out.println(arCopy.containsAll(ar)); //check collection is present or not

        ar.add('M');

        ar.retainAll(arCopy);

        System.out.println(arCopy);  //[priyanshu gupta, 22]
        System.out.println(ar);      //[priyanshu gupta, 22]

        //sort elements
        ArrayList<Integer> ar1 = new <Integer> ArrayList();
        ar1.add(5);
        ar1.add(50);
        ar1.add(3);
        ar1.add(15);
        ar1.add(4);

        Collections.sort(ar1);
        System.out.println("after sort elements are :" + ar1); //after sort elements are :[3, 4, 5, 15, 50]

        Collections.sort(ar1, Collections.reverseOrder());
        System.out.println("after reverse  elements are :" + ar1); //after reverse  elements are :[50, 15, 5, 4, 3]

        Collections.shuffle(ar1); //arrange in randomly
        System.out.println("random order  elements are :" + ar1);

//         convert collection to array
        Object a[] = ar1.toArray();
        System.out.println("array element are:");
        for (Object o : a)
        {
            System.out.println(o);
        }

//          convert array to collection
        ArrayList ar2 = new ArrayList(Arrays.asList(a));
        System.out.println("arrayList element are:");
        System.out.println(ar2);
    }
}
