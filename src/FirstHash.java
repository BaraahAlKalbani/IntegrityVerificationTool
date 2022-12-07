import java.util.Scanner;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
/**
 * This class can be used to generate hashes of files and strings 
 *
 */
public class FirstHash 
{

	/**
	 * @param args:Contains the arguments from the command line 
	 * @throws NoSuchAlgorithmException 
	 */
	public static void main(String[] args) throws NoSuchAlgorithmException {
		// TODO Auto-generated method 
		
		Scanner sc= new Scanner(System.in);

		System.out.println("Select an Action:");
		System.out.println("______________________________________");
		System.out.println("\t1> Genarate HASH");
		System.out.println("\t2> Compare HASH");
		System.out.println("\t3> Re-compute");
		boolean valid=false;

		while(valid!=true)
		{
			System.out.println("\tEnter Your Input:");
			int input=sc.nextInt();

			if(input==1)
			{
				System.out.println("\tEnter text:");
				String TS = new Scanner(System.in).nextLine();

				System.out.println("\t\t--Genarating HASH--");
				System.out.println(TS+" :\t"+toHexString(getSHA(TS)));

				valid=true;
				break;
			}
			else if(input==2)
			{
				valid=true;
				System.out.println("\t--Comparing HASH--");
				break;
			}
			else if(input==3) 
			{
				valid=true;
				System.out.println("\t--ReComputing HASH--");
				break;
			}
			else 
			{
				valid=false;
				System.out.println("\t--Invalid Input--");
			
			}

		}
	}


	public static byte[] getSHA(String input) throws NoSuchAlgorithmException
	{
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		return md.digest(input.getBytes(StandardCharsets.UTF_8));
	}

	public static String toHexString(byte[] hash)
	{
		BigInteger number = new BigInteger(1, hash);

		StringBuilder hexString = new StringBuilder(number.toString(16));
		while (hexString.length() < 64)
		{
			hexString.insert(0, '0');
		}

		return hexString.toString();
	}

	//public void CompHash() {}
	//public void ReComp() {}

}
