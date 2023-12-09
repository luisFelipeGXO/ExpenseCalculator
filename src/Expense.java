import java.util.Date;

public class Expense {

    public String description;
    public Double value;
    public Date date;

    public Expense(String description, Double value, Date date) {
        this.description = description;
        this.value = value;
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Description: " + description +
                " Value: " + value +
                " Date: " + date;
    }
}
