# Complaint Management System

## Overview

The Complaint Management System is a web-based application that allows users to submit, track, and manage complaints efficiently. Administrators can review complaints, update their status, and monitor the resolution process.

## Features

### User Features
- User Registration
- User Login
- Submit Complaints
- View Complaint Status
- Track Complaint History

### Admin Features
- Admin Login
- View All Complaints
- Update Complaint Status
- Manage Users
- Resolve or Reject Complaints

## Technology Stack

### Backend
- Java
- JDBC
- Oracle Database
- HTTP Server (`com.sun.net.httpserver`)

### Database
- Oracle XE

### Frontend
- HTML
- CSS
- JavaScript

## Project Structure

```text
ComplaintManagementSystem/
│
├── Main.java
├── MainHandler.java
├── DBConnection.java
├── UserDAO.java
├── ComplaintDAO.java
│
├── login.html
├── register.html
├── dashboard.html
├── complaint.html
│
├── style.css
│
├── ojdbc11.jar
│
└── README.md
```

## Database Schema

### USERS Table

```sql
CREATE TABLE USERS (
    ID NUMBER PRIMARY KEY,
    NAME VARCHAR2(100),
    EMAIL VARCHAR2(100),
    PASSWORD VARCHAR2(100)
);
```

### COMPLAINTS Table

```sql
CREATE TABLE COMPLAINTS (
    ID NUMBER PRIMARY KEY,
    TITLE VARCHAR2(200),
    DESCRIPTION VARCHAR2(1000),
    STATUS VARCHAR2(50),
    USER_ID NUMBER
);
```

## Prerequisites

- JDK 21 or later
- Oracle Database XE
- SQL*Plus
- ojdbc11.jar

## Setup Instructions

### 1. Clone the Repository

```bash
git clone <repository-url>
cd ComplaintManagementSystem
```

### 2. Configure Database

Create the required tables in Oracle Database.

Update database credentials in the database connection file:

```java
String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
String username = "system";
String password = "your_password";
```

### 3. Compile the Project

Windows:

```bash
javac -cp ".;ojdbc11.jar" *.java
```

Linux/Mac:

```bash
javac -cp ".:ojdbc11.jar" *.java
```

### 4. Run the Application

```bash
java -cp ".;ojdbc11.jar" Main
```

## Default Admin Account

```text
Email: admin@gmail.com
Password: admin123
```

(Ensure the admin user exists in the USERS table.)

## Application Workflow

1. User registers an account.
2. User logs in.
3. User submits a complaint.
4. Complaint is stored in Oracle Database.
5. Admin reviews the complaint.
6. Admin updates the complaint status.
7. User tracks the complaint progress.

## Future Enhancements

- Email Notifications
- File Upload Support
- Complaint Categories
- Dashboard Analytics
- Role-Based Access Control
- REST API Integration

## Screenshots

Add screenshots of:
- Login Page
- Registration Page
- User Dashboard
- Complaint Submission Page
- Admin Dashboard

## Author

Developed as a Complaint Management System project using Java and Oracle Database.
