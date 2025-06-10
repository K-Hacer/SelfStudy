public class Question {

    String prompt;
    String optionA;
    String optionB;
    String optionC;
    String optionD;
    char correctAnswer;

    public Question(String prompt, String optionA, String optionB, String optionC, String optionD, char correctAnswer) {
        this.prompt = prompt;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.correctAnswer = correctAnswer;
    }

    public boolean isCorrect(char answer) {
        return Character.toUpperCase(answer) == Character.toUpperCase(correctAnswer);
    }
}


