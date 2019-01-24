import java.io.*;
import java.util.*;
class Student
{
	String firstName;
    String lastName;
    Address addr;
    Date dob;
    String skills;	
    Qualification qual;
    Project pr;
    String eMail;
    String contactNo;

      
    Student(String firstName,String lastName,String eMail,String contactNo,String line1,String line2,String city,String state,int pinCode,String qualName, String  university , String institute,  float cgpa,String name, String role, int startDate,int endDate ,int dateofBirth)
    {
        this.firstName= firstName;
        this.lastName=lastName;
        this.eMail=eMail;
        this.contactNo=contactNo;
        this.addr = new Address(line1,line2,city,state,pinCode);
        this.qual=new Qualification(qualName, university , institute, cgpa);
        this.pr=new Project(name, role);
        this.dob= new Date( startDate,endDate , dateofBirth);
        
   }
   public void setFN(String firstName) 
   {   
      this.firstName= firstName;
   }
   public String getFN()
   {
   	return firstName;
   }
   public void setLN(String lastName) 
   {   
      this.lastName= lastName;
   }
   public String getLN()
   {
   	return lastName;
   }
   public void setEmail(String eMail) 
   {   
      this.eMail= eMail;
   }
   public String getEmail()
   {
   	return eMail;
   }
   public void setContactno(String contactNo) 
   {   
      this.contactNo= contactNo;
   }
   public String getContactno()
   {
   	return contactNo;
   }
    public void setSkills(String skills)
    {
     //for(int i=0; i<a ; i++)
     
     	skills=skills;
    }
     public String getSkills()
     {
      	return skills;
    }

     public void displaySDetails()
     {
        System.out.println("the personal details of the student is : " + "First Name is =\n" + firstName + "lastName is =" + lastName +
           "Email is= "  + eMail + " Contact No. is  =" +  contactNo );

     }
      

} 