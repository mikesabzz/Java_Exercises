import java.util.ArrayList;

public class LinkedList {
    private Node head;

    private class Node {
        int data; 
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(int data) {
        Node newNode = new Node(data);
        
        if (head == null) {
            head = newNode;
            return;
        }
        
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void printList() {
        Node current = head;
        System.out.print("[ ");
        while (current != null) {
            System.out.print(current.data + ", ");
            current = current.next;
        }
        System.out.println("]");
        System.out.println();
    }

    public LinkedList getIntersectionNode(LinkedList headA, LinkedList headB) {
        LinkedList res = new LinkedList();
        Node currentA = headA.head;
        Node currentB = headB.head;
        while (currentA != null && currentB != null) {
            if(currentA.data == currentB.data){
                res.add(currentA.data);
            }
            currentA = currentA.next;      
            currentB = currentB.next;
        
        }

        return res;
    }
    public void mergeTwoLists(LinkedList list1, LinkedList list2) {
        Node currentOne = list1.head;
        Node currentTwo = list2.head;
        LinkedList list = new LinkedList();
        while(currentOne != null && currentTwo != null){
            list.add(currentOne.data);
            list.add(currentTwo.data);
            currentOne = currentOne.next;
            currentTwo = currentTwo.next;
        }

        Node current = list.head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
    public void middleValue(LinkedList list){
        Node res = list.head;
        int count = 0;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while(res != null){
            count++;
            // System.out.println(res.data);
            arr.add(res.data);
            res = res.next;
        }
        int size = count;  
        // System.out.println("The middle value is "+ arr.get(size/2));
    }
    public void reverseList(LinkedList list) {
        Node res = list.head;
        Node previous = null;
        Node next = null;
        while(res != null){
            next = res.next;
            res.next = previous;
            previous = res;
            res = next;
        }
        list.head = previous;        
    }
    public void addTwoNumbers(LinkedList l1, LinkedList l2) {
        ArrayList<Integer> alist = new ArrayList<Integer>();
        ArrayList<Integer> blist = new ArrayList<Integer>();
        Node cur = l1.head;
        Node cur2 = l2.head;
        while (cur != null){
            alist.add(cur.data);
            cur = cur.next;
        }
        while (cur2 != null){
            blist.add(cur2.data);
            cur2 = cur2.next;
        }
        String firstNum = "";
        String secNum = "";
        for(int i=alist.size()-1; i>=0; i--){
            firstNum = firstNum + alist.get(i);
        }
        for(int i=blist.size()-1; i>=0; i--){
            secNum = secNum + blist.get(i);
        }
        int calc = Integer.parseInt(firstNum) + Integer.parseInt(secNum);
        String calcst = ""+calc;
        LinkedList newList = new LinkedList();
        for(int i = calcst.length()-1; i>=0; i--){
            newList.add(calcst.charAt(i));
        }
        System.out.println("res "+calcst);
    }
    public void findDuplicate(LinkedList duplicateList){
        Node curr = duplicateList.head;
        while(curr != null){
            Node sec = curr.next;
            while (sec != null){
                if(curr.data > sec.data){
                   int temp = curr.data;
                   curr.data = sec.data;
                   sec.data = temp;
                } 
                sec = sec.next;
            }
            curr = curr.next;
        }
        
        Node current = duplicateList.head;
        while(current != null){
            Node runner = current;
            while(runner.next != null){
                if(runner.next.data == current.data){
                    System.out.println(runner.data);
                }
                runner = runner.next;
            }
            // System.out.println(current.data);
            current = current.next;
        }
    }
    public static void main(String[] args) throws Exception {
        LinkedList headA = new LinkedList();
        headA.add(2);
        headA.add(4);
        headA.add(3);
        LinkedList headB = new LinkedList();
        headB.add(4);
        headB.add(6);
        headB.add(5);
        // headA.printList();
        // headB.printList();

        LinkedList returnList = new LinkedList();
        // returnList.mergeTwoLists(headA, headB);
        // returnList.middleValue(headA);
        // returnList.reverseList(headB);
        returnList.addTwoNumbers(headA, headB);
        LinkedList duplicateList = new LinkedList();
        duplicateList.add(6);
        duplicateList.add(2);
        duplicateList.add(7);
        duplicateList.add(5);
        duplicateList.add(8);
        duplicateList.add(6);
        returnList.findDuplicate(duplicateList);

        //headA.getIntersectionNode(headA, headB);


    }
}
