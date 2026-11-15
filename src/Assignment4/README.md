# Calculator Program

## Introduction

This is a simple calculator program made with Java. It can add positive numbers and show the total. It is also possible to reset the calculator, which means that the total goes back to zero.

If someone tries to add a negative number, the program gives an exception.

# Source Code

## public class Calculator {

    // Stores the current total
    private int total;

    // Constructor sets total to zero
    public Calculator() {
        total = 0;
    }

    // Resets the calculator
    public void reset() {
        total = 0;
    }

    // Adds a number to the total
    public void add(int number) {

        // Negative numbers are not allowed
        if (number < 0) {
            throw new IllegalArgumentException("Number cannot be negative");
        }

        total = total + number;
    }

    // Returns the current total
    public int getTotal() {
        return total;
    }

    // Tests the calculator
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        calculator.add(10);
        calculator.add(20);
        calculator.add(30);

        System.out.println("Total: " + calculator.getTotal());

        calculator.reset();

        System.out.println("After reset: " + calculator.getTotal());
    }
}

## How the Program Works

The Calculator class has four main methods and parts:

1. **Constructor:** When a new calculator is created, the total is automatically set to zero.
2. **reset():** This method clears the current total and sets it back to zero.
3. **add(int number):** This method adds a number to the total. Negative numbers are not allowed, so the program gives an exception if someone tries to add one.
4. **getTotal():** This method shows the current total.

In the main method, I tested the calculator by adding three numbers: 10, 20 and 30. The total becomes 60. After that, I reset the calculator, and the total goes back to zero.

## Using GitHub Copilot

I used GitHub Copilot to help me create the Calculator class and write the different methods. It gave me suggestions while I was writing the code.

Copilot helped me understand how the methods work and how to organize the code. I also checked the suggestions and changed some parts to make the code simpler and easier for me to understand.

## Benefits of GitHub Copilot

- It helps me write code faster.
- It gives suggestions when I am not sure how to write something.
- It can help me understand new programming concepts.
- It saves time when working on programming tasks.

## Drawbacks of GitHub Copilot

- Sometimes it suggests code that is too complicated.
- Some suggestions may contain mistakes.
- It can be easy to depend on it too much.
- It is still important to understand the code instead of just copying it.

## My Opinion

In my opinion, GitHub Copilot is a useful tool, especially for students who are still learning programming. It helps when I get stuck and gives me ideas on how to solve problems.

However, I think it is important to wr ite and understand the code by myself as well. Sometimes simple code is better because it is easier to read and understand. Overall, I think GitHub Copilot is a good tool to use while learning Java, as long as I do not depend on it too much.