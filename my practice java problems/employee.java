
class employee{
    int EmpID;
    String name;
    double salary;


    public static void main(String[] args) {
        employee e=new employee();
        e.EmpID=1233;
        e.name="Pirravina";
        e.salary=45000;

        employee e2=new employee();
        e2.EmpID=1633;
        e2.name="Kaushik";
        e2.salary=55000;

        employee e3=new employee();
        e3.EmpID=1433;
        e3.name="Ravi";
        e3.salary=40000;

        System.out.println(e.EmpID);
        System.out.println(e.name);
        System.out.println(e.salary);

        System.out.println(e2.EmpID);
        System.out.println(e2.name);
        System.out.println(e2.salary);
        System.out.println("employee2");
        System.out.println(e3.EmpID);
        System.out.println(e3.name);
        System.out.println(e3.salary);
    }
}