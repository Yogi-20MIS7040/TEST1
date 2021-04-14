import java.util.*;
public class Main{
public static void main(String args[]){
Main d=new Main();
Scanner sc=new Scanner(System.in);
char j;
do{
System.out.println("\n1.create a node \n2.insert node at beggining \n3.insert node at middle \n4.insert node at end");
System.out.println("5.delete at begin \n6.delete at end \n7.delete at middle \n8.display \n9.exit");
System.out.println("Enter your choice");
int n=sc.nextInt();
switch(n){
case 1:
System.out.println("Enter the value");
                  int m=sc.nextInt();
               d.add(m);
              d.display();
break;
case 2: 
System.out.println("Enter the element to insert");
                int k=sc.nextInt();
                   d.atbegin(k);
                   d.display();
break;
case 3:
System.out.println("Enter the position to insert");
           int l=sc.nextInt();
System.out.println("Enter the element to insert");
           int g=sc.nextInt();
                d.atmiddle(l,g);
                d.display();
break;
case 4:
System.out.println("Enter the element to insert");
               int a=sc.nextInt();
              d.atend(a);
        d.display();
break;
case 5:
                
                   d.deleteatbegin();
                    d.display();
break;
case 6:
           
             d.deleteatend();
             d.display();
break;
case 7:
System.out.println("Enter the position to delete");
              int f=sc.nextInt();
               d.deleteatmiddle(f);
               d.display();
break;
case 8: 
       d.display();
break;
case 9:
              System.out.println("program -EXITED");
}
System.out.println("Press Y to try again and Press X to leave");
j=sc.next().charAt(0);
}while(j=='Y');
}
         public class Node{  

        int data;  
        Node next;  
        public Node(int data) {  
            this.data = data;  
        }  
    }  
  public Node head = null;  
    public Node tail = null;  
    public void add(int data){ 
        Node newNode = new Node(data);  
  if(head == null) {  
 head = newNode;  
            tail = newNode;  
            newNode.next = head;  
   }  
        else {
 tail.next = newNode;   
            tail = newNode;  
            tail.next = head;  
        }    
}
 public void atbegin(int data){ 
            Node newNode = new Node(data);
            if(head == null) {  
                head = newNode;  
                tail = newNode;  
                newNode.next = head;  
            }  
            else {  
                Node temp = head; 
                newNode.next = temp;  
                head = newNode;  
                tail.next = head;  
            }  
        }   
public void atend(int data){ 
            Node newNode = new Node(data);
            if(head == null) {  
                head = newNode;  
                tail = newNode;  
                newNode.next = head;  
            }  
            else {  
             tail.next=newNode;
               tail=newNode;
                tail.next = head;  
            }  
        }   
        public void atmiddle(int position,int data){  
                     
            Node newNode = new Node(data);   
            if(head == null){  
                head = newNode;  
                tail = newNode;  
                newNode.next = head;  
            }  
            else{  
               
               Node temp = head;  
               Node current= null;  
                for(int i = 0; i < position; i++){  
                    current = temp;  
                    temp = temp.next;  
                }   
                current.next = newNode; 
                newNode.next = temp;  
            }  
        }  
    public void deleteatbegin() {  
        if(head == null) {  
            return;  
        }  
        else {   
            if(head != tail ) {

The Batman, [21.03.21 22:32]
[Forwarded from Pooju]
head = head.next;  
                tail.next = head;  
            }    
            else {  
                head = tail = null;  
            }  
        }  
    }  
    public void deleteatend() {  
        if(head == null) {  
            return;  
        }  
        else {  
            if(head != tail ) {  
                Node current = head; 
                while(current.next != tail) {  
                    current = current.next;  
                }  
                tail = current;   
                tail.next = head;  
            }   
            else {  
                head = tail = null;  
            }  
        }  
    }  
    public void deleteatmiddle(int place) {    
        Node current, temp;      
        if(head == null) {    
            return;    
        }    
        else {        
            if( head != tail ) {       
                temp = head;    
                current = null;   
                for(int i = 0; i < place; i++){    
                    current = temp;    
                    temp = temp.next;    
                }    
                    
                if(current != null) {      
                    current.next = temp.next;       
                    temp = null;    
                }       
                else {    
                    head = tail = temp.next;    
                    tail.next = head;     
                    temp = null;    
                }    
                    
            }
            else {    
                head = tail = null;    
            }    
        }    
        
    }     
           
 public void display() {  
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
        }  
        else {  
            System.out.println("Nodes of the circular linked list: ");  
             do{  

                System.out.print(" "+ current.data);  
                current = current.next;  
            }while(current != head);  
            System.out.println();  
        }  
}    
}