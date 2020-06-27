public class StringCalculator 
{
int addCalledCount = 0;
    public int add(String numbers)
{
addCalledCount++;
if (numbers.equals(""))
            return 0;

         String customDelimiter;
       if (numbers.contains("//")) {
            int newLineIndex = numbers.indexOf('\n');
            customDelimiter = numbers.substring(2, newLineIndex);
            numbers = numbers.substring(newLineIndex + 1);
        } else
            customDelimiter = "";
        String[] sNumbers = numbers.split("[,\n" + customDelimiter + "]");
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

    public int getCalledCount() {
        return addCalledCount;
    }
}