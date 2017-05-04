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
        content = new HuffmanTriple(t, q); //Erstellen von einem neuen HuffmanTriple Objekt
        content.setCode(c);                 //Eintragen des Codes
        leftChild = new CharacterSearchTree(); //zwei leere Kinder
        rightChild = new CharacterSearchTree();
      }
      else
      {
        if(content.getToken() > t) //wichtig auf content anwenden
        {
          leftChild.add(t, q, c);
        }
        else if(content.getToken() < t)
        {
          rightChild.add(t, q, c);
        }
        else
        {
          for(int i = 1; i <= q; i++) //durchlaufen des Arrays
          {
            content.incrementQuantity(); //erhöhen der Anzahl
          }
          content.setCode(c);
        }
      }
    }

    public void showPreorder()
    {
      if(!isEmpty()) //solange nicht leer
      {
        if(isLeaf()) //wenn es ein blatt ist ein *
        {
          System.out.print('*');
        }
        System.out.println(content.toString());
        leftChild.showPreorder(); //Rekursive Aufrufe zuerst left
        rightChild.showPreorder();
      }
    }

    public int height()
    {
      if(!isEmpty())
      {
        int left = leftChild.height(); //Rekursive bestimmung der höhe
        int right = rightChild.height();
        if(left < right) //bestimmung des längsten weges
        {
          return right + 1; // + 1 für die Wurzel
        }
        else
        {
          return left + 1;
        }
      }
      else
      {
        return 0;
      }
    }

    public int countCharacters()
    {
      if(!isEmpty())
      {
        return content.getQuantity() + leftChild.countCharacters() + rightChild.countCharacters(); //getQuantity aus HuffmanTriple + Rekursive Aufrufe
      }
      else
      {
        return 0;
      }
    }

    public int longestCode()
    {
      if(!isEmpty())
      {
        int left = leftChild.longestCode(); //der Längste Code von rechts und links
        int right = rightChild.longestCode();
        int longestChild = 0; //Längste Kind anfangs aus 0
        if(left > right)
        {
          longestChild = left; //Verlgeiche
        }
        else
        {
          longestChild = right;
        }
        if(longestChild > content.getCode().length()) //Abbruchkriterium
        {
          return longestChild;
        }
        else
        {
          return content.getCode().length();
        }
      }
      else
      {
        return 0;
      }
    }

    public HuffmanTriple minimum()
    {
      if(!isEmpty())
      {
        CharacterSearchTree c = this; //Referenz auf den aktuellen Baum
        while(!c.leftChild.isEmpty()) //Solange es nicht leer ist, links sind immer die kleineren Analog max
        {
          c = c.leftChild; //dann setze das letzte Objekt auf c
        }
        return c.getContent();
      }
      else
      {
        return null;
      }
    }

    public HuffmanTriple maximum()
    {
      if(!isEmpty())
      {
        CharacterSearchTree c = this;
        while(!c.rightChild.isEmpty())
        {
          c = c.rightChild;
        }
        return c.getContent();
      }
      else
      {
        return null;
      }
    }

    public boolean hasOnlyCompleteNodes()
    {
      if(isEmpty() || isLeaf()) //Wenn der Baum leer ist oder ein Blatt ist erfüllt
      {
        return true;
      }
      else
      {
        if(!(leftChild.isEmpty() || rightChild.isEmpty())) //angewand auf links oder rechts wenn nicht
        {
          return leftChild.hasOnlyCompleteNodes() && rightChild.hasOnlyCompleteNodes(); //Rekursive aufrufe
        }
        else
        {
          return false; //sonst false
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










  }
