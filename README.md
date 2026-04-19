# 📚 GoodRead Library Management System

A full-featured **desktop Library Management System** built with **Java Swing** and **MySQL**, designed to streamline day-to-day library operations for administrators, librarians, and patrons.

---

## 🖥️ Overview

The **GoodRead Library Management System** provides a complete solution for managing library resources. It supports multi-role access (Admin & Librarian), enabling efficient handling of books, members, and borrowing transactions through an intuitive GUI built with Java Swing and NetBeans.

---

## ✨ Features

### 👨‍💼 Admin Panel
- Secure admin login
- Add, edit, and remove **Librarians**
- Full oversight of all library operations

### 📖 Book Management
- Add new books with full details (Title, Author, Publisher, ISBN, Year)
- Edit and update existing book records
- Track book availability and stock count
- View all books in a searchable table

### 👥 Patron Management
- Register new patrons with personal and contact details
- Edit patron profiles
- Track borrowing history per patron
- Manage borrow dates and return deadlines

### 🏛️ Librarian Portal
- Dedicated librarian login and profile management
- Manage patron records and book checkouts
- View and update book status

### 🔍 Search & View
- Browse all books and filter by availability
- View detailed book and patron profiles

---

## 🗂️ Project Structure

```
LibraryManagement/
│
├── GoodReadLibrary.java       # Main entry point
├── MenuPage.java / .form      # Main menu UI
├── LogInPage.java / .form     # Librarian login
├── AdminLogIn.java / .form    # Admin login
├── Admin.java / .form         # Admin dashboard
│
├── AddBooks.java / .form      # Add new book
├── EditBooks.java / .form     # Edit book details
├── ManageBooks.java / .form   # Book management view
├── ViewBook.java / .form      # View single book
├── ViewingBooks.java / .form  # Browse all books
│
├── AddLibrarian.java / .form  # Add librarian
├── EditLibrarian.java / .form # Edit librarian
├── ManageLibrarian.java/.form # Manage librarians
├── LibProfile.java / .form    # Librarian profile
│
├── AddPatrons.java / .form    # Add new patron
├── EditPatron.java / .form    # Edit patron info
├── ManagePatrons.java / .form # Admin patron view
├── ManagePatronsLib.java/.form# Librarian patron view
├── newPatron.java / .form     # New patron form
├── ViewProfile.java / .form   # View patron profile
│
├── DATABASE QUERIES           # SQL schema & setup
├── build.xml                  # NetBeans Ant build file
└── manifest.mf                # JAR manifest
```

---

## 🗄️ Database Setup

This project uses **MySQL**. Follow the steps below to set up the database.

### 1. Create the Database

```sql
CREATE DATABASE GoodRead;
USE GoodRead;
```

### 2. Create the `books` Table

```sql
CREATE TABLE books (
    sno           INT AUTO_INCREMENT PRIMARY KEY,
    BookID        VARCHAR(255) NOT NULL,
    BookTitle     VARCHAR(255) NOT NULL,
    Author        VARCHAR(255) NOT NULL,
    Publisher     VARCHAR(255),
    Year          INT,
    ISBN          VARCHAR(13),
    NumberOfBooks INT,
    Status        VARCHAR(50),
    Available     TINYINT(1)
);
```

### 3. Create the `patrons` Table

```sql
CREATE TABLE patrons (
    PatronID    INT AUTO_INCREMENT PRIMARY KEY,
    FirstName   VARCHAR(100),
    SecondName  VARCHAR(100),
    Email       VARCHAR(100),
    City        VARCHAR(100),
    Contact     VARCHAR(50),
    Address     TEXT,
    BookTitle   VARCHAR(200),
    borrowDate  TIMESTAMP,
    endDate     TIMESTAMP
);
```

### 4. Create the `Librarian` Table

```sql
CREATE TABLE Librarian (
    librarianID INT AUTO_INCREMENT PRIMARY KEY,
    Username    VARCHAR(100) NOT NULL UNIQUE,
    Password    VARCHAR(100) NOT NULL,
    FirstName   VARCHAR(100) NOT NULL,
    SecondName  VARCHAR(100),
    Address     TEXT,
    Email       VARCHAR(100) NOT NULL UNIQUE,
    City        VARCHAR(100),
    Contact     VARCHAR(50),
    CNIC        VARCHAR(20)
);
```

### 5. Configure the Database Connection

In the source code, locate the database connection class and update the credentials:

```java
String url      = "jdbc:mysql://localhost:3306/GoodRead";
String username = "your_mysql_username";
String password = "your_mysql_password";
```

> 💡 Make sure the **MySQL JDBC Connector (mysql-connector-j)** JAR is added to your project's library classpath in NetBeans.

---

## ⚙️ Prerequisites

| Tool | Version |
|------|---------|
| Java (JDK) | 8 or higher |
| NetBeans IDE | 12+ (recommended) |
| MySQL Server | 5.7 or higher |
| MySQL JDBC Driver | mysql-connector-j |

---

## 🚀 Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/RadhikaKapoor383/LibraryManagement.git
cd LibraryManagement
```

### 2. Set Up the Database

- Open MySQL Workbench or any SQL client
- Run all SQL statements from the [Database Setup](#️-database-setup) section above
- Update the DB credentials in the source code

### 3. Open in NetBeans

- Launch **NetBeans IDE**
- Go to `File → Open Project` and select the `LibraryManagement` folder
- Add the **MySQL JDBC Connector** JAR to the project libraries:
  - Right-click project → `Properties → Libraries → Add JAR/Folder`

### 4. Build & Run

- Click `Run → Run Project` (or press `F6`)
- The application will launch starting at the **Menu Page**

---

## 📸 Application Flow

```
MenuPage
   ├── Admin Login  →  Admin Dashboard
   │                       ├── Manage Librarians (Add / Edit / Remove)
   │                       └── Full System Access
   │
   └── Librarian Login  →  Librarian Dashboard
                               ├── Manage Books    (Add / Edit / View)
                               └── Manage Patrons  (Add / Edit / Borrow / Return)
```

---

## 🛠️ Technologies Used

| Layer | Technology |
|-------|-----------|
| Language | Java |
| GUI Framework | Java Swing (NetBeans Form Editor) |
| IDE | Apache NetBeans |
| Build Tool | Apache Ant (`build.xml`) |
| Database | MySQL |
| DB Connectivity | JDBC (MySQL Connector/J) |

---

## 📄 License

This project is licensed under the terms of the [LICENSE](LICENSE) file included in this repository.

---

## 🙋‍♀️ Author

**Radhika Kapoor**  
GitHub: [@RadhikaKapoor383](https://github.com/RadhikaKapoor383)

---

> ⭐ If you found this project helpful, please consider giving it a star on GitHub!