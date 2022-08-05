import java.util.*;
public class ABArray
{
	public static void main(String[] args) 
	{
		int[] intArr = {8, 4, 3,5,6 };
		String[] strArr = {"8", "4", "3","5","6"};
		Arrays.sort(intArr);
		Arrays.sort(strArr);
		System.out.println(Arrays.toString(intArr));
		System.out.println(Arrays.toString(strArr));
	}
}
