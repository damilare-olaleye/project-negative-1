# project-negative-1

# Overview
Your team at company X is currently working on a fullstack application that helps users perform basic arithmetic. They can visit the website, input two numbers, and perform a binary arithmetic operation (addition, subtraction, multiplication, division) on those numbers. They can then view the result of the calculation.


## Manual Testing
In order to see if the application is working as intended, you currently follow a manual process of sitting down at the computer, typing in two numbers on the keyboard, selecting the operation you would like to perform, and clicking the calculate button. If the output matches what you would expect if you did those calculations on paper, then you know that the application is working.

Currently, you have to test the application manually, testing each operation (addition, subtraction, multiplication, division) with a variety of different combinations of numbers each and every time a new feature/change is made in the application.

**Question:** Why do you need to test the application each time you make a change to it?
> To ensure that new functionality / code you have added to the application did not cause old functionality to break

Formally, this is known as **regression testing**. You a testing to make sure the application did not **regress**. Regress means to *go backwards*, which is not good.

# The Project
You have been tasked to automate this tedious process of testing out each operation (addition, subtraction, multiplication, division).

To accomplish the task of automating these tasks, you will utilize the following technologies:
- Java 8
- Selenium WebDriver

## Steps
1. First, 
    - You will have to make sure you have the calculator app up and running
    - It should have the appropriate functionality to support
        - Addition (already implemented during lecture)
        - Subtraction
        - Multiplication
        - Division
    - This will require 
        - 4 different forms in your .HTML file to support each operation
        - The necessary logic in your Java program
            - 4 endpoint mappings (/add, /subtract, /multiply, /divide)
            - Service layer methods

2. Secondly,
    1. Create a new project
    2. Create a package that will house your main class
    3. Write a script within the main class' main method that will
        - Input 2 numbers, perform the add functionality, and then print out the result of the addition
        - Input 2 numbers, perform the subtract functionality, and then print out the result of the subtraction
        - Input 2 numbers, perform the multiply functionality, and then print out the result of the multiplication
        - Input 2 numbers, perform the divide functionality, and then print out the result of the division

# Deliverables
- Push the automation project to Github and provide a link by the due date to me
- Present your project on the due date
    - 5 minute limit
    - This project is relatively simple, so the presentation will likely not take long
    - Run your code and demonstrate it working

# Due Date
- Wednesday (October 27th)