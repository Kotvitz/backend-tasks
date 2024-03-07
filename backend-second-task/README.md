# Pair Finder

This application finds pairs of integers from a list that sum up to a specific target value. 

## Usage

1. Ensure you have Maven installed on your system.

2. Clone the repository to your local machine.

3. Navigate to the project directory.

4. Compile the project using Maven:

   `mvn compile`

5. Run the application using Maven:

   `mvn exec:java -Dexec.mainClass="com.example.App"`

## Input Format

The input to the application is a list of integers separated by spaces. For example: 

1 2 10 7 5 3 6 6 13 0

## Output

The application outputs pairs of integers from the input list that sum up to a specific target value. Each pair is displayed on a separate line, with the smaller number first, separated by a space. In the above example, the correct result will be:

0 13

3 10

6 7

6 7