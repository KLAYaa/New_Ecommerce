package ecommerce;

import javax.swing.*;
import java.awt.*;

public class swincalpro extends JFrame {

    // =========================================================
    // QUESTIONS
    // =========================================================

    String[] questions = {
        "Which language is used to develop Android applications?",
        "Which keyword is used to create a class in Java?",
        "Which data type is used to store whole numbers?",
        "Which method is the starting point of a Java program?",
        "Which symbol is used to end a statement in Java?",
        "Which keyword is used to inherit a class in Java?",
        "Which data type stores true or false values?",
        "Which operator is used for addition?",
        "Which loop is used when the number of iterations is known?",
        "Which keyword is used to create an object?"
    };


    // =========================================================
    // OPTIONS
    // =========================================================

    String[][] options = {

        {"Java", "HTML", "CSS", "SQL"},

        {"class", "method", "object", "function"},

        {"int", "float", "char", "boolean"},

        {"start()", "run()", "main()", "execute()"},

        {".", ";", ":", ","},

        {"extends", "implements", "inherit", "super"},

        {"int", "boolean", "char", "double"},

        {"+", "-", "*", "/"},

        {"for", "while", "do-while", "if"},

        {"new", "class", "object", "create"}
    };


    // =========================================================
    // CORRECT ANSWERS
    // =========================================================

    int[] correctAnswers = {
        1, 1, 1, 3, 2,
        1, 2, 1, 1, 1
    };


    // =========================================================
    // REWARDS
    // =========================================================

    int[] reward = {
        100, 200, 300, 400, 500,
        600, 700, 800, 900, 1000
    };


    // =========================================================
    // VARIABLES
    // =========================================================

    int currentQuestion = 0;

    int totalAmount = 0;

    boolean gameOver = false;

    boolean audiencePollUsed = false;

    boolean fiftyFiftyUsed = false;


    // =========================================================
    // SWING COMPONENTS
    // =========================================================

    JLabel title;

    JLabel questionLabel;

    JLabel rewardLabel;

    JLabel scoreLabel;

    JButton option1;

    JButton option2;

    JButton option3;

    JButton option4;

    JButton lifelineButton;


    // =========================================================
    // CONSTRUCTOR
    // =========================================================

