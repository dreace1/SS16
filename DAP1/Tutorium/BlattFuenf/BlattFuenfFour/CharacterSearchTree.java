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
        iterativeAdd(c[i]);
      }
    }

    public void add(char t, int q, String c)
    {
      if(isEmpty())
      {
        content = new HuffmanTriple(t, q);
        content.setCode(c); //nicht in einem Konstruktor
        leftChild = new CharacterSearchTree();
        rightChild = new CharacterSearchTree();
      }
      else
      {
        if(content.getToken() > t) //Ermitteln ob der char Wert linkes oder rechtes Kind ist
        {
          leftChild.add(t, q, c); //Rekursives durchlaufen
        }
        else if(content.getToken() < t)
        {
          rightChild.add(t, q, c);
        }
        else
        {
          for(int i = 1; i <= q; i++)
          {
            content.incrementQuantity(); //Anzahl erhöhen
          }
        }
      }
    }

    public void showPreOrder()
    {
      if(!isEmpty())
      {
        if(isLeaf())
        {
          System.out.print("*"); //an der Stelle an der ein Blatt vorkommt
        }
        System.out.println(content.toString()); //Ausgabe des HuffmanTriple
        leftChild.showPreOrder(); //Rekursive Aufrufe links und rechts
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
        int left = leftChild.height(); //Bestimmung der Höhe des linken bzw rechten Kindes
        int right = rightChild.height();
        if(left > right) //Vergleich und Rückgabe welches am Höhesten ist
        {
          return 1 + left; //+1 für die Wurzel
        }
        else
        {
          return 1 + right;
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
        return content.getQuantity() + leftChild.countCharacters() + rightChild.countCharacters(); //Zusammenrechenn der Quantity Werte
      }
    }

    public HuffmanTriple minimum() //nicht Rekursiv
    {
      if(isEmpty())
      {
        return null;
      }
      else
      {
        CharacterSearchTree m = this; //Referenz auf den aktuellen Baum(keine Rekusion)
        while(!m.leftChild.isEmpty())//Laufe solange bis du am Ende angekommen bist
        {
          m = m.leftChild; //lege den Inhalt auf m
        }
        return m.getContent();
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
        else if (content.getToken() < t)
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
        if(isLeaf() && content.getQuantity() >= 1)
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
