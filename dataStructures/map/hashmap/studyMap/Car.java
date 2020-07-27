public class Car implements Comparable<Car>{

  //fields
  private String registrationNumber;
  private int price;


  //consturctor
  public Car(String registrationNumber){
    this.registrationNumber = registrationNumber;
  }


  //constructor 2 with 2 argument
  public Car(String registrationNumber, int price){
    this.registrationNumber = registrationNumber;
    this.price = price;
  }



  //dont know what this method does yet
  public boolean equals(Object obj){
    if(obj!= null && obj instanceOf Car){
      String regNumber = ((Car)obj).getRegistrationNumber();
      if(regNumber != null & regNumber.equals(this.registrationNumber)){
        return true;
      }
    }
    return false;
  }


  public int hashCode(){
    return this.registrationNumber.hashCode();
  }


  public String String(){
    return this.registrationNumber;
  }


  /**
   * Natural ordering for car instance
   */


   public int compareTo(Car o){
     if(this.getPrice() > o.getPrice()){
       return 1;
     }
     else if(this.getPrice() < o.getPrice()){
       return -1;
     }
   }
