Main.java

пакет  ru.mirea.gibo0119.pr5 ;

import  java.text.DecimalFormat ;
import  java.text.NumberFormat ;
import  java.util.Scanner ;

  public  class  Main {
public  static  void  main ( String [] args ) {
        / * День недели = Неделя.СУББОТА;
 Номер недели = день;
 System.out.println (день.ординал () + 1);
 System.out.println (число.имя ());
 for (Неделя i: день) {
 System.out.println (Week.values ());
        } * /
        Планета планета =  Планета . ЗЕМЛЯ ;
        Система . из . println ( " Каков ваш вес " );
        Scanner sc =  новый  сканер ( System . In);
        int ves = sc . nextInt ();
        двойной мас = вес / планета . surfaceGravity ();
        Система . из . printf ( " Ваш вес на% s% f% n " ,
        п, п . SurfaceWeight (мас.));
        DecimalFormat fmt = новый  DecimalFormat ( " #. ## " );
        для ( Planet р :  Planet . значения ()) системы . из . println ( " Ваш вес на планете: " + p + "  " + fmt . format (p . surfaceWeight (mas)));

        }
        }