    public swincalpro() {

        // JFrame
        setTitle("Quiz Application");

        setSize(800, 600);

        setLocationRelativeTo(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel(new BorderLayout(10, 10));

        panel.setBackground(new Color(235, 240, 250));
        title = new JLabel(
                "WELCOME TO QUIZ APPLICATION",
                SwingConstants.CENTER
        );

        title.setFont(
                new Font("Arial", Font.BOLD, 25)
        );

        title.setForeground(Color.BLACK);

        title.setBackground(Color.ORANGE);

        title.setOpaque(true);

        title.setBorder(
                BorderFactory.createEmptyBorder(
                        15, 10, 15, 10
                )
        );

        panel.add(title, BorderLayout.NORTH);


        // =====================================================
        // CENTER PANEL
        // =====================================================

        JPanel centerPanel = new JPanel(
                new BorderLayout(10, 10)
        );

        centerPanel.setBackground(
                new Color(235, 240, 250)
        );


        // =====================================================
        // QUESTION
        // =====================================================

        questionLabel = new JLabel(
                "",
                SwingConstants.CENTER
        );

        questionLabel.setFont(
                new Font("Arial", Font.BOLD, 20)
        );

        questionLabel.setForeground(Color.BLACK);

        questionLabel.setBorder(
                BorderFactory.createEmptyBorder(
                        20, 20, 20, 20
                )
        );

        centerPanel.add(
                questionLabel,
                BorderLayout.NORTH
        );


        // =====================================================
        // OPTION PANEL
        // =====================================================

        JPanel optionPanel = new JPanel(
                new GridLayout(2, 2, 15, 15)
        );

        optionPanel.setBackground(
                new Color(235, 240, 250)
        );

        optionPanel.setBorder(
                BorderFactory.createEmptyBorder(
                        20, 50, 20, 50
                )
        );


        // =====================================================
        // BUTTONS
        // =====================================================

        option1 = new JButton();

        option2 = new JButton();

        option3 = new JButton();

        option4 = new JButton();


        // Button font
        option1.setFont(
                new Font("Arial", Font.BOLD, 16)
        );

        option2.setFont(
                new Font("Arial", Font.BOLD, 16)
        );

        option3.setFont(
                new Font("Arial", Font.BOLD, 16)
        );

        option4.setFont(
                new Font("Arial", Font.BOLD, 16)
        );


        // Button text color
        option1.setForeground(Color.BLACK);

        option2.setForeground(Color.BLACK);

        option3.setForeground(Color.BLACK);

        option4.setForeground(Color.BLACK);


        // Button colors
        option1.setBackground(Color.GREEN);

        option2.setBackground(Color.WHITE);

        option3.setBackground(Color.WHITE);

        option4.setBackground(Color.WHITE);


        // Add buttons
        optionPanel.add(option1);

        optionPanel.add(option2);

        optionPanel.add(option3);

        optionPanel.add(option4);


        centerPanel.add(
                optionPanel,
                BorderLayout.CENTER
        );


        panel.add(
                centerPanel,
                BorderLayout.CENTER
        );


        // =====================================================
        // BOTTOM PANEL
        // =====================================================

        JPanel bottomPanel = new JPanel(
                new BorderLayout(10, 10)
        );

        bottomPanel.setBackground(
                new Color(235, 240, 250)
        );


        // =====================================================
        // SCORE
        // =====================================================

        scoreLabel = new JLabel(
                "Total Points: 0"
        );

        scoreLabel.setFont(
                new Font("Arial", Font.BOLD, 16)
        );

        scoreLabel.setForeground(Color.BLUE);

        bottomPanel.add(
                scoreLabel,
                BorderLayout.WEST
        );


        // =====================================================
        // REWARD
        // =====================================================

        rewardLabel = new JLabel(
                "",
                SwingConstants.CENTER
        );

        rewardLabel.setFont(
                new Font("Arial", Font.BOLD, 16)
        );

        rewardLabel.setForeground(Color.RED);

        bottomPanel.add(
                rewardLabel,
                BorderLayout.CENTER
        );


        // =====================================================
        // LIFELINE BUTTON
        // =====================================================

        lifelineButton = new JButton(
                "Lifeline"
        );

        lifelineButton.setFont(
                new Font("Arial", Font.BOLD, 16)
        );

        lifelineButton.setForeground(Color.BLACK);

        lifelineButton.setBackground(Color.YELLOW);


        bottomPanel.add(
                lifelineButton,
                BorderLayout.EAST
        );


        panel.add(
                bottomPanel,
                BorderLayout.SOUTH
        );


        // =====================================================
        // BUTTON ACTIONS
        // =====================================================

        option1.addActionListener(
                e -> checkAnswer(1)
        );

        option2.addActionListener(
                e -> checkAnswer(2)
        );

        option3.addActionListener(
                e -> checkAnswer(3)
        );

        option4.addActionListener(
                e -> checkAnswer(4)
        );


        lifelineButton.addActionListener(
                e -> showLifelines()
        );


        // =====================================================
        // ADD MAIN PANEL
        // =====================================================

        add(panel);


        // =====================================================
        // LOAD FIRST QUESTION
        // =====================================================

        loadQuestion();


        // Show frame
        setVisible(true);
    }


    // =========================================================
    // LOAD QUESTION
    // =========================================================

    void loadQuestion() {

        questionLabel.setText(
                "<html><center>Question "
                + (currentQuestion + 1)
                + ": "
                + questions[currentQuestion]
                + "</center></html>"
        );


        rewardLabel.setText(
                "Reward: "
                + reward[currentQuestion]
                + " points"
        );


        scoreLabel.setText(
                "Total Points: "
                + totalAmount
        );


        // Set option text
        option1.setText(
                "1. " + options[currentQuestion][0]
        );

        option2.setText(
                "2. " + options[currentQuestion][1]
        );

        option3.setText(
                "3. " + options[currentQuestion][2]
        );

        option4.setText(
                "4. " + options[currentQuestion][3]
        );


        // Enable buttons
        option1.setEnabled(true);

        option2.setEnabled(true);

        option3.setEnabled(true);

        option4.setEnabled(true);


        // Reset button colors
        option1.setBackground(Color.GREEN);

        option2.setBackground(Color.WHITE);

        option3.setBackground(Color.WHITE);

        option4.setBackground(Color.WHITE);


        // Lifeline only for first 7 questions
        if (currentQuestion < 7) {

            lifelineButton.setEnabled(true);

        } else {

            lifelineButton.setEnabled(false);
        }
    }


    // =========================================================
    // CHECK ANSWER
    // =========================================================

    void checkAnswer(int answer) {

        // Correct answer
        if (answer == correctAnswers[currentQuestion]) {


            // Add reward
            totalAmount =
                    totalAmount
                    + reward[currentQuestion];


            scoreLabel.setText(
                    "Total Points: "
                    + totalAmount
            );


            JOptionPane.showMessageDialog(
                    this,
                    "Correct Answer!\n\n"
                    + "You earned "
                    + reward[currentQuestion]
                    + " points.\n\n"
                    + "Total Points: "
                    + totalAmount,
                    "Correct Answer",
                    JOptionPane.INFORMATION_MESSAGE
            );


            // Check last question
            if (currentQuestion == 9) {

                showResult();

            } else {

                // Move to next question
                currentQuestion++;

                loadQuestion();
            }


        } else {

            // =================================================
            // WRONG ANSWER
            // =================================================

            if (currentQuestion <= 3) {

                totalAmount = 0;

                scoreLabel.setText(
                        "Total Points: 0"
                );


                JOptionPane.showMessageDialog(
                        this,
                        "Wrong Answer!\n\n"
                        + "Because the wrong answer was "
                        + "given within the first four questions,\n"
                        + "your total points are now 0.",
                        "Wrong Answer",
                        JOptionPane.ERROR_MESSAGE
                );

            } else {

                JOptionPane.showMessageDialog(
                        this,
                        "Wrong Answer!\n\n"
                        + "You keep the points already earned.\n\n"
                        + "Total Points: "
                        + totalAmount,
                        "Wrong Answer",
                        JOptionPane.ERROR_MESSAGE
                );
            }


            gameOver = true;

            showResult();
        }
    }


    // =========================================================
    // SHOW LIFELINES
    // =========================================================

    void showLifelines() {

        // Lifeline only for questions 1-7
        if (currentQuestion >= 7) {

            JOptionPane.showMessageDialog(
                    this,
                    "Lifeline is not available for "
                    + "Question 8, 9 and 10.",
                    "Lifeline",
                    JOptionPane.WARNING_MESSAGE
            );

            return;
        }


        String[] lifelines = {
                "Audience Poll",
                "50-50"
        };


        int choice = JOptionPane.showOptionDialog(
                this,
                "Choose a Lifeline:",
                "LIFELINE OPTIONS",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                lifelines,
                lifelines[0]
        );


        if (choice == 0) {

            audiencePoll();

        } else if (choice == 1) {

            fiftyFifty();
        }
    }


    // =========================================================
    // AUDIENCE POLL
    // =========================================================

    void audiencePoll() {

        if (audiencePollUsed) {

            JOptionPane.showMessageDialog(
                    this,
                    "Audience Poll has already been used.\n"
                    + "You cannot use it again.",
                    "Audience Poll",
                    JOptionPane.WARNING_MESSAGE
            );

            return;
        }


        audiencePollUsed = true;


        String poll =
                "AUDIENCE POLL\n\n"
                + "1. "
                + options[currentQuestion][0]
                + " - 70%\n\n"

                + "2. "
                + options[currentQuestion][1]
                + " - 10%\n\n"

                + "3. "
                + options[currentQuestion][2]
                + " - 15%\n\n"

                + "4. "
                + options[currentQuestion][3]
                + " - 5%\n\n"

                + "Highest percentage: Option 1";


        JOptionPane.showMessageDialog(
                this,
                poll,
                "Audience Poll",
                JOptionPane.INFORMATION_MESSAGE
        );
    }


    // =========================================================
    // 50-50
    // =========================================================

    void fiftyFifty() {

        if (fiftyFiftyUsed) {

            JOptionPane.showMessageDialog(
                    this,
                    "50-50 has already been used.\n"
                    + "You cannot use it again.",
                    "50-50",
                    JOptionPane.WARNING_MESSAGE
            );

            return;
        }


        fiftyFiftyUsed = true;


        int correct = correctAnswers[currentQuestion];


        // Find one wrong answer
        int wrong = 0;


        for (int i = 1; i <= 4; i++) {

            if (i != correct) {

                wrong = i;

                break;
            }
        }


        // Disable all options
        option1.setEnabled(false);

        option2.setEnabled(false);

        option3.setEnabled(false);

        option4.setEnabled(false);


        // Enable correct option
        if (correct == 1) {

            option1.setEnabled(true);

        } else if (correct == 2) {

            option2.setEnabled(true);

        } else if (correct == 3) {

            option3.setEnabled(true);

        } else {

            option4.setEnabled(true);
        }


        // Enable one wrong option
        if (wrong == 1) {

            option1.setEnabled(true);

        } else if (wrong == 2) {

            option2.setEnabled(true);

        } else if (wrong == 3) {

            option3.setEnabled(true);

        } else {

            option4.setEnabled(true);
        }


        JOptionPane.showMessageDialog(
                this,
                "50-50 Lifeline Used!\n\n"
                + "Two options are remaining.",
                "50-50",
                JOptionPane.INFORMATION_MESSAGE
        );
    }


    // =========================================================
    // FINAL RESULT
    // =========================================================

    void showResult() {

        String message;


        if (totalAmount == 5500) {

            message =
                    "CONGRATULATIONS!\n\n"
                    + "You answered all 10 questions correctly.\n\n"
                    + "Total Points Earned: "
                    + totalAmount;


        } else if (totalAmount > 0) {

            message =
                    "WELL DONE!\n\n"
                    + "You completed the quiz.\n\n"
                    + "Total Points Earned: "
                    + totalAmount;


        } else {

            message =
                    "QUIZ OVER!\n\n"
                    + "You earned 0 points.";
        }


        int choice = JOptionPane.showConfirmDialog(
                this,
                message
                + "\n\nDo you want to play again?",
                "QUIZ RESULT",
                JOptionPane.YES_NO_OPTION
        );


        if (choice == JOptionPane.YES_OPTION) {

            restartQuiz();

        } else {

            System.exit(0);
        }
    }


    // =========================================================
    // RESTART QUIZ
    // =========================================================

    void restartQuiz() {

        currentQuestion = 0;

        totalAmount = 0;

        gameOver = false;

        audiencePollUsed = false;

        fiftyFiftyUsed = false;


        loadQuestion();
    }


    // =========================================================
    // MAIN METHOD
    // =========================================================

    public static void main(String[] args) {

        new swincalpro();
    }
}