package com.amigoscode;

import java.util.List;
import java.util.Optional;

public class Main {
    public static int findElement(List<Integer> collection, int targetElement) {
        Optional<Integer> result = collection.stream()
                .filter(element -> element.equals(targetElement))
                .findFirst();
        return result.orElse(-1);
    }

    public static void main(String[] args) {

        // String tipinde generic bir liste örneği
        GenericList<String> stringGenericList = new GenericList<>();

        stringGenericList.addElement("Java");
        stringGenericList.addElement("Python");
        stringGenericList.addElement("C++");
        stringGenericList.printElements();

        System.out.println("*****************************");

        // Integer tipinde generic bir liste örneği
        GenericList<Integer> integerGenericList = new GenericList<>();
        integerGenericList.addElement(17);
        integerGenericList.addElement(34);
        integerGenericList.addElement(57);
        integerGenericList.printElements();

        List<Integer> integerList = List.of(10, 20, 30, 40, 50);
        int result = findElement(integerList, 30);

        if (result != -1) {
            System.out.println("Element found: " + result);
        } else {
            System.out.println("Element not found.");
        }

        System.out.println("****************************");

        int result1 = findElement(integerList, 60);

        if (result1 != -1) {
            System.out.println("Element found: " + result1);
        } else {
            System.out.println("Element not found.");
        }
    }
}