package OOPsDay3.EmployeePromo;

public class Employee {
    private int id;
    private String name;
    private promotions designation;

    public Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = promotions.valueOf(designation);

    }
    public void promote(){
        this.designation=designation.nextLevel();
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", designation=" + designation +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    enum promotions{
        Junior(50000),Mid(75000),Senior(100000),Lead(20000);
        double salary;
        promotions(double salary){
            this.salary=salary;
        }
        public double  getSalary(){
            return salary;
        }

        public promotions nextLevel(){
            int nextOrdinal=this.ordinal()+1;
            promotions[]levels= promotions.values();
            if(nextOrdinal<levels.length) return levels[nextOrdinal];
            else return this.nextLevel();
        }

    }
}
