# Employee-Management-System-using-java-JDBC-
# 📄 Employee Management System using JDBC

## 🔹 Project Overview

This project is a **Java console-based application** that demonstrates how to perform **CRUD operations (Create, Read, Update, Delete)** on a MySQL database using JDBC.

The application allows users to manage employee records such as adding, viewing, updating, and deleting employee details.

---

## 🔹 Objective

To understand and implement database connectivity in Java using JDBC and perform real-world data operations efficiently.

---

## 🔹 Technologies Used

* Java
* JDBC API
* MySQL Database
* IDE: Eclipse / IntelliJ/Vscode

---

## 🔹 Database Configuration

### Create Database:

```sql
CREATE DATABASE employee_db;
```

### Use Database:

```sql
USE employee_db;
```

### Create Table:

```sql
CREATE TABLE employee (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50),
    salary DOUBLE
);
```

---

## 🔹 Project Structure

```
EmployeeJDBCProject/
│
├── src/
│   ├── com/
│   │   ├── util/
│   │   │   └── DbConnection.java
│   │   │
│   │   ├── model/
│   │   │   └── Employee.java
│   │   │
│   │   ├── dao/
│   │   │   └── EmployeeDAO.java
|   |   |    └──  EmployeeDAOImpl.java
│   │   │
│   │   ├── main/
│   │   │   └── App.java
│
├── lib/
│   └── mysql-connector-j.jar
│
└── README.md
```

---

## 🔹 Features

* ➕ Add Employee
* 📋 View All Employees
* ✏️ Update Employee Salary
* ❌ Delete Employee

---

## 🔹 How to Run

1. Clone or download the project
2. Open in Eclipse/IntelliJ/Vscode
3. Add MySQL Connector JAR to build path
4. Configure database credentials in `DbConnection.java`
5. Run `App.java`

---

## 🔹 Sample Menu

```
1. Add Employee
2. View Employees
3. Update Salary
4. Delete Employee
5. Exit
```

---

## 🔹 Key Concepts Covered

* JDBC Connection using DriverManager
* PreparedStatement usage
* ResultSet handling
* CRUD operations
* Basic exception handling

---

## 🔹 Limitations

* Console-based UI
* No input validation
* No advanced error handling
* No layered architecture (Service layer optional)

---

## 🔹 Future Enhancements

* Add input validation
* Implement Service layer
* Use try-with-resources for better resource management
* Add search functionality
* Convert to GUI or Web application

---

## 🔹 Conclusion

This project provides a foundational understanding of how Java applications interact with databases using JDBC and demonstrates essential database operations required in real-world applications.

---

## 🔹 Author

* Sooriyaveena A

---
