# 🔐 Password Manager

The **Password Manager** is a simple desktop application built using Java (NetBeans IDE) with MySQL as the backend. It allows users to securely store, retrieve, update, and manage login credentials for various websites. The application uses Java Swing for the graphical user interface and JDBC for connecting to the database.

---

## 📸 Screenshots

<img width="724" height="560" alt="image" src="https://github.com/user-attachments/assets/d12c78d3-fa7f-458f-8944-865fc12fe2c9" />
<img width="718" height="549" alt="image" src="https://github.com/user-attachments/assets/c531c32d-b220-4952-92af-431b7ba0adff" />
<img width="707" height="522" alt="image" src="https://github.com/user-attachments/assets/8d031e32-09f6-48e1-a3f2-e2f2cad6666d" />
<img width="715" height="543" alt="image" src="https://github.com/user-attachments/assets/66c50ca1-ab30-451f-bf4b-b184a3244e4e" />


---

## 🔧 Tech Stack

- **Java** (Swing for GUI)
- **NetBeans IDE**
- **MySQL** (as the backend database)
- **JDBC** (Java Database Connectivity)

---

## 🎯 Features

- ➕ Add and save login credentials (website, username, password)
- 🖊️ Edit and update existing records
- ❌ Delete saved credentials from the database
- 🔍 Search credentials by website name
- 🖥️ User-friendly desktop interface

---

## 🗃️ Database Schema

You can use the following SQL script to create the required table:

```sql
CREATE DATABASE IF NOT EXISTS password_manager;

USE password_manager;

CREATE TABLE IF NOT EXISTS credentials (
    id INT PRIMARY KEY AUTO_INCREMENT,
    website VARCHAR(255) NOT NULL,
    username VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL
);
```
