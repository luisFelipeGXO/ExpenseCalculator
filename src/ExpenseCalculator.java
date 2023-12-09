import java.util.ArrayList;

public class ExpenseCalculator {

    private ArrayList<Expense> expenseList;

    public ExpenseCalculator() {
        this.expenseList = new ArrayList<>();
    }

    public void addExpense(Expense expense) {
        expenseList.add(expense);
    }

    public void TotalExpensesCalculator() {
        double total = 0;
        for(Expense expense : expenseList) {
            total += expense.getValue();
        }
        System.out.println("Total: " + total);
    }

    public void showExpense() {
        for (Expense expense : expenseList) {
            System.out.println(expense);
            System.out.println("........................");
        }
    }
}
