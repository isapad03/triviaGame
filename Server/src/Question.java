public class Question {
    private String question;
    private int answer;
    private String[] options;


    public Question(String question,String[] options, int answer ) {
        this.question = question;
        this.answer = answer;
        this.options = options;
    }


    public String getQuestion() {
        return question;
    }
    public String getAnswer() {
        return options[answer] + ": " + answer;
    }
    public String[] getOptions() {
        return options;
    }
    public String getQuestionData(){

        String questionData = question + "|" + options[0] + "|" + options[1] + "|" + options[2] + "|" +  options[3];

        return questionData;
    }

    public boolean checkAnswer(int x) {
        System.out.println(answer == x);
        return answer == x;


    }




}
