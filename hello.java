// 

// className must be equal to fileName 
class hello{
    public static void main(String args[]){
        System.out.println("Hello World");
    }
}

// The eight primitives defined in Java are int, byte, short, long, float, double, boolean, and char those aren't considered objects and represent raw values.

// Constants are like a variable, except that their value never changes during program execution.
// final float INTEREST_RATE = 0.04;

// + - * / %    = += -= *= /= %=    == 
// int x = 10/3;
// float x = (float)10 / (float)3;

// EscapeSequences: \t \r  \\ \' \" \?  

// Type casting:

// Decision Control Statements: if else  switch 
// Ternary:  variable = (condition) ? expressionTrue : expressionFalse;

// Iterative Statements:  while do-while  for for-each  break continue 

// Arrays 
// Declaration:  String[] var_name;
// Defination:  String[] var_name = {"Asta", "Yuno", "Noelle"};
// Accessing:  System.out.println(var_name[index]);
// Changing:  var_name[2] = "Narrow";
// arrayLength:  System.out.println(var_name.length);
/* Loop through array:
    for (int i=0; i < var_name.length; i++) {
        System.out.println(var_name[i]);
    }
*/
/* Multi-dimentional array:
    // Creating a 2x3 array (two rows, three columns)
        int[2][3] matrix = new int[2][3];
        matrix[0][0] = 10;
    // Shortcut
        int[2][3] matrix = {
            { 1, 2, 3 },
            { 4, 5, 6 }
        };
*/
