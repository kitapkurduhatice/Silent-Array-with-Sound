//package haticesoru;

import java.util.Scanner;


public class SesliSessizHarfler {


    public static void main(String[] args) 
    {
        String[] isimler = new String[50];
        Scanner scn = new Scanner(System.in);
        int i = 0;
        System.out.println("Ýsimlerin girin, bitirmek için boþ satýr girin: ");
        for(; i<isimler.length; i++)
        {
            String isim = scn.nextLine();
            if(isim.equals(""))
                break;
            else
                isimler[i] = isim;    
        }
        String[] sesli = new String[i];
        String[] sessiz = new String[i];
       for(i=0; i < sesli.length; i++)
       {
           String sl = "";
           String sz = "";
           for(int j = 0; j < isimler[i].length(); j++)
           {
               switch(isimler[i].charAt(j))
               {
                   case 'a':
                    sl = sl + isimler[i].charAt(j);
                    break;
                   case 'e':
                    sl = sl + isimler[i].charAt(j);
                    break;
                   case 'ý':
                    sl = sl + isimler[i].charAt(j);
                    break;
                   case 'i':
                    sl = sl + isimler[i].charAt(j);
                    break;
                   case 'o':
                    sl = sl + isimler[i].charAt(j);
                    break;
                   case 'ö':
                    sl = sl + isimler[i].charAt(j);
                    break;
                   case 'u':
                    sl = sl + isimler[i].charAt(j);
                    break;
                   case 'ü':
                    sl = sl + isimler[i].charAt(j);
                    break;
                   default:
                       sz = sz + isimler[i].charAt(j);
                       break;
               }
               sesli[i] = sl;
               sessiz[i] = sz;
           }
       }
       
       System.out.println("Sesli Harfler:");
       for(i = 0; i < sesli.length; i++)
       {
           if(isimler[i] == "")
               break;
           System.out.println(sesli[i]);
       }
       
       System.out.println("Sessiz Harfler:");
       for(i = 0; i < sessiz.length; i++)
       {
           if(isimler[i] == "")
               break;
           System.out.println(sessiz[i]);
       }
    }
    
}