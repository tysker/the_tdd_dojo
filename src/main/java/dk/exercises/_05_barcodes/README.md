# ✨ KATA 5 — Point of Sale (Barcode Scanner)

```
______                _____             _
| ___ \              /  __ \           | |
| |_/ /  __ _  _ __  | /  \/  ___    __| |  ___  ___
| ___ \ / _` || '__| | |     / _ \  / _` | / _ \/ __|
| |_/ /| (_| || |    | \__/\| (_) || (_| ||  __/\__ \
\____/  \__,_||_|     \____/ \___/  \__,_| \___||___/

```

This kata models a **supermarket barcode scanner**, where each scanned barcode should return either a product price or an appropriate error message.
You will also extend the system to handle multiple scans and calculate a running total — a step toward a real Point-of-Sale (POS) system.

---

## 🎯 Objective

Build a function or class that:

- accepts a barcode
- returns either the price or an error
- supports scanning **multiple** items
- displays the **total** price when requested

The kata encourages clean condition handling, dictionary lookups, and careful incremental TDD.

---

## 📜 Requirements

### **1. Known barcode prices**

The system should recognize two barcodes:

- Barcode `"12345"` → `"$7.25"`
- Barcode `"23456"` → `"$12.50"`

---

### **2. Barcode not found**

If the barcode does not exist in the product database, return:

```
Error: barcode not found
```

Example:

- `"99999"` → `Error: barcode not found`

---

### **3. Empty barcode**

If the barcode is an empty string, return:

```
Error: empty barcode
```

This prevents accidental “ghost scans.”

---

### **4. Scanning multiple items — introduce _total_ command**

Extend the system to support **multiple scans**.
When the user issues the **total** command, the system should display the sum of all scanned product prices.

Example:

Scan `"12345"` → `$7.25`
Scan `"23456"` → `$12.50`
Scan `"12345"` → `$7.25`
Command `"total"` → `$27.00`

(7.25 + 12.50 + 7.25)

You may choose implementation details such as:

- storing scanned prices in a list
- using a running subtotal
- clearing the total after displaying it (optional)

---

## 🧪 TDD Advice

1. Start with the smallest behaviour:
   - unknown barcode → error
   - empty barcode → error
   - known barcode → price

2. Add a product dictionary/map for barcode → price.

3. Add tests ensuring formatting stays consistent (`"$7.25"` not `"7.25"`).

4. Add support for multiple scans:
   - test with a list of scanned items
   - introduce a `total` command that sums them

5. Refactor regularly:
   - extract `lookupPrice(barcode)`
   - keep command parsing minimal
   - ensure error messages remain consistent

---

## ⭐ Difficulty

**Easy → Medium**, depending on your implementation of the multiple-scan logic.
