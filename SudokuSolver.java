// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Scanner;

public class SudokuSolver {
   public SudokuSolver() {
   }

   public static boolean isSafe(int[][] var0, int var1, int var2, int var3) {
      int var4;
      for(var4 = 0; var4 < 9; ++var4) {
         if (var0[var1][var4] == var3) {
            return false;
         }
      }

      for(var4 = 0; var4 < 9; ++var4) {
         if (var0[var4][var2] == var3) {
            return false;
         }
      }

      var4 = var1 - var1 % 3;
      int var5 = var2 - var2 % 3;

      for(int var6 = 0; var6 < 3; ++var6) {
         for(int var7 = 0; var7 < 3; ++var7) {
            if (var0[var6 + var4][var7 + var5] == var3) {
               return false;
            }
         }
      }

      return true;
   }

   public static boolean solveSudoku(int[][] var0, int var1, int var2) {
      if (var1 == 8 && var2 == 9) {
         return true;
      } else {
         if (var2 == 9) {
            ++var1;
            var2 = 0;
         }

         if (var0[var1][var2] != 0) {
            return solveSudoku(var0, var1, var2 + 1);
         } else {
            for(int var3 = 1; var3 <= 9; ++var3) {
               if (isSafe(var0, var1, var2, var3)) {
                  var0[var1][var2] = var3;
                  if (solveSudoku(var0, var1, var2 + 1)) {
                     return true;
                  }
               }

               var0[var1][var2] = 0;
            }

            return false;
         }
      }
   }

   public static void printBoard(int[][] var0) {
      for(int var1 = 0; var1 < 9; ++var1) {
         if (var1 % 3 == 0 && var1 != 0) {
            System.out.println("------+-------+------");
         }

         for(int var2 = 0; var2 < 9; ++var2) {
            if (var2 % 3 == 0 && var2 != 0) {
               System.out.print("| ");
            }

            System.out.print(var0[var1][var2] + " ");
         }

         System.out.println();
      }

   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      int[][] var2 = new int[9][9];
      System.out.println("Enter the Sudoku puzzle (use 0 for empty cells).");
      System.out.println("Provide 9 rows, each with 9 numbers separated by spaces:");

      for(int var3 = 0; var3 < 9; ++var3) {
         for(int var4 = 0; var4 < 9; ++var4) {
            var2[var3][var4] = var1.nextInt();
         }
      }

      System.out.println("\nInput Sudoku Puzzle:");
      printBoard(var2);
      if (solveSudoku(var2, 0, 0)) {
         System.out.println("\nSolved Sudoku Puzzle:");
         printBoard(var2);
      } else {
         System.out.println("\nNo solution exists for the given puzzle.");
      }

      var1.close();
   }
}
