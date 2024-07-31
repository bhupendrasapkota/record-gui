
/**
 * Write a description of class Tutor here.
 *
 * @author (BHUPENDRA SAPKOTA)
 * @version (2.1)
 */
//Created a Class Tutor and Extends Teacher [Inheritance Applyed].

public class Tutor extends Teacher
{
    //Created a variables for the Tutor.
    private double     salary;                              //Unique Salary                 for the Tutor.
    private String     specialization;                      //Unique Specialization         for the Tutor.
    private String     academic_qualification;              //Unique Academic_Qualification for the Tutor.
    private int        performance_index;                   //Unique Performance_index      for the Tutor.
    private boolean    is_certified;                        //Unique Is_Certified           for the Tutor.

    //Created a Constructor to initialized a Tutor Object.
    public Tutor(int teacher_id, String teacher_name, String address, String working_types,
                 String employment_status, int working_hours, double salary, String specialization,
                 String academic_qualification, int performance_index)
    {
    super(teacher_id, teacher_name, address, working_types, employment_status);  //Super is used to call a method in a parent class to subclass[child class].
    super.setworking_hours(working_hours);                                       //Super is used to set working_hours of parent class to subclass for using in.
    this.salary = salary;
    this.specialization = specialization;
    this.academic_qualification = academic_qualification;
    this.performance_index = performance_index;
    this.is_certified = false;                                                     //Setting is_Certified as default to false[boolean] form.
    }
    //Using getter method to receive information about the Tutor.
    public double getsalary()
    {
        return this.salary;
    }
    //Using setter method to set information about the Tutor.
     public void setsalary(int salary)
    {
        this.salary=salary;
    }
    //Using getter method to receive information about the Tutor.
    public String getspecialization()
    {
        return this.specialization;
    }
    //Using setter method to set information about the Tutor.
    public void setspecialization(String specialization)
    {
        this.specialization=specialization;
    }
    //Using getter method to receive information about the Tutor.
    public String getacademic_qualification()
    {
        return this.academic_qualification;
    }
    //Using setter method to set information about the Tutor.
    public void setacademic_qualification(String academic_qualification)
    {
        this.academic_qualification=academic_qualification;
    }
    //Using getter method to receive information about the Tutor.
    public int getperformance_index()
    {
        return this.performance_index;
    }
    //Using setter method to set information about the Tutor.
    public void setperformance_index(int performance_index)
    {
        this.performance_index=performance_index;
    }
    //Using setter method to set information about the Tutor for salary .
    public void setsalary(double new_salary, int new_performance_index)
    {
        if(new_performance_index > 5 && super.getworking_hours() > 20)
        {
            double appraisal;
            if (new_performance_index >= 5 && new_performance_index <= 7)
            {
                appraisal = 0.05;
            }
            else if (new_performance_index >= 8 && new_performance_index <= 9)
            {
                appraisal = 0.10;
            }
            else if (new_performance_index == 10)
            {
                appraisal = 0.20;
            }
            else
            {
                System.out.println("Salary won't be approved.");
                return;
            }

            double increment = appraisal * salary;
            salary += increment;
            is_certified = true;
            System.out.println("Salary has been approved.");
            System.out.println("New Salary ="+ salary);
        } else
        {
            System.out.println("Salary has not been approved.");
        }
    }
    
    public void removetutor()
    {
     if(is_certified==true)
 
       {
        super.setteacher_id(0); // from method of parent class Teacher
        super.setteacher_name(""); // from method of parent class Teacher
        super.setaddress(""); // from method of parent class Teacher
        super.setworking_types(""); // from method of parent class Teacher
        super.setemployment_status(""); // from method of parent class Teacher
        super.setworking_hours(0); // from method of parent class Teacher
        this.setsalary(0); // from method of parent class Teacher
        this.setperformance_index(0);
        this.setspecialization("");
        this.setacademic_qualification("");
        System.out.println("Salary has been approved.");
       }
     else
       {
        System.out.print("Salary has not been approved.");
       }
    }
    //display method is create to display the variable data.
    public void display()
    {
    super.display();
    System.out.println("salary =" +salary);
    System.out.println("specialization ="+specialization);
    System.out.println("academic_qualification ="+academic_qualification);
    System.out.println("performance_index ="+performance_index);
    System.out.println("is_certified ="+is_certified);
    }
}