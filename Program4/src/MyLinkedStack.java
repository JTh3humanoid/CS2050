
//Jose Salcedo
public class MyLinkedStack {
    public static class Node {
        String e;
        Node Next;
        Node head;
        Node tail;
        int size;
        public void Req(int s){

        }
        public String Push (String e){
            Node p= new Node();
            p.e=e;
            p.Next=head;
            head=p;
            if (Empty())
                tail=p;
            size++;
            return e;
        }
        public String Pop(){
            if (Empty()) return null;
            String e= head.e;
            head=head.Next;
            if (--size==0)tail=null;
            return e;
        }
        public String Peek (){
            return e=head.e;
        }
        public boolean Empty(){
            return size==0;
        }
    }
}
