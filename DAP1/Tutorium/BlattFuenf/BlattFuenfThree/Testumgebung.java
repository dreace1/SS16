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
        cst.add('y', 1, "");
        cst.add('a', 1, "");
        System.out.println("cst.show() - SOLL-Ergebnis: a b d e f i k n o r s x y z");
        cst.show();

        System.out.println();
        System.out.println("Mögliches Testat: " + cst.learnCount());

        System.out.println();
        System.out.println("Preorder Durchlauf mit * Bei Blättern: ");
        cst.showPreorder();

        System.out.println();
        System.out.println("Höhe von cst: " + cst.height());

        System.out.println();
        System.out.println("Minimum von cst: " + cst.minimum());

        System.out.println();
        System.out.println("Has only Complete Nodes: " + cst.hasOnlyCompleteNodes());

        System.out.println();
        System.out.println("Kommt p in cst vor? " + cst.containsCharacter('p'));
    }

}
