package day_51_Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice2 {

    public static void main(String[] args) {

        //Given the following map that contains the employee name and thier salary:

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson",125000);
        map.put("Steven", 135000);


    //1.1 who has the maximum salary?

        String name1 = "";
        int maxSalary = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String eachKey = pair.getKey();
            Integer eachValue = pair.getValue();

            if (eachValue>maxSalary){
                maxSalary = eachValue;
                name1 = eachKey;
            }
        }

        System.out.println("name1 max salary= " + name1);


        //1.2 who has the minimum salary?

        String name2 = "";
        int minSalary = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String eachKey = pair.getKey();
            Integer eachValue = pair.getValue();

            if (eachValue<minSalary){
                minSalary=eachValue;
                name2 = eachKey;
            }
        }
        System.out.println("name2 min salary= " + name2);



        //1.3 how many employees has the salary between 120k ~ 150K?

        int count = 0;

        for (Integer eachValue : map.values()) {
            if (eachValue>=120000 && eachValue<=150000){
                count++;
            }
        }
        System.out.println("count how many employees has the salary between 120k ~ 150K = " + count);



        //1.4 display the names of the employees who are making less than 118k?

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String eachEmployee = pair.getKey();
            Integer eachSalary = pair.getValue();

            if (eachSalary<118000){
                System.out.println("employee earning less than 118k = " + eachEmployee);
            }
        }


        //1.5 increase the salary of each employee by 10K

        for (Integer eachSalary : map.values()) {
            eachSalary+=10000;
            System.out.println("eachSalary increased by 10K= " + eachSalary);
        }


        //1.6 increase the salary of each employee by 10K if the current salary is less than 120k

        for (Integer eachSalary : map.values()) {
            if (eachSalary < 120000) {
                eachSalary += 10000;
                System.out.println("eachSalary increased by 10K if salary was less than 120k= " + eachSalary);
            }
        }


        System.out.println("map = " + map);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue()<120000){
                entry.setValue(entry.getValue()+10000);
            }
        }
        System.out.println("map = " + map);

    }
}
