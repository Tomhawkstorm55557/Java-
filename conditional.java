/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class conditional
{
	public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
	//int age = sc.nextInt();
	// if(age>18){
	     
//				System.out.println("you can vote");
//	 }
//	else{
//	    
//				System.out.println("you cant vote");

//	}
    char grade ='A';
    /*
    if(grade =='A'){
        System.out.println("superb");
    }
    else if(grade =='B'){
        System.out.println("good");
    }
    else{
        System.out.println("invalid");
    }
	 System.out.println(19<=16);
	}
	*/
	switch(grade){
	    case 'A':
	        System.out.println("superb");
	        break;
	   case 'b':
	       System.out.println("avg");
	       break;
	   default:
	   System.out.println("inavlid");
      }
	}
}

