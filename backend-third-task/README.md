# Separated Graphs Counter

This Java application counts the number of separated graphs in a given graph represented by pairs of vertices.

## Usage

1. Ensure you have Maven installed on your system.

2. Clone the repository to your local machine.

3. Navigate to the project directory.

4. Compile the project using Maven:

   `mvn compile`

5. Run the application using Maven:

   `mvn exec:java -Dexec.mainClass="com.example.App"`

6. Follow the on-screen instructions to input the graph data.

## Input Format

The input should be provided via standard input (console). The first line should contain a positive integer `n`, representing the number of connections (pairs of vertices). The following `n` lines should each contain two positive integers `a` and `b`, representing a connection between vertices `a` and `b` in the graph.

Example:

3

4 3

1 4

5 6

## Output

The application will output the number of separated graphs found in the input graph. In the above example, the correct result will be "2". There are two separated groups of connected vertices.
