package inheritancePack;

class Emp {
    int yearsOfExp = 10;
    int getYearsOfExp() {
        return yearsOfExp;
    }
}
class OnsiteEmp extends Emp{
    int yearsOfExp = 2;
    int getYearsOfExp() {
        return yearsOfExp+5;
    }
}

public class InheritanceDemo1 {
    public static void main(String[] args) {
        Emp emp=new OnsiteEmp();
        System.out.println(emp.yearsOfExp + " and " + emp.getYearsOfExp());
    }
}