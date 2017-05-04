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
      if(isEmpty()) //Wenn der Baum leer ist
      {
        content = new HuffmanTriple(t, q); //content Aufzurufende HuffmanTriple Objekt
        content.setCode(c); //code muss aber noch gesetzt werden da dies nicht in einem Konstruktor ist
        leftChild = new CharacterSearchTree(); //neuer Baum
        rightChild = new CharacterSearchTree();
      }
      else
      {
        if(content.getToken() > t) //content.getToken() aktuelles Token wenn > dann t nach links
        {
          leftChild.add(t, q, c);
        }
        else if(content.getToken() < t) //content.getToken() wenn < dann nach rechts
        {
          rightChild.add(t, q, c);
        }
        else
        {
          for(int i = 1; i <= q; i++) //wenn es vorhanden ist dann muss die Anzahl erhöht werden
          {
            content.incrementQuantity();
          }
          content.setCode(c); // aber der Code muss noch gesetzt werden
        }
      }
    }

    public void showPreorder()
    {
      if(!isEmpty())
      {
        if(isLeaf())
        {
          System.out.print('*');
        }
        System.out.println(content.toString()); //!!!! Wichtig ausgabe des HuffmanTriple Objektes
        leftChild.showPreorder();
        rightChild.showPreorder();
      }
    }

    public int height()
    {
      if(!isEmpty()) //Solange es nicht leer ist
      {
        int left = leftChild.height(); //Rekursive bestimmung der Höhe
        int right = rightChild.height();
        if(left < right)
        {
          return right + 1; //+ Wurzel
        }
        else
        {
          return left + 1;
        }
      }
      else
      {
        return 0; //leerer Baum hat eine Höhe von 0
      }
    }

    public int countCharacters()
    {
      if(isEmpty()) //Wenn es der Baum leer ist
      {
        return 0;
      }
      else
      {
        return content.getQuantity() + rightChild.countCharacters() + leftChild.countCharacters();
      } //Zaele die Quantity der HuffmanTriple Objekte von links und rechts zusammen
    }

    public HuffmanTriple minimum()
    {
      if(isEmpty())
      {
        return null;
      }
      else
      {
        CharacterSearchTree m = this; //Referenz auf den aktuellen baum
        while(!m.leftChild.isEmpty()) //laufe solange bis du am letzten linken Kind angekommen bist
        {
          m = m.leftChild; //Speichere diesen
        }
        return m.getContent(); //gib ihn zurück
      }
    }

    public HuffmanTriple maximum()
    {
      if(!isEmpty())
      {
        CharacterSearchTree m = this;
        while(!m.rightChild.isEmpty())
        {
          m = m.rightChild;
        }
        return m.getContent();
      }
      else
      {
        return null;
      }
    }

    public boolean hasOnlyCompleteNodes()
    {
      if(isEmpty() || isLeaf()) //Bedinung Erfüllt wenn der Baum leer ist
      {
        return true;
      }
      else
      {
        if(!(leftChild.isEmpty() || rightChild.isEmpty())) //Solange right und left noch nicht am ende sind
        {
          return leftChild.hasOnlyCompleteNodes() && rightChild.hasOnlyCompleteNodes(); //Rekursive Aufrufe
        }
        return false;
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

    public int countIt()
    {
      if(isEmpty())
      {
        return 0;
      }
      else
      {
        if(content.getQuantity() > 1)
        {
          return 1 + leftChild.countIt() + rightChild.countIt();
        }
        return leftChild.countIt() + rightChild.countIt();
      }
    }

}
