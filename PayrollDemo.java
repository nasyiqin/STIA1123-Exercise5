import java.util.Scanner;

class Employee{

    Scanner input = new Scanner(System.in);

     int id;
     double grossPay, stateTax, fedTax;

    public void input(){
        System.out.print("Enter your Employee ID Number: ");
        id = input.nextInt();
        System.out.print("Enter your Gross Pay: RM ");
        grossPay = input.nextDouble();
        System.out.print("Enter your State Tax: RM ");
        stateTax = input.nextDouble();
        System.out.print("Enter your Federal Tax: RM ");
        fedTax = input.nextDouble();
    }
}

class Payroll{

    private double grossPay, stateTax, fedTax, netPay;

    public Payroll(double grossPay, double stateTax, double fedTax){
            this.grossPay = grossPay;
            this.stateTax = stateTax;
            this.fedTax = fedTax;
        }

    public double calculateNetPay(){
        return netPay = grossPay - stateTax - fedTax;
    }

    public void printOutput(){
        System.out.print("\nNet Pay is: RM " + calculateNetPay());
    }

}

public class PayrollDemo {

    public static void main(String[] args){

        Employee emp = new Employee();
        emp.input();
        Payroll roll = new Payroll(emp.grossPay, emp.stateTax, emp.fedTax);
        roll.printOutput();
    }
}
