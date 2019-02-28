
public class Passschecker {

    static boolean eineZahl = false ;
    static boolean groﬂbuchstabe = false ;
    static boolean buchstabe = false;
    static boolean zifferOderBuchstabe = false;
    static boolean laenge = false;
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        zuCharArray("Passwort200");

    }

    public static void zuCharArray(String test)
    {
        System.out.println(test);
        char [] charArray = test.toCharArray();
        System.out.println (charArray [2]);
        System.out.println();
        
        
        
        
    
        for (int i=0 ; i< charArray.length ; i++)
     { if (Character.isUpperCase(charArray [i]))
            {
                System.out.println(charArray[i] + " ist ein Groﬂbuchstabe! ");
                groﬂbuchstabe = true;
                
            } else
            {
                System.out.println(charArray[i] + " ist kein Groﬂbuchstabe! ");
            }
        

   
         { if (Character.isDigit(charArray [i]))
        {
            System.out.println(charArray[i] + " ist eine Zahl! ");
            eineZahl=true;
        } else
        {
            System.out.println(charArray[i] + " ist keine Zahl! ");
        }
        

         { if (Character.isLetter(charArray [i]))
        {
            System.out.println(charArray[i] + " ist ein Buchstabe! ");
            buchstabe = true;
        } else
        {
            System.out.println(charArray[i] + " ist kein Buchstabe! ");
        }
        

         { if (Character.isLetterOrDigit(charArray [i]))
        {
            System.out.println(charArray[i] + " ist eine Ziffer oder ein Buchstabe! ");
            zifferOderBuchstabe = true;
        } else
        {
            System.out.println(charArray[i] + " ist keine Ziffer oder Buchstabe! ");
        }
        
         { if (charArray.length >= 7)
         {
             System.out.println(charArray[i] + " ist mindestens acht Ziffern lang! ");
             laenge = true;
         }else{
             System.out.println(charArray[i] + " ist keine acht Ziffern lang! ");
         }
        
        
        
     }
     }
     }
     }
     }
        
    
}
}

