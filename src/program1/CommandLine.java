/*To find the sum of any number of integers entered as 
  command line arguments*/

package program1;
public class CommandLine {
	public static void main(String[] args) {
		int sum=0;
		for(int i=0;i<args.length;i++)
		sum+=Integer.parseInt(args[i]);
		System.out.println("Sum is:"+sum);
	}
}