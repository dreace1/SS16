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
        System.out.println("Letztes Element von integers: " + integers.getLast());

        System.out.println();
        System.out.println("Kommt 6 in integers vor?: " + integers.contains(6));

        System.out.println();
        System.out.println("Wie oft kommt 4 in integers vor?: " + integers.count(4));

        System.out.println();
        System.out.println("Sind alle Werte in integers gleich?: " + integers.allEqual());
        DoublyLinkedList integersx = new DoublyLinkedList();
        integersx.add( 2 );
        integersx.add( 2 );
        integersx.add( 2 );
        integersx.add( 2 );
        integersx.add( 2 );
        integersx.add( 2 );
        integersx.add( 2 );
        integersx.add( 2 );
        System.out.println("Sind alle Werte in integersx gleich?: " + integersx.allEqual());

        System.out.println();
        System.out.println("Füge die 1 in die Mitte von integersx: ");
        integersx.testatInsert(1);
        integersx.showAll();

        System.out.println();
        System.out.println("Füge die 1 nach dem 3. Element von integers ein: ");
        integers.insert(3, 1);
        integers.showAll();

        System.out.println();
        integersx.testatRemove();
        integersx.showAll();

    }
}
