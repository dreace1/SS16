public class DoublyLinkedList
{
    private Element first, last;
    private int size;

    public DoublyLinkedList()
    {
        first = last = null;
        size = 0;
    }

    public int size()
    {
        return size;
    }

    public boolean isEmpty()
    {
        return size == 0;
    }

    public void add( Object content )
    {
        Element e = new Element( content );
        if ( isEmpty() )
        {
            first = last = e;
        }
        else
        {
            last.connectAsSucc( e );
            last = e;
        }
        size++;
    }

    public void addFirst( Object content )
    {
        Element e = new Element( content );
        if ( isEmpty() )
        {
            first = last = e;
        }
        else
        {
            first.connectAsPred( e );
            first = e;
        }
        size++;
    }

    public Object getFirst()
    {
        if ( !isEmpty() )
        {
            return first.getContent();
        }
        else
        {
            throw new RuntimeException();
        }
    }

    public Object get( int index )
    {
        if ( index >= 0 && index < size )
        {
            Element current = first;
            for ( int i = 0; i < index; i++ )
            {
                current = current.getSucc();
            }
            return current.getContent();
        }
        else
        {
            throw new RuntimeException();
        }
    }

    public Object removeFirst()
    {
        if ( !isEmpty() )
        {
            Object result = first.getContent();
            if ( first.hasSucc() )
            {
                first = first.getSucc();
                first.disconnectPred();
            }
            else
            {
                first = last = null;
            }
            size--;
            return result;
        }
        else
        {
            throw new RuntimeException();
        }
    }

    public void showAll()
    {
        Element current = first;
        while ( current != null )
        {
            System.out.print( current.getContent().toString() );
            if ( current != last )
            {
                System.out.print(", ");
            }
            current = current.getSucc();
        }
        System.out.println();
    }



    // zeigt alle Attribute einer Liste und ihrer Elemente an,
    // insbesondere auch die Werte von Referenzen, so dass die
    // Verkettung kontrolliert werden kann
    public void inspect()
    {
        System.out.println( "list\nsize = " + size() );
        if ( first != null ) {
            System.out.println( "first = " + first.toString().substring(first.toString().indexOf('@')) );
        } else {
            System.out.println( "first = null" );
        }
        if ( last != null ) {
            System.out.println( "last = " + last.toString().substring(last.toString().indexOf('@')) );
        } else {
            System.out.println( "last = null" );
        }
        System.out.println( "\nelements" );
        if (last != null) {
            Element current = first;
            int i = 0;
            while (current != null) {
                inspectElement( current, i );
                current = current.getSucc();
                i++;
            }
        } else {
            System.out.println("none");
        }
        System.out.println();
    }

    // zeigt alle Attribute eines Elements an
    private void inspectElement( Element e, int index )
    {
        String info = "Element " + index + ": "
                      + e.toString().substring(e.toString().indexOf('@'));
        info += " [ content = ";
        if ( e.getContent() != null ) {
            info += e.getContent().toString();
        } else {
            info += "null";
        }
        info += ", pred = ";
        if ( e.getPred() != null ) {
            info += e.getPred().toString().substring(e.getPred().toString().indexOf('@'));
        } else {
            info += "null";
        }
        info += ", succ = ";
        if ( e.getSucc() != null ) {
            info += e.getSucc().toString().substring(e.getSucc().toString().indexOf('@'));
        } else {
            info += "null";
        }

        info += " ]";
        System.out.println( info );
    }

    //Aufgaben
    public void clear()
    {
      first = last = null;
      size = 0;
    }

    public Object getLast()
    {
      if(isEmpty())
      {
        throw new IllegalStateException();
      }
      else
      {
        return last.getContent();
      }
    }

    public boolean contains(Object o)
    {
      Element c = first;
      while(c != null)
      {
        if(o != null && o.equals(c.getContent()))
        {
          return true;
        }
        c = c.getSucc();
      }
      return false;
    }

    public int count(Object o)
    {
      Element c = first;
      int count = 0;
      while(c != null)
      {
        if(o != null && o.equals(c.getContent()))
        {
          count++;
        }
        c = c.getSucc();
      }
      return count;
    }

    public boolean allEqual()
    {
      Element c = first;
      while(c != null)
      {
        if(!first.getContent().equals(c.getContent()))
        {
          return false;
        }
        c = c.getSucc();
      }
      return true;
    }

    public void testatInsert(Object o)
    {
      Element c = first;
      for(int i = 1; i < size/2; i++)
      {
        c = c.getSucc();
      }

      Element succ = c.getSucc();
      Element insert = new Element(o);
      c.connectAsSucc(insert);
      succ.connectAsPred(insert);
      size++;
    }

    public void testatRemove()
    {
      Element c = first;
      for(int i = 1; i <= size/2; i++)
      {
        c = c.getSucc();
      }

      Element pred = c.getPred();
      Element succ = c.getSucc();
      pred.connectAsSucc(succ);
      size--;
    }

    private Element elementAt(int n)
    {
      Element c = first;
      for(int i = 0; i < n; i++)
      {
        c = c.getSucc();
      }
      return c;
    }

    public void insert(int n, Object o)
    {
      if(n >= 0 && n < size)
      {
        Element c = elementAt(n);
        Element succ = c.getSucc();
        Element insert = new Element(o);
        c.connectAsSucc(insert);
        if(succ == null)
        {
          last = insert;
        }
        else
        {
          succ.connectAsPred(insert);
        }
        size++;
      }
      else
      {
        throw new IndexOutOfBoundsException();
      }
    }

    public void toArray(Object[] a)
    {
      Element c = first;
      for(int i = 0; i < a.length; i++)
      {
        a[i] = c.getContent();
        c = c.getSucc();
        if(i > size)
        {
          a[i] = null;
        }
      }
    }

    public void remove(int n)
    {
      if(n >= 0 && n < size)
      {
        Element c = elementAt(n);
        if(c == first && c == last)
        {
          last = first = null;
        }
        else if(c == first)
        {
          first = c.getSucc();
          first.disconnectPred();
        }
        else if(c == last)
        {
          last = c.getPred();
          last.disconnectSucc();
        }
        else
        {
          c.getPred().connectAsSucc(c.getSucc());
        }
        size--;
      }

    }


}
