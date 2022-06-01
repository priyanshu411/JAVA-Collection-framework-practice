import java.util.Vector;

public class VectorDemo1
{

    public static void main(String args[])
    {
        Vector ve = new Vector(); //default capacity is 10

        System.out.println("capacity is :" + ve.capacity());
        for (int i = 1; i < 11; i++)
        {
            ve.add(i);
        }
        System.out.println("capacity is :" + ve.capacity());
        ve.add("priyanshu");
        System.out.println("capacity is :" + ve.capacity());   //old capacity * 2
        System.out.println("size is :" + ve.size());   //old capacity * 2
        System.out.println(ve);

        Vector ve1 = new Vector(7);  //we give capacity is 7
        System.out.println("capacity of ve1 :" + ve1.capacity());

        Vector ve2 = new Vector(5, 10);  //we give capacity is 5 and increment value is 10 
        System.out.println("capacity of ve2 :" + ve2.capacity());
        for (int i = 1; i < 6; i++)
        {
            ve2.add(i);
        }
        System.out.println("capacity of ve2 :" + ve2.capacity());
        ve2.add("priyanshu");
        System.out.println("capacity of ve2 :" + ve2.capacity());
    }
}
