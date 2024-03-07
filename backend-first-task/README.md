# Distinct Elements Sorter

This application outputs the list of distinct elements from an input list of integers, sorted in ascending order, plus the basic measurement information.

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

1 10 20 20 2 5

## Output

The application outputs the list of distinct elements from the input list, sorted in ascending order. It also displays basic measurement information, including:

- Total number of elements in the source list
- Number of distinct elements
- Minimum value
- Maximum value

In the above example, the correct result will be:

1 2 5 10 20

count: 6

distinct: 5

min: 1

max: 20