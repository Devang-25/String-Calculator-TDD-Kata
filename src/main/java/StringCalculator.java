// Submitted By: Devang Sharma
// Email: devangsharma25398@gmail.com
// T: (+91)-9953027469



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;	

public class StringCalculator 
{
int addCalledCount = 0;
    public int add(String numbers)
{
addCalledCount++;
if (numbers.equals(""))
            return 0;

         String customDelimiter;
       if (numbers.startsWith("//")) 
{
            int newLineIndex = numbers.indexOf('\n');
            numbers = numbers.substring(newLineIndex + 1);
        }

 else
            customDelimiter = "";
        
String[] sNumbers = numbers.split("(,|\n" + customDelimiter + ")");
int count = 0;
        for(String v : sNumbers)
       {
	int number = Integer.parseInt(v.trim());
            if (number < 0)
               negativeNumbers.add(v.trim());
	 if (number <= 1000)
            count += number;
        }

 if (negativeNumbers.size() > 0)
            throw new IllegalArgumentException("Negatives not allowed" + (negativeNumbers.size() > 1 ? (" " + String.join(",", negativeNumbers)) : ""));
        return count;
    }


private String getCustomDelimiter(String numbers) 
{
        String delimiterString = numbers.substring(2, numbers.indexOf("\n"));
        List<String> delimiters = new ArrayList<>();
        if(delimiterString.contains("["))
{
            while(delimiterString.length() > 0)
{
                int cursor = delimiters.indexOf("[") + 1;
                int endIndex = delimiterString.indexOf("]");
                delimiters.add(delimiterString.substring(cursor+1, endIndex));
                delimiterString = delimiterString.substring(endIndex + 1);
            }
        }
else
{
            delimiters.add(delimiterString);
        }
        return "|" + String.join("|", delimiters).replace("*", "\\*").replace("%", "\\%");
    }


    public int getCalledCount() {
        return addCalledCount;
    }
}