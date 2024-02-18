package com.amigoscode;

import java.util.ArrayList;
import java.util.List;

public class GenericList <T>{
    private List<T> elements;
    public GenericList() {
        this.elements = new ArrayList<>();
    }

    public void addElement(T element){
        elements.add(element);
    }

    public void printElements(){
        for(T element:elements){
            System.out.println(element);
        }
    }
}
