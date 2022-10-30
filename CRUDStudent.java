import java.util.*;
class Student{
    private int prn;
    private String name;
    private String branch;
    private String year;

    Student(int prn, String name, String branch, String year){
        this.prn = prn;
        this.name = name;
        this.branch = branch;
        this.year = year;
    }

    public int getPRN(){
        return prn;
    }
    public String getNAME(){
        return name;
    }
    public String getBRANCH(){
        return branch;
    }
    public String getYEAR(){
        return year;
    }

    public String toString(){
        return prn+""+name+""+branch+""+year;     
    }
}

class CRUDStudent{
  public static void main(String[] args){
    
    List<Student> c = new ArrayList<Student>();
    Scanner s = new Scanner(System.in);
    Scanner s1 = new Scanner(System.in);
    int ch;
    do{
      System.out.println("1.INSERT");
      System.out.println("2.DISPLAY");
      System.out.println("3.SEARCH");
      System.out.println("4.DELETE");
      System.out.println("5.UPDATE");
      System.out.print("Enter your choice :");
      ch=s.nextInt();
      
      switch(ch){
        case 1:
          System.out.println("Enter PRN :");
          int prn = s.nextInt();
          System.out.print("Enter Name :");
          String name = s1.nextLine();
          System.out.print("Enter Branch :");
          String branch = s1.nextLine();
          System.out.print("Enter Year :");
          String year = s1.nextLine();
          
          c.add(new Student(prn,name,branch,year));
        break;
        case 2:
          System.out.println("------------------------");
          Iterator<Student> i = c.iterator();
          while(i.hasNext()){
            Student e = i.next();
            System.out.println(e);          
          }
          System.out.println("-------------------------");
       break;
       case 3:
          boolean found = false;
          System.out.println("Enter PRN to Search :");
          prn = s.nextInt();
          System.out.println("------------------------");
          i = c.iterator();
          while(i.hasNext()){
            Student e = i.next();
            if(e.getPRN()== prn)  {             
            System.out.println(e);
            found = true;
            }
          }
          if(!found){
            System.out.println("Record not found");
          }
          System.out.println("-------------------------");
       break;
       case 4:
           found = false;
          System.out.println("Enter PRN to Delete :");
          prn = s.nextInt();
          System.out.println("------------------------");
          i = c.iterator();
          while(i.hasNext()){
            Student e = i.next();
            if(e.getPRN()== prn)  { 
              i.remove();
            found = true;
            }
          }
          if(!found){
            System.out.println("Record not found");
          }else{
            System.out.println("Record is deleted sucessfully..........!");
          }
          System.out.println("-------------------------");
       break;
       case 5:
           found = false;
          System.out.println("Enter PRN to Upadate :");
          prn = s.nextInt();
          ListIterator<Student>li = c.listIterator();
          while(li.hasNext()){
            Student e = li.next();
            if(e.getPRN()== prn)  { 
              System.out.print("Enter new Name:");
              name = s1.nextLine();
              
              System.out.print("Enter new Branch:");
              branch = s1.nextLine();
              
              System.out.print("Enter new Year:");
              year = s1.nextLine();
              li.set(new Student(prn,name,branch,year));
              found = true;
            }
          }
          if(!found){
            System.out.println("Record not found");
          }else{
            System.out.println("Record is Updated sucessfully..........!");
          }
       break;
      }
    }while(ch!=0);
  }
}


