import java.util.stream.*;
import java.util.*;

class Loggical {
  
  public static void isAddition10(Integer[] a,Integer total){
    if(a!=null){
      
      System.out.println("Loggical 1");
      System.out.println("Element Details Which Addition Are Equal to 10 Are :");
      //Solution 1
      System.out.println();
      System.out.println("Solution1");
      for(Integer i=0;i<a.length;i++){
        for(Integer j=0;j<a.length;j++){
          if(a[i]+a[j] == total){
            System.out.println(a[i]+" & "+a[j]+" Addition is "+total);
          }
        }
      }
      //Solution 2
      System.out.println();
      System.out.println("Solution2");
      List<Integer> l = Arrays.asList(a);
      l.stream().forEach(i->{
        l.stream().forEach(j->{
          if(i+j == total){
            System.out.println(i+" & "+j+" Addition is 10");
          }
        });
      });
    }
  }
  public static void printPersonIDs(List<Person> personList){
    
    if(personList != null){
      System.out.println();
      System.out.println("Loggical 2");
      System.out.println("Person ID Details With Comma Separated Values :");
      System.out.println();
      System.out.println("Solution 1");
      StringBuffer s = new StringBuffer("");
      //Solution 1
      personList.stream().forEach(p->{
        s.append(p.getPersonID()+",");
      });
     if(s!=null && !"".equals(s)){
       s.deleteCharAt(s.length() - 1);
     }
     System.out.println(s);
      
      //Solution 2
      System.out.println();
      System.out.println("Solution 2");
      List<String> idList = personList.stream().map(p->String.valueOf(p.getPersonID())).collect(Collectors.toList());
      String ids = idList.stream().collect(Collectors.joining(","));
      System.out.println(ids);
    }
  }
  
  
  
  public static void main(String[] args) {
    //Loggical 1
    Integer[] i = {1,3,5,7,9,10};
    isAddition10(i,10);
    
    //Loggical 2
    List<Person> l = new ArrayList<Person>();
    l.add(new Person(1,"Chintu1",27));
    l.add(new Person(2,"Chintu2",27));
    l.add(new Person(3,"Chintu3",27));
    l.add(new Person(4,"Chintu4",27));
    l.add(new Person(35,"Chintu4",27));
    l.add(new Person(20,"Chintu4",27));
    printPersonIDs(l);
    
   	//Loggical 3
    System.out.println();
    System.out.println("Loggical 3");
    System.out.println("Sorting By Person ID Ascennding Order");
    System.out.println();
    Collections.sort(l, (p1,p2)->Integer.valueOf(p1.getPersonID()).compareTo(Integer.valueOf(p2.getPersonID())));
    l.stream().forEach(k->{
      System.out.println(k.getPersonID());
    });
    
    
    HashSet<Person> hs = new HashSet<Person>();
    Person p = new Person(1,"Chintu1",27);
    hs.add(p);
    p.setPersonID(2);
    hs.add(p);
    hs.stream().forEach(j->{
      System.out.println(j);
    });
    
  }
  
}
