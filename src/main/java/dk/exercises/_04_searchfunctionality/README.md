# ✨ KATA 4 — Search Functionality

```
   _____                     _        ______                _       _ _
  / ____|                   | |      |  ____|              | |     | | |
 | (___   ___  __ _ _ __ ___| |__    | |__ _   _ _ __   ___| | __ _| | | ___ _ __
  \___ \ / _ \/ _` | '__/ __| '_ \   |  __| | | | '_ \ / __| |/ _` | | |/ _ \ '__|
  ____) |  __/ (_| | | | (__| | | |  | |  | |_| | | | | (__| | (_| | | |  __/ |
 |_____/ \___|\__,_|_|  \___|_| |_|  |_|   \__,_|_| |_|\___|_|\__,_|_|_|\___|_|
```

This kata focuses on implementing a **simple search engine** for city names while practising incremental TDD.
You will build rules step-by-step, beginning with basic prefix matching and moving toward more flexible, case-insensitive search behavior.

---

## 🗂 Prerequisites

Create a collection of city names (your “database”).

You may store them as a `List<String>`:

```
Paris, Budapest, Skopje, Rotterdam, Valencia, Vancouver,
Amsterdam, Vienna, Sydney, New York City, London,
Bangkok, Hong Kong, Dubai, Rome, Istanbul
```

---

## 📜 Requirements

### **1. Ignore searches shorter than 2 characters**

If the search text is fewer than 2 characters → return **no results**.

This is an optimization technique to prevent unnecessary searches.

---

### **2. Basic search: return cities starting with the given text**

If the search text is **2 or more characters**, return all city names that **start with** the given input.

Example:

```
Search: "Va"
→ Valencia, Vancouver
```

---

### **3. Case-insensitive search**

Searching `"va"`, `"Va"`, or `"VA"` should produce the same results.

---

### **4. Partial match search**

The search text should also match **anywhere** within the city name, not only at the beginning.

Example:

```
Search: "ape"
→ Budapest   (because “ape” appears inside the name)
```

---

### **5. Special case: wildcard search**

If the search text is `"*"` → return **all cities**.

This represents “match all” behavior.

---

## 🧪 TDD Advice

Grow your search rules step-by-step:

1. Start with a failing test for returning an empty result when text length < 2
2. Add tests for prefix matching
3. Add case-insensitive tests
4. Add tests for substring matching
5. Finish with the wildcard `"*"` case
6. Refactor early — extract small helpers (e.g., `normalize(String)`)

This kata is great practice in:

- designing small, expressive functions
- handling edge cases
- thinking about how search engines work internally
- ensuring correctness with incremental tests

---

## ⭐ Difficulty

**Medium** — involves conditional logic, text matching, and careful test organization.

---
