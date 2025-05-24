
public class dijkstraCalculator
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String infix = in.nextLine();
        String[] items = infix.split(" ");

        Stack<String> operators = new Stack<>();
        Stack<Double> operands = new Stack<>();

        double num1;
        double num2;
        String operator;
        double result = 0;

        for(String item: items)
        {
            if(item.equals("(")) continue;
            else if(item.equals("*") || item.equals("/") || item.equals("+") || item.equals("-") || item.equals("^"))
            {
                operators.push(item);
            }
            else if(item.equals(")") && operands.Size() > 1 && !operators.isEmpty())
            {
                num2 = operands.pop();
                num1 = operands.pop();
                operator = operators.pop();

                switch (operator)
                {
                    case "*" -> result = num1 * num2;
                    case "/" -> result = num1 / num2;
                    case "+" -> result = num1 + num2;
                    case "-" -> result = num1 - num2;
                    case "^" -> result = Math.pow(num1, num2);
                }
                operands.push(result);
            }
            else
            {
                operands.push(Double.parseDouble(item));
            }

        }
        result = operands.pop();
        System.out.println(result);
    }
}

