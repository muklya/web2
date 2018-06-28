import java.util.*;
public class D{
  public static void main(String[] args){
    ArrayList<String> x = new ArrayList<String>(Arrays.asList("Jack","Sam","Bills","Jack"));
    int a = Collections.binarySearch(x,"Jack");
    //System.out.println(a);

    String b=Collections.max(x);
    //System.out.println(b);

    int c = Collections.frequency(x,"Jack");
    //System.out.println(c);

    Collections.reverse(x);
    //System.out.println(x);

    Collections.shuffle(x);
    //System.out.println(x);

    Collections.sort(x);
    //System.out.println(x);

    Object object = new Object();
		int hCode;
		hCode = object.hashCode();
		System.out.println(hCode);
  }
}
