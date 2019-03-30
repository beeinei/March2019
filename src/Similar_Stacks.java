import java.util.Stack;
import unit4.collectionsLib.Node;

public class Similar_Stacks {

    public static boolean isSimilar(Stack<Integer> s1, Stack<Integer> s2){
        Node<Integer> myList = new Node(s1.pop());
        while (!s1.isEmpty()){
            myList = new Node(s1.pop(),myList);
        }
        while (!s2.isEmpty()) {
            int temp = s2.pop();
            boolean found = false;
            if (myList != null) {
                if (myList.getValue() == temp) {
                    found = true;
                    myList = myList.getNext();
                } else {
                    Node<Integer> curr = myList;
                    while (curr.getNext() != null && !found) {
                        if (curr.getNext().getValue() == temp) {
                            found = true;
                            curr.setNext(curr.getNext().getNext());
                        } else {
                            curr = curr.getNext();
                        }
                    }
                }
            }
            if (!found) {
                return false;
            }
        }
        return myList == null;
    }

    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack();
        s1.push(3);
        s1.push(5);
        s1.push(9);
        s1.push(6);
        Stack<Integer> s2 = new Stack();
        s2.push(3);
        s2.push(9);
        s2.push(5);
        s2.push(6);
        System.out.println(isSimilar(s1,s2));
    }

}
