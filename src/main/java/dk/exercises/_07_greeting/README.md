# ✨ KATA 7 — The Greeting Kata

```


 _____                    _    _
|  __ \                  | |  (_)
| |  \/ _ __   ___   ___ | |_  _  _ __    __ _
| | __ | '__| / _ \ / _ \| __|| || '_ \  / _` |
| |_\ \| |   |  __/|  __/| |_ | || | | || (_| |
 \____/|_|    \___| \___| \__||_||_| |_| \__, |
                                          __/ |
                                         |___/


```

This kata explores string formatting, branching logic, collections, and progressively complex input patterns — all driven through TDD.
It is one of the most well-known “refactoring growth” katas and an excellent test of incremental design.

---

## 🎯 Objective

Write a method:

```java
String greet(...)
```

that returns personalized greetings depending on the input rules.

The input may be:

- a single name
- `null`
- multiple names
- shouted names
- names containing commas
- names with escaped commas

Each new requirement builds on the previous ones.

---

## 📜 Requirements

### **Requirement 1 — Basic Greeting**

```
greet("Bob") → "Hello, Bob."
```

Insert the name into a simple greeting.

---

### **Requirement 2 — Null Handling**

If the name is `null`, use a friendly fallback:

```
greet(null) → "Hello, my friend."
```

---

### **Requirement 3 — Shouting**

If the input name is entirely **uppercase**, you must shout back:

```
greet("JERRY") → "HELLO JERRY!"
```

Note:

- No punctuation period
- Ends with an exclamation mark

---

### **Requirement 4 — Two Names**

If the input is two names:

```
greet(["Jill", "Jane"]) → "Hello, Jill and Jane."
```

Use _and_ between the names.

---

### **Requirement 5 — Arbitrary Number of Names**

If more than two names appear:

- separate with commas
- use an Oxford comma before the last name

Example:

```
greet(["Amy", "Brian", "Charlotte"])
→ "Hello, Amy, Brian, and Charlotte."
```

---

### **Requirement 6 — Mix Normal & Shouted Names**

If some names are shouted (ALL CAPS):

- create **two separate greetings**:
  - one normal
  - one shouted

Order:

1. Normal greeting
2. Shouted greeting (prefixed with AND)

Example:

```
greet(["Amy", "BRIAN", "Charlotte"])
→ "Hello, Amy and Charlotte. AND HELLO BRIAN!"
```

---

### **Requirement 7 — Split Names Containing Commas**

If any entry contains a comma, treat it as **multiple names**.

Example:

```
greet(["Bob", "Charlie, Dianne"])
→ "Hello, Bob, Charlie, and Dianne."
```

This allows inputs like:

- `"Charlie, Dianne"`
- `"John, Paul, George, Ringo"`

---

### **Requirement 8 — Escaped Commas**

If a name is surrounded with double quotes, do **NOT** split it.

This mirrors CSV parsing behavior.

Example:

```
greet(["Bob", "\"Charlie, Dianne\""])
→ "Hello, Bob and Charlie, Dianne."
```

Meaning:

- `"\"Charlie, Dianne\""` stays as **one** name: `Charlie, Dianne`

---

## 🧪 TDD Guidance

Grow your design through small steps:

1. Start with the simple single-name greeting
2. Add null handling
3. Add shouting
4. Add 2-name lists
5. Grow to arbitrary-length lists
6. Add separation of shouted vs normal names
7. Introduce comma splitting
8. Add CSV-style escaped commas

Key points for good design:

- Write helper methods early (e.g., `isShouting`, `splitName`, `joinNames`)
- Keep greeting building logic readable and intention-revealing
- Separate **parsing** from **formatting**, at least conceptually
- Write tests for ordering, punctuation, and edge cases

---

## ⭐ Difficulty

**Medium → Advanced**
This kata becomes pleasantly challenging once lists and escaped names enter the picture.
