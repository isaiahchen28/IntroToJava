public class Employee{
    public String name;
    public int payRate;
    public Department dept;

    public Employee(String empName, int pay, Department dep){
	name = empName;
	payRate = pay;
	dept = dep;
    }
    public int weeklyPay(int hours){
	int grossPay = payRate * hours;
	return grossPay - taxes(grossPay);
    }
    public static int taxes(int pay){
	return (int) (pay * .25);
    }
    public String bossName( ){
	return (dept . manager) . name;
    }
	
    public void printStub(int hours){
	IO.outputStringAnswer(this.name + " " + hours  + " " 
		       + this.weeklyPay(hours) + " " + this.bossName( ));
    }

    public static Employee createDepartmentManager
	(String deptName, String bossName, int bossPay){
	Department dept = new Department(deptName);
	Employee boss = new Employee(bossName, bossPay, dept);
	dept.manager = boss;
	return boss;
    }

    public static void main(String[] args){
	Employee toyMgr=createDepartmentManager("toys","Joe Smith", 1000);
	Department toyDept = toyMgr.dept;
	Employee sue = new Employee("Sue Jones", 500, toyDept);
	Employee sam = new Employee("Sam Baker", 250, toyDept);

	sue.printStub(40);
	sam.printStub(50);
    }
}
