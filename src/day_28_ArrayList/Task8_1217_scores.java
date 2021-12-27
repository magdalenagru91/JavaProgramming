package day_28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task8_1217_scores {

    /*
    Given the following arraylists:
		ArrayList<Integer>  scores = new ArrayList<>();
  		scores.addAll( Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));


  		ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~ 100
        ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
        ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
        ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
        ArrayList<Integer> gradeOfF = new ArrayList<>(); // 0 ~ 59


        Write a program that can count the total numbers of grade A, B, C, D and F
     */

    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll(Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));

        ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~ 100
        ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
        ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
        ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
        ArrayList<Integer> gradeOfF = new ArrayList<>(); // 0 ~ 59


        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;
        int countF = 0;

        for (int i = 0; i < scores.size(); i++) {

            if (scores.get(i) >= 90 && scores.get(i) <= 100) {
                gradeOfA.add(i);
                countA++;
            } else if (scores.get(i) >= 80) {
                gradeOfB.add(i);
                countB++;
            } else if (scores.get(i) >= 70) {
                gradeOfC.add(i);
                countC++;
            } else if (scores.get(i) >= 60) {
                gradeOfD.add(i);
                countD++;
            } else if (scores.get(i) >= 0) {
                gradeOfF.add(i);
                countF++;
            }
        }

        System.out.println(gradeOfA + " " + countA);
        System.out.println(gradeOfB + " " + countB);
        System.out.println(gradeOfC + " " + countC);
        System.out.println(gradeOfD + " " + countD);
        System.out.println(gradeOfF + " " + countF);
    }
}