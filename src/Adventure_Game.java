import java.util.Scanner;
public class Adventure_Game {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Jungle Safari!!");

		System.out.println(" Do you prefer to do a jungle safari riding on a (Jeep) or an (Elephant)?");
		String choice1 = sc.next();
		
		if (choice1.equals("Elephant")){
			System.out.println("You are a enthusiast!!");
			System.out.println("This safari will leave you stunned. You will see lots of exotic plants, endangered animals, and also you will"
					+ " feel how pure and serene the ambience is. If you want to further make your safari exciting you can either do (Bathing)"
					+ " on the river with the Elephant or you can see lions in pursuit to (Hunt) deers. Which one would you like to choose?");						
			String choice2 = sc.next();
			
			
			if (choice2.equals("Bathing")){
				System.out.println("I knew you hate violence. We have a beautiful cottage at the top of mountain that "
						+ " oversees the valley. You can rest there eating delicious dishes and looking the majestic views of the nature. Would you like to (Hike) towards"
						+ " cottage or come back to the (Hotel)?");
				String choice3 = sc.next();
				
				if (choice3.equals("Hike")){
					System.out.println(" I hope you have a woderful time. Be safe.");
				}else if (choice3.equals("Hotel")){
					System.out.println("I understand you must be tired physically but rejoiced mentally, right?. I am sure you are.");	
					}
	
			}else if (choice2.equals("Hunt")){
				System.out.println("I know you are a dare devil. After that would you like to go for a (Hike) or do you wanna come back to (Hotel)?");
				String choice3 = sc.next();	
				
			if (choice3.equals("Hike")){
					System.out.println(" I hope you have a woderful time. Be safe.");
				}else if (choice3.equals("Hotel")){
					System.out.println("I understand you must be tired physically but rejoiced mentally, right?. I am sure you are.");	
					}
			}
		}
			
		else 
			if(choice1.equals("Jeep")){
				System.out.println(" You are going to have an amazing time. Taking Jeep really allows you to go deeper into the Jungle. If you want to further make your safari exciting you can either do (Bathing)"
					+ " on the river with the Elephant or you can see lions in pursuit to (Hunt) deers. Which one would you like to choose?");
				String choice2_1 = sc.next();
				
				
			if (choice2_1.equals("Bathing")){
					System.out.println("I knew you hate violence. We have a beautiful cottage at the top of mountain that "
							+ " oversees the valley. You can rest there eating delicious dishes and looking the majestic views of the nature. Would you like to (Hike) towards"
							+ " cottage or come back to the (Hotel)?");
					String choice3 = sc.next();
					
					if (choice3.equals("Hike")){
						System.out.println(" I hope you have a woderful time. Be safe.");
					}else if (choice3.equals("Hotel")){
						System.out.println("I understand you must be tired physically but rejoiced mentally, right?. I am sure you are.");	
						}
		
				}else if (choice2_1.equals("Hunt")){
					System.out.println("I know you are a dare devil. After that would you like to go for a (Hike) or do you wanna come back to (Hotel)?");
					String choice3 = sc.next();	
					
				if (choice3.equals("Hike")){
						System.out.println(" I hope you have a woderful time. Be safe.");
					}else if (choice3.equals("Hotel")){
						System.out.println("I understand you must be tired physically but rejoiced mentally, right?. I am sure you are.");	
						}
			}
			
		
		
		}
	}
  }


		
		
	


