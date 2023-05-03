//{ Driver Code Starts
import java.util.Scanner;
import java.util.*;
import java.io.*;

class Node
{
	int data;
	Node next;
	Node bottom;
	
	Node(int d)
	{
		data = d;
		next = null;
		bottom = null;
	}
}


class Flatttening_A_LinkedList
{	
    Node head;
	
	void printList(Node node)
    {
        //Node temp = head;
        while (node != null)
        {
            System.out.print(node.data + " ");
            node =node.bottom;
        }
        System.out.println();
    }
	public  static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		Flatttening_A_LinkedList list = new Flatttening_A_LinkedList();
		while(t>0)
		{
			int N = sc.nextInt();
			int arr[] = new int[N];
			for(int i=0;i<N;i++)
				arr[i] = sc.nextInt();
			
			Node temp = null;
			Node tempB = null;
			Node pre = null;
			Node preB = null;	
			int flag=1;
			int flag1=1;
			for(int i=0; i<N;i++)
			{
				int m = arr[i];
				m--;
				int a1 = sc.nextInt();
				temp = new Node(a1);
				if(flag == 1)
				{
					list.head = temp;
					pre = temp;
					flag = 0;
					flag1 = 1;
				}
				else
				{
					pre.next = temp;
					pre = temp;
					flag1 = 1;
				}
				
				for(int j=0;j<m;j++)
				{
					int a = sc.nextInt();
					tempB = new Node(a);
					if(flag1 == 1)
					{
						temp.bottom = tempB;
						preB = tempB;
						flag1 = 0;
					}
					else
					{
						preB.bottom = tempB;
						preB = tempB;
					}
				}
				
			}
			//list.printList();
			GfG g = new GfG();
			Node root = g.flatten(list.head);
			list.printList(root);
		
		t--;
		}
	}	
}
// } Driver Code Ends


/*Node class  used in the program
class Node
{
	int data;
	Node next;
	Node bottom;
	
	Node(int d)
	{
		data = d;
		next = null;
		bottom = null;
	}
}
*/
/*  Function which returns the  root of 
    the flattened linked list. */
class GfG
{
    Node mergetwolists(Node a ,Node b){
        Node temp=new Node(0);//dummy  node
        Node res=temp;
        while(a!=null && b!=null){//taken two pointer a and b
            if(a.data<b.data){
                temp.bottom=a;//assigning the value to bottom of temp
                temp=temp.bottom;//move the temp pointer to one down 
                a=a.bottom;//move the a pointer
            }
            else{
                temp.bottom=b;
                temp=temp.bottom;
                b=b.bottom;//move the b pointer
            }
        }
        if(a!=null)//if any data is left in the a pointer then add it to the temp
            temp.bottom=a;
        else        ////if any data is left in the b pointer then add it to the temp
            temp.bottom=b;
        return res.bottom;//res.bottom is head of the flateen linked list
    }
    Node flatten(Node root)
    {
        if(root==null || root.next==null)return root;
        
        //recursion for list on right
        root.next=flatten(root.next);
        //merge two lists
        root=mergetwolists(root,root.next);
        //return the root
        //it will in turn merge with its left
        return root;
    }
}