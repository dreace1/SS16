public class Testumgebung
{
    public static void main( String[] args )
    {
        testMethods();
    }

    public static void testMethods()
    {
        DoublyLinkedList integers = new DoublyLinkedList();
        integers.add( 4 );
        integers.add( 5 );
        integers.add( 6 );
        integers.add( 9 );
        integers.add( 7 );
        integers.add( 17 );
        integers.add( 11 );
        integers.add( 4 );
        integers.showAll();
        System.out.println();
        integers.inspect();

        DoublyLinkedList emptyList = new DoublyLinkedList();
        emptyList.showAll();
        System.out.println();
        emptyList.inspect();

        System.out.println();
        System.out.println("Das Letze Element von integers: " + integers.getLast());

        System.out.println();
        System.out.println("Kommt die 9 in integers vor?: " + integers.contains(9));

        System.out.println();
        System.out.println("Wie oft kommt die 4 in integers vor? " + integers.count(4));

        System.out.println();
        DoublyLinkedList integersx = new DoublyLinkedList();
        integersx.add( 2 );
        integersx.add( 2 );
        integersx.add( 2 );
        integersx.add( 2 );
        integersx.add( 2 );
        integersx.add( 2 );
        integersx.add( 2 );
        integersx.add( 2 );
        integersx.showAll();
        System.out.println();

        System.out.println("Sind alle Werte in integers gleich? " + integers.allEqual() + " Sind alle Werte in integersx gleich? " + integersx.allEqual());

        System.out.println();
        System.out.println("Füge die 1 in die Mitte von integersx ein: ");
        integersx.testatInsert(1);
        integersx.showAll();
        System.out.println();
        System.out.println("Lösche die Eingefügte 1 wieder aus integersx: ");
        integersx.testatRemove();
        integersx.showAll();
        System.out.println();

        System.out.println("Füge die 1 hinter die 3. Stelle ein: ");
        integersx.insert(2, 1);
        integersx.showAll();
        integersx.remove(3);
        System.out.println("Lösche das Element nach der 3. Stelle: ");
        integersx.showAll();

    }
}
