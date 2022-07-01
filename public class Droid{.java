public class Droid{
  String name;
double batteryLevel;

 public Droid (String droidName){
batteryLevel = 100;
name = droidName;

  }
  public String toString(){
    return "Hello, I am " + name;
  }
public void performTask(String task){
  System.out.println(name + " is performing "+ task);
}
  public static void main (String[] args){
double batteryLevel;
Droid codey  = new Droid("Codey");
System.out.println(codey);
codey.performTask("for you");
  }
}