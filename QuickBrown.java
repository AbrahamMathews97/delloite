package oops;
import java.lang.String;

public class QuickBrown{

	public static void main(String args[])
	{
      String input="The quick brown fox jumps over the lazy dog";
      
      //Printing 12th character 
      System.out.println("Character present at index 12: "+input.charAt(12)+"\n");
      
      //concatenating to the string
      input=input.concat(" and killed it");
      
      //checking last word is a dog or not
      if(input.charAt(input.length()-1)!='g' && input.charAt(input.length()-2)!='o' && input.charAt(input.length()-3)!='d')
      {
    	  System.out.println("String does not end with dog "+"\n"); 
      }
      else
      {
    	  System.out.println("String ends with dog "+"\n");
      }
      
      //checking if string is equal to "The quick brown fox jumps over the lazy dog"
      if(input.equals("The quick brown fox jumps over the lazy dog")==true)
      	{
    	  System.out.println("It is equal "+"\n");
      	}
      else
      	{
    	  System.out.println("It is not equal "+"\n");
      	}
      
     //checking if string is equal to "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"
      if(input.equals("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG")==true)
      	{
    	  System.out.println("It is equal "+"\n");
      	}
      else
      	{
    	  System.out.println("It is not equal "+"\n");
      	}
	  
      //Printing length of the string
      int length=input.length();
	  System.out.println("The length of the string is: "+length+"\n");
	 
	  if(input.equals("The quick brown Fox jumps over the lazy Dog")==true)
    	{
		  System.out.println("It is equal "+"\n");
    	}
	  else
    	{
  	  	System.out.println("It is not equal "+"\n");
    	}
	  
	  //Replacing the string of "The" with "A"
	  input=input.replace("The","A");
	  
	  //Split the above string into two such that two animal names do not come together.
	  String input1=input.substring(0,18);
	  String input2=input.substring(18,input.length());
	  System.out.println(input1+"\n");
	  System.out.println(input2+"\n");
	  
	  //Print the animal names alone separately from the above string. 
	  int flag=0;
	  for(int i=0;i<input.length();i++)
	  	{
		  if((input.charAt(i)=='f' || input.charAt(i)=='d') && flag<2)
		  	{ flag++;
			  System.out.println(input.substring(i,i+4)+"\n");
		  	}
	  	}
	  
	  //Print the above string in completely lower case and upper case. 
	  System.out.println(input.toLowerCase()+"\n");
	  System.out.println(input.toUpperCase()+"\n");
	  
	  //Index with letter 'a'
	  for(int i=0;i<input.length();i++)
	  	{
		  if(input.charAt(i)=='a')
		  	{
			  System.out.println("The index with the letter a is : "+i+"\n");
			  break;
		  	}
	  	}
	  
	  //Index with letter 'e'
	  int last=0;
	  for(int i=0;i<input.length();i++)
	  {
		  if(input.charAt(i)=='e')
		  	{
			  last=i;
		  	}
	  }
	  System.out.println("The last index value with the letter e is: "+last+"\n");
	}
}
