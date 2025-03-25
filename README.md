# **Pet Adoption Management System**  

## **Overview**  
This project is a **Pet Adoption Management System** developed using **Java, XHTML, and SQL**. It provides functionalities to manage pet adoption records, users, and pet details efficiently.  

## **Features**  
- **User Management**: Add and manage users adopting pets.  
- **Pet Information**: Store and retrieve pet details.  
- **Adoption Records**: Track and manage adoption details.  
- **Database Integration**: Uses SQL for storing and retrieving data.  

## **Project Structure**  
```
├── src/
│   ├── Adoptiondetails.java      # Handles pet adoption details
│   ├── ApplicationConfig.java    # Application configuration settings
│   ├── BusinessLogicResource.java  # Core business logic
│   ├── BusinessLogicsResource.java # Additional business logic
│   ├── Pet.java                  # Pet entity model
│   ├── User.java                 # User entity model
├── web/
│   ├── List of Users.xhtml        # Displays list of users
│   ├── New User Added.xhtml       # Confirmation page for new user
│   ├── index.xhtml                # Main UI page
├── database/
│   ├── pet.sql                    # Database schema and queries
```

## **Setup Instructions**  
### **Prerequisites**  
- Java JDK  
- Apache Tomcat / Any Java Web Server  
- MySQL or any SQL-supported database  

### **Steps to Run**  
1. Clone this repository.  
2. Set up the database using `pet.sql`.  
3. Configure the database connection in `ApplicationConfig.java`.  
4. Deploy the application on a Java web server.  
5. Access the UI via `index.xhtml`.  

## **Technologies Used**  
- **Backend**: Java (Servlets & JSP)  
- **Frontend**: XHTML  
- **Database**: MySQL  

## **Contributors**  
- **[@salin1771](https://github.com/salin1771)**  

