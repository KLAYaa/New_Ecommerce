package Strings;
import java.util.Scanner;
public class MiniProject {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        // Questions
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
	        // Options
	        String[] option1 = {
	            "Java", "class", "int", "start()", ".",
	            "extends", "int", "+", "for", "new"
	        };
	        String[] option2 = {
	            "HTML", "method", "float", "run()", ";",
	            "implements", "boolean", "-", "while", "class"
	        };
	        String[] option3 = {
	            "CSS", "object", "char", "main()", ":",
	            "inherit", "char", "*", "do-while", "object"
	        };
	        String[] option4 = {
	            "SQL", "function", "boolean", "execute()", ",",
	            "super", "double", "/", "if", "create"
	        };
	        // Correct answers
	        int[] correctAnswers = {
	            1, 1, 1, 3, 2,
	            1, 2, 1, 1, 1
	        };
	        // Reward for each question
	        int[] reward = {
	            100, 200, 300, 400, 500,
	            600, 700, 800, 900, 1000
	        };
	        // Variables
	        int totalAmount = 0;
	        int answer;
	        int choice;
	        boolean gameOver = false;
	        // Lifeline variables
	        boolean audiencePollUsed = false;
	        boolean fiftyFiftyUsed = false;
	        System.out.println("==========================================");
	        System.out.println("          WELCOME TO QUIZ APPLICATION");
	        System.out.println("==========================================");
	        System.out.println("There are 10 questions.");
	        System.out.println("Each question has 4 options.");
	        System.out.println("Option 5 is Lifeline.");
	        System.out.println();
	        // Loop for 10 questions
	        for (int i = 0; i < questions.length; i++) {
	            if (gameOver == true) {
	                break;
	            }
	            System.out.println();
	            System.out.println("==========================================");
	            System.out.println("Question " + (i + 1));
	            System.out.println("Reward: " + reward[i] + " points");
	            System.out.println("==========================================");
	            System.out.println(questions[i]);
	            System.out.println("1. " + option1[i]);
	            System.out.println("2. " + option2[i]);
	            System.out.println("3. " + option3[i]);
	            System.out.println("4. " + option4[i]);
	            // Lifeline option
	            if (i < 7) {
	                System.out.println("5. Lifeline");
	            }
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();
	            // Option 5 - Lifeline
	            if (choice == 5 && i < 7) {
	                System.out.println();
	                System.out.println("LIFELINE OPTIONS");
	                System.out.println("1. Audience Poll");
	                System.out.println("2. 50-50");
	                System.out.print("Choose Lifeline: ");
	                int lifeline = sc.nextInt();
	                // Audience Poll
	                if (lifeline == 1) {
	                    if (audiencePollUsed == false) {
	                        audiencePollUsed = true;
	                        System.out.println();
	                        System.out.println("AUDIENCE POLL");
	                        System.out.println("1. " + option1[i] + " - 70%");
	                        System.out.println("2. " + option2[i] + " - 10%");
	                        System.out.println("3. " + option3[i] + " - 15%");
	                        System.out.println("4. " + option4[i] + " - 5%");
	                        System.out.println();
	                        System.out.println("Highest percentage: Option 1");
	                        System.out.println();
	                        System.out.print("Now enter your answer (1-4): ");
	                        answer = sc.nextInt();
	                        if (answer == correctAnswers[i]) {
	                            totalAmount = totalAmount + reward[i];
	                            System.out.println("Correct Answer!");
	                            System.out.println("You earned " + reward[i] + " points.");
	                            System.out.println("Total points: " + totalAmount);
	                        } else {
	                            System.out.println("Wrong Answer!");
	                            if (i <= 3) {
	                                totalAmount = 0;
	                                System.out.println("Your points are now 0.");
	                            } else {
	                                System.out.println("You keep your earned points.");
	                            }
	                            gameOver = true;
	                        }
	                    } else {
	                        System.out.println("Audience Poll has already been used.");
	                        System.out.println("You cannot use it again.");
	                        // Ask the same question again
	                        i--;
	                    }
	                // 50-50
	                } else if (lifeline == 2) {
	                    if (fiftyFiftyUsed == false) {
	                        fiftyFiftyUsed = true;
	                        System.out.println();
	                        System.out.println("50-50 LIFELINE");
	                        // Display two options
	                        if (correctAnswers[i] == 1) {
	                            System.out.println("1. " + option1[i]);
	                            System.out.println("3. " + option3[i]);
	                        } else if (correctAnswers[i] == 2) {
	                            System.out.println("2. " + option2[i]);
	                            System.out.println("4. " + option4[i]);
	                        } else if (correctAnswers[i] == 3) {
	                            System.out.println("3. " + option3[i]);
	                            System.out.println("1. " + option1[i]);
	                        } else {
	                            System.out.println("4. " + option4[i]);
	                            System.out.println("2. " + option2[i]);
	                        }
	                        System.out.println();
	                        System.out.print("Enter your answer: ");
	                        answer = sc.nextInt();
	                        if (answer == correctAnswers[i]) {
	                            totalAmount = totalAmount + reward[i];
	                            System.out.println("Correct Answer!");
	                            System.out.println("You earned " + reward[i] + " points.");
	                            System.out.println("Total points: " + totalAmount);
	                        } else {
	                            System.out.println("Wrong Answer!");
	                            if (i <= 3) {
	                                totalAmount = 0;
	                                System.out.println("Your points are now 0.");
	                            } else {
	                                System.out.println("You keep your earned points.");
	                            }
	                            gameOver = true;
	                        }
	                    } else {
	                        System.out.println("50-50 has already been used.");
	                        System.out.println("You cannot use it again.");
	                        // Ask the same question again
	                        i--;
	                    }
	                } else {
	                    System.out.println("Invalid Lifeline choice.");
	                    System.out.println("You have to answer this question.");
	                    // Ask the same question again
	                    i--;
	                }
	            // Lifeline not allowed for last 3 questions
	            } else if (choice == 5 && i >= 7) {
	                System.out.println("Lifeline is not available for Question 8, 9 and 10.");
	                System.out.println("Please select an option from 1 to 4.");
	                // Ask same question again
	                i--;
	            // Normal answer
	            } else if (choice >= 1 && choice <= 4) {
	                answer = choice;
	                if (answer == correctAnswers[i]) {
	                    totalAmount = totalAmount + reward[i];
	                    System.out.println("Correct Answer!");
	                    System.out.println("You earned " + reward[i] + " points.");
	                    System.out.println("Total points: " + totalAmount);
	                } else {
	                    System.out.println("Wrong Answer!");
	                    // Wrong answer in first four questions
	                    if (i <= 3) {
	                        totalAmount = 0;
	                        System.out.println("Because the wrong answer was given");
	                        System.out.println("within the first four questions,");
	                        System.out.println("your total points are now 0.");
	                    } else {
	                        System.out.println("You keep the points already earned.");
	                    }
	                    gameOver = true;
	                }
	            } else {
	                System.out.println("Invalid choice!");
	                System.out.println("Please enter a number from 1 to 4.");
	                // Ask the same question again
	                i--;
	            }
	        }
	        // Final Result
	        System.out.println();
	        System.out.println("==========================================");
	        System.out.println("               QUIZ RESULT");
	        System.out.println("==========================================");
	        System.out.println("Total Points Earned: " + totalAmount);
	        if (totalAmount == 5500) {
	            System.out.println("Congratulations!");
	            System.out.println("You answered all 10 questions correctly.");
	        } else if (totalAmount > 0) {
	            System.out.println("Well Done!");
	            System.out.println("You completed the quiz with " + totalAmount + " points.");
	        } else {
	            System.out.println("You earned 0 points.");
	        }
	        System.out.println("==========================================");
	    }
	}