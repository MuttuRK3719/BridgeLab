package OOPsDay3.EmployeePromo;

public class EmployeePro {
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
         promotions []levels=promotions.values();
         if(nextOrdinal<levels.length) return levels[nextOrdinal];
         else return this;
    }

}
}
