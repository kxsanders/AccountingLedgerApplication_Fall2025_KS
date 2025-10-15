💰 Financial Transaction Tracker (Java Console App)

📖 Overview
This project is a **Accounting Ledger Application** built in Java.  
It allows users to record deposits and payments, store them in a CSV file, and generate detailed reports by time period or vendor.

The application demonstrates core Java concepts such as:
- Object-Oriented Programming (OOP)
- File input/output (reading and writing CSV files)
- Encapsulation and method design
- Exception handling (`try-catch`)
- Working with `LocalDate` and `LocalTime`

---

🧩 Features

🏠 Home Menu
- Add a **Deposit**
- Make a **Payment**
- View the **Ledger**
- Exit the program

📜 Ledger Menu
- View **All Transactions** (Newest → Oldest)
- View **Deposits** only
- View **Payments** only
- Open **Reports Menu**

📊 Reports Menu
- **Month to Date**
- **Previous Month**
- **Year to Date**
- **Previous Year**
- **Search by Vendor**

---

⚙️ How It Works

1. **Transactions are stored** in `src/main/resources/transactions.csv`  
   Each line follows this format: date|time|description|vendor|amount

2. **FileManager** loads existing transactions when the program starts.

3. **TransactionManager** adds new deposits or payments.  
- Deposits are positive amounts.  
- Payments are automatically converted to negative amounts.

4. **Ledger** displays transactions, deposits, or payments (newest first).

5. **Reports** filters transactions by time range or vendor name.

---

## 🧱 Class Overview

| Class | Responsibility |
|-------|----------------|
| `Main` | Controls the main program loop and user navigation |
| `Menu` | Displays menus and handles user input |
| `Transaction` | POJO representing one financial transaction |
| `FileManager` | Handles CSV reading and writing |
| `TransactionManager` | Adds deposits and payments |
| `Ledger` | Displays and filters transactions |
| `Reports` | Generates date- and vendor-based reports |

---

## 🚀 How to Run
1. Open the project in IntelliJ or VS Code.  
2. Run the `Main.java` file.  
3. Follow the on-screen menus to:
   - Add new transactions  
   - View your ledger  
   - Generate reports
