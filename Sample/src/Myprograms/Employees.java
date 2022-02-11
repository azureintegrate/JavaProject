package Myprograms;
 
import java.util.*;
 
class Employee{
    public int id;
    public String name;
    public int age;
    public String add;
    public String gender;
    public static int count = 0;
 
    //zero argument constructor. Gets called by default when an object is created for the Employee class
    public Employee(){}
 
    //Parameterized Constructor
    public Employee(int id, String name,int age,String add,String gender)
    {
        super();
        this.id = id;
        this.name = name;
        this.age=age;
        this.add=add;
        this.gender=gender;
        count++;
    }
 
    public int getId() {
    return id;
    }
 
    public String getName() {
    return name;
    }
    public int getAge() {
        return age;
        }
 
    public String getAddress() {
    return add;
    }
    public String getGender() {
        return gender;
        }
}
 
public class Employees {
public static void main(String[] args) throws Exception 

   {
	List<Employee> list = new ArrayList<Employee>();
 
     list.add(new Employee(1, "Ravi",18,"Chennai","male"));
     list.add(new Employee(2, "Priya",24,"Mumbai","female"));
     list.add(new Employee(3, "Vini",25,"Bangalore","female"));
     list.add(new Employee(4, "Ram",30,"Madurai","male"));
     
 
        for (Employee s : list) //Iterates as long as there are elements in the list. An object s is created of type Employee class.
        {
            System.out.print("ID, Name, Age, Address and Gender of the employee are : ");
            System.out.println(s.getId()+" "+s.getName()+" "+s.getAge()+" " +s.getAddress()+" "+s.getGender());
        }
        
        
    }//End of main() method
}//end of DisplayArrayList class