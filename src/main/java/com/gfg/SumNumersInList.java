
import java.awt.List;
//leet code questions
//add-two-numbers
public class SumNumersInList {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode l3 = null;
        ListNode sumList = null;
        while(l1!=null && l2!=null){
            int sum = l1.getValue()+l2.getValue()+(carry);
            ListNode node = new ListNode(sum%10);
            if(l3 == null){
                sumList = node;
                l3 = node;
            }else{
                l3.setNext(node);
                l3 = l3.getNext();
            }
            carry = sum/10;
            l1=l1.getNext();
            l2=l2.getNext();
            System.out.print("");
        }
        if(carry!=0){
        	l3.setNext(new ListNode(carry));
        }
        return sumList;
    }
    
    public void printList(ListNode l){
    	while(l!=null){
    		System.out.print(l.getValue()+"->");
    		l=l.getNext();
    	}
    	System.out.println("");
    }
    
    public static void main(String[] args) {
		ListNode l1 = new ListNode(5);
		l1.setNext(new ListNode(6));
		l1.getNext().setNext(new ListNode(4));
		ListNode l2 = new ListNode(2);
		l2.setNext(new ListNode(4));
		l2.getNext().setNext(new ListNode(3));
		SumNumersInList driver = new SumNumersInList();
		System.out.println("print list 1 :");
		driver.printList(l1);
		System.out.println("print list 2 :");
		driver.printList(l2);
		System.out.println("print sum :");
		driver.printList(driver.addTwoNumbers(l1, l2));
	}
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
    public int getValue(){return val;}
    public void setNext(ListNode l){next=l;}
    public ListNode getNext(){return next;};
}
