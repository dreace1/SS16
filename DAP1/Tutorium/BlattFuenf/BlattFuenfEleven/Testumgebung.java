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
        cst.add('a', 1, "");
        cst.add('y', 2, "");
        System.out.println();
        System.out.println("cst.show() - SOLL-Ergebnis: a b d e f i k n o r s x y z");
        cst.show();

        System.out.println();
        System.out.println("PreOrder Durchlauf von cst:");
        cst.showPreOrder();

        System.out.println();
        System.out.println("Höhe von cst: " + cst.height());

        System.out.println();
        System.out.println("Summe der Quantity Werte: " + cst.countCharacters());

        System.out.println();
        System.out.println("minimum von cst: " + cst.minimum() + "maximum von cst: " + cst.maximum());

        System.out.println();
        System.out.println("hasOnlyCompleteNodes: " + cst.hasOnlyCompleteNodes());

        System.out.println();
        System.out.println("Kommt p in cst vor? " + cst.containsCharacter('p'));

        System.out.println();
        System.out.println("Mögliches Testat: " + cst.countTestat());

        System.out.println();
        System.out.println("Weiteres Mögliches Testat: " + cst.countIt());

    }

}
