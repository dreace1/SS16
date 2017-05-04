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
        CountInIntervalStrategy int05 = new CountInIntervalStrategy(0,5);
        ints.inspectAll(int05);
        System.out.println("Anzahl der Elemente aus dem Interval 0-5: " + int05.getCount());
        System.out.println();

        System.out.println("AverageOfPositivesStrategy");
        AverageOfPositivesStrategy avrg = new AverageOfPositivesStrategy();
        ints.inspectAll(avrg);
        System.out.println("Der Durschnitt der Positiven Elemente: " + avrg.getSum());
        System.out.println();

        System.out.println("AllToAbsStrategy");
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
        System.out.println("Absolutwerte der Elemente: ");
        ints2.showAll();
        System.out.println();

        System.out.println("AddNToPositivesStrategy");
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
        System.out.println("1 auf alle Positiven werte addiert: ");
        ints3.showAll();
        System.out.println();

        System.out.println("DoubleAllInIntervalStrategy");
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
        DoubleAllInIntervalStrategy double05 = new DoubleAllInIntervalStrategy(0,5);
        ints4.substituteAll(double05);
        System.out.println("Elemente im Bereich 0-5 verdoppelt: ");
        ints4.showAll();
        System.out.println();

        System.out.println("RemoveAllNegativesStrategy");
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
        System.out.println("Alle negativen Elemente gelöscht");
        ints5.showAll();
        System.out.println();

        System.out.println("RemoveAllInIntervalStrategy");
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
        RemoveAllInIntervalStrategy rem05 = new RemoveAllInIntervalStrategy(0, 5);
        ints6.deleteSelected(rem05);
        System.out.println("Alle Elemente zwischen 0-5 gelöscht");
        ints6.showAll();
        System.out.println();

        System.out.println("RemoveAndCountAllInIntervalStrategy");
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
        RemoveAndCountAllInIntervalStrategy remAc05 = new RemoveAndCountAllInIntervalStrategy(0,5);
        ints7.deleteSelected(remAc05);
        System.out.println("Alle Elemente zwischen 0-5 gelöscht");
        ints7.showAll();
        System.out.println("Anzahl der gelöschten Elemente: " + remAc05.getCount());
        System.out.println();

        System.out.println("RemoveTestatStrategy");
        DoublyLinkedList<Integer> ints8 = new DoublyLinkedList<>();
        ints8.add( 5 );
        ints8.add( 6 );
        ints8.add( -9 );
        ints8.add( 11 );
        ints8.add( 2 );
        ints8.add( 5 );
        ints8.add( 9 );
        ints8.add( 7 );
        ints8.add( -12 );
        ints8.add( 5 );
        ints8.showAll();
        RemoveTestatStrategy testat = new RemoveTestatStrategy();
        ints8.deleteSelected(testat);
        System.out.println("Das erste und jedes 3. Element aus der Liste löschen:");
        ints8.showAll();








    }
}
