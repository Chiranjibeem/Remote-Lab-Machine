
class Person {
  
  private int personID;
  
  private String personName;
  
  private int personAge;
  
  
  public void setPersonID(int personID){
    this.personID = personID;
  }
  
  public int getPersonID(){
    return personID;
  }
  
   public String getPersonName(){
    return personName;
  }
  
   public int getPersonAge(){
    return personAge;
  }
  
  public Person(int personID,String personName,int personAge)
  {
    this.personID= personID;
    this.personName= personName;
    this.personAge= personAge;
  }
  
  public String toString(){
    return "["+ "-> "+ String.valueOf(personID)+" "+personName+" "+String.valueOf(personAge) + "<-"+ "]";
  }
    
}
