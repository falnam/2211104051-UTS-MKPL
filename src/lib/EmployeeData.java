package lib;

// /** Berikut adalah refactor untuk Employee yang lebih mudah dipahami

/**
 * EmployeeData digunakan sebagai objek pembungkus (data holder)
 * untuk menyederhanakan parameter pada konstruktor Employee.
 * 
 * Dengan adanya class ini, kita bisa menghindari penggunaan parameter
 * yang terlalu panjang (long parameter list) dan meningkatkan
 * keterbacaan serta pemeliharaan kode.
 *
 * Ini adalah salah satu teknik refactoring yang dikenal sebagai
 * "Introduce Parameter Object".
 *
 * ---
 * EmployeeData is a wrapper class (data holder)
 * used to simplify the constructor parameters in Employee.
 *
 * This helps avoid the long parameter list code smell and
 * improves code readability and maintainability.
 *
 * It applies a refactoring technique known as
 * "Introduce Parameter Object".
 */

public class EmployeeData {
    public int monthlySalary;
    public int otherMonthlyIncome;
    public int numberOfMonthWorking;
    public int deductible;
    public boolean isMarried;
    public int numberOfChildren;

    public EmployeeData(int monthlySalary, int otherMonthlyIncome, int numberOfMonthWorking,
                        int deductible, boolean isMarried, int numberOfChildren) {
        this.monthlySalary = monthlySalary;
        this.otherMonthlyIncome = otherMonthlyIncome;
        this.numberOfMonthWorking = numberOfMonthWorking;
        this.deductible = deductible;
        this.isMarried = isMarried;
        this.numberOfChildren = numberOfChildren;
    }
}
