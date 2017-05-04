public class Testumgebung
{
    public static void main( String[] args )
    {
        IntIntPairs testPairs = new IntIntPairs( 20 );
        testPairs.put(7,3); testPairs.put(4,3); testPairs.put(1,-9); testPairs.put(6,6); testPairs.put(2,8);
        testPairs.put(41,12); testPairs.put(9,-11); testPairs.put(8,12); testPairs.put(5,-60); testPairs.put(14,18);
        testPairs.put(0,12); testPairs.put(-9,-16); testPairs.put(0,0); testPairs.put(17,32); testPairs.put(1,1);

        System.out.println("Beispiel: " + testPairs.accumulate( (k,v) -> { if (k==0) { return v; } else { return 0; } } ) );

        //Aufgabe 1c
        testPairs.show();
        System.out.println("Anzahl von geraden keys: " + testPairs.accumulate((k, v) -> {if (k%2 == 0) {return 1;} else {return 0;}}));
        System.out.println();
        //Aufgabe 1f
        testPairs.show();
        System.out.println("Anzahl von values > 10: " + testPairs.accumulate((k, v) -> {if (v > 10) {return 1;} else {return 0;}}));
        System.out.println();
        //Aufgabe 1l
        testPairs.show();
        System.out.println("Summe der Werte von values: " + testPairs.accumulate((k, v) -> v));
        System.out.println();
        //Aufgabe 1c
        testPairs.show();
        System.out.println("löschen von Paaren mit k = 6: ");
        testPairs.remove((k,v) -> k == 6);
        testPairs.show();
        System.out.println();
        //Aufgabe 1h
        testPairs.show();
        System.out.println("Löschen von Paaren mit einem negativen Wert in values: ");
        testPairs.remove((k,v) -> v < 0);
        testPairs.show();
        System.out.println();
        //Aufgabe 1k
        testPairs.show();
        System.out.println("Löschen von Paaren deren Werte identisch sind: ");
        testPairs.remove((k,v) -> k == v);
        testPairs.show();
        System.out.println();
        //Aufgabe 1d
        testPairs.show();
        System.out.println("Jeden Wert von keys + 10: ");
        testPairs.manipulate((k,v) -> k+10, (k,v) -> v);
        testPairs.show();
        System.out.println();
        //Aufgabe 1g
        testPairs.show();
        System.out.println("keys + 5 wenn values größer als 3: ");
        testPairs.manipulate((k,v) -> {if (v > 3) {return k+5;} else {return k;}}, (k,v) -> v);
        testPairs.show();
        System.out.println();
        //Aufgabe 1i
        testPairs.show();
        System.out.println("gültige Werte in values verdoppelt: ");
        testPairs.manipulate((k,v) -> k, (k,v) -> v*2);
        testPairs.show();
        System.out.println();
        //Aufgabe 1j
        testPairs.show();
        System.out.println("Kopie von allen Paaren: ");
        IntIntPairs otherPairs = testPairs.extract((k,v) -> true );
        otherPairs.show();
        System.out.println();
        //Aufgabe 1e
        testPairs.show();
        System.out.println("Kopie aller Paare deren values ganzzahlig durch 3 teilbar ist: ");
        IntIntPairs otherPairs2 = testPairs.extract((k,v) -> v%3 == 0);
        otherPairs2.show();
        System.out.println();
        //Aufgabe 1m
        testPairs.show();
        System.out.println("Kopie aller Paare deren values Wert größer als 5 ist: ");
        IntIntPairs otherPairs3 = testPairs.extract((k,v) -> v > 5);
        otherPairs3.show();
        System.out.println();



    }

    public static int sumUp(IntIntPairs pairs)
    {
        return pairs.accumulate( (k,v) -> { if (k==0) { return v; } else { return 0; } } );
    }

//     public static void addNToValue( IntIntPairs pairs, int n )
//     {
//         // hier ergaenzen
//     }
//
//     public static boolean uniqueKey( IntIntPairs pairs, int n )
//     {
//         // hier ergaenzen
//     }
//
//     public static void doubleGreaterN( IntIntPairs pairs, int n )
//     {
//         // hier ergaenzen
//     }
//
//     public static IntIntPairs concat(IntIntPairs first, IntIntPairs second)
//     {
//         // hier ergaenzen
//     }
}
