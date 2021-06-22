package structural;

public class Charger extends Power_Socket{
   int convert(String ac_vol)
   {
	   int vol=Integer.parseInt(ac_vol);
	   return converting(vol);
   }
}
