//Koki Yamaguchi
//CS1400
//Assigment 4
//11/5/2021
public class Question{
    private String question; 
    private String pa1; 
    private String pa2; 
    private String pa3; 
    private String pa4; 
    private String correct; 

    public Question(String question, String pa1, String pa2, String pa3, String pa4, String correct){
        this.question = question; 
        this.pa1 = pa1; 
        this.pa2 = pa2; 
        this.pa3 = pa3; 
        this.pa4 = pa4; 
        this.correct = correct;
    }

    public String getQuestion(){
        return question; 
    }
    public String getPa1(){
        return pa1; 
    }
    public String getPa2(){
        return pa2; 
    }
    public String getPa3(){
        return pa3; 
    }
    public String getPa4(){
        return pa4; 
    }
    public String getCorrect(){
        return correct; 
    }

    public void setQuestion(String question){
        this.question = question; 
    }
    public void setPa1(String pa1){
        this.pa1 = pa1; 
    }
    public void setPa2(String pa2){
        this.pa2 = pa2; 
    }
    public void setPa3(String pa3){
        this.pa2 = pa3; 
    }
    public void setPa4(String pa4){
        this.pa2 = pa4; 
    }
    public void setCorrect(String correct){
        this.correct = correct; 
    }

}