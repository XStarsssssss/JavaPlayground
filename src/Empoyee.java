public class Empoyee {
    private int salary;
    private int extrahourpayrate;
    private int extrahour;

    public Empoyee(int salary, int extrahourpayrate,int extrahour) {
        setSalary(salary);
        setExtraHourPayRate(extrahourpayrate);
        setExtraHour(extrahour);
    }

    public int calculateTotalSalary() {
        return getSalary() + (extrahourpayrate * extrahour);
    }

    private int getSalary() {
        return salary;
    }

    private void setSalary(int salary) {
        if (salary <= 0)
            throw new IllegalArgumentException("Salary cannot be 0 or less!");
        this.salary = salary;
    }

    private void setExtraHourPayRate(int extrahourpayrate) {
        if (extrahourpayrate <= 0)
            throw new IllegalArgumentException("Extra hour pay rate cannot be 0 or less!");
        this.extrahourpayrate = extrahourpayrate;
    }
    private void setExtraHour(int extrahour) {
        if (extrahour < 0)
            throw new IllegalArgumentException("Extra hour cannot be under 0!");
        this.extrahour = extrahour;
    }

    public void result() {
        int totalSalary = calculateTotalSalary();
        System.out.println("Salary : " + salary);
        System.out.println("Extra hour pay rate : " + extrahourpayrate);
        System.out.println("Extra hours : " + extrahour);
        System.out.println("------------------------");
        System.out.println("Total Salary : " + totalSalary);
    }
}
