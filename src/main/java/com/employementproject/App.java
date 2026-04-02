package com.employementproject;

import java.util.List;
import java.util.Scanner;

import com.employementproject.dao.EmployeeDAOImpl;
import com.employementproject.model.Employee;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //DbConnection.getConnection();

        Scanner s = new Scanner(System.in);
        EmployeeDAOImpl em = new EmployeeDAOImpl();
        Employee e1;
        System.out.println("enter the choice");
        System.out.println("1.Add employee\n 2.Display the details\n 3.upadte the salary\n4.delete the value");
        int choice = s.nextInt();
        s.nextLine();

        switch(choice) {
            case 1:
                System.out.println("Enter the name");
                String name = s.next();
                System.out.println("Enter the salary");
                double salary=s.nextDouble();
                s.nextLine();
                System.out.println("Enter the department");
                String departmant=s.nextLine();
                e1 = new Employee(name, salary, departmant);
                em.addEmployee(e1);
                
                
                break;
            case 2:
                System.out.println("Display Employee details");
                
                List<Employee> empList=em.getAllEmployees();
                for(Employee e:empList){
                    System.out.println("Id:"+e.getId());
                    System.out.println("Name:"+e.getName());
                    System.out.println("Salary:"+e.getSalary());
                    System.out.println("Department Name:"+e.getDepartment());
                    break;


                }
            case 3:
                System.out.println("enter the id to upaded");
                int id=s.nextInt();
                s.nextLine();
                System.out.println("Enter the updated salary ");
                double salary1 = s.nextDouble();
                s.nextLine();
                em.updateEmployee(id, salary1);
                break;
            case 4:
                System.out.println("enter the id to deleted");
                int id1=s.nextInt();
                s.nextLine();
                em.deleteEmployee(id1);
                break;

            default:
                System.out.println("Invalid choice");
        }

        s.close();
    }

}
