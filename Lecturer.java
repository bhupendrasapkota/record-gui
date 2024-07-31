
/**
 * Write a description of class Lecturer here.
 *
 * @author (BHUPENDRA SAPKOTA)
 * @version (2.1)
 */
//Created a Class Lecturer and Extends Teacher [Inheritance Applyed].

public class Lecturer extends Teacher
{
    //Created a variables for the Lecturer.
    private String department;                 //Unique department for the Lecturer.
    private int years_of_experience;           //Unique years_of_experience for the Lecturer.
    private int graded_score;                  //Unique graded_score for the Lecturer.
    private boolean has_graded;                //Unique has_graded for the Lecturer.

    //Created a Constructor to Initialize the Lecturer Object.
    public Lecturer(int teacher_id, String teacher_name, String address, String working_types, String employment_status,int working_hours,
                    String department,int years_of_experience)
    {
        //variable of the Lecturer Object.
        
        super(teacher_id, teacher_name, address, working_types, employment_status);//Super is used to call a method in a parent class to subclass[child class].
        super.setworking_hours(working_hours);                                     //Super is used to set working_hours of parent class to subclass for using in.
        
        //Assigning the Values to passes as Arguments to the constructor to the respective instance
        this.years_of_experience = years_of_experience;
        this.department=department;
        this.graded_score = 0;                                                     //setting values graded_score default to 0.
        this.has_graded = false;                                                   //setting values has_graded   default to false[boolean].
    }

    /*Using setter method to Update information about the Lecturer.
    And
    Void is used to set the new values in department.*/
    
    public void setdepartment(String department)
    {
        this.department = department;
    }

    /*Using getter method to receive information about the Lecturer.*/
    public String getdepartment()
    {
        return this.department;
    }

    //Using getter method to receive information about the Lecturer.
    public int getyears_of_experience()
    {
        return this.years_of_experience;
    }

    //Using getter method to receive information about the Lecturer.
    public int getgraded_score()
    {
        return this.graded_score;
    }

    //Using getter method to receive information about the Lecturer.
    public boolean gethas_graded()
    {
        return this.has_graded;
    }

    //Using getter method to receive information about the Lecturer.
    public void setgraded_score(int GradeScore)
    {
        this.graded_score = GradeScore;
    }

    public void gradeAssignment(int graded_score, String Student_department,int years_of_experience)
    {
        if (years_of_experience >= 5 && this.department.equals(Student_department))
        {
            if (graded_score >= 70)
            {
                System.out.println("Grade=A");
            }
            else if (graded_score >= 60)
            {
                System.out.println("Grade=B");
            }
            else if (graded_score >= 50)
            {
                System.out.println("Grade=C");
            }
            else if (graded_score >= 40)
            {
                System.out.println("Grade=D");
            }
            else
            {
                System.out.println("Grade=F");
            }
        }
            this.graded_score=graded_score;
            this.has_graded=true;
            
            
            if(has_graded=true)
            {
                System.out.println("Asigned Sucessfully");
            }
            else
            {
                System.out.println("Not Asigned [either graded or not meet requirement]");
            }
            
    }   
    
    //Using Method to Display information about the Lecturer[displayLecturer].
    public void display()
    {
    super.display();
    System.out.println("department =" + department);
    System.out.println("years_of_experience =" + years_of_experience);
    }
    }
