package inheritancePack;
class Employee {
    private int yearsOfExp;
    public Employee(int yearsOfExp) {
        this.yearsOfExp = yearsOfExp;
    }

    int getYearsOfExp() {
        return yearsOfExp;
    }
}

class Department extends Employee{
    private String deptName;
    /* Department constructor*/
    
    String getDeptName() {
        return deptName;
    }
}

public class InheritanceDemo2 {
    public static void main(String[] args) {
        /* create Department object and check the value*/
    }
}