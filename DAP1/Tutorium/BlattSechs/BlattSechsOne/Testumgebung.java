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

        System.out.println("Letzter Wert der Integers: " + integers.getLast());

        System.out.println();
        System.out.println("Kommt 6 in Integers vor?: " + integers.contains(6));

        System.out.println();
        System.out.println("Wie oft kommt 4 in Integers vor?: " + integers.count(4));

        //All equals
        DoublyLinkedList equals = new DoublyLinkedList();
        equals.add( 2 );
        equals.add( 2 );
        equals.add( 2 );
        equals.add( 2 );
        equals.add( 2 );
        equals.add( 2 );
        equals.add( 2 );
        equals.add( 2 );
        System.out.println();
        equals.showAll();

        System.out.println("Sind alle Elemente gleich? " + equals.allEqual());
        System.out.println();

        System.out.println("Füge die 3 in die Mitte von equals ein: ");
        equals.testatInsert(3);
        equals.showAll();

        System.out.println();
        System.out.println("Enthalten 2 Elemente von Integers den gleichen Inhalt? " + integers.containsDouble());

        System.out.println();
        integers.insert(3, 1);
        System.out.println("Einfügen von 1 an der 3. Stelle von Integers: " );
        integers.showAll();

        System.out.println();
        integers.remove(3);
        System.out.println("Löschen des 3. Elementes" );
        integers.showAll();


    }
}
