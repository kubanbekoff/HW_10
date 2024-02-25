package Home_Work.HW_10;

//Необходимо создать класс Manager в который нужно добавить следующие методы:
//getNumberOfSubordinates - получить количество подчиненных
//setNumberOfSubordinates
//
// в классе, метод getSalary будет возвращать значение по формуле
// - <базовая ставка> * (<количество подчиненных> / 100 * 3).
// Если количество подчиненных 0, то результат как у обычного рабочего.
public class Manager extends Worker {
    private int NumberOfSubordinates;
    private double baseSalary;

    public Manager(double BaseSalary) {
        super(BaseSalary);
    }



    public double getBaseSalary() {
        return baseSalary;
    }

//    public void setBaseSalary(double baseSalary) {
//        this.baseSalary = baseSalary;
//    }

    public int getNumberOfSubordinates() {
        return NumberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.NumberOfSubordinates = numberOfSubordinates;
    }
    public double getSalary() {
        if (NumberOfSubordinates == 0) {
            return baseSalary;
        } else {
            return baseSalary * (getNumberOfSubordinates() / 100.0 * 3);
        }
    }
}
