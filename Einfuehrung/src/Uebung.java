
public class Uebung {

	static String beliebigerString ;
	static int eineZahl ;
	static int nochEineZahl ;
	static int ergebnis ;
	static float  eineZahlMitKomma ;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		rechenspiele() ;
		ungerade () ;
		
		
	}
public static void rechenspiele ()
{ 
	eineZahl = 666 ;
    nochEineZahl = 1 ;
	eineZahlMitKomma = 7 ; 
    
    ergebnis = eineZahl * nochEineZahl ;
    
    if (ergebnis > eineZahlMitKomma )
    {System.out.println(ergebnis - eineZahlMitKomma); }
    else 
    {System.out.println("Das ergebnis ist zu klein"); }
	
    	
    	System.out.println(ergebnis);
	
	
}
public static void ungerade ()
{
	for(int i= 1 ; i<36 ; i=i+2)
	{
        System.out.println(i);   
    }
}

public static void fibonaccifolge ()
   {
	   for (int i=0 ; int u=1)
	   {
}
}
}














