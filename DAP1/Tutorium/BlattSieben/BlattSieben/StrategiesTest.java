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
        CountInIntervalStrategy count09 = new CountInIntervalStrategy(0, 9);
        ints.inspectAll(count09);
        System.out.println(count09.getCount());
        System.out.println();

        System.out.println("AverageOfPositivesStrategy");
        ints.showAll();
        AverageOfPositivesStrategy average = new AverageOfPositivesStrategy();
        ints.inspectAll(average);
        System.out.println("Mittelwert: " + average.getAverage());
        System.out.println();

        System.out.println("AllToAbsStrategy");
        ints.showAll();
        AllToAbsStrategy absolute = new AllToAbsStrategy();
        ints.substituteAll(absolute);
        System.out.println("Absolut Betrag:");
        ints.showAll();
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
        System.out.println("AddNToPositivesStrategy");
        ints2.showAll();
        AddNToPositivesStrategy add1 = new AddNToPositivesStrategy(1);
        ints2.substituteAll(add1);
        System.out.println("ints2 + 1");
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
        DoubleAllInIntervalStrategy double05 = new DoubleAllInIntervalStrategy(0, 5);
        ints3.substituteAll(double05);
        System.out.println("double 0 to 5");
        ints3.showAll();
        System.out.println();

        System.out.println("RemoveAllNegativesStrategy");
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
        RemoveAllNegativesStrategy neg = new RemoveAllNegativesStrategy();
        ints4.deleteSelected(neg);
        System.out.println("Alle negativen gelöscht:");
        ints4.showAll();
        System.out.println();

        System.out.println("RemoveAllInIntervalStrategy");
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
        RemoveAllInIntervalStrategy interval03 = new RemoveAllInIntervalStrategy(0, 3);
        ints5.deleteSelected(interval03);
        System.out.println("Alle im Interval 0 - 3 gelöscht:");
        ints5.showAll();
        System.out.println();

        System.out.println("RemoveAndCountAllInIntervalStrategy");
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
        RemoveAndCountAllInIntervalStrategy interval04 = new RemoveAndCountAllInIntervalStrategy(0, 4);
        ints6.deleteSelected(interval04);
        System.out.println("Alle im Interval 0 - 4 gelöscht:");
        ints6.showAll();
        System.out.println("Anzahl der gelöschten Elemente: " + interval04.getCount());




    }
}
