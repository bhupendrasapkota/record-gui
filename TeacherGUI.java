// Import files --------------------------------------------
import java.awt.*;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

// ----------------------------------------------------------


public class TeacherGUI implements ActionListener
{
    private JTextField txtteacher_id;
    private JTextField txtteacher_id2;
    private JTextField txtteacher_idsalary;
    private JTextField dep;
    private JTextField txtteacher_Name;
    private JTextField txtaddress;
    private JTextField txtwork;
    private JTextField txtemployment_status;
    private JTextField txtworking_hours;
    private JTextField txtworking_hours2;
    private JTextField txtyof;
    private JTextField txtyof3;
    private JTextField txtgrade;
    private JTextField txtdepartment;
    private JTextField txtsalary;
    private JTextField txtsalary1;
    private JTextField txtspacialization;
    private JTextField txtacademic;
    private JTextField txtperformance_index;
    private JTextField txtperformance_index1;
    private JTextField txthasgraded;

    private ArrayList<Teacher> listofteachers = new ArrayList<Teacher>();


    public TeacherGUI()
    {
        JFrame frame = new JFrame();
        frame.setTitle("Record System Form");
        frame.setSize(1410,850);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);  //recheck after words
        frame.getContentPane().setBackground(Color.BLACK);

        //-----------------------panel(0) for heeader-------------------------------------

        JPanel p0 = new JPanel();
        p0.setSize(1360,60);
        p0.setLocation(20,5);
        p0.setBackground(Color.LIGHT_GRAY);
        p0.setLayout(null);
        frame.add(p0); 

        Label header = new Label("RECORD SYSTEM OF TEACHER");
        header.setBounds(450, 10, 500, 40);
        p0.add(header);
        // -------------------------------------------------------------------------------

        // ------------------ font sizing of heading class -------------------------------
        Font fn = new Font("arial", Font.BOLD, 30);
        header.setFont(fn);
        // -------------------------------------------------------------------------------


        // -----------------------------Teacher class -----------------------------------------------------------
        JPanel p1 = new JPanel();
        p1.setSize(450,450);
        p1.setLocation(20,75);
        p1.setBackground(Color.LIGHT_GRAY);
        p1.setLayout(null);
        frame.add(p1);      

        JLabel label = new JLabel();
        label.setText("Teacher Information");
        label.setBounds(150,40,200,20);
        p1.add(label);

        // ------------------------------------------------------------------------------

        JLabel teacher_id = new JLabel("Teacher-Id :");
        teacher_id.setBounds(30,100,100,20);
        p1.add(teacher_id);
        
        txtteacher_id = new JTextField();
        txtteacher_id.setBounds(200, 100, 150, 25);
        p1.add(txtteacher_id);
        
        // -------------------------------------------------------------------------------

        JLabel teacher_Name = new JLabel("Teacher-Name :");
        teacher_Name.setBounds(30,150,100,20);
        p1.add(teacher_Name);

        txtteacher_Name = new JTextField();
        txtteacher_Name.setBounds(200, 150, 150, 25);
        p1.add(txtteacher_Name);

        // -------------------------------------------------------------------------------

        JLabel address = new JLabel("Address :");
        address.setBounds(30,200,100,20);
        p1.add(address);

        txtaddress = new JTextField();
        txtaddress.setBounds(200, 200, 150, 25);
        p1.add(txtaddress);

        // -------------------------------------------------------------------------------

        JLabel work = new JLabel("Working-types :");
        work.setBounds(30,250,100,20);
        p1.add(work);

        txtwork= new JTextField();
        txtwork.setBounds(200, 250, 150, 25);
        p1.add(txtwork);

        // -------------------------------------------------------------------------------

        JLabel employment_status = new JLabel("Employment-Status:");
        employment_status.setBounds(30,300,150,20);
        p1.add(employment_status);

        txtemployment_status = new JTextField();
        txtemployment_status.setBounds(200, 300, 150, 25);
        p1.add(txtemployment_status);

        // -------------------------------------------------------------------------------

        // clear button--------------------------------------------------------------------
        JButton clearall = new JButton("Clear All");
        clearall.setBounds(270, 400, 150, 30);
        p1.add(clearall);

        clearall.addActionListener(this);


        // ------------------------------Lecturer class---------------------------------------------------------

        JPanel p2 = new JPanel();
        p2.setSize(450,450);
        p2.setLocation(475,75);
        p2.setBackground(Color.LIGHT_GRAY);
        p2.setLayout(null);
        frame.add(p2);  


