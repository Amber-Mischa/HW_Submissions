import java.util.Scanner;
 //Task 1's Code
public class Testing_code {

	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean stop = false;
		int count = 0;
		while(stop == false)
		{
			System.out.println("Please input a number");
			String num = userInput.nextLine();
			if(num.equalsIgnoreCase("Stop"))
			{
				stop = true;
			}
			else
			{
				count++;
				System.out.println(num + " " + count);
			}
		}
		
		userInput.close();
	}
}

//Task 2's code
public class Main {
	
	public static void main(String[] args)
	{
      //Square 1's characteristics
  		Square squarOne = new Square(3.12);
  		System.out.println("Square 1's name is Taylor");
  		System.out.println("The sides of Taylor are "+squarOne.getSide());
  		System.out.println("The area of Taylor is "+squarOne.getArea(0));
  		System.out.println("The perimeter of Taylor is "+squarOne.getPerimeter(0));
  		
      //updates the sides of the square to something new based on what the User inputs
  		Scanner userInput = new Scanner(System.in);
  		double radius =  squarOne.getSide();
  		for(int i =0; i <5; i++)
  		{
  			System.out.println("Please input a number");
  			String playerNum = userInput.nextLine();
  			double num = Double.parseDouble(playerNum);
  			radius += num;
  		}
  		userInput.close();
  		System.out.println("The new side of Taylor is " + radius)

  }
}
