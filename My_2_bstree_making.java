
package trees;
import java.lang.*;
import java.util.*;
class Noode
{
    int data;
    Noode left;
    Noode right;
    public Noode(int data)
    {
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class My_2_bstree_making
{
    public static Noode head=null;
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements:");
        int n=sc.nextInt();
        System.out.println("enter the elements:");
        for(int i=0;i<n;i++)
        {
            insert(sc.nextInt());
        }
        tra(head);
        System.out.println("the height of the tree is:"+height(head));
    }
    public static void insert(int data)
    {
        Noode newnode=new Noode(data);
        if(head==null)
        {
            head=newnode;
        }
        else
        {
            Noode current=head;
            while(current!=null)
            {
                if(newnode.data<current.data && current.left==null)
                    current.left=newnode;
                else if(newnode.data>current.data && current.right==null)
                    current.right=newnode;
                current=newnode.data<current.data?current.left:current.right;
            }
        }
    }
    public static void tra(Noode node)
    {
        if(node==null)
            return;
        else
        {
            tra(node.left);
            System.out.print(node.data+" ");
            tra(node.right);
        }
    }
    public static int height(Noode head)
    {
        if(head==null)
            return -1;
        else
        {
            return (Math.max(height(head.left)+1,height(head.right)+1));
        }
    }
}
