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
        System.out.println("Das Letzte Element von integers: " + integers.getLast());

        System.out.println();
        System.out.println("Kommt die 9 in integers vor? " + integers.contains(9));

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
        System.out.println("Sind alle Werte in integersx gleich? " + integersx.allEqual());

        System.out.println();
        System.out.println("Wie oft kommt die 2 in integersx vor? " + integersx.count(2));

        System.out.println();
        System.out.println("Füge die 1 nach dem 3. Element ein: ");
        integersx.insert(2, 1);
        integersx.showAll();
        System.out.println("Lösche das eingefügte Element wieder: ");
        integersx.remove(3);
        integersx.showAll();
        System.out.println();

        System.out.println();
        DoublyLinkedList integersy = new DoublyLinkedList();
        integersy.add( 1 );
        integersy.add( 2 );
        integersy.add( 3 );
        integersy.add( 4 );
        integersy.add( 5 );
        integersy.add( 6 );
        integersy.add( 7 );
        integersy.add( 8 );
        integersy.showAll();
        System.out.println();

        System.out.println("Füge die 10 in die Mitte von integersy ein:");
        integersy.testatInsert(10);
        integersy.showAll();
        System.out.println("Lösche das eingefügte Element wieder aus der Mitte:");
        integersy.testatRemove();
        integersy.showAll();

        System.out.println();
        integersy.testat(4);
        integersy.showAll();

        DoublyLinkedList integersn = new DoublyLinkedList();
        integersn.add( 1 );
        integersn.testat(4);
        integersn.showAll();








    }
}
