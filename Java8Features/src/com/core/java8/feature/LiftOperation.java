import java.io.InterruptedIOException;
import java.util.*;

class LiftOperation {

  private List<Integer> floorList;
  private int floorSize;
  private boolean basement;
  private int basementSize;
  private int currentFloor;
  
  public LiftOperation(int floorSize,boolean basement,int basementSize,int currentFloor){
    this.floorSize  = floorSize;
    this.basement = basement;
    this.basementSize = basementSize;
    this.currentFloor = currentFloor;
  }
  
  public List<Integer> createFloor(){
    floorList =  new LinkedList<Integer>();
    if(basement && basementSize > 0){
      for(int i=1;i<=basementSize;i++){
        floorList.add(-i);
      }
    }
    if(floorSize > 0){
      floorList.add(0);
      for(int i=1;i<=floorSize;i++){
        floorList.add(i);
      }
    }
    else
      System.out.println("Lift Not Required");
    return floorList;
  }
  
  public void printLiftDetails(List<?> list){
    if(list!=null && !list.isEmpty()){
      System.out.println("List Of Floor =>");
    	list.stream().forEach(i->{
      System.out.println(i);
    });
    }
    
  }
  
  public synchronized void startLift(int selectedFloor) throws InterruptedException{
    if(currentFloor < selectedFloor)
      System.out.println("Lift is Going Up");
     else if(currentFloor > selectedFloor)
       System.out.println("Lift is Going Down");
    System.out.println("Door Open");
    System.out.println("Waiting For Door to be Closed");
    this.wait(10000);
    System.out.println("Door Closed");
  }
}
