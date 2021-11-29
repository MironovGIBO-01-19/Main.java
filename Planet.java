пакет  ru.mirea.gibo0119.pr5 ;

public  enum  Planet {
    МЕРКУРИЙ ( 3.303e + 23 , 2.4397e6 ),
    ВЕНЕРА ( 4.869e + 24 , 6.0518e6 ),
    ЗЕМЛЯ ( 5.976e + 24 , 6.37814e6 ),
    МАРС ( 6.421e + 23 , 3.3972e6 ),
    ЮПИТЕР ( 1.9e + 27 , 7.1492e7 ),
    САТУРН ( 5.688e + 26 , 6.0268e7 ),
    УРАН ( 8.686e + 25 , 2.5559e7 ),
    НЕПТУН ( 1.024e + 26 , 2.4746e7 );
    частная  финальная  двойная масса; // в килограммах
    частный  финальный  двойной радиус; // в метрах
    Планета ( двойная  масса , двойной  радиус ) {
        это . масса = масса;
        это . радиус = радиус;
    }
    частная  двойная  масса () { возвратная масса; }
    частный  двойной  радиус () { радиус возврата ; }
    // гравитационная постоянная
    публичный  статический  финал  double  G  =  6.67300E-11 ;
    double  surfaceGravity () {
        вернуть  G  * массу / (радиус * радиус);
    }
    double  surfaceWeight ( double  otherMass ) {
        return otherMass * surfaceGravity ();
    }
    public  static  void  main ( String [] args ) {
        if (args . length ! =  1 ) {
            Система . эээ . println ( " Использование: java ru.mirea.gibo01.pr5.Planet & lt; earth_weight & gt; " );
            Система . выход ( - 1 );
        }
        двойной earthWeight =  двойной . parseDouble (args [ 0 ]);
        двойная масса = масса земли / ЗЕМЛЯ . surfaceGravity ();
        для ( Planet p :  Planet . values ​​())
            Система . из . printf ( " Ваш вес на% s% f% n " ,
                    п, п . SurfaceWeight (масса));
    }
}
