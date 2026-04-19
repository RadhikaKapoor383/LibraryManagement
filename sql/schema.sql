DATABASE:
create database GoodRead;
Table name patrons
+------------+--------------+------+-----+---------+----------------+
| Field      | Type         | Null | Key | Default | Extra          |
+------------+--------------+------+-----+---------+----------------+
| PatronID   | int          | NO   | PRI | NULL    | auto_increment |
| FirstName  | varchar(100) | YES  |     | NULL    |                |
| SecondName | varchar(100) | YES  |     | NULL    |                |
| Email      | varchar(100) | YES  |     | NULL    |                |
| City       | varchar(100) | YES  |     | NULL    |                |
| Contact    | varchar(50)  | YES  |     | NULL    |                |
| Address    | text         | YES  |     | NULL    |                |
| BookTitle  | varchar(200) | YES  |     | NULL    |                |
| borrowDate | timestamp    | YES  |     | NULL    |                |
| endDate    | timestamp    | YES  |     | NULL    |                |
+------------+--------------+------+-----+---------+----------------+
Table name books
+---------------+--------------+------+-----+---------+----------------+
| Field         | Type         | Null | Key | Default | Extra          |
+---------------+--------------+------+-----+---------+----------------+
| sno           | int          | NO   | PRI | NULL    | auto_increment |
| BookID        | varchar(255) | NO   |     | NULL    |                |
| BookTitle     | varchar(255) | NO   |     | NULL    |                |
| Author        | varchar(255) | NO   |     | NULL    |                |
| Publisher     | varchar(255) | YES  |     | NULL    |                |
| Year          | int          | YES  |     | NULL    |                |
| ISBN          | varchar(13)  | YES  |     | NULL    |                |
| NumberOfBooks | int          | YES  |     | NULL    |                |
| Status        | varchar(50)  | YES  |     | NULL    |                |
| Available     | tinyint(1)   | YES  |     | NULL    |                |
+---------------+--------------+------+-----+---------+----------------+
Table name Librarian
+-------------+--------------+------+-----+---------+----------------+
| Field       | Type         | Null | Key | Default | Extra          |
+-------------+--------------+------+-----+---------+----------------+
| librarianID | int          | NO   | PRI | NULL    | auto_increment |
| Username    | varchar(100) | NO   | UNI | NULL    |                |
| Password    | varchar(100) | NO   |     | NULL    |                |
| FirstName   | varchar(100) | NO   |     | NULL    |                |
| SecondName  | varchar(100) | YES  |     | NULL    |                |
| Address     | text         | YES  |     | NULL    |                |
| Email       | varchar(100) | NO   | UNI | NULL    |                |
| City        | varchar(100) | YES  |     | NULL    |                |
| Contact     | varchar(50)  | YES  |     | NULL    |                |
| CNIC        | varchar(20)  | YES  |     | NULL    |                |
+-------------+--------------+------+-----+---------+----------------+
