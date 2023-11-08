//Jose Salcedo
public class ArrayStackClass {
    int top;

    public String[] getItems() {
        return items;
    }

    public void setItems(String[] items) {
        this.items = items;
    }

    String[] items;
    int maxsize;
    public int getTop() {
        return top;
    }
    public void setTop(int top) {
        this.top = top;
    }
    public int getMaxsize() {
        return maxsize;
    }
    public void setMaxsize(int maxsize) {
        this.maxsize=maxsize;
    }
    public void Req (int n){
        items = new String[n];
        top= -1;
    }

    public String  Pop(){
        if (top==-1){
            return "";
        }
        String El=items[top];
        top--;
        return El;
    }

    public void Push(String ele){
        top++;
        items[top]=ele;
        }
    public String Peek(){
        return items[top];
    }

    public boolean Empty(){
        return top==-1;
    }






}
