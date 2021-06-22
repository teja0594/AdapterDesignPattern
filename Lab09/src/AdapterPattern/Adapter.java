package AdapterPattern;

public class Adapter extends Cylinder_Socket {
     public int Adapt(String s1,String s2)
     {
    	 int a1 = Integer.parseInt(s1);
    	 int a2 = Integer.parseInt(s2);
    	 return Supply(a1,a2);
    	
     }
}
