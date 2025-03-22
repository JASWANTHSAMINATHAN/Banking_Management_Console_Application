# Banking Management System (Console Application)

## Overview
This is a Java-based console application that simulates a simple banking management system. Users can create savings and current accounts, deposit and withdraw money, transfer funds, and view account details.

## Features
- Open a **Savings Account** or **Current Account**
- Deposit Money
- Withdraw Money
- Transfer Money
- Show Account Details
- Calculate interest for savings accounts
- Exit the program

## Installation & Setup
### Prerequisites
- Install **Java JDK** (version 8 or later)
- Install a code editor (VS Code, IntelliJ IDEA, or Eclipse)

### Steps to Run the Project
1. Clone the repository:
   ```
   git clone https://github.com/yourusername/BankingManagementSystem.git
   ```
2. Navigate to the project folder:
   ```
   cd BankingManagementSystem
   ```
3. Compile the Java files:
   ```
   javac Main.java
   ```
4. Run the application:
   ```
   java Main
   ```

## Usage Guide
Upon running the program, the user is prompted to select an operation:
1. Open Savings Account
2. Open Current Account
3. Deposit Money
4. Withdraw Money
5. Transfer Money
6. Show Account Details
7. Exit

The application provides proper validations to prevent invalid inputs and ensures a smooth user experience.

## Project Structure
```
BankingManagementSystem/
│── Main.java             # Entry point of the application
│── models/
│   ├── Account.java      # Base class for accounts
│   ├── SavingsAccount.java # Savings account with interest calculation
│   ├── CurrentAccount.java # Current account with overdraft functionality
└── README.md             # Project documentation
```

## Future Enhancements
- Add a database to store account details permanently
- Implement GUI for better user interaction
- Introduce authentication for secure access

## License
This project is licensed under the MIT License.

