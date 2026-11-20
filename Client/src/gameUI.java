
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;

public class gameUI extends Application {

    protected Stage stage;
    protected Scene scene;

    protected VBox panel;
    protected VBox answerBox;
    protected Game game;

    protected TextArea question;
    protected Button optionA;
    protected Button optionB;
    protected Button optionC;
    protected Button optionD;
    protected Button answerButton;
    protected TextArea serverIPBox;


    protected Question q;
    protected int response;
    protected String serverIP;


    @Override
    public void start(Stage stage) {
        this.stage = stage;
        game = new Game();

        scene = new Scene(buildMainScreen(), 800, 600);

        stage.setTitle("Trivia!");
        stage.setScene(scene);
        stage.show();
    }

    // Switch between screens
    public void showScreen(Parent screen) {
        scene.setRoot(screen);
    }

    // Main menu screen
    public Parent buildMainScreen() {
        VBox mainPanel = new VBox(20);

        Label title = new Label("Trivia!");

        Button startButton = new Button("Start Game");

        serverIPBox = new TextArea();

        serverIPBox.setMaxSize(200, 30);
        serverIPBox.setMinSize(10, 10);


        startButton.setOnAction(e -> connectToServer());

        mainPanel.getChildren().addAll(title, startButton, serverIPBox);
        mainPanel.setAlignment(Pos.CENTER);

        return mainPanel;
    }

    // Game screen
    public void showGameScreen() {
        showScreen(buildGameScreen());
    }

    public Parent buildGameScreen() {
        panel = new VBox(15);
        answerBox = new VBox(10);

        question = new TextArea();
        optionA = new Button("A: ");
        optionB = new Button("B: ");
        optionC = new Button("C: ");
        optionD = new Button("D: ");
        answerButton = new Button("Answer");

        question.setEditable(false);
        question.setWrapText(true);
        question.setPrefHeight(250);

        optionA.setMaxWidth(Double.MAX_VALUE);
        optionB.setMaxWidth(Double.MAX_VALUE);
        optionC.setMaxWidth(Double.MAX_VALUE);
        optionD.setMaxWidth(Double.MAX_VALUE);

        answerButton.setOnAction(e -> {
            if (q != null) {
                q.checkAnswer(response);
            }
        });

        optionA.setOnAction(e -> response = 0);
        optionB.setOnAction(e -> response = 1);
        optionC.setOnAction(e -> response = 2);
        optionD.setOnAction(e -> response = 3);

        Button menuButton = new Button("Main Menu");
        menuButton.setOnAction(e -> showScreen(buildMainScreen()));

        answerBox.getChildren().addAll(
                optionA,
                optionB,
                optionC,
                optionD,
                answerButton
        );

        panel.getChildren().addAll(
                question,
                answerBox,
                menuButton
        );

        panel.setPadding(new Insets(20));

        if (q != null) {
            updateQuestion();
        }

        return panel;
    }

    // Set the current question
    public void setQuestion(String questionData) {

String[] questionDataArr = questionData.split("|");

        if (questionDataArr != null) {
            question.setText(questionDataArr[0]);

            optionA.setText("A: " + questionDataArr[1]);
            optionB.setText("B: " + questionDataArr[2]);
            optionC.setText("C: " + questionDataArr[3]);
            optionD.setText("D: " + questionDataArr[4]);

        }
    }

    // Update question and answer choices
    private void updateQuestion() {
        question.setText(q.getQuestion());

        optionA.setText("A: " + q.getOptions()[0]);
        optionB.setText("B: " + q.getOptions()[1]);
        optionC.setText("C: " + q.getOptions()[2]);
        optionD.setText("D: " + q.getOptions()[3]);

        response = -1;
    }

    public static void main(String[] args) {
        launch(args);
    }



    public void connectToServer() {
        serverIP = serverIPBox.getText().trim();
        System.out.println("Server IP: " + serverIP);

        showGameScreen();

        Thread connectionThread = new Thread(() -> {
            try {
                game.connectServer(serverIP);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        connectionThread.setDaemon(true);
        connectionThread.start();
    }






}