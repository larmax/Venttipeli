package venttipeli;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Venttipeli {

    public static void main(String[] args) {

        ArrayList<Integer> Korttienarvo = new ArrayList<>();

        String pelaajankortinarvo = "";
        String pelaajankortinmaa = "";
        String jakajankortinarvo = "";
        String jakajankortinmaa = "";

        Korttienarvo.add(2);
        Korttienarvo.add(3);
        Korttienarvo.add(4);
        Korttienarvo.add(5);
        Korttienarvo.add(6);
        Korttienarvo.add(7);
        Korttienarvo.add(8);
        Korttienarvo.add(9);
        Korttienarvo.add(10);
        Korttienarvo.add(11);
        Korttienarvo.add(12);
        Korttienarvo.add(13);
        Korttienarvo.add(14);

        ArrayList<String> Korttienmaa = new ArrayList<>();

        Korttienmaa.add("Pata");
        Korttienmaa.add("Risti");
        Korttienmaa.add("Ruutu");
        Korttienmaa.add("Hertta");

        Jakaminen(Korttienarvo, Korttienmaa);
    }

    public static void Jakaminen(ArrayList<Integer> Korttienarvo, ArrayList<String> Korttienmaa) {
        Scanner lukijantti = new Scanner(System.in);
        Random rand = new Random();

        HashMap< Integer, String> Pelaajankäsi = new HashMap<>();
        for (int i = 0; i < 2; i++) {
            int arvoo = Korttienarvo.get(rand.nextInt(Korttienarvo.size()));

            String maaa = Korttienmaa.get(rand.nextInt(Korttienmaa.size()));
            if (Pelaajankäsi.containsKey(maaa) && Pelaajankäsi.containsValue(arvoo)) {
                arvoo = Korttienarvo.get(rand.nextInt(Korttienarvo.size()));
                maaa = Korttienmaa.get(rand.nextInt(Korttienmaa.size()));
            } else {
                Pelaajankäsi.put(arvoo, maaa);

            }

        }
        System.out.println("Korttisi" + Pelaajankäsi);

   
while(true){
     System.out.println("haluatko lisätä tai jäädä");
        int lisaajaa = lukijantti.nextInt();
        if (lisaajaa == 1) {
//lisaaTaiJää(Korttienarvo,Korttienmaa,Pelaajankäsi);
 int arvoo = Korttienarvo.get(rand.nextInt(Korttienarvo.size()));
    
        String maaa = Korttienmaa.get(rand.nextInt(Korttienmaa.size()));
       
        
        if (Pelaajankäsi.containsKey(maaa) && Pelaajankäsi.containsValue(arvoo)) {

            System.out.println("hää");
        } else {
            Pelaajankäsi.put(arvoo, maaa);
            System.out.println("Korttisi" + Pelaajankäsi);

        }
        }else if (lisaajaa == 2) {
          
                  int sum = 0;
for (int f : Pelaajankäsi.keySet()) {
    sum += f;
   
}
  emanta(Korttienarvo, Korttienmaa,sum);
  break;
        }
 
   }
    }
   // public static void lisaaTaiJää(ArrayList<Integer> Korttienarvo, ArrayList<String> Korttienmaa, HashMap< Integer, String> Pelaajankäsi) {
     //    Scanner lukijantti = new Scanner(System.in);
       // Random rand = new Random();
       
    //}
    

    public static void emanta(ArrayList<Integer> Korttienarvo, ArrayList<String> Korttienmaa, int pelaajanpisteet) {
        
        Random rand = new Random();
        HashMap< Integer, String> Emännänkäsi = new HashMap<>();
        int korttienmaara = rand.nextInt(5) + 3;
        for (int i = 2; i < korttienmaara; i++) {
            int arvoo = Korttienarvo.get(rand.nextInt(Korttienarvo.size()));

            String maaa = Korttienmaa.get(rand.nextInt(Korttienmaa.size()));

            Emännänkäsi.put(arvoo, maaa);
            System.out.println(Emännänkäsi);
             
        }
        int emännänpisteet = 0;
for (int f :Emännänkäsi.keySet()) {
    emännänpisteet += f;
    System.out.println("");
}


            System.out.println("");
    if(emännänpisteet >= pelaajanpisteet && emännänpisteet <= 21){
        System.out.println("Emäntä voitti!");
        
    }else if (pelaajanpisteet > emännänpisteet && pelaajanpisteet <= 21){
        System.out.println("Voitit!");
    }else if(pelaajanpisteet >= 21 && emännänpisteet >= 21){
        System.out.println("Molemmat hävisivät");
    }else if(pelaajanpisteet <=21 && emännänpisteet >21){
        System.out.println("Voitit!");
    
    }else if(pelaajanpisteet >21 && emännänpisteet <=21){
        System.out.println("Emäntä voitti!");
          
    }else if(pelaajanpisteet == emännänpisteet && emännänpisteet <=21){
        System.out.println("Emäntä voitti!");
    }else{
        System.out.println("error");
    }
    
}   
    }
            
            
            
        
    


