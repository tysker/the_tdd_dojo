```


_____  _            ______
|  ___|(_)           | ___ \
| |_    _  ____ ____ | |_/ / _   _  ____ ____
|  _|  | ||_  /|_  / | ___ \| | | ||_  /|_  /
| |    | | / /  / /  | |_/ /| |_| | / /  / /
\_|    |_|/___|/___| \____/  \__,_|/___|/___|



```

FizzBuzz is one of the classic programming exercises and an excellent entry point into **Test-Driven Development (TDD)**.
Even though the task is small, it teaches the core habits of incremental design:

- start with a failing test
- write only the minimal implementation
- continuously refactor

---

## 🎯 Objective

Implement a `fizzBuzz` (or `convert`) method that takes an integer and returns the correct FizzBuzz result as a **String**.

---

## 📜 Requirements (The Rules)

1. The method should return the **number itself** as a string.
   Example: `1 → "1"`

2. For multiples of **three**, return `"Fizz"`.

3. For multiples of **five**, return `"Buzz"`.

4. For multiples of **both three and five**, return `"FizzBuzz"`.

---

## 🧪 Work in TDD Steps

You should structure the implementation in small cycles:

**Step 1: Start with the simplest rule**
Write the first failing test:

> “returns the number as string when not divisible by 3 or 5”

Then make it pass.

**Step 2: Add tests for Fizz and Buzz**
One failing test at a time.

**Step 3: Add the combined rule**
Test the “FizzBuzz” case last.

---

## 📝 Notes & Advice

- Start with the **minimal failing solution** — do not skip ahead.
- After each green test, **refactor** both code and tests:
  - remove duplication
  - simplify logic
  - keep naming clear

- Follow the requirements literally—your tests should match them exactly.
- It’s about **discipline**, not speed.

---

## 💡 Example Test Case Ideas

(Not the implementation — just hints.)

- `convert(1)` should return `"1"`
- `convert(3)` → `"Fizz"`
- `convert(5)` → `"Buzz"`
- `convert(15)` → `"FizzBuzz"`

---

## ⭐ Difficulty

**Easy**, perfect warm-up kata for getting comfortable with TDD.

---

If you want, I can generate:

- The same style README for **all 7 katas**
- OR a unified header/logo for the whole repo
- OR a small SVG/logo that looks nicer than ASCII

Just tell me which direction you want to go next.
simple exercise but an excellent one to start

as a String.
