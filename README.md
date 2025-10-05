# 🧩 Sudoku Solver (Java)

This project is a **Sudoku Solver** implemented in Java using the **backtracking algorithm**.  
It takes a 9×9 Sudoku puzzle as input (with `0` representing empty cells), and outputs the solved puzzle if a solution exists.

---

## 🚀 Features
- Solves any valid Sudoku puzzle using **recursion + backtracking**.
- Reads puzzle input from the user via the console.
- Prints both the **input puzzle** and the **solved puzzle** in a clean grid format.
- Detects if **no valid solution** exists.

---

## 📂 File Structure
```
SudokuSolver.java   # Main program file
README.md           # Project documentation
```

---

## 🛠️ How It Works
1. The program checks if a number can be safely placed at a given position:
   - Ensures it’s not repeated in the **row**.
   - Ensures it’s not repeated in the **column**.
   - Ensures it’s not repeated in the **3×3 subgrid**.
2. Uses **backtracking**:
   - Tries numbers `1–9` in empty cells.
   - If a number works, move to the next cell.
   - If stuck, backtrack and try the next number.

---

## 📥 Input Format
- Enter `9` rows of `9` numbers separated by spaces.
- Use `0` for empty cells.  

**Example Input:**
```
5 3 0 0 7 0 0 0 0
6 0 0 1 9 5 0 0 0
0 9 8 0 0 0 0 6 0
8 0 0 0 6 0 0 0 3
4 0 0 8 0 3 0 0 1
7 0 0 0 2 0 0 0 6
0 6 0 0 0 0 2 8 0
0 0 0 4 1 9 0 0 5
0 0 0 0 8 0 0 7 9
```

---

## 📤 Output Example

**Input Sudoku Puzzle:**
```
5 3 0 | 0 7 0 | 0 0 0 
6 0 0 | 1 9 5 | 0 0 0 
0 9 8 | 0 0 0 | 0 6 0 
------+-------+------
8 0 0 | 0 6 0 | 0 0 3 
4 0 0 | 8 0 3 | 0 0 1 
7 0 0 | 0 2 0 | 0 0 6 
------+-------+------
0 6 0 | 0 0 0 | 2 8 0 
0 0 0 | 4 1 9 | 0 0 5 
0 0 0 | 0 8 0 | 0 7 9 
```

**Solved Sudoku Puzzle:**
```
5 3 4 | 6 7 8 | 9 1 2 
6 7 2 | 1 9 5 | 3 4 8 
1 9 8 | 3 4 2 | 5 6 7 
------+-------+------
8 5 9 | 7 6 1 | 4 2 3 
4 2 6 | 8 5 3 | 7 9 1 
7 1 3 | 9 2 4 | 8 5 6 
------+-------+------
9 6 1 | 5 3 7 | 2 8 4 
2 8 7 | 4 1 9 | 6 3 5 
3 4 5 | 2 8 6 | 1 7 9 
```

---

## ▶️ How to Run
1. Save the file as `SudokuSolver.java`.
2. Compile the code:
   ```bash
   javac SudokuSolver.java
   ```
3. Run the program:
   ```bash
   java SudokuSolver
   ```

---

## 📚 Concepts Used
- **Backtracking Algorithm**
- **Recursion**
- **2D Arrays in Java**

---

## 🧑‍💻 Author
Developed by **Kaustav Bhardwaj** ✨
