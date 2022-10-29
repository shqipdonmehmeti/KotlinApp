package javaClasses;

public class PrimitiveVsReference {
    public static void main(String[] args) {
//        int a = 5;
//        int b = a;
//        b = 10;
//        System.out.println(a);
//        System.out.println(b); //primitive
//
//        Employee employee = new Employee("Shqipdon");
//        Employee employee2 = employee;
//        employee2.setFullName("Dorant");
//        System.out.println(employee);
//        System.out.println(employee2);

        String x = "Vlera 1";
        String y = x;
        y = "Vlera 2";
        System.out.println(x);
        System.out.println(y);


    }
}
