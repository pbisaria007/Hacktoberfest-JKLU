

 class Node
{
    protected int data;
    public Node link;
    Node()
    {
        data=0;
        link=null;
    }
    Node(int x, Node n)
    {
        data=x;
        link=n;
    }
    void setdata(int d)
    {
        data=d;
    }
    int getdata()
    {
        return data;
    }
    void setlink(Node l)
    {
         link=l;
    }
    Node getlink()
    {
        return link;
    }
} 
class linkedlist 
{
    Node start;
    linkedlist()
    {
        start=null;
    }
    public void first_pos(int n)
    {
         Node nptr = new Node(n,null);
        if(start==null)
        {
            start=nptr;            
        }
            
        else
        { 
            nptr.setlink(start);
            start=nptr;
        }
    } 
    public void last_pos(int n)
    {
        Node ptr=start;
        Node nptr = new Node(n,null);
        if(start==null)
        {
            System.out.println("linked list is empty");

        }
        else
        {
            while(ptr.getlink()!=null)
                ptr=ptr.getlink();
            ptr.setlink(nptr);
        }
    }   
    public void aft_Node(int val,int n)
    {
       Node ptr=start;
       Node nptr = new Node(n,null);
        if(start==null)
        {
            System.out.println("linked list is empty");
        }
        else
        {
            while(ptr.getdata()!=val)
                ptr=ptr.getlink();
            nptr.setlink(ptr.getlink());
            ptr.setlink(nptr); 
        }
    }
    public void bef_Node(int val, int n)
    {
         Node ptr=start;
         Node pptr=start;
         Node nptr = new Node(n,null);
        if(start==null)
            System.out.print("linked list is empty");
        else
        {
             while(ptr.data!=val)
             {
                 pptr=ptr;
                 ptr=ptr.getlink();
             }
             nptr.setlink(ptr);
             pptr.setlink(nptr);
            
        }
    }
    public void display()
    {
        Node ptr=start;
        while(ptr.getlink()!=null)
             {
                System.out.println(ptr.getdata());
                ptr=ptr.getlink();
             }
             System.out.println(ptr.getdata());
    }
    
    public void del_first()
    {
        if(start==null)
            System.out.println("Underflow");
        else
        {
            Node ptr=start;
            Node pptr=ptr;
            pptr=pptr.getlink(); 
            start.setlink(pptr);
            start=pptr; 
            
        }  
                    
    }
    public void del_last()
    {
        if(start==null)
            System.out.println("underflow");
        else
        {
            Node ptr=start;
            while(ptr.getlink()!=null)
            {
                Node pptr=ptr;
                ptr=ptr.getlink();
                pptr.setlink(ptr.getlink());
            }
        }
    }
    public void del_aft(int val)
    {
        if(start==null)
            System.out.println("underflow");
        else
        {
            Node ptr=start;
            while(ptr.getdata()!=val)
                ptr=ptr.getlink();
            
            Node pptr=ptr;
            pptr=pptr.getlink();
            ptr.setlink(pptr.getlink());
        }
    }
    public void del_bef(int val)
    {
        if(start==null)
            System.out.println("underflow");
        else
        {
            Node ptr=start;
            Node pptr=start;
            while(ptr.getdata()!=val)
            {
                pptr=ptr;
                ptr=ptr.getlink();
            }
        }
    }
   
}
public class ll_runner
{
    public static void main(String args[])
    {
        linkedlist l=new linkedlist();
        l.first_pos(2);
        l.first_pos(7);
        l.first_pos(10);    
        l.last_pos(20);  
        l.aft_Node(7,556);
        l.bef_Node(20, 584);
        l.del_first();
        l.del_last();
        l.del_bef(2);
        l.del_aft(2);
        l.display();
    }
    
}


