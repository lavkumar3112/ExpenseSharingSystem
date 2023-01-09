package ExpenseSystem.models.expense;

import ExpenseSystem.models.split.Split;
import ExpenseSystem.models.User;
import ExpenseSystem.models.split.EqualSplit;

import java.util.List;

public class EqualExpense extends Expense {
  public EqualExpense(double amount, User paidBy, List<Split> splits, ExpenseMetadata expenseMetadata) {
    super(amount, paidBy, splits, expenseMetadata);
  }

  @Override
  public boolean validate() {
    for (Split split : getSplits()) {
      if (!(split instanceof EqualSplit)) {
        return false;
      }
    }

    return true;
  }
}
