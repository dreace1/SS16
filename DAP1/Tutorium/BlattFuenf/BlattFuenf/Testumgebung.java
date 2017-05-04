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

        cst.add('x', 1, "");
        System.out.println();
        System.out.println("mit add x");
        System.out.println("cst.show() - SOLL-Ergebnis: a b d e f i k n o r s x z");
        cst.show();

        System.out.println();
        System.out.println("PreOrder durchlauf");
        cst.showPreorder();

        System.out.println();
        System.out.println("Höhe von cst: " + cst.height());

        System.out.println();
        System.out.println("Summe der quantity Werte: " + cst.countCharacters());

        System.out.println();
        System.out.println("Der längste Code: " + cst.longestCode());

        System.out.println();
        System.out.println("Das minimum: " + cst.minimum());

        System.out.println();
        System.out.println("Das maximum: " + cst.maximum());

        System.out.println();
        System.out.println("Kommt a int cst vor? " + cst.containsCharacter('z'));



    }

}
