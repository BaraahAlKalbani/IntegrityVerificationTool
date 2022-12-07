import java.util.*;

public class GenHash
{
	//main method
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Select an Action:");
		System.out.println("______________________________________");
		System.out.println("\t1> Genarate HASH");
		System.out.println("\t2> Compare HASH");
		System.out.println("\t3> Re-compute");
		int input=sc.nextInt();
		
		switch(input)
		{
			case 1:
				System.out.println("\t--Genarating HASH--");
				break;
				
			case 2:
				System.out.println("\t--Comparing HASH--");
				break;
			
			case 3:
				System.out.println("\t--ReComputing HASH--");
				break;
			
			default:
				System.out.println("\t--Invalid Input--");
				break;
		}
	}
	public void GHash() {}
	public void Compare() {}
	public void ReComp() {}
	
	
}