package day_11_Switch_Scanner;

public class CydeoBatches {
    public static void main(String[] args) {

        String batch="E";
        boolean classes = batch == "USmorning" || batch == "USevening" || batch == "EU";

        if (classes){
            if (batch== "USmorning"){
                batch = "Class times are 10-5 EST. M, T, Th, F.";

            }else if (batch=="USevening"){
                batch = "Class times are 7-10 EST. M, T, W, Th, S, S";
            }else{
                batch = "Class times are 7-10 EST. M, T, W, Th, S, S";
            }


        }else{
           batch = "Invalid Batch";
        }
        System.out.println(batch);

        System.out.println("------------------------------------------------------");

        switch (batch){
            case "USmorning":
                batch = "Class times are 10-5 EST. M, T, Th, F.";
                break;
            case "USevening":
                batch = "Class times are 7-10 EST. M, T, W, Th, S, S";
                break;
            case "EU":
                batch = "Class times are 7-10 EST. M, T, W, Th, S, S";
            default:
                batch = "Invalid batch";


        }
        System.out.println(batch);

        System.out.println("--------------------------------------------------------------");

        if (classes){
            switch (batch){
                case "USmorning":
                    batch = "Class times are 10-5 EST. M, T, Th, F.";
                    break;
                case "USevening":
                    batch = "Class times are 7-10 EST. M, T, W, Th, S, S";
                    break;
                case "EU":
                    batch = "Class times are 7-10 EST. M, T, W, Th, S, S";
                default:
                    batch = "Invalid batch";

            }

        }else{
            batch = "Invalid batch";
        }
        System.out.println(batch);




        /*  Create a class named Cydeo batches. In Cydeo we have three batch types: US morning, US evening, EU.
        Depending on a batch type (String) print information about the batch.

        	If batch type is US morning ==> print "Class times are 10-5 EST. M, T, Th, F."
        	If batch type is US evening ==> print "Class times are 7-10 EST. M, T, W, Th, S, S"
        	If batch type is EU ==> print "Class times are 7-10 EST. M, T, W, Th, S, S"
        	If batch type is invalid, print "Invalid Btach"

        	Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed*/
    }
}
