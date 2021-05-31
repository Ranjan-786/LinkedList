import java.util.*;

public  class SinglyLinkedList 
{
    public class Node
    {
        int data;
        Node next;
       

       Node(int data)
       {
            this.data=data;
            this.next=null;
          
       }
    }


    static Scanner sc=new Scanner(System.in);
    Node head;
    Node tail;
    SinglyLinkedList ()
    {
        head=null;
        tail=null;
    }

    public void addElement()
    {
        System.out.println("enter the data");
        int d=sc.nextInt();
        Node newnode=new Node(d);
        if(head==null)
        {
            head=newnode;
            tail=newnode;
        }
        else
        {
            tail.next=newnode;
            tail=newnode;

        }
    }

    public void delete()
    {   
        Node current=head,pre=null,v=head;  
        int c=0;
        System.out.println("Enter the data");
        int k=sc.nextInt();

        while(v!=null && v.data!=k)
        {
            pre=v;
            v=v.next;
        }

       while(current!=null)
       {
            if(current.data==k && current==head)
            {
                
                head=current.next;
                System.out.println("element deleted");
                c=1;
                break;
            }
            else if(current.data == k)
            {   

                    pre.next=current.next;
                    System.out.println("element deleted");
                    c=1;
                    break;
                
            }
            current=current.next;

        }
        

        if(c==0)
        {
            System.out.println("element not found");
        }
        

    }

    public void display()
    {
        Node current=head;

        if(head==null)
        {
            System.out.println("List is empty");
        }

        while(current!=null)
        {
             System.out.print(current.data+"->");
            current=current.next;

        }
        System.out.println("null");
        System.out.println();
        System.out.println("-----------------------");
    }

 public static void main(String []s)
    {
        SinglyLinkedList f=new SinglyLinkedList();
        while(true)
        {
            System.out.println("For inserting data :1");
            System.out.println("For displaying node:2");
            System.out.println("For deleting node:3");
            System.out.println("For exit:4");
            System.out.println("Enter your choice");
            int c=sc.nextInt();
            switch(c)
            {
                case 1:
                    f.addElement();
                    break;
                case 2:
                    f.display();
                    break;
                case 3:
                    f.delete();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong Choice");
            }

        }
    } 
}
    

