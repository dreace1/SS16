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
        content.setCode(c);
        leftChild = new CharacterSearchTree();
        rightChild = new CharacterSearchTree();
      }
      else
      {
        if(content.getToken() > t)
        {
          leftChild.add(t, q, c);
        }
        else if(content.getToken() < t)
        {
          rightChild.add(t, q, c);
        }
        else
        {
          for(int i = 0; i < q; i++)
          {
            content.incrementQuantity();
          }
          content.setCode(c);
        }
      }
    }

    public int learnCount()
    {
      if(isEmpty())
      {
        return 0;
      }
      else
      {
        if(content.getQuantity() > 1) //isLeaf() &&
        {
          return 1 + leftChild.learnCount() + rightChild.learnCount();
        }
        else
        {
        return leftChild.learnCount() + rightChild.learnCount();
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
        System.out.println(content.toString());
        leftChild.showPreorder();
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
        int left = leftChild.height(); //Rekursive Bestimmung der Hoehe
        int right = rightChild.height();
        if(left > right) //Vergleich welches der laengste Teilbaum ist
        {
          return 1 + left;
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
        return content.getQuantity() + leftChild.countCharacters() + rightChild.countCharacters();
      }//Zaele die QUantity Werde und wende es Rekursiv auf left und right an
    }

    public HuffmanTriple minimum()
    {
      if(isEmpty())
      {
        return null;
      }
      else
      {
        CharacterSearchTree c = this; //Referenz auf den aktuellen baum
        while(!c.leftChild.isEmpty()) //nicht rekursiv laufe bis zum Ende
        {
          c = c.leftChild; //Setze den Teilbaum auf c
        }
        return c.getContent(); //gib den Teilbaum aus
      }
    }

    public boolean hasOnlyCompleteNodes()
    {
      if(isEmpty() || isLeaf()) //Bedingung Erfüllt
      {
        return true;
      }
      else
      {
        if(!(leftChild.isEmpty() || rightChild.isEmpty())) //Sobald es am ende angekommen ist
        {
          return rightChild.hasOnlyCompleteNodes() && leftChild.hasOnlyCompleteNodes(); //Rekursive Aufrufe
        }
          return false;
      }
    }

    public boolean containsCharacter( char t)
    {
      if(isEmpty())
      {
        return false;
      }
      else
      {
        if(content.getToken() > t) //Überprüfung welcher Weg gegangen werden muss ob rechts oder links
        {
          return leftChild.containsCharacter(t); //Rekursive Aufrufe
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
