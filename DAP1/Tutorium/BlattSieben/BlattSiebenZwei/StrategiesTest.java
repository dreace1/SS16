public class StrategiesTest
{

    public static void main( String[] args )
    {
        testStrategy();
    }

    public static void testStrategy()
    {
        DoublyLinkedList<Integer> ints = new DoublyLinkedList<>();
        ints.add( 5 );
        ints.add( 6 );
        ints.add( -9 );
        ints.add( 11 );
        ints.add( 2 );
        ints.add( 5 );
        ints.add( 9 );
        ints.add( 7 );
        ints.add( -12 );
        ints.add( 5 );

        System.out.println("CountXStrategy");
        System.out.print("input list: ");
        ints.showAll();
        System.out.print("result of CountXStrategy( 5 ): ");
        CountXStrategy count5 = new CountXStrategy( 5 );
        ints.inspectAll( count5 );
        System.out.println( count5.getQuantity() );
        System.out.println();

        System.out.println("CountInIntervalStrategy");
        ints.showAll();
        CountInIntervalStrategy int06 = new CountInIntervalStrategy(0, 6);
        ints.inspectAll(int06);
        System.out.println("Es kommen " + int06.getCount() + " Elemente im Interval 0-6 in ints vor.");
        System.out.println();

        System.out.println("AverageOfPositivesStrategy");
        ints.showAll();
        AverageOfPositivesStrategy average = new AverageOfPositivesStrategy();
        ints.inspectAll(average);
        System.out.println("Der Durchschnitt von ints lautet: " + average.getAverage());
        System.out.println();

        DoublyLinkedList<Integer> ints2 = new DoublyLinkedList<>();
        ints2.add( 5 );
        ints2.add( 6 );
        ints2.add( -9 );
        ints2.add( 11 );
        ints2.add( 2 );
        ints2.add( 5 );
        ints2.add( 9 );
        ints2.add( 7 );
        ints2.add( -12 );
        ints2.add( 5 );
        ints2.showAll();
        AllToAbsStrategy abs = new AllToAbsStrategy();
        ints2.substituteAll(abs);
        System.out.println("Absolut werte von ints2: ");
        ints2.showAll();
        System.out.println();

        DoublyLinkedList<Integer> ints3 = new DoublyLinkedList<>();
        ints3.add( 5 );
        ints3.add( 6 );
        ints3.add( -9 );
        ints3.add( 11 );
        ints3.add( 2 );
        ints3.add( 5 );
        ints3.add( 9 );
        ints3.add( 7 );
        ints3.add( -12 );
        ints3.add( 5 );
        ints3.showAll();
        AddNToPositivesStrategy add1 = new AddNToPositivesStrategy(1);
        ints3.substituteAll(add1);
        System.out.println("1 auf alle positiven Elemente addiert");
        ints3.showAll();
        System.out.println();

        DoublyLinkedList<Integer> ints4 = new DoublyLinkedList<>();
        ints4.add( 5 );
        ints4.add( 6 );
        ints4.add( -9 );
        ints4.add( 11 );
        ints4.add( 2 );
        ints4.add( 5 );
        ints4.add( 9 );
        ints4.add( 7 );
        ints4.add( -12 );
        ints4.add( 5 );
        ints4.showAll();
        DoubleAllInIntervalStrategy double06 = new DoubleAllInIntervalStrategy(0, 6);
        ints4.substituteAll(double06);
        System.out.println("Alle im Interval 0-6 verdoppelt: ");
        ints4.showAll();
        System.out.println();

        DoublyLinkedList<Integer> ints5 = new DoublyLinkedList<>();
        ints5.add( 5 );
        ints5.add( 6 );
        ints5.add( -9 );
        ints5.add( 11 );
        ints5.add( 2 );
        ints5.add( 5 );
        ints5.add( 9 );
        ints5.add( 7 );
        ints5.add( -12 );
        ints5.add( 5 );
        ints5.showAll();
        RemoveAllNegativesStrategy neg = new RemoveAllNegativesStrategy();
        ints5.deleteSelected(neg);
        System.out.println("Alle negativen gelöscht: ");
        ints5.showAll();
        System.out.println();

        DoublyLinkedList<Integer> ints6 = new DoublyLinkedList<>();
        ints6.add( 5 );
        ints6.add( 6 );
        ints6.add( -9 );
        ints6.add( 11 );
        ints6.add( 2 );
        ints6.add( 5 );
        ints6.add( 9 );
        ints6.add( 7 );
        ints6.add( -12 );
        ints6.add( 5 );
        ints6.showAll();
        RemoveAllInIntervalStrategy rem06 = new RemoveAllInIntervalStrategy(0,6);
        ints6.deleteSelected(rem06);
        System.out.println("Alle im Bereich 0-6 gelöscht");
        ints6.showAll();
        System.out.println();

        DoublyLinkedList<Integer> ints7 = new DoublyLinkedList<>();
        ints7.add( 5 );
        ints7.add( 6 );
        ints7.add( -9 );
        ints7.add( 11 );
        ints7.add( 2 );
        ints7.add( 5 );
        ints7.add( 9 );
        ints7.add( 7 );
        ints7.add( -12 );
        ints7.add( 5 );
        ints7.showAll();
        RemoveAndCountAllInIntervalStrategy remAndC06 = new RemoveAndCountAllInIntervalStrategy(0,6);
        ints7.deleteSelected(remAndC06);
        System.out.println("Alle im Bereich 0-6 gelöscht");
        ints7.showAll();
        System.out.println("Anzahl der gelöschten Elemente: " + remAndC06.getCount());
        System.out.println();






    }
}
