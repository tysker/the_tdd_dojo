```


______                _     _
| ___ \              | |   (_)
| |_/ /  __ _  _ __  | | __ _  _ __    __ _
| ___ \ / _` || '_ \ | |/ /| || '_ \  / _` |
| |_/ /| (_| || | | ||   < | || | | || (_| |
\____/  \__,_||_| |_||_|\_\|_||_| |_| \__, |
                                       __/ |
                                      |___/


```

This kata explores a **banking system** with deposits, withdrawals, and printed account statements.
It is intentionally more advanced and typically involves:

- **mocking date providers**
- **collaborating classes** (Account → TransactionRepository → StatementPrinter)
- **tracking state over time**
- **reversing transaction order** for printing

Solve it when you feel confident with TDD beyond simple state changes.

---

## 🎯 Objective

Implement a minimal banking application capable of:

- recording deposits
- recording withdrawals
- printing a **statement** showing date, amount, and balance

Everything must be driven by tests — with the help of a mocking framework such as **Mockito**.

---

## 📐 Constraints

1. **Start from the given class signature**
   You _must_ keep this exact public API:

   ```java
   public class Account {
       public void deposit(int amount);
       public void withdraw(int amount);
       public void printStatement();
   }
   ```

2. **You may not add any additional public methods**
   (You may, and should, add private helpers or collaborating classes.)

3. Use **String** for dates and **int/Integer** for amounts
   Avoid unnecessary complexity.

4. Ignore formatting details like column width/alignment
   Only correctness of values and ordering matters.

---

## 📜 Requirements

### **1. Deposit money**

Calling:

```java
account.deposit(1000);
```

should record a **+1000** transaction with the current date.

---

### **2. Withdraw money**

Calling:

```java
account.withdraw(100);
```

should record a **-100** transaction with the current date.

---

### **3. Print statement**

Calling:

```java
account.printStatement();
```

should print a table like:

```
DATE       | AMOUNT  | BALANCE
10/04/2014 | 500.00  | 1400.00
02/04/2014 | -100.00 | 900.00
01/04/2014 | 1000.00 | 1000.00
```

Notes:

- **Most recent transaction first**
  (Reverse chronological order)

- Balance is calculated cumulatively

- Printing goes to the **console** using a printer abstraction

---

## 🧪 TDD & Design Advice

This kata is meant to teach:

### 🧩 Breaking the problem into collaborating components

Typical design (not mandatory):

- `Account` → orchestrates everything
- `TransactionRepository` → stores transactions
- `StatementPrinter` → turns transactions into console output
- `Clock` → provides dates (mocked in tests)

### 🔍 Important TDD patterns here:

- **Mocking the clock** → predictable dates
- **Mocking the printer** → capturing printed output
- Verifying interactions, not just state
- Using small value objects (`Transaction`)

---

## ⭐ Difficulty

**Hard**
Requires understanding of:

- mocking
- designing multi-class systems
- reversing order
- cumulative balances
- clean incremental refactoring
