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
      if(isEmpty()) //Wenn leer neuen Teilbaum erstellen
      {
        content = new HuffmanTriple(t, q);
        content.setCode(c); //Code muss noch gesetzt werden
        leftChild = new CharacterSearchTree(); //mit 2 leeren Bäumen
        rightChild = new CharacterSearchTree();
      }
      else
      {
        if(content.getToken() > t) //Überprüfen ob es rechts oder links angehängt werden muss
        {
          leftChild.add(t, q, c);
        }
        else if(content.getToken() < t)
        {
          rightChild.add(t, q, c);
        }
        else
        {
          for(int i = 1; i <= q; i++)
          {
            content.incrementQuantity(); //Wenn schon vorhanden dann quantity erhöhen
          }
        }
      }
    }

    public void showPreOrder()
    {
      if(!isEmpty())
      {
        if(isLeaf()) //an der Stelle der Blätter ein *
        {
          System.out.print("*");
        }
        System.out.println(content.toString());
        leftChild.showPreOrder(); //Rekursive Aufrufe
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
        int l = leftChild.height();
        int r = rightChild.height();
        if(l > r) //Überprüfen welches mehr Elemente hat
        {
          return l + 1; //+ Wurzel
        }
        else
        {
          return r + 1;
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
      }
    }

    public HuffmanTriple minimum()
    {
      if(isEmpty())
      {
        return null;
      }
      else
      {
        CharacterSearchTree m = this;
        while(!m.leftChild.isEmpty())
        {
          m = m.leftChild;
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

    public int countIt()
    {
      if(isEmpty())
      {
        return 0;
      }
      else
      {
        if(isLeaf() && content.getQuantity() > 1)
        {
          return 1 + leftChild.countIt() + rightChild.countIt();
        }
        else
        {
          return leftChild.countIt() + rightChild.countIt();
        }
      }
    }

    public boolean hasOnlyCompleteNode()
    {
      if(isEmpty() || isLeaf())
      {
        return true;
      }
      else
      {
        if(!(leftChild.isEmpty() || rightChild.isEmpty()))
        {
          return leftChild.hasOnlyCompleteNode() && rightChild.hasOnlyCompleteNode();
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

}
