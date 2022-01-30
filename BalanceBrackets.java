import java.util.*;

public class BalanceBrackets {

	static boolean BalBracket(String input)
	{
		Deque<Character> stack = new ArrayDeque<Character>();
		
		for(int i = 0;i< input.length();i++)
		{
			char value = input.charAt(i);
			
			if(value == '(' || value == '[' || value == '{')
			{
				stack.push(value);
				continue;
			}
			
			if(stack.isEmpty())
				return false;
			
			char out;
			
			switch(value)
			{
			case ')':
				out = stack.pop();
				if (out != '(')
					return false;
				break;
				
			case ']':
				out = stack.pop();
				if (out != '[')
					return false;
				break;
				
			case '}':
				out = stack.pop();
				if (out != '{')
					return false;
				break;
			
			}
			
		}
		
		return stack.isEmpty();
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		
		String input = sc.next();
		
		if(BalBracket(input))
			System.out.println("The entered String has Balanced Brackets");
		else
			System.out.println("The entered Strings do not contain Balanced Brackets");
		
		sc.close();

	}

}
