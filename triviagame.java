import java.util.Scanner; 
public class TriviaGame{ 
    public static final Scanner scan = new Scanner(System.in); // INPUT FINAL 
    public static int correct1 = 0; 
    public static int correct2 = 0; 
    public static void main(String args[]){ 
        Question[] questions = new Question[10]; 
        questions[0] = new Question("Which animal has the longest neck?", "Shark", "Giraffe", "Kangaroo", "Dolphin", "Giraffe");  
        questions[1] = new Question("Who is currently the wealthiest person alive (net worth)?", "Jeff Bezos", "Elon Musk", "Bill Gates", "Warren Buffet", "Jeff Bezos");
        questions[2] = new Question("Which country won the world cup for soccer in 2018?", "China", "USA", "South Korea", "France", "France");
        questions[3] = new Question("What is the most popular coding language in the world?", "JavaScript", "Java", "Python", "C++", "Python");
        questions[4] = new Question("What school do we attend?", "Cal Poly Slo", "Cal Poly Pomona", "MIT", "Harvard", "Cal Poly Pomona");
        questions[5] = new Question("Which fruit is yellow?", "banana", "orange", "apple", "grape", "banana");
        questions[6] = new Question("What is the most populated country in the world?", "USA", "India", "China", "Indonesia", "China");
        questions[7] = new Question("Who was the 45th president of the United States?", "George Washington", "Barack Obama", "Donald Trump", "George Bush", "Donald Trump");
        questions[8] = new Question("What is the name of the national american basketball league?", "NFL", "NHL", "NBA", "NASCAR", "NBA"); 
        questions[9] = new Question("What is the warmest state in the United States?", "Hawaii", "Louisiana", "Florida", "Texas", "Florida");  
        
        System.out.println("5 Qeustions for player 1: "); 
        for(int i = 0; i <= 4; i++){
            String question = questions[i].getQuestion(); 
            System.out.println(question); 
            System.out.println("1. " + questions[i].getPa1()); 
            System.out.println("2. " + questions[i].getPa2());
            System.out.println("3. " + questions[i].getPa3());
            System.out.println("4. " + questions[i].getPa4());
            System.out.print("What is your final answer? "); 
            String answer = scan.nextLine(); 
            String correct = questions[i].getCorrect(); 
            if(answer.equalsIgnoreCase(correct)){
                correct1++; 
                System.out.println("Correct, nice job!"); 
            }else{
                System.out.println("Incorrect, too bad!"); 
            }
        }

        System.out.println(" "); 
        System.out.println(" "); 
        
        System.out.println("5 Qeustions for player 2: "); 
        for(int i = 5; i <= 9; i++){
            String question = questions[i].getQuestion(); 
            System.out.println(question); 
            System.out.println("1. " + questions[i].getPa1()); 
            System.out.println("2. " + questions[i].getPa2());
            System.out.println("3. " + questions[i].getPa3());
            System.out.println("4. " + questions[i].getPa4());
            System.out.print("What is your final answer? "); 
            String answer = scan.nextLine(); 
            String correct = questions[i].getCorrect(); 
            if(answer.equalsIgnoreCase(correct)){
                correct2++; 
                System.out.println("Correct, nice job!"); 
            }else{
                System.out.println("Incorrect, too bad!"); 
            }
        }

        checkWin(); 
    }

    public static void checkWin(){
        System.out.println("Player one got " + correct1 + " answers correct while Player two got " + correct2 + " answers correct!"); 
        if(correct1 == correct2){
            System.out.println("Both players have tied!");
        } else if(correct1 > correct2){
            System.out.println("Player 1 has won!"); 
        } else if(correct2 > correct1){
            System.out.println("Player 2 has won!"); 
        }
    }
}