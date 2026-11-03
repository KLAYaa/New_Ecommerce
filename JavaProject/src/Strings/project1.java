package Strings;
import java.util.Scanner;
public class project1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("   Quiz Test  ");
		System.out.println("===================");
		System.out.println("All the Best for Quiz....");
		System.out.println("==========================");
		String Questions[]= {
				"1.Which bird is unable to fly? ",
				"2.What is the currency of Japan?",
				"3.Which key is commonly used to refresh a webpage on a computer?",
				"4.Which symbol is used to assign a value to a variable in Java?",
				"5.Which data type is used to store a decimal number in Java?",
				"6.Which index represents the first element of an array in Java?",
				"7.Which method is used to find the length of a String?",
				"8.Which statement is used when there are multiple conditions?",
				"9.Which number comes next: 2, 4, 6, 8, ___?",
				"10.Which festival is known as the Festival of Lights?"
		};
		String options[][]= {
				{"Eagle","Sparrow","Penguin","Parrot"},//1
				{"won","Dollar","Yen","Peso"},//2
				{"f1","f5","f8","f12"},//3
				{"==","=","!=",">="},//4
				{"int","char","double","boolean"},//5
				{"0","1","-1","2"},//6
				{"size()","length()","count()","lengthOf()"},//7
				{"if-else","for","scanner","import"},//8
				{"9","10","11","12"},//9
				{"Holi","Pongal","Diwali","Onam"},//10
		};
		int Answer[]= {
				3,//1
				3,//2
				2,//3
				2,//4
				3,1,2,1,2,3
		};
		int points=0;//for points
		//for lifeline
		boolean fiftyFiftyUsed = false;
		boolean audiencePollUsed = false;
		for(int i =0;i<Questions.length;i++) {
			boolean remove[]=new boolean[4];//to remove lifeline
			boolean answered = false;
			while(answered == false) { //if answer is correct 
				System.out.println();
				System.out.println(Questions[i]);
				for(int j = 0; j < 4; j++) {
					if(remove[j] == false) {
						System.out.println((j + 1) + ". " + options[i][j]);
					}
				}
				if(i<7 && !fiftyFiftyUsed && !audiencePollUsed) {
					System.out.println("5. Lifeline");
				}
				System.out.println("Enter the answer:");
				int answer=sc.nextInt();
				if(answer == 5 && i < 7 && (!fiftyFiftyUsed || !audiencePollUsed)) {
				    System.out.println("Lifeline");
				    if(fiftyFiftyUsed == false) {
				    System.out.println("1. 50-50");
				    }
				    if(audiencePollUsed == false) {
				    System.out.println("2. Audience Poll");
				    }
				    int lifeChoice = sc.nextInt();
				    if(lifeChoice == 1&& fiftyFiftyUsed == false) {
				     	fiftyFiftyUsed = true;
				        System.out.println("50-50 selected");
				        int removecount=0;
				        for(int j=0;j<4;j++) {
				         	if(j != Answer[i] - 1 && removecount < 2) {
				         		remove[j]=true;
				         		removecount++;
				         	}
				        }
				    }
				    else if(lifeChoice == 1 && fiftyFiftyUsed == true){
				    	   System.out.println("50-50 has already been used.");
				    }
				    else if(lifeChoice ==2 && audiencePollUsed ==false) {
				    	   audiencePollUsed = true;
				        System.out.println("Audience Poll selected");
				        int percentage[] = new int[4];
				        for(int j=0;j<4;j++) {
				        	   if(j == Answer[i] - 1) {
				                 percentage[j] = 70;
				             }
				             else {
				                 percentage[j] = 10;
				             }
				        	   System.out.println((j + 1) + ". " + options[i][j] + " - " + percentage[j] + "%");
				        }
				    }
				    else if(lifeChoice == 2 && audiencePollUsed == true) {

				        System.out.println("Audience Poll has already been used.");

				    }

				    else {

				        System.out.println("Invalid Lifeline choice.");

				    }
				}
				else if(answer == Answer[i]) {
				    System.out.println("Answer is Correct..");
				    points = points +((i+1)* 100);
				    System.out.println("Points: " + points);
				    answered =true;
				}
				else {
				    System.out.println("Answer is wrong..!!");
				    if(i <= 3) { 
				    	points = 0;
				    	}
				    System.out.println("Points: " + points);
				    answered=true;
				}
			} 
		} 
		System.out.println("-------------");
		System.out.println("Quiz completed");
		System.out.println("Your total points: "+points);
	}
}

