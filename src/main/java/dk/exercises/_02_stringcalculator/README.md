```


 _____  _          _
/  ___|| |        (_)
\ `--. | |_  _ __  _  _ __    __ _
 `--. \| __|| '__|| || '_ \  / _` |
/\__/ /| |_ | |   | || | | || (_| |
\____/  \__||_|   |_||_| |_| \__, |
                              __/ |
                             |___/
 _____         _               _         _
/  __ \       | |             | |       | |
| /  \/  __ _ | |  ___  _   _ | |  __ _ | |_   ___   _ __
| |     / _` || | / __|| | | || | / _` || __| / _ \ | '__|
| \__/\| (_| || || (__ | |_| || || (_| || |_ | (_) || |
 \____/ \__,_||_| \___| \__,_||_| \__,_| \__| \___/ |_|




```

The String Calculator kata is a classic TDD exercise created by Roy Osherove.
It focuses on growing complexity step-by-step while keeping the code clean, expressive, and test-driven.

---

## 🎯 Objective

Create a small calculator with a single method:

```java
int add(String numbers)
```

The method takes a string of numbers and returns their sum, following increasingly complex rules.

---

## 📜 Requirements

### **1. Base case: up to two numbers separated by commas**

The method should handle:

- `""` → `0`
- `"1"` → `1`
- `"1,2"` → `3`

**Notes:**

- Start with the _simplest_ possible failing test (empty string).
- Add one rule at a time (first “1”, then “1,2”).
- After each green phase, **refactor**.

---

### **2. Handle an unknown amount of numbers**

Strings such as `"1,2,3,4,5"` should work.

---

### **3. Support newlines as separators (in addition to commas)**

Examples:

- `"1,2\n3"` → `6`

Invalid input like:

- `"2,\n3"`

does **not** need explicit handling — unspecified behavior is fine.

---

### **4. Do not allow a trailing separator**

Examples:

- `"1,2,"` → should throw **an error** (or exception)

Trailing commas must be rejected.

---

### **5. Support custom delimiters**

If the string begins with a delimiter definition:

```
"//[delimiter]\n[numbers]"
```

Examples:

- `"//;\n1;3"` → `4`
- `"//|\n1|2|3"` → `6`
- `"//sep\n2sep5"` → `7`
- `"//|\n1|2,3"` → invalid
  Should produce the message:

  ```
  '|' expected but ',' found at position 3.
  ```

---

### **6. Negatives must raise an error**

Calling `add` with negative numbers returns:

```
Negative number(s) not allowed: <numbers>
```

Examples:

- `"1,-2"` →
  `Negative number(s) not allowed: -2`

- `"2,-4,-9"` →
  `Negative number(s) not allowed: -4, -9`

---

### **7. Multiple errors must be combined**

If the input has more than one error, return **all error messages separated by newlines**.

Example:

Input:

```
//|\n1|2,-3
```

Output:

```
Negative number(s) not allowed: -3
'|' expected but ',' found at position 3.
```

---

### **8. Ignore numbers larger than 1000**

- `"2,1001"` → `2`

---

## 🧪 TDD Advice

Grow the solution incrementally:

- Write only one failing test at a time
- Make it pass with minimal code
- Refactor aggressively
- Use helper methods once duplication appears
- Keep parsing logic readable and intention-revealing

---

## ⭐ Difficulty

**Medium → Hard**
(Several layers of parsing, validation, and error handling.)
