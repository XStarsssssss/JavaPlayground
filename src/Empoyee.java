public class Empoyee {
    private int baseSalary;
    private int extraPayRate;

    public int getExtraPayRate(int extraPayRate) {
        this.extraPayRate = extraPayRate;
        return extraPayRate;
    }

    public int total(int extraHour) {
        return baseSalary + (extraHour * extraPayRate);
    }

    public void setBaseSalary(int baseSalary) {
        if (baseSalary < 0) {
            throw new IllegalArgumentException("Base salary cannot be negative");
        }
        this.baseSalary = baseSalary;
    }
}

