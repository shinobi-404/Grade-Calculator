
import java.util.Scanner;
public class GradeCalc{
    public static void main(String[] args){   

        Scanner myScan = new Scanner(System.in);
        char again = 'Y';

        while (again == 'Y' || again == 'y'){

        int gradeA = 0;
        int gradeB = 0;
        int gradeC = 0;
        int gradeD = 0;
        int gradeF = 0;
        int score = 0;
        double tempScore = 0; 
        int tries = 0; 

            while (score != -1){
                
                System.out.println("Enter Score (Enter -1 to Stop): "); //prompts user to enter score
                score = myScan.nextInt();

                if (score == -1){  

                    System.out.println("Here is your report:\n");
                    
                    // calculations for averages and grades over 70
                    double averageGrades = tempScore/tries;
                    int higherGrades = gradeA + gradeB + gradeC;

                    System.out.println("- A total of "+ tries +" scores entered. "+ higherGrades +" of them are 70 or higher."); // tries and grades over 70
                    
                    System.out.println("\t-\tLetter Grade distribution of the scores:\n");
                    // prints the amount of students each person gets 
                    System.out.println("\t\t-\t"+ gradeA +" Students earned the grade of A (90-100)");
                    System.out.println("\t\t-\t"+ gradeB +" Students earned the grade of B (80-89)");
                    System.out.println("\t\t-\t"+ gradeC +" Students earned the grade of C (70-79)");
                    System.out.println("\t\t-\t"+ gradeD +" Students earned the grade of D (60-69)");
                    System.out.println("\t\t-\t"+ gradeF +" Students earned the grade of 7 (59 or below)");
                    System.out.printf("\n\t-\tThe average score is: %.2f\n\n", averageGrades);
                
                }
                // caclualets and assigne scores to and incriments it 
                else if (score <= 100 && score >= 0){
                    if(score > 89){
                        gradeA++;
                        tries++;
                    }
                    else if(score > 79){
                        gradeB++;
                        tries++;
                    }
                    else if(score > 69){
                        gradeC++;
                        tries++;
                    }
                    else if(score > 59){
                        gradeD++;
                        tries++;
                    }
                    else if (score >= 0 && score <= 59){
                        gradeF++;
                        tries++;
                    }
                }
                else{
                    System.out.println("Score "+ score +" Rejected"); //for when score is rejected. 
                    score = 0; 
                }
                tempScore += score; // stores score to varable as score always changes 
                //System.out.println(tempScore); 
                
            
        } 
        // asks user if they want to redi the loop. 
        System.out.println("Would you like to process another class? (Y or N): ");
        again = myScan.next().charAt(0);
        if (again == 'Y' || again == 'y'){
            continue;
        }
        else if (again == 'N' || again == 'n'){
            System.out.println("Goodbye!");
            break;
        }

        myScan.close();
        }
    }
}
