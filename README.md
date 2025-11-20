<p align="center">
  <img width="300" src="https://img.shields.io/badge/The%20TDD%20Dojo-Red%20Green%20Refactor-orange?style=for-the-badge&logo=target&logoColor=white">
</p>

<p align="center">
  <a href="https://github.com/tysker/the_tdd_dojo/actions/workflows/tests.yml">
    <img src="https://github.com/tysker/the_tdd_dojo/actions/workflows/tests.yml/badge.svg" alt="Build & Test Status">
  </a>
    <br/>
    <br/>
  <img src="https://img.shields.io/github/license/tysker/the_tdd_dojo" alt="License">
  <img src="https://img.shields.io/badge/Java-17%2B-red?logo=openjdk&style=flat" alt="Java Version">
</p>

A collection of small, focused Java katas designed to practise **Test-Driven Development** (TDD).  
Each exercise is self-contained, language-agnostic in concept, and structured to reinforce the  
_Red → Green → Refactor_ cycle.

Ideal for teaching, dojos, pair programming, or sharpening your own testing reflexes.

---

## 📚 Table of Contents

1. [About](#about)
2. [Goals](#goals)
3. [Repository Structure](#repository-structure)
4. [Getting Started](#getting-started)
5. [How to Work Through an Exercise](#how-to-work-through-an-exercise)
6. [Exercise List](#exercise-list)
7. [Exercise README Template](#exercise-readme-template)
8. [Contributing](#contributing)
9. [License](#license)

---

## 📖 About

This repository contains a curated set of Java exercises designed to build intuition for TDD:
writing tests first, letting them fail, implementing the smallest possible solution, and
refactoring toward clean, maintainable code.

Every exercise has:

- a dedicated folder
- one or more Java classes to be tested
- a README explaining the problem
- space for you to write tests and implementations gradually

---

## 🎯 Goals

This project helps you:

- practise TDD in small, safe iterations
- understand good test naming and structure
- improve refactoring habits
- build fluency with clean Java code
- explore a variety of problem domains (strings, validation, business logic, parsing, etc.)

---

## 🗂 Repository Structure

```

src
└── main
└── java
└── dk
└── exercises
├── 01-FizzBuzz
├── 02-StringCalculator
├── 03-PasswordValidator
├── 04-SearchFunctionality
├── 05-BarCodes
├── 06-Banking
└── 07-Greeting
└── resources
└── logs / logback.xml

test
└── java
└── dk
└── exercises
└── (tests live here as you write them)

```

Each kata lives inside its own folder under `dk/exercises/`.

---

## 🚀 Getting Started

Clone the repository:

```bash
git clone https://github.com/tysker/the_tdd_dojo.git
cd the_tdd_dojo
```

Make sure you have:

- **Java** (Java 17+ recommended)
- **Maven** (project uses `pom.xml`)
- Your editor or IDE (IntelliJ works beautifully)

Run all tests:

```bash
mvn test
```

Run a single kata’s tests:

```bash
mvn -Dtest="FizzBuzzTest" test
```

---

## 🧪 How to Work Through an Exercise

Every exercise is designed for classic TDD flow:

1. **Read the kata README** inside the exercise folder
2. Write the **first failing test**
3. Implement the **smallest amount of code** to make it pass
4. **Refactor** your code and tests
5. Repeat with the next requirement
6. Commit frequently in small steps

---

## 📘 Exercise List

| #   | Name                 | Folder Name              | Description (short)                                 |
| --- | -------------------- | ------------------------ | --------------------------------------------------- |
| 01  | FizzBuzz             | `01-FizzBuzz`            | Classic FizzBuzz with TDD & incremental rules       |
| 02  | String Calculator    | `02-StringCalculator`    | Add numbers from strings, handle delimiters, errors |
| 03  | Password Validator   | `03-PasswordValidator`   | Validate password strength rules                    |
| 04  | Search Functionality | `04-SearchFunctionality` | Implement simple text search and filtering rules    |
| 05  | Bar Codes            | `05-BarCodes`            | Barcode checking / validation logic                 |
| 06  | Banking              | `06-Banking`             | Simple banking logic (accounts, transactions)       |
| 07  | Greeting             | `07-Greeting`            | Generate greeting messages with formatting rules    |

---

## 📝 Exercise README Template

```markdown
# Exercise Name

## Objective

A short description of the problem and what you are expected to implement.

## Requirements

List of rules, one per line.
Follow incremental TDD steps.

## Hints

- Start with small tests
- Keep refactoring often
- Focus on naming
- Think about edge cases

## Expected Difficulty

Easy / Medium / Hard

## Notes

Any additional clarifications for the student.
```

---

## 🤝 Contributing

To add a new kata:

1. Create a folder using zero-padded numbering:
   `08-NewExercise`
2. Add Java files + a `README.md` with the template above
3. Ensure it compiles
4. Open a pull request

---

## 📄 License

MIT License — free to use, modify, and teach with.
