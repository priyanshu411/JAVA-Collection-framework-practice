import java.util.Vector;

public class VectorDemo2
{

    public static void main(String[] args)
    {
        Vector ve = new Vector(5);
        System.out.println("capacity is :" + ve.capacity()); //capacity is :5

//        vector class methods

        ve.addElement("priyanshu");
        ve.addElement("gupta");
        ve.addElement('M');
        ve.addElement(21);
        System.out.println(ve); //[priyanshu, gupta, M, 21]

        ve.removeElement('M');
        System.out.println(ve); //[priyanshu, gupta, 21]

        ve.removeElementAt(0);
        System.out.println(ve); //[gupta, 21]
        
         System.out.println(ve.elementAt(0)); //gupta
         System.out.println(ve.firstElement()); //gupta
         System.out.println(ve.lastElement()); //21
         
         ve.removeAllElements();
         System.out.println(ve); // []
     
        
    }
}
