/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class meth
{
    /// methords--> public stactic void yeh usaaa he dhundega joh public static aur void hogaaa
	public static void main(String[] args) {
/*	System.out.println("Hello World");
		System.out.println(average(4,5));
	}
	static int average( int fir, int sec){
	    int sum = (fir+sec)/2;
	    return sum;
	*/
	// exceptional handling 
	int arr[] = new int[3];
	try{
	    System.out.println(arr[4]);
	}catch(ArrayIndexOutOfBoundsException e){
	    System.out.println("error aya tha");
	    System.out.println(e.getLocalizedMessage());
	}
	System.out.println("succes");
	}
}
