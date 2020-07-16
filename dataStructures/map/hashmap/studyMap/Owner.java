import java.util.Random;

public class Owner{

  private String ownerName;

  public Owner(String name){
    ownerNamer = name;
  }

  public Owner(){
    final String alphabet = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ';
    final int N = alphabet.length();

    Random r = new Random();
    StringBuffer name = new StringBuffer();
    for(int i = 0; i < 6; i ++){
      name.append(alphabet.charAt(r.nextInt(N)));
    }
    ownerName = name.toString();
  }

  public String getOwnerName(){
    return ownerName;
  }

  public void setOwnerName(String ownerName){
    this.ownerName = ownerName;
  }


  public String toString(){
    return this.ownerName;
  }

  //@Override
  public boolean equals(Object obj){
    if(obj!= null && instanceOf Owner){
      Owner owner2 = (Owner)obj;
      if(owner2.getOwnerName() != null && owner2.equals(this.getOwnerName())){
        return true;
      }
    }
  }
}
