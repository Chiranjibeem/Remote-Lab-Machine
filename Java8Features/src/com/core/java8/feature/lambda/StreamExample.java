
import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;


class StreamExample {
  
   public Predicate<Integer> checkNumberGreaterThan102030(){
    return i -> i > 10 && i > 20 && i > 30;
  }
  
  public void printNumberGreaterThan102030(){
    List<Integer> list = generateListInteger();
    if(list != null && !list.isEmpty()){
      
      System.out.println(new java.util.Date());
      List<Integer> newList2 = list.parallelStream().filter(checkNumberGreaterThan102030()).collect(Collectors.toList());
      System.out.println(newList2);
      System.out.println(new java.util.Date());
      
      System.out.println(new java.util.Date());
      List<Integer> newList3 = list.stream().filter(checkNumberGreaterThan102030()).collect(Collectors.toList());
      System.out.println(newList3);
      System.out.println(new java.util.Date());
    }
  }
  
  public List<Integer> generateListInteger()
  {
    List<Integer> intList = new ArrayList<Integer>();
    for(int i=0;i < 1000 ; i++){
      intList.add(i);
    }
    return intList;
  }

  public static void main(String args[]){
    StreamExample s = new StreamExample();
    s.printNumberGreaterThan102030();
  }
  
}
