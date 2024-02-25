package Home_Work.HW_10;
//Необходимо создать класс Director с теми же методами,
// что и Manager, но метод getSalary должен возвращать
// результат по формуле - <базовая ставка> * (<количество подчиненных> / 100 * 9).
// Если количество подчиненных 0, то результат как у обычного рабочего
public class Director extends Employee {
    private int NumberOfSubordinates;
    private double baseSalary;

    public Director(String name, double Salary) {
        super(name, Salary);
    }


    public int getNumberOfSubordinates() {
        return NumberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        NumberOfSubordinates = numberOfSubordinates;
    }
    public double getSalary(){
        if (NumberOfSubordinates == 0){
            return baseSalary;
        }else {
            return baseSalary * (NumberOfSubordinates / 100.0 * 3);
        }
    }
}
