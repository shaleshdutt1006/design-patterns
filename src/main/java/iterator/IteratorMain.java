package iterator;

import java.util.Arrays;

public class IteratorMain {
    //to access the elements of an aggregate object sequentially without exposing its underlying implementation".

    public static void main(String[] args) {

        CollectionOfNames collection = new CollectionOfNames();
       //Printing names using for-each method

        for(Iterator iter = collection.getIterator(); iter.hasnext();){
            String name = (String) iter.next();
            System.out.println("Name : " + name);
        }
    }

}




