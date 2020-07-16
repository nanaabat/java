import java.util.*;


public class HashMapExec{

  public static voif main(String [] args){

    HashMap<Car, Owner> carOwners = new HashMap <Car, Owner>();

    for(int i; i < 100; i ++){
      carOwners.put(new Car("H-" + i), new Owner());
    }

    Iterator <Car> carIterator = carOwner.keySet().iterator();
    while(carIterator.hasNext()){
      Car c = carIterator.next();
      System.out.println(c + " Owner:" + carOwners.get(c));
    }




    /*EntrySet
    System.out.println("=======================");
    System.out.println("Map Entry");
    System.out.println("=======================");
    Set<Map.Entry<Car, Owner>> mapEntries = carOwners.entrySet();
    Iterator<Map.Entry<Car, Owner>> mapEntryItr = mapEntries.iterator();
    while(mapEntryItr.hasNext()){
      Map.Entry<Car, Owner> carEntry = mapEntryItr.next();
      System.out.println("Key:" + carEntry.getKey() + "Value" + carEntry.getValue());
  }
  }
}
