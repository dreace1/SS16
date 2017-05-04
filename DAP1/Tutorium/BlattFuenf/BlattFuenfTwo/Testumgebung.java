public class Testumgebung
{
    public static void main( String[] args )
    {
        testMethods();
    }

    private static void testMethods()
    {
        char[] chars = {'n','d','a','f','b','e','k','i','x','o','s','z','r'};
        CharacterSearchTree cst = new CharacterSearchTree( chars );
        System.out.println("cst.show() - SOLL-Ergebnis: a b d e f i k n o r s x z");
        cst.show();

        // weitere Tests ergaenzen

        System.out.println();
        cst.add('y', 1, "" );
        System.out.println("cst.show() - SOLL-Ergebnis: a b d e f i k n o r s x y z");
        cst.show();

        System.out.println();
        System.out.println("cst PreOrder");
        cst.showPreorder();

        System.out.println();
        System.out.println("Höhe von cst: " + cst.height());

        System.out.println();
        System.out.println("Summe der Quantity Werte: " + cst.countCharacters());

        System.out.println();
        System.out.println("Minimum von cst: " + cst.minimum());

        System.out.println();
        System.out.println("Maximum von cst: " + cst.maximum());

        System.out.println();
        System.out.println("hasOnlyCompleteNodes: " + cst.hasOnlyCompleteNodes());

        System.out.println();
        System.out.println("Kommt g in cst vor? " + cst.containsCharacter('g'));

        cst.add('a', 1, "");
        cst.add('b', 1, "");
        System.out.println();
        System.out.println("Mögliche Testat Aufgabe Zaelen ob es ein Blatt ist und die Anzahl Größer als 1 ist: " + cst.countIt());

    }

}
