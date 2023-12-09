import java.util.Date;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ExpenseCalculator expenseCalculator = new ExpenseCalculator();

        Expense expense1 = new Expense("Whey Protein", 120.0, new Date());
        Expense expense2 = new Expense("Movies", 100.0, new Date());

        expenseCalculator.addExpense(expense1);
        expenseCalculator.addExpense(expense2);

        expenseCalculator.showExpense();

        expenseCalculator.TotalExpensesCalculator();


    }
}