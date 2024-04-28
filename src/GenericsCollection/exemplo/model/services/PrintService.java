package GenericsCollection.exemplo.model.services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<Type> { // <Type> generaliza o tipo da classe
    private List<Type> list = new ArrayList<>(); // <Integer> é um generic

    public void addValue(Type value){
        list.add(value);
    }

    public Type first(){
        if(list.isEmpty()){
            throw new RuntimeException("List is empty");
        }
        return list.getFirst();
    }

    public void print(){
        System.out.print("[");
        if(!list.isEmpty()){
            System.out.println(list.getFirst()); // list.getFirst() é o mesmo que list.get(0)
        }
        for(int i=1; i<list.size(); i++){
            System.out.print(", " + list.get(i));
        }
        System.out.println("]");
    }
}
