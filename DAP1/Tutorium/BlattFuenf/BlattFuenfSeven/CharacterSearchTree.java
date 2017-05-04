public class CharacterSearchTree
{

    // Vorgaben

    private HuffmanTriple content;
    private CharacterSearchTree leftChild, rightChild;

    public CharacterSearchTree()
    {
        content = null;
        leftChild = null;
        rightChild = null;
    }

    public HuffmanTriple getContent()
    {
        if ( !isEmpty() )
        {
            return content;
        } else {
            throw new RuntimeException();
        }
    }

    public boolean isEmpty()
    {
        return content == null;
    }

    public boolean isLeaf()
    {
        return !isEmpty() && leftChild.isEmpty() && rightChild.isEmpty();
    }

    public void iterativeAdd( char t )
    {
        CharacterSearchTree current = this;
        while ( !current.isEmpty() && current.content.getToken() != t )
        {
            if ( current.content.getToken() > t )
            {
                current = current.leftChild;
            }
            else
            {
                current = current.rightChild;
            }
        }
        if ( current.isEmpty() )
        {
            current.content = new HuffmanTriple( t );
            current.leftChild = new CharacterSearchTree();
            current.rightChild = new CharacterSearchTree();
        }
        else
        {
            current.content.incrementQuantity();
        }
    }

    public void show()
    {
        if ( !isEmpty() )
        {
            leftChild.show();
            System.out.println( content.toString() );
            rightChild.show();
        }
    }

    //Aufgaben

    public CharacterSearchTree(char[] c)
    {
      for(int i = 0; i < c.length; i++)
      {
        iterativeAdd(c[i]); //das Array wird zu einer Baumstruktur
      }
    }

    public void add(char t, int q, String c)
    {
      if(isEmpty()) //Wenn leer neuen Baum erstellen
      {
        content = new HuffmanTriple(t, q);
        content.setCode(c);
        leftChild = new CharacterSearchTree();
        rightChild = new CharacterSearchTree();
      }
      else
      {
        if(content.getToken() > t) //Überprüfen ob es nach rechts oder links muss
        {
          leftChild.add(t, q, c); //Rekursives Einfügen
        }
        else if(content.getToken() < t)
        {
          rightChild.add(t, q, c);
        }
        else
        {
          for(int i = 1; i <= q; i++) //Wenn schon vorhanden dann Anzahl erhöhen
          {
            content.incrementQuantity();
          }
        }
      }
    }

    public void showPreOrder()
    {
      if(!isEmpty()) //Solange nicht leer
      {
        if(isLeaf())
        {
          System.out.print("*"); // "*" an der Stelle wo ein Blatt vorkommt
        }
        System.out.println(content.toString()); //Ausgabe des HuffmanTriple Objektes
        leftChild.showPreOrder(); //Rekursiv auf rechts und links angewandt
        rightChild.showPreOrder();
      }
    }

    public int height()
    {
      if(isEmpty())
      {
        return 0;
      }
      else
      {
        int l = leftChild.height(); //Rekursive Bestimmung der Höhe
        int r = rightChild.height();
        if(l > r) //Überprüfen ob rechts oder links größer sind
        {
          return 1 + l; // 1 + für die Wurzel
        }
        else
        {
          return 1 + r;
        }
      }
    }

    public int countCharacters()
    {
      if(isEmpty())
      {
        return 0;
      }
      else
      {
        return content.getQuantity() + leftChild.countCharacters() + rightChild.countCharacters(); //Zusammenrechenn
      } // der Quantity Werte erst für die Wurzel und dann für den Rest Rekursiv
    }

    public HuffmanTriple minimum() //nicht Rekursiv
    {
      if(isEmpty())
      {
        return null;
      }
      else
      {
        CharacterSearchTree m = this; //Referenz auf den aktuellen Baum
        while(!m.leftChild.isEmpty()) //Solange dieser nicht leer ist
        {
          m = m.leftChild; //Unterer Wert auf m setzten
        }
        return m.getContent(); // und Ausgeben
      }
    }

    public HuffmanTriple maximum()
    {
      if(isEmpty())
      {
        return null;
      }
      else
      {
        CharacterSearchTree m = this;
        while(!m.rightChild.isEmpty())
        {
          m = m.rightChild;
        }
        return m.getContent();
      }
    }

    public boolean hasOnlyCompleteNodes()
    {
      if(isEmpty() || isLeaf())
      {
        return true;
      }
      else
      {
        if(!(leftChild.isEmpty() || rightChild.isEmpty()))
        {
          return leftChild.hasOnlyCompleteNodes() && rightChild.hasOnlyCompleteNodes();
        }
        else
        {
          return false;
        }
      }
    }

    public boolean containsCharacter(char t)
    {
      if(isEmpty())
      {
        return false;
      }
      else
      {
        if(content.getToken() > t)
        {
          return leftChild.containsCharacter(t);
        }
        else if(content.getToken() < t)
        {
          return rightChild.containsCharacter(t);
        }
        else
        {
          return true;
        }
      }
    }

    public int countTestat()
    {
      if(isEmpty())
      {
        return 0;
      }
      else
      {
        if(isLeaf() && content.getQuantity() == 1)
        {
          return 1 + leftChild.countTestat() + rightChild.countTestat();
        }
        else
        {
          return leftChild.countTestat() + rightChild.countTestat();
        }
      }
    }

}
