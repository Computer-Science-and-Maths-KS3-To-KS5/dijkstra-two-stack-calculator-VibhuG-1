**Analysis**
============

When a someone inputs a arithmetic expression into a computer, it is usually input as infix notation, for example 1+1 or 20*10+(2+2) etc. The computer cannot solve these expressions very easily, so there are different ways to evaluate these expressions. One way is to convert the infix into postfix (Reverse Polish Notation), however, that can be slow and challenging. Another way to evaluate infix expressiosn is to use Dijkstra's Two-Stack Algorithm, which is great for one-time evaluation where the expression does not need to be stored and calculated many times.

**Objectives**
--------------

1. Take input from user and parse it.
    1. The input is in infix and has spaces between every term.
    1. Seperate out each term and store them.
2. Evaluate the expression.
    1. Iterate through each term and apply the Two-stack Algorithm.
    1. Be able to evaluate operators
        1. "+" (add)
        1. "-" (subtract)
        1. "*" (multiply)
        1. "/" (divide)
    1. Store the result.
3. Output the result.