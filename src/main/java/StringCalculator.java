public class StringCalculator 
{
    public int add(String numbers)
{

if (numbers.equals(""))
            return 0;

        String[] sNumbers = numbers.split(",");
        int count = 0;
        for(String v : sNumbers)
       {
            count += Integer.parseInt(v.trim());
        }
        return count;

    }
}