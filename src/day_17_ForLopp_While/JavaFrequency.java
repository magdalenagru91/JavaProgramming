package day_17_ForLopp_While;

import java.util.Locale;

public class JavaFrequency {

    public static void main(String[] args) {

        String str = "Java Java Python";

        int frequency = 0;

        while (str.contains("Java")) {
           str = str.replaceFirst("Java", "");      // replaceFirst because you want to start from beginning every time
           frequency++;
        }
        System.out.println(frequency);


        System.out.println("----------------------------");


        String str1 = "cat cat dog dog";
        str1 = str1.toLowerCase();

        int countCat = 0;
        int frequency1 = 0;

        while (str1.contains("cat")) {
            str1 = str1.replaceFirst("cat", "");      // replaceFirst because you want to start from beginning every time
                                                                        // the replacement "" deletes the cat word!!!
                                                                        // if it gets deleted we add one to countCat
            countCat++;         // how many times the loop has been executed, how many times we removed CAT from the sentence!!!
                                // if there is no more cats the WHILE LOOP becomes fals and stops
        }
        System.out.println(countCat);


        System.out.println("----------------------------");

        String s = "java java java python python";

        int countJava = 0;
        int countPython = 0;

        while (s.contains("java") || s.contains("python")) {
            if (s.contains("java")) {
                s = s.replaceFirst("java","");
                countJava++;
            }
            if (s.contains("python")) {
                s = s.replaceFirst("python","");
                countPython++;
                }
            }
        System.out.println("java " + countJava);
        System.out.println("python " + countPython);
        }
    }