        // ------------------------------------------------------------------------------
        JLabel label2 = new JLabel();
        label2.setText("Lecturer Information");
        label2.setBounds(150,40,200,20);
        p2.add(label2);
         // -----------------------------------------------------------------------------

        JLabel department = new JLabel("Department :");
        department.setBounds(30,100,100,20);
        p2.add(department);
        
        txtdepartment = new JTextField();
        txtdepartment.setBounds(200, 100, 150, 25);
        p2.add(txtdepartment);
        
         // -----------------------------------------------------------------------------

        JLabel yof = new JLabel("Years-Of-Experience :");
        yof.setBounds(30,150,200,20);
        p2.add(yof);

        txtyof = new JTextField();
        txtyof.setBounds(200, 150, 150, 25);
        p2.add(txtyof);

         // ---------------------------------------------------------------------------
        
        JLabel working_hours = new JLabel("Working-Hours :");
        working_hours.setBounds(30,200,350,20);
        p2.add(working_hours);

        txtworking_hours= new JTextField();
        txtworking_hours.setBounds(200, 200, 150, 25);
        p2.add(txtworking_hours);

         // --------------------------------------------------------------------------
        
        JLabel has_graded = new JLabel("Has-Graded :");
        has_graded.setBounds(30,250,100,20);
        p2.add(has_graded);

        txthasgraded= new JTextField("False");
        txthasgraded.setEditable(false);
        txthasgraded.setBounds(200, 250, 150, 25);
        p2.add(txthasgraded);



        // ------button for lecturer and teacher class-----------------------------------------

        JButton AddLecturer = new JButton("Add Lecturer Info");
        AddLecturer.setBounds(75, 400, 150, 30);
        p2.add(AddLecturer);

        AddLecturer.addActionListener(this);

        JButton displayInformation = new JButton("displayLecturerInfo");
        displayInformation.setBounds(250, 400, 150, 30);
        p2.add(displayInformation);

        displayInformation.addActionListener(this);

        //  -------------Tutor class-------------------------------------------------------------------------

        JPanel p3 = new JPanel();
        p3.setSize(450,450);
        p3.setLocation(930,75);
        p3.setBackground(Color.LIGHT_GRAY);
        p3.setLayout(null);
        frame.add(p3);

        // ------------------------------------------------------------------
        JLabel label3 = new JLabel();
        label3.setText("Tutor Information");
        label3.setBounds(160,40,200,20);
        p3.add(label3);
        // ------------------------------------------------------------------


        JLabel working_hours2 = new JLabel("Working-Hours :");
        working_hours2.setBounds(30,300,350,20);
        p3.add(working_hours2);

        txtworking_hours2= new JTextField();
        txtworking_hours2.setBounds(200, 300, 150, 25);
        p3.add(txtworking_hours2);

        JLabel salary = new JLabel("Salary :");
        salary.setBounds(30,100,100,20);
        p3.add(salary);
        
        txtsalary = new JTextField();
        txtsalary.setBounds(200, 100, 150, 25);
        p3.add(txtsalary);
        
        // ------------------------------------------------------------------

        JLabel spacilization = new JLabel("Spacialization :");
        spacilization.setBounds(30,150,200,20);
        p3.add(spacilization);

        txtspacialization = new JTextField();
        txtspacialization.setBounds(200, 150, 150, 25);
        p3.add(txtspacialization);

        // ------------------------------------------------------------------

        JLabel academic = new JLabel("Academic-Qualification :");
        academic.setBounds(30,200,200,20);
        p3.add(academic);

        txtacademic = new JTextField();
        txtacademic.setBounds(200, 200, 150, 25);
        p3.add(txtacademic);

        // ------------------------------------------------------------------

        JLabel performance_index = new JLabel("Performance-Index :");
        performance_index.setBounds(30,250,150,20);
        p3.add(performance_index);
        txtperformance_index= new JTextField();
        txtperformance_index.setBounds(200, 250, 150, 25);
        p3.add(txtperformance_index);

        // ------button for tutor and teacher class-----------------------------------------

        JButton AddTutor = new JButton("Add Tutor Info");
        AddTutor.setBounds(75, 360, 150, 30);
        p3.add(AddTutor);

        // listener for add
        AddTutor.addActionListener(this);



        JButton tutor_info = new JButton("displayTutorInfo");
        tutor_info.setBounds(75, 400, 150, 30);
        p3.add(tutor_info);

        tutor_info.addActionListener(this);

        // ---------------------------------------------------------------------------------

        
        JButton clearTutor = new JButton("Remove Tutor Info");
        clearTutor.setBounds(250, 400, 150, 30);
        p3.add(clearTutor);

        clearTutor.addActionListener(this);
        
        // -------------------------------------------------------------------------------


        // ---------------------------grade-Assignment--------------------------------

        JPanel gradeassignment = new JPanel();
        gradeassignment.setSize(380,260);
        gradeassignment.setLocation(615,530);
        gradeassignment.setBackground(Color.LIGHT_GRAY);
        gradeassignment.setLayout(null);
        frame.add(gradeassignment);

        // -------------------------------------------------------------

        JLabel label4 = new JLabel();
        label4.setText("Grade Assignment");
        label4.setBounds(150,20,200,25);
        gradeassignment.add(label4);

        // ------------------ font sizing of heading class -------------------------------
        Font fn2 = new Font("arial", Font.BOLD, 20);
        label4.setFont(fn2);
        // -------------------------------------------------------------------------------

          // ------------------------------------------------------------------------------

        JLabel teacher_id3 = new JLabel("Teacher-Id :");
        teacher_id3.setBounds(30,50,100,20);
        gradeassignment.add(teacher_id3);

        txtteacher_id2 = new JTextField();
        txtteacher_id2.setBounds(200, 50, 150, 25);
        gradeassignment.add(txtteacher_id2);
        
          // -------------------------------------------------------------------------------
        JLabel Department = new JLabel("Department :");
        Department.setBounds(30,90,100,20);
        gradeassignment.add(Department);
        
        dep = new JTextField();
        dep.setBounds(200, 90, 150, 25);
        gradeassignment.add(dep);

        JLabel grade_score1 = new JLabel("Grade-Score :");
        grade_score1.setBounds(30,130,100,20);
        gradeassignment.add(grade_score1);

        txtgrade = new JTextField();
        txtgrade.setBounds(200, 130, 150, 25);
        gradeassignment.add(txtgrade);

        JLabel yof1 = new JLabel("Years-Of-Experience :");
        yof1.setBounds(30,170,200,20);
        gradeassignment.add(yof1);

        txtyof3 = new JTextField();
        txtyof3.setBounds(200, 170, 150, 25);
        gradeassignment.add(txtyof3);

        JButton gradeAssignment = new JButton("gradeAssignment");
        gradeAssignment.setBounds(200, 200, 150, 30);
        gradeassignment.add(gradeAssignment);

        gradeAssignment.addActionListener(this);

        // ---------------------------------------------------------

                //-------------------------------Set new Salary-------------------------------------

                JPanel newsalary = new JPanel();
                newsalary.setSize(380,260);
                newsalary.setLocation(1000,530);
                newsalary.setBackground(Color.LIGHT_GRAY);
                newsalary.setLayout(null);
                frame.add(newsalary);
        
                // ---------------------------------------------------------------------
        
                JLabel label5 = new JLabel();
                label5.setText("Setting New Salary");
                label5.setBounds(150,20,200,25);
                newsalary.add(label5);
        
                // ------------------ font sizing of heading class -------------------------------
                Font fn1 = new Font("arial", Font.BOLD, 20);
                label5.setFont(fn1);
                // -------------------------------------------------------------------------------
        
                // ------------------------------------------------------------------------------
        
                JLabel teacher_id1 = new JLabel("Teacher-Id :");
                teacher_id1.setBounds(30,50,100,20);
                newsalary.add(teacher_id1);
                
                txtteacher_idsalary = new JTextField();
                txtteacher_idsalary.setBounds(200, 50, 150, 25);
                newsalary.add(txtteacher_idsalary);
                
                // -------------------------------------------------------------------------------
        
                JLabel performance_index1 = new JLabel("New-Performance-Index :");
                performance_index1.setBounds(30,100,150,20);
                newsalary.add(performance_index1);
        
                txtperformance_index1= new JTextField();
                txtperformance_index1.setBounds(200, 100, 150, 25);
                newsalary.add(txtperformance_index1);
        
                JLabel salary1 = new JLabel("New-Salary :");
                salary1.setBounds(30,150,100,20);
                newsalary.add(salary1);
                
                txtsalary1 = new JTextField();
                txtsalary1.setBounds(200, 150, 150, 25);
                newsalary.add(txtsalary1);
        
                JButton SetSalary = new JButton("Set Salary");
                SetSalary.setBounds(200, 200, 150, 30);
                newsalary.add(SetSalary);
        
                SetSalary.addActionListener(this);
        
