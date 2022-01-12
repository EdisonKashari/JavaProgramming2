package day_30_CustomClass;

import java.util.ArrayList;

public class EmployerObject {
    public static void main(String[] args) {

        Employes employes1 = new Employes();
        Employes employes2 = new Employes();
        Employes employes3 = new Employes();
        Employes employes4 = new Employes();
        Employes employes5 = new Employes();

        employes1.setInfo("Mike",2454,'M',"labor",75000,true);
        employes2.setInfo("Michael",2457,'M',"developer",125000,true);
        employes3.setInfo("John",1454,'M',"tester",130000,false);
        employes4.setInfo("Anna",5454,'F',"ba",100000,true);
        employes5.setInfo("Jack",2458,'M',"instructor",150000,true);

        Employes[] employes = {employes1,employes2,employes3,employes4,employes5};

      //  ArrayList<Employes>

        int fullTime =0;
        int partTime = 0;
        int maxSalary=0;
        int minSalary=0;

        for (Employes each : employes) {
            System.out.println(each);

            if (each.isFullTime){
                fullTime++;
            }else {
                partTime++;
            }
            if (each.salary>maxSalary){
                maxSalary=each.salary;
            }else {
                minSalary=each.salary;
            }


        }


        System.out.println("fullTime = " + fullTime);
        System.out.println("partTime = " + partTime);
        System.out.println("minSalary = " + minSalary);
        System.out.println("maxSalary = " + maxSalary);



    }
}
