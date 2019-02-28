import java.util.ArrayList;
import java.util.List;

public class ArrayUebung{
	static List<String> wochentage = new ArrayList<String>();
	static List<String> monate = new ArrayList<String>();
	static List<Integer> tagevonmonaten = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		aufgaben();
	}
    public static void aufgaben ()
    {
    	wochentage.add ("Montag");
    	wochentage.add ("Dienstag");
    	wochentage.add ("Mittwoch");
    	wochentage.add ("Donnerstag");
    	wochentage.add ("Freitag");
    	wochentage.add ("Samstag");
    	wochentage.add ("Sonntag");
    	
    	
    	wochentage.set (4, "Dochnichtfreitag");
    	
    	System.out.println (wochentage.get(4));
    	
    	
    	monate.add ("Januar");
    	monate.add ("Februar");
    	monate.add ("März");
    	monate.add ("April");
    	monate.add ("Mai");
    	monate.add ("Juni");
    	monate.add ("Juli");
    	monate.add ("August");
    	monate.add ("September");
    	monate.add ("Oktober");
    	monate.add ("November");
    	monate.add ("Dezember");
    	
    	
    	tagevonmonaten.add(31);
    	tagevonmonaten.add(28);
    	tagevonmonaten.add(31);
    	tagevonmonaten.add(30);
    	tagevonmonaten.add(31);
    	tagevonmonaten.add(30);
    	tagevonmonaten.add(31);
    	tagevonmonaten.add(31);
    	tagevonmonaten.add(30);
    	tagevonmonaten.add(31);
    	tagevonmonaten.add(30);
    	tagevonmonaten.add(31);
    	
    	System.out.println (monate);
    	System.out.println (tagevonmonaten);
    	
    	for(int i=0; i< monate.size (); i++)
    	{
    		System.out.println("Der Monat " + monate.get(i) + " hat genau " + tagevonmonaten.get(i) + " Tage!");
    	}
    		
    	
    }
		


}
