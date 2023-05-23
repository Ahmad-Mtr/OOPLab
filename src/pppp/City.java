package pppp;

import java.util.*;
public class City {
    private HashMap<String, Integer> people;

    public City() {
        people = new HashMap<String, Integer>();
    }

    public void print(){

        System.out.println(people.entrySet()+"\n ");
        System.out.println(people.values()+ "\n");
        System.out.println(people.keySet()+"\n\n");
        for (String key: people.keySet()) {
            System.out.println(key+" - "+ people.get(key)+".") ;

        }



    }
    public void add(String _Name, int _ID){
        people.put(_Name,_ID);
    }
    public static void main(String args[] ){

        City Amman = new City();
        Amman.add("Jan One",20131010);
        Amman.add("Edward", 20131011);
        Amman.add("Christian", 20132555);
        Amman.print();

    }
}
