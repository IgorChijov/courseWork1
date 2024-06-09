public class Main {

    private static Employee[] employees = new Employee[4];

    public static void main(String[] args) {

        employees[0] = new Employee("Ivan", "Ivanov", "Ivanovich", 1, 100000);
        employees[1] = new Employee("Nikita", "Nikitin", "Nikitevich", 2, 11111);
        employees[2] = new Employee("Pavel", "Popov", "Pavlovich", 3, 10000);
        employees[3] = new Employee("Alexander", "Alexandrov", "Alexandrovich", 4, 15000);

        printEmployees();
        System.out.println("=========");
        System.out.println(printSalary());
        System.out.println("=========");
        System.out.println(minSalary());
        System.out.println("=========");
        System.out.println(maxSalary());
        System.out.println("=========");
        System.out.println(averageSalary());
        System.out.println("=========");
        printFIO();
        System.out.println("=========");

    }




    public static void printEmployees(){
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static int printSalary() {
        int sum = 0;
        for (Employee employee : employees){
            sum += employee.getSalary();
        }
        return sum;
    }

    public static Employee minSalary() {
        Employee min = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < min.getSalary()) {
                min = employee;
            }
        }
        return min;
    }

    public static Employee maxSalary() {
        Employee max = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > max.getSalary()) {
                max = employee;
            }
        }
        return max;
    }

    public static double averageSalary() {
        return (double) printSalary() / employees.length;
    }

    public static void printFIO() {
        for (Employee employee : employees) {
            System.out.println(employee.getLastName() + " " + employee.getFirstName() + " " + employee.getMiddleName());
        }
    }
}
