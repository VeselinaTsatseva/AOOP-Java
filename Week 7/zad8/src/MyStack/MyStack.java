package MyStack;

import java.util.ArrayList;

public class MyStack {
    private ArrayList list = new ArrayList();

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public int size(){
        return list.size();
    }

    public Object peek(){
        if(!isEmpty()){
            return list.get(size() - 1);
        } else {
            return null;
        }
    }

    public Object pop(){
        if(!isEmpty()){
            return list.remove(size() - 1);
        } else {
            return null;
        }
    }

    public void push(Object o){
        list.add(o);
    }
}
