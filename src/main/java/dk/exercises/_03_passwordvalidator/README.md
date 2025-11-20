```

______                                              _
| ___ \                                            | |
| |_/ /  __ _  ___  ___ __      __  ___   _ __   __| |
|  __/  / _` |/ __|/ __|\ \ /\ / / / _ \ | '__| / _` |
| |    | (_| |\__ \\__ \ \ V  V / | (_) || |   | (_| |
\_|     \__,_||___/|___/  \_/\_/   \___/ |_|    \__,_|


 _   _         _  _      _             _  _
| | | |       | |(_)    | |           | || |
| | | |  __ _ | | _   __| |  __ _   __| || |_   ___   _ __
| | | | / _` || || | / _` | / _` | / _` || __| / _ \ | '__|
\ \_/ /| (_| || || || (_| || (_| || (_| || |_ | (_) || |
 \___/  \__,_||_||_| \__,_| \__,_| \__,_| \__| \___/ |_|



```

This kata focuses on building a small **password validation component** using TDD.
Instead of returning just _true_ or _false_, the validator should tell _exactly why_ a password fails,
and support **multiple simultaneous validation errors**.

This is excellent practice for:

- writing clear validation rules
- combining errors
- expressing domain constraints
- test-first iterative design

---

## 🎯 Objective

Create a function:

```java
ValidationResult validate(String password)
```

Where `ValidationResult` contains:

- `boolean isValid`
- `List<String> errors` (or a joined error message)

Your goal is to validate a password against a set of rules, collecting all failures.

---

## 📜 Requirements

### **1. Minimum length**

Password must be **at least 8 characters**.

If not met:

```
Password must be at least 8 characters
```

---

### **2. Must contain at least 2 numbers**

If not met:

```
The password must contain at least 2 numbers
```

---

### **3. Must support multiple simultaneous errors**

Example:

Input:

```
somepassword
```

Output errors:

```
Password must be at least 8 characters
The password must contain at least 2 numbers
```

Errors should be combined in order and separated by **newlines**.

---

### **4. Must contain at least one capital letter**

If not met:

```
Password must contain at least one capital letter
```

---

### **5. Must contain at least one special character**

If not met:

```
Password must contain at least one special character
```

---

## 🧪 TDD Approach

Work with small steps:

- Write a failing test for the **short password rule**
- Make it pass
- Add tests for **at least 2 digits**
- Make them pass
- Continue with capital letter, special character
- At the end, write tests for _multiple combined errors_
- Refactor once duplication starts appearing

A good design uses small private helper methods:

```java
private boolean hasTwoDigits(String s)
private boolean hasCapitalLetter(String s)
private boolean hasSpecialCharacter(String s)
```

This keeps the validation logic expressive and readable.

---

## ⭐ Difficulty

**Medium** — combining errors, parsing characters, and building a readable result.

---

## 📝 Recommended Output Format

Ideally, your validator returns:

```text
<error1>
<error2>
<error3>
```

And for a valid password:

```java
result.isValid() == true
result.getErrors().isEmpty()
```
