package com.employementproject.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.employementproject.model.Employee;
import com.employementproject.util.DbConnection;

public class EmployeeDAOImpl implements EmployeeDAO{

    @Override
    public boolean addEmployee(Employee e) {
        boolean isAdded=false;
       try {
        Connection con=DbConnection .getConnection();
        String sql="insert into employee(name,salary,department) values(?,?,?)";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1, e.getName());
        ps.setDouble(2,e.getSalary() );
        ps.setString(3,e.getDepartment());
        int rows=ps.executeUpdate();
        if(rows>0){
            isAdded=true;
        System.out.println("Added successfully");
        }
        else{
            System.out.println("Failed to add");

        }
           
       } catch (SQLException el) {
        el.printStackTrace();
       }


        return isAdded;
     
    }

    @Override
    public List<Employee> getAllEmployees() {
        List<Employee> employee=new ArrayList<>();
        Employee e=new Employee();
        String sql="select * from employee";
        try {
            Connection con=DbConnection.getConnection();
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                e.setId(rs.getInt("id"));
                e.setName(rs.getString("name"));
                e.setSalary(rs.getDouble("salary"));
                e.setDepartment(rs.getString("department"));
                employee.add(e);



                
            }


            
        } catch (SQLException e1) {
            e1.printStackTrace();
        }


        return employee;
    }

    @Override
    public boolean updateEmployee(int id, double salary) {
        boolean isUpadted=false;
        String sql="update employee set salary=? where id=?";
        try {
            Connection con=DbConnection.getConnection();
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(2, id);
            ps.setDouble(1, salary);
            int rows=ps.executeUpdate();
             System.out.println(rows);
            if(rows>0){
            isUpadted=true;
           
        System.out.println("Updated successfully");
        }
        else{
            System.out.println("Failed to update");

        }


        } catch (Exception e) {
            e.printStackTrace();
        }
        return isUpadted;
    }

    @Override
    public boolean deleteEmployee(int id) {
        boolean isDeleted=false;
        String sql="delete from employee where id=?";
        try {
            Connection con=DbConnection.getConnection();
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1,id);
            int rows=ps.executeUpdate();
                System.out.println(rows);
                if(rows>0){
                    isDeleted=true;
                    System.out.println("Deleted successfully");
                }
                else{
                    System.out.println("Failed to delete");
                }

        } catch (SQLException e1) {
            e1.printStackTrace();
        }

       return  isDeleted;
    }

}
    