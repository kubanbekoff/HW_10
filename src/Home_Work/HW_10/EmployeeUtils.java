package Home_Work.HW_10;



//Необходимо создать утилитарный класс со следующими методами:



public class EmployeeUtils {
    //поиск сотрудника в массиве по его имени
    public static Employee findEmployeeByName(Employee[]employees, String name){
        for (int i = 0; i < employees.length; i++) {
           Employee employee = employees[i];
            if (employee.getName().equals(name)){
                return employee;
            }
        }
        return null;
    }
    //поиск сотрудника в массиве по вхождению
    // указанной строки в его имени
    public static Employee findEmployeeBySubString(Employee[] employees, String substring){
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee.getName().contains(substring)){
                return employee;
            }
        }
        return null;
    }
    //подсчет зарплатного бюджета
    // для всех сотрудников в массиве
    public static double getSum(Employee[] employees){
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            sum += employee.getSalary();
        }
        return sum;
    }
    //поиск наименьшей зарплаты в массиве
    public static double minOfSalary(Employee[] employees){
        double min = Double.POSITIVE_INFINITY;
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            double minOfSalary = employee.getSalary();
            if (minOfSalary < min){
                min = minOfSalary;
            }
        }
        return min;
    }
    //поиск наибольшей зарплаты в массиве
    public static double maxOfSalary(Employee[] employees){
        double max = 0;
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            double MaxOfSalary = employee.getSalary();
            if (MaxOfSalary > max ){
                max = MaxOfSalary;
            }
        }
        return max;
    }
    //поиск наименьшего количества
    // подчиненных в массиве менеджеров
    public static  int MinNumberOfSubordinates (Manager[] managers){

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < managers.length; i++) {
            Manager manager = managers[i];
            int numberOfSubordinates = manager.getNumberOfSubordinates();
            if (numberOfSubordinates < min){
              min = numberOfSubordinates;
            }
        }
        return min;
    }
    //поиск наибольшего количества
    // подчиненных в массиве менеджеров
    public static  int MaxNumberOfSubordinates (Manager[] managers){

        int max = 0;
        for (int i = 0; i < managers.length; i++) {
            Manager manager = managers[i];
            int numberOfSubordinates = manager.getNumberOfSubordinates();
            if (numberOfSubordinates > max){
                max = numberOfSubordinates;
            }
        }
        return max;
    }


    //поиск наибольшей надбавки
// (разнице между базовой ставкой и зарплатой)
// в массиве менеджеров
    public static double maxSupplement(Manager[] managers){
        double max = Double.MIN_VALUE;
        for (int i = 0; i < managers.length; i++) {
            Manager manager = managers[i];
            double MaxSupplement = manager.getSalary() - manager.getBaseSalary();
            if (MaxSupplement > max){
                max = MaxSupplement;
            }
        }
        return max;
    }
    //поиск наименьшей надбавки
    // (разнице между базовой ставкой и зарплатой)
    // в массиве менеджеров
    public static double minSupplement(Manager[] managers){
        double min = Double.POSITIVE_INFINITY;
        for (int i = 0; i < managers.length; i++) {
            Manager manager = managers[i];
            double MinSupplement = manager.getSalary() - manager.getBaseSalary();
            if (MinSupplement < min){
                min = MinSupplement;
            }
        }
        return min;
    }


}
