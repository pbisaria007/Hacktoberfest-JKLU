

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lab
 */
 class Node
{
    protected int data;
    public Node link , prev;
    Node()
    {
        data=0;
        link=null;
        prev=null;
    }
    Node(int x, Node n , Node y)
    {
        data=x;
        link=n;
        prev=y;
    }
    void setdata(int d)
    {
        data=d;
    }
    int getdata()
    {
        return data;
    }
    void setlink_next(Node l )
    {
         link=l;
       
    }
     void setlink_prev(Node l )
    {
         prev=l;
       
    }
    Node getlink_next()
    {
        return link;
    }
    Node getlink_prev()
    {
        return prev;
    }
} 
class dlinkedlist 
{
    Node start;
    dlinkedlist()
    {
        start=null;
    }
    public void first_pos(int n)
    {
        Node nptr = new Node(n,null,null);
        if(start==null)
        {
            start=nptr;            
        }
            
        else
        { 
            nptr.setlink_next(start);
            nptr.setlink_prev(null);
            start=nptr;
        }
    } 
    public void last_pos(int n)
    {
        Node ptr=start;
        Node nptr = new Node(n,null,null);
        if(start==null)
        {
            System.out.println("linked list is empty");

        }
        else
        {
            while(ptr.getlink_next()!=null)
                ptr=ptr.getlink_next();
            nptr.data=n;
            nptr.link=null;
            nptr.prev=ptr;
            ptr.link=nptr;
        }
    }   
    public void aft_Node(int val,int n)
    {
       Node ptr=start;
       Node nptr = new Node(n,null,null);
        if(start==null)
        {
            System.out.println("linked list is empty");
        }
        else
        {
            while(ptr.getdata()!=val)
                ptr=ptr.getlink_next();
            
            nptr.data=n;
            nptr.link=ptr.link;
            nptr.prev=ptr;
            ptr.link.prev=nptr;
            ptr.link=nptr;
            //nptr.setlink(ptr.getlink());
           // ptr.setlink(nptr); 
        }
    }
    public void bef_Node(int val, int n)
    {
         Node ptr=start;
         Node nptr = new Node(n,null,null);
        if(start==null)
            System.out.print("linked list is empty");
        else
        {
             while(ptr.data!=val)
                 ptr=ptr.getlink_next();
             
             nptr.link=ptr;
             nptr.prev=ptr.prev;
             ptr.prev.link=nptr;
             ptr.prev=nptr;
             
            // nptr.setlink(ptr);
            // pptr.setlink(nptr);
            
        }
    }
    public void display()
    {
        Node ptr=start;
        while(ptr.getlink_next()!=null)
             {
                System.out.println(ptr.getdata());
                ptr=ptr.getlink_next();
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
          ptr.link=start;
          ptr.prev=null;
            
        }  
                    
    }
    public void del_last()
    {
        if(start==null)
            System.out.println("underflow");
        else
        {
           Node ptr=start;
           while(ptr.getlink_next()!=null)
                ptr=ptr.getlink_next();
          ptr.prev.link=null;
           
        }
    }
    public void del_aft(int val)
    {
        if(start==null)
            System.out.println("underflow");
        else
        {
             Node ptr=start;
              while(ptr.data!=val)
                 ptr=ptr.getlink_next();
             ptr.link=ptr.link.link;
             ptr.link.prev=ptr;
             
        }
    }
    public void del_bef(int val)
    {
        if(start==null)
            System.out.println("underflow");
        else
        {
          Node ptr=start;
          while(ptr.data!=val)
                 ptr=ptr.getlink_next();
          ptr.prev=ptr.prev.prev;
          ptr.prev.link=ptr;
        }
    }
    
   
}
public class dll_runner
{
    public static void main(String args[])
    {
        dlinkedlist l=new dlinkedlist();
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
