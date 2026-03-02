# Mobile Phone Simulation System

A console-based Java application that simulates a basic smartphone system, including SIM card management, contact handling, load balance, messaging, and calling features.
Built to demonstrate my understanding about Object-Oriented Programming concepts such as Encapsulation, Inheritance, Aggregation, handling edge cases, error handling, etc.

This project was developed as a **Laboratory Quiz during Midterm** in our **Object-Oriented Programming (OOP)** course.

---

## Case Scenario
A mobile phone simulation system is designed to demonstrate Object-Oriented Programming class relationship concepts. The system allows the creation of different types of smartphones, specifically AndroidPhone or iOSPhone. Each smartphone can hold one SIM card, which is responsible for storing contacts, managing load balance, sending messages, and making calls. Contacts can only be saved through the SIM card and not directly on the phone. The SIM card allows adding and removing contacts, topping up load balance, sending text messages (P1 per message), and making calls (P3 per minute). The smartphone interacts with the SIM card to perform these operations, including showing all saved contacts. Removing the SIM card disables the phone from performing messaging or calling operations until a SIM is reinserted. For testing and demonstration purposes, each operation is labeled as a test case (TC1, TC2, ...).

--- 

## Test Cases
Here are the operations and their expected results: 

| Test Case | Operation | Expected Result |
| :--- | :--- | :--- |
| **TC1** | Create Android or iOS phone | Phone object is created, displays brand if needed |
| **TC2** | Insert SIM | "SIM inserted: Smart Telecom" |
| **TC3** | Add 2 contacts via SIM | "Juan Dela Cruz added to SIM.", "Maria Clara added to SIM." |
| **TC4** | Top-up load P20 | "Load added: P20.0", "Total balance: P20.0" |
| **TC5** | Show contacts | Lists all contacts stored in SIM: 1. Juan Dela Cruz - 09123456789, 2. Maria Clara - 09987654321 |
| **TC6** | Send message + call Juan 4 min | Message sent (P1 deducted), call cost P12, remaining load updated (P7 remaining); shows insufficient load if applicable |
| **TC7** | Remove contact Maria | "Maria Clara removed from SIM." |
| **TC8** | Remove SIM card | "SIM removed: Smart Telecom" |

---

## Run It Online (No Setup Required)

[![Run on Replit](https://replit.com/badge/github/JioPerey/mobile-phone-simulation-system-java)](https://replit.com/github/JioPerey/mobile-phone-simulation-system-java)

---

## OOP Concepts Demonstrated

### 1. Inheritance
`AndroidPhone` and `IOSPhone` both **extend** the `Smartphone` class, inheriting its fields (`brand`, `sim`) and methods (`insertSim()`, `removeSim()`, `hasSim()`). This avoids code duplication and establishes a clear class hierarchy.

### 2. Encapsulation
All class fields are declared as **`private`**, and access is strictly controlled through **getters** (and setters where appropriate). For example, `loadBalance` in `Sim` can only be modified through `topUpLoad()`, `sendMessage()`, and `makeCall()` — never directly.

---

## How to Run Locally

### Prerequisites
- Java JDK 8 or higher installed
- A terminal / command prompt

### Steps

```bash
# 1. Clone the repository
git clone https://github.com/JioPerey/mobile-phone-simulation-system-java.git

# 2. Navigate to the project folder
cd mobile-phone-simulation-system-java

# 3. Compile all Java files
javac *.java

# 4. Run the program
java Main
```

---


##  Developer

**Jio Perey** — March 03, 2026
