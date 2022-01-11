package day_35_Encapsulation;

public class Person {


        public String name;
        public int age;
        public char gender;
        public String language;

        public static String planet;
        public static boolean isHuman, hasNose;
        public static int numberOfWings, numberOfHead;


        public Person(String name, int age, char gender, String language) {
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.language = language;
        }

        static{
            planet = "Earth";
            isHuman = true;
            hasNose = true;
            numberOfHead = 1;
            numberOfWings = 0;
        }


        public static void printPlanetName(){   //how to decide if to use static or instance method - ask yourself if the
                                                // method will need any instance variables - if it does not need it
                                                //do not use instance, static takes less space


            System.out.println("Planet is" + planet);

    }

    public void eat(String food){
        System.out.println(name + " is eating " + food);
    }

    public void drink(String drink){
        System.out.println(name + " is drinking " + drink);
    }

/*
1. Create a class named Person:
			Variables:
				name, age, gender, language, planet, isHuman, hasNose, numberOfWings, numberOfHead
			Add a constructor to initialize all the fields
			Add a static block to initialize all the statics
			Methods:
				printPlanetName()
				eat(String food)
				drink(String drink)
				toString()
 */
}