                // ---------------------------------------------------------------------


        // ---------------------remove tutor------------------------

        JPanel Informationtutor = new JPanel();
        Informationtutor.setSize(180,260);
        Informationtutor.setLocation(220,530);
        Informationtutor.setBackground(Color.LIGHT_GRAY);
        Informationtutor.setLayout(null);
        frame.add(Informationtutor);

        JTextArea textArea1 = new JTextArea();
        textArea1.setText("Tutor Information to Add:\n1. Teacher-Id\n2. Teacher-Name\n3. Teacher-Address\n4. Teacher-Working-Type\n5. Teacher-Employment-Status\n6. Tutor-Salary\n7. Tutor-Specialization\n8. Tutor-Academic-Qualification\n9. Tutor-Performance-Index\n10. Tutor-Working-Hours\n\n\n");
        textArea1.setLineWrap(true);
        textArea1.setEditable(false);
        textArea1.setBackground(Color.LIGHT_GRAY);
        textArea1.setWrapStyleWord(true);
        textArea1.setBounds(0, 0, 220, 300);
        Informationtutor.add(textArea1);


        // -------------------------------------------------------------------------------

        // ---------------------Information Box------------------------

                JPanel InformationBox = new JPanel();
                InformationBox.setSize(350,260);
                InformationBox.setLocation(20,530);
                InformationBox.setBackground(Color.LIGHT_GRAY);
                InformationBox.setLayout(null);
                frame.add(InformationBox);

                JTextArea textArea = new JTextArea();
                textArea.setText("Lecturer Information to Add:\n1. Teacher-Id\n2. Teacher-Name\n3. Teacher-Address\n4. Teacher-Working-Type\n5. Teacher-Employment-Status\n3. Lecturer-Department\n4. Lecturer-Years-Of-Experience\n5. Lecturer-Working-Hours\n\n\n");
                textArea.setLineWrap(true);
                textArea.setEditable(false);
                textArea.setBackground(Color.LIGHT_GRAY);
                textArea.setWrapStyleWord(true);
                textArea.setBounds(0, 0, 200, 300);
                InformationBox.add(textArea);
        
                // ------------------------------------------------------------------------------

                // ---------------------Information Box------------------------

                JPanel Informationremove = new JPanel();
                Informationremove.setSize(210,260);
                Informationremove.setLocation(400,530);
                Informationremove.setBackground(Color.LIGHT_GRAY);
                Informationremove.setLayout(null);
                frame.add(Informationremove);

                JTextArea textArea2 = new JTextArea();
                textArea2.setText("Tutor Information to Remove info:\n\n 1.From  Teacher Information\n    Teacher-id Enter \n    press Remove tutor info");
                textArea2.setLineWrap(true);
                textArea2.setBackground(Color.LIGHT_GRAY);
                textArea2.setEditable(false);
                textArea2.setWrapStyleWord(true);
                textArea2.setBounds(0, 0, 230, 300);
                Informationremove.add(textArea2);
        
                // ------------------------------------------------------------------------------


        frame.setVisible(true);
    }

    //------------------------------------ Main method--------------------------------------
    public static void main(String[] args)
    {
        new TeacherGUI();
    }

    // -----------------------------------EventListener------------------------------------
    public void actionPerformed(ActionEvent ae) 
    {
        if (ae.getActionCommand().equals("Add Lecturer Info")) 
        {
            addLecturer();
        }
        else if (ae.getActionCommand().equals("Add Tutor Info")) 
        {
            addtutor();
        }
        else if (ae.getActionCommand().equals("Clear All")) 
        {
            clearFields();
        }
        else if(ae.getActionCommand().equals("gradeAssignment"))
        {
            gradeAssignment();
        }
        else if (ae.getActionCommand().equals("Set Salary")) 
        {
            setsalary();
        }
        else if (ae.getActionCommand().equals("Remove Tutor Info")) 
        {
            removetutor();
        }
        else if (ae.getActionCommand().equals("displayLecturerInfo")) 
        {
            displayInformation();
        }
        else if (ae.getActionCommand().equals("displayTutorInfo")) 
        {
            displaytutor_info();
        }
    }

    private void addLecturer() 
    {
        try 
        {
            int teacher_id = Integer.parseInt(txtteacher_id.getText().trim());

            if (teacher_id < 0) {
                JOptionPane.showMessageDialog(null, "Please enter a non-negative value for Teacher ID.");
                return; // Exit the method without adding
            }
            
            // Check if teacher_id already exists
            if (isTeacherIdExists(teacher_id)) 
            {
                JOptionPane.showMessageDialog(null, "Teacher ID already exists.");
                return; // Exit the method without adding
            }
            String teacher_name = txtteacher_Name.getText().trim();
            String address = txtaddress.getText().trim();
            String working_types = txtwork.getText().trim();
            String employment_status = txtemployment_status.getText().trim();
            int working_hours = Integer.parseInt(txtworking_hours.getText().trim());
            String department = txtdepartment.getText().trim();
            int years_of_experience = Integer.parseInt(txtyof.getText().trim());
    
            Lecturer lecturer = new Lecturer(teacher_id, teacher_name, address, working_types, employment_status,working_hours,department,years_of_experience);
    
            listofteachers.add(lecturer);
            JOptionPane.showMessageDialog(null, "Lecturer information  is successfully added.");

            clearFields();
            } 
            catch (NumberFormatException e) 
            {
            JOptionPane.showMessageDialog(null, "Please enter valid number.");
        }
    }
    
    private void addtutor() 
    {
        try 
        {
            int teacher_id = Integer.parseInt(txtteacher_id.getText());

            if (teacher_id < 0) {
                JOptionPane.showMessageDialog(null, "Please enter a non-negative value for Teacher ID.");
                return; // Exit the method without adding
            }
            // Check if teacher_id already exists
            if (isTeacherIdExists(teacher_id)) 
            {
                JOptionPane.showMessageDialog(null, "Teacher ID already exists.");
                return; // Exit the method without adding
            }
            String teacher_name = txtteacher_Name.getText();
            String address = txtaddress.getText();
            String working_types = txtwork.getText();
            String employment_status = txtemployment_status.getText();
            int salary = Integer.parseInt(txtsalary.getText());
            String specialization = txtspacialization.getText();
            String academic_qualification = txtacademic.getText();
            int performance_index = Integer.parseInt(txtperformance_index.getText());
            int working_hours = Integer.parseInt(txtworking_hours2.getText());
    
            Tutor tutor = new Tutor(teacher_id, teacher_name, address, working_types, employment_status, working_hours, salary, specialization, academic_qualification, performance_index);
    
            listofteachers.add(tutor);
            JOptionPane.showMessageDialog(null, "Tutor information is successfully added.");
            clearFields();
    
        } 
        catch (NumberFormatException e) 
        {
            JOptionPane.showMessageDialog(null, "Please enter valid number.");
        }
    }
    
    private boolean isTeacherIdExists(int teacherId) 
    {
        for (Teacher teacher : listofteachers) 
        {
            if (teacher.getteacher_id() == teacherId) 
            {
                return true; // ID already exists
            }
        }
        return false; // ID does not exist
    }
    private void displayInformation() 
    {
        try 
        {
            int id = Integer.parseInt(txtteacher_id.getText());
            boolean lecturerFound = false;
            for (Teacher t : listofteachers) {
                if (t instanceof Lecturer && t.getteacher_id() == id) 
                {
                    System.out.println("Lecturer Details:");
                    Lecturer l = (Lecturer) t;
                    l.display();
                    System.out.println("");
                    clearFields();
                    lecturerFound = true;
                    JOptionPane.showMessageDialog(null,"Lecturer Details is Displayed in Terminal");
                    break;
                }
            }
            if (!lecturerFound) 
            {
                JOptionPane.showMessageDialog(null, "No teacher was found.", "Error", JOptionPane.ERROR_MESSAGE);
            } else 
            {
                System.out.println("Lecturer details are displayed in terminal!");
            }
        } catch (NumberFormatException e) 
        {
            JOptionPane.showMessageDialog(null,"Please enter a valid number for teacher ID!");
        } catch (IllegalArgumentException e) 
        {
            JOptionPane.showMessageDialog(null,"Please enter a valid number for teacher ID!");
        }
    }
    
    private void displaytutor_info()
    {
        try 
        {
            int teacher_id = Integer.parseInt(txtteacher_id.getText());
            Teacher teacher = null;
    
            for (Teacher t : listofteachers) 
            {
                if (t.getteacher_id() == teacher_id) 
                {
                    teacher = t;
                    break;
                }
            }
    
            if (teacher != null) 
            {
                if (teacher instanceof Tutor) 
                {
                    System.out.println("Tutor Details:");
                    Tutor tutor = (Tutor) teacher;
                    tutor.display();
                    System.out.println("");
                    JOptionPane.showMessageDialog(null, "Tutor Details is Displayed in Terminal");
                    clearFields();
                }
            else 
            {
                JOptionPane.showMessageDialog(null, "No teacher was found.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            }
        }
        catch (NumberFormatException e) 
        {
            JOptionPane.showMessageDialog(null, "Please enter a valid number.", "Information", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void gradeAssignment() 
    {
        try 
        {
            int teacher_id = Integer.parseInt(txtteacher_id2.getText());
            int graded_score = Integer.parseInt(txtgrade.getText());
            String department = dep.getText();
            int years_of_experience = Integer.parseInt(txtyof3.getText());            
    
            for (Teacher t1 : listofteachers) 
            {
                if (t1.getteacher_id() == teacher_id) 
                {
                    if (t1 instanceof Lecturer) 
                    {
                        Lecturer l1 = (Lecturer) t1;
                        int gradedScoreInt = graded_score;
                        int yearsOfExperienceInt = years_of_experience;
    
                        // Displaying the information based on the condition are met or not
                        if (yearsOfExperienceInt >= 5 && l1.getdepartment().equals(department)) 
                        {
                            l1.gradeAssignment(gradedScoreInt, department, yearsOfExperienceInt);
                            clearFields();
                            JOptionPane.showMessageDialog(null, "Assignments graded successfully!",
                                    "Success", JOptionPane.INFORMATION_MESSAGE);
                            
                            txthasgraded.setText(String.valueOf(l1.gethas_graded()));
                        } 
                        else 
                        {
                            JOptionPane.showMessageDialog(null,
                                    "The assignment cannot be evaluated since the requirement has not been fulfilled.",
                                    "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        clearFields();
                        return;
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "No lecturer found with the provided ID.");
        } 
        catch (NumberFormatException e) 
        {
            JOptionPane.showMessageDialog(null, "Please enter valid numerical data for Grade Score and Years of Experience.");
        }
    }
    
    

    private void setsalary() 
    {
        try 
        {
            int teacher_id = Integer.parseInt(txtteacher_idsalary.getText());
            double new_salary = Double.parseDouble(txtsalary1.getText());
            int new_performance_index = Integer.parseInt(txtperformance_index1.getText());
    
            Teacher teacher = null;
            for (Teacher t : listofteachers) 
            {
                if (t.getteacher_id() == teacher_id) 
                {
                    teacher = t;
                    break;
                }
            }
    
            if (teacher instanceof Tutor) 
            {
                Tutor tutor = (Tutor) teacher;
                tutor.setsalary(new_salary, new_performance_index);
                clearFields();
                JOptionPane.showMessageDialog(null, "Salary has been updated.");
            } 
            else 
            {
                JOptionPane.showMessageDialog(null, "No tutor id was found.");
            }
        } 
        catch (NumberFormatException e) 
        {
            JOptionPane.showMessageDialog(null, "Please enter valid number.");
        }
    }
    
    private void removetutor() {
        try 
        {
            // Get input values
            int teacher_id = Integer.parseInt(txtteacher_id.getText());
    
            // Find the tutor with the given ID
            Tutor tutorToRemove = null;
            for (Teacher teacher : listofteachers) 
            {
                if (teacher instanceof Tutor && teacher.getteacher_id() == teacher_id) 
                {
                    tutorToRemove = (Tutor) teacher;
                    clearFields();
                    break;
                }
            }
    
            if (tutorToRemove != null) 
            {
                tutorToRemove.removetutor(); // Call the removetutor method
                listofteachers.remove(tutorToRemove);
                JOptionPane.showMessageDialog(null, "tutor id was found and removed sucessfully.");

            } 
            else 
            {
                JOptionPane.showMessageDialog(null, "No tutor id was found.");
            }
        } catch (NumberFormatException e) 
        {
            JOptionPane.showMessageDialog(null, "Please enter a valid number.");
        }
    }
    private void clearFields() 
    {
        txtteacher_id.setText("");
        txtteacher_Name.setText("");
        txtaddress.setText("");
        txtwork.setText("");
        txtemployment_status.setText("");
        txtdepartment.setText("");
        txtworking_hours.setText("");
        txtyof.setText("");
        txtgrade.setText("");
        txtdepartment.setText("");
        txtsalary.setText("");
        txtspacialization.setText("");
        txtacademic.setText("");
        txtperformance_index.setText("");
        txtworking_hours2.setText("");
        txtteacher_id2.setText("");
        dep.setText("");
        txtyof3.setText("");
        txtteacher_idsalary.setText("");
        txtperformance_index1.setText("");
        txtsalary1.setText("");
    }
    }