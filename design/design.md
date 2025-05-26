**DESIGN**
==========

The main data structure required for this algorithm is a stack which is a Last in First out (LIFO) structure. The algorithm requires two of these, one to store the operands (numbers) and the other to store the operators (+, -, /, *).

The flowchart for the main algorithm is - 

![image](./algorithm_flowchart.png)

Pseudocode - 

Two stack algorithm - 

expression <- input()
terms <- expression.split(" ")

ops <- Stack()
operands <- Stack()

for term in terms
    if term is an operator then
        ops.push(term)
    else if term = "(" then
        continue
    else if term is a numeric value then
        operands.push((int)term)
    else if term is ")" then
        num2 = operands.pop()
        num1 = operands.pop()
        op = ops.pop()
        result <- 0
        if op = "+" then 
            result <- num1 + num2
        else if op = "-" then
            result <- num1 - num2
        else if op = "*" then
            result <- num1 * num2
        else if op = "/" then
            result <- num1 / num2
        endif
        operands.push(result)
    endif

ouput(operands.pop())