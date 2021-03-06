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
      if(isEmpty()) //Wenn leer neuen Baum anlegen
      {
        content = new HuffmanTriple(t, q);
        content.setCode(c);
        leftChild = new CharacterSearchTree();
        rightChild = new CharacterSearchTree();
      }
      else
      {
        if(content.getToken() > t) //sonst Prüfen ob rechts oder links und Rekursiv einfügen
        {
          leftChild.add(t, q, c);
        }
        else if(content.getToken() < t)
        {
          rightChild.add(t, q, c);
        }
        else
        {
          for(int i = 1; i <= q; i++) //wenn schon vorhanden Anzahl erhöhen
          {
            content.incrementQuantity();
          }
          content.setCode(c);
        }
      }
    }

    public void showPreorder()
    {
      if(!isEmpty())
      {
        if(isLeaf()) //An der Stelle eine Blattes ein *
        {
          System.out.print("*");
        }
        System.out.println(content.toString()); //Ausgabe des Inhaltes
        leftChild.showPreorder(); //Rekursiv auf rechts und links
        rightChild.showPreorder();
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
        if(l > r) //Vergleich und Ausgabe + 1 für Wurzel
        {
          return 1 + l;
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
        return content.getQuantity() + leftChild.countCharacters() + rightChild.countCharacters();
      } //Bestimmen des quantity Wertes plus left und right
    }

    public HuffmanTriple minimum() //nicht Rekursiv
    {
      if(isEmpty())
      {
        return null;
      }
      else
      {
        CharacterSearchTree m = this;
        while(!m.leftChild.isEmpty()) //Wenn ganz unten angekommen
        {
          m = m.leftChild; //setze m auf left
        }
        return m.getContent(); //gib es zurück
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
        if(isLeaf() && content.getQuantity() > 1)
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
