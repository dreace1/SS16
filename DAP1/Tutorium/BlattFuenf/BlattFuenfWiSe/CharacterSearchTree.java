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

    //Beginn der Aufgaben

    public CharacterSearchTree(char[] a)
    {
      for(int i = 0; i < a.length; i++)
      {
        iterativeAdd(a[i]);
      }
    }

    public void add(char t, int q, String c)
    {
      if(isEmpty()) //falls noch nicht vorhanden
      {
        content = new HuffmanTriple(t, q); //einsetzen eines neuen Knotens mit 2 Kindern
        leftChild = new CharacterSearchTree();
        rightChild = new CharacterSearchTree();
        content.setCode(c); //einsetzen der Codierung
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
          for(int i = 1; i <= q; i++)
          {
            content.incrementQuantity(); //q++;
          }
          content.setCode(c); //Code = c;
        }
      }
    }

    public void ShowPreOrder()
    {
      if()
    }

}
