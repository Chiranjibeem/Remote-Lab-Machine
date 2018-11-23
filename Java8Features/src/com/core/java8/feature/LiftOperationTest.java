import java.util.*;
import java.util.stream.*;

class LiftOperationTest {
  
  public static void main(String[] args) {
    
    LiftOperation lift = new LiftOperation(5,true,3,0);
    List<Integer> liftList = lift.createFloor();
    lift.printLiftDetails(liftList);
    
    boolean flag = true;
    while(flag){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Select The Floor You Want to Go");
    String floor  = scanner.next();
    Integer floorName = null;
    try{
    floorName = Integer.parseInt(floor);
    if(liftList.contains(floorName)){
    try{
    lift.startLift(floorName);
    }
    catch(Exception e){
      System.out.println("System Error,Contact Your Administrator");
    }
    flag = false;
    }
    else{
      System.out.println(floorName+" Floor Does Not Exist.Please Select Another Floor");
      flag=true;
    }
    }
    catch(NumberFormatException e){
      System.out.println(floorName+" Floor Does Not Exist.Please Select Another Floor");
      flag=true;
    }
    
    }
  }
}
