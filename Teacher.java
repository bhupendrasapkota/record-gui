
/**
 * Write a description of class Teacher here.
 *
 * @author (BHUPENDRA SAPKOTA)
 * @version (2.1)
 */

public class Teacher
{
    //Created a Variables for Class Teacher
    
    private int teacher_id;                     //Unique ID for the teacher.
    private String  teacher_name;               //Unique Name for the teacher.
    private String  address;                    //Unique Address for the teacher.
    private String  working_types;              //Unique Working_Types for the teacher.
    private String  employment_status;          //Unique Employment_Status for the teacher.
    private int     working_hours;              //Unique Working_Hours for the teacher.

    
    //Created a Constructor to Initialize the Teacher Object.
    
    public Teacher(int teacher_id, String teacher_name, String address, String working_types,
    String employment_status)
    {
        //Assigning the Values to passes as Arguments to the constructor to the respective instance
        //variable of the teacher Object.
        
        this.teacher_id = teacher_id;
        this.teacher_name = teacher_name;
        this.address = address;
        this.working_types = working_types;
        this.employment_status = employment_status;
        this.working_hours=0;                            //Default working_hours set to 0.
    }

    //Using setter method to Update information about the teacher.
    //And
    //Void is used to Set the values in working_hours.
    public void setworking_hours(int working_hours)
    {
        this.working_hours = working_hours;
    }

    //Using getter method to receive information about the teacher.
    public int getteacher_id()
    {
        return this.teacher_id;
    }

    //Using getter method to receive information about the teacher.
    public String getteacher_name()
    {
        return this.teacher_name;
    }

    //Using getter method to receive information about the teacher.
    public String getaddress()
    {
        return this.address;
    }

    //Using getter method to receive information about the teacher.
    public String getworking_types()
    {
        return this.working_types;
    }

    //Using getter method to receive information about the teacher.
    public String getemployment_status()
    {
        return this.employment_status;
    }
    
    //Using getter method to receive information about the teacher.
    public int getworking_hours()
    {
        return this.working_hours;
    }
    
    //Using setter method to set information about the teacher.
    public void setteacher_id(int teacher_id)
    {
        this.teacher_id=teacher_id;
    }

    //Using setter method to set information about the teacher.
    public void setteacher_name(String teacher_name)
    {
        this.teacher_name=teacher_name;
    }

    //Using setter method to set information about the teacher.
    public void setaddress(String address)
    {
        this.address=address;
    }

    //Using setter method to set information about the teacher.
    public void setworking_types(String working_types)
    {
        this.working_types=working_types;
    }

    //Using setter method to set information about the teacher.
    public void setemployment_status(String employment_status)
    {
        this.employment_status=employment_status;
    }

    //Using Method to Display information about the teacher.
    public void display()
    {
        if (working_hours == 0)
        {
            System.out.println("Working_hours" + "  " + "=" + "NOT ASSIGNED");
        } else {
            System.out.println("Working_hours" + " " + "=" + "ASSIGNED");
        }
        System.out.println("Teacher_id" + "=" + teacher_id);
        System.out.println("Teacher_name" + "=" + teacher_name);
        System.out.println("Address" + "=" + address);
        System.out.println("Working_types" + "=" + working_types);
        System.out.println("employment_status" + "=" + employment_status);
    }
}