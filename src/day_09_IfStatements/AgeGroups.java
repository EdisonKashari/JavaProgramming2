package day_09_IfStatements;

public class AgeGroups {

    public static void main(String[] args) {

        byte ageGroups = 31;

        if (1 == ageGroups || 2 == ageGroups){
            System.out.println("Infant");
        }else if (ageGroups >= 3 || ageGroups <= 5){
            System.out.println("Toddler");
        }else if (ageGroups >= 6 || ageGroups <= 9){
            System.out.println("Kid");
        }else if (ageGroups >= 10 || ageGroups <= 12){
            System.out.println("Pre-Teen");
        }else if (ageGroups >= 13 || ageGroups <= 17){
            System.out.println("Teenager");
        }else if (ageGroups >= 18 || ageGroups <= 20){
            System.out.println("Young Adult");
        }else if (ageGroups >= 21 || ageGroups <= 39){
            System.out.println("Adult");
        }else if (ageGroups >= 40 || ageGroups <= 49){
            System.out.println("Young Middle-Aged Adult");
        }else if (ageGroups >= 50 || ageGroups <= 54){
            System.out.println("Middle-Aged Adult");
        }else if (ageGroups >= 55 || ageGroups <= 64){
            System.out.println("Very Young Senior Citizen");
        }else if (ageGroups >= 65 || ageGroups <= 74){
            System.out.println("Young Senior Citizen");
        }else if (ageGroups >= 75 || ageGroups <= 84){
            System.out.println("Senior Citizen");
        }else if (ageGroups >= 85){

        System.out.println("Old Senior Citizen ");


    }else {

            System.out.println("Invalid Number");
        }

        /*  Create a class called AgeGroups, and write a program that can define the age groups of a person

	             age groups are:
	                    infant (1 - 2)
	                    Toddler (3 - 5),
	                    Kid (6 - 9),
	                    Pre-Teen (10 - 12),
	                    Teenager (13 - 17),
	                    Young Adult (18 - 20),
	                    Adult (21 - 39),
	                    Young Middle-Aged Adult (40 - 49),
	                    Middle-Aged Adult (50 - 54),
	                    Very Young Senior Citizen (55 - 64),
	                    Young Senior Citizen (65 - 74),
	                    Senior Citizen (75 - 84),
	                    Old Senior Citizen (85+) */
    }
}
