### Stack using arrays

    - Stack is a linear data structure which follows a particular order in which the operations are performed. The order may be LIFO(Last In First Out) or FILO(First In Last Out).
    - Mainly the following three basic operations are performed in the stack:
        - Push: Adds an item in the stack. If the stack is full, then it is said to be an Overflow condition.
        - Pop: Removes an item from the stack. The items are popped in the reversed order in which they are pushed. If the stack is empty, then it is said to be an Underflow condition.
        - Peek or Top: Returns top element of stack.
        - isEmpty: Returns true if stack is empty, else false.

### String, StringBuffer and StringBuilder 
    java.lang

### What is class in java ?
 
    - A class is a blueprint or template which helps to create object.
    - A class contains fields and methods
    
### Type casting, parsing, boxing and unboxing
    - Type casting: Converting one data type to another data type
    - Parsing: Converting String to primitive data type
    - Boxing: Converting primitive data type to wrapper class
    - Unboxing: Converting wrapper class to primitive data type


Exceptions:

    Error
    Bug 
    Exception
What is Exception ?
    
        - An exception is an event, which occurs during the execution of a program, that disrupts the normal flow of the program's instructions.
        - When an error occurs within a method, the method creates an object and hands it off to the runtime system. The object, called an exception object, contains information about the error, including its type and the state of the program when the error occurred. Creating an exception object and handing it to the runtime system is called throwing an exception.
        - After a method throws an exception, the runtime system attempts to find something to handle it. The set of possible "somethings" to handle the exception is the ordered list of methods that had been called to get to the method where the error occurred. The list of methods is known as the call stack.
        - The runtime system searches the call stack for a method that contains a block of code that can handle the exception. This block of code is called an exception handler. The search begins with the method in which the error occurred and proceeds through the call stack in the reverse order in which the methods were called. When an appropriate handler is found, the runtime system passes the exception to the handler. An exception handler is considered appropriate if the type of the exception object thrown matches the type that can be handled by the handler.
        - An exception handler is considered appropriate if the type of the exception object thrown matches the type that can be handled by the handler. If the runtime system exhaustively searches all the methods on the call stack without finding an appropriate exception handler, as shown in the next figure, the runtime system (and, consequently, the program) terminates.
        - The call stack is printed by the printStackTrace method. The output indicates that the exception occurred in method main, at line 6 of ThrowDemo.java. The line number and the name of the file containing the line are printed. The remainder of the output shows the contents of the call stack, starting with the method in which the exception occurred, and proceeding to the method that invoked that method, and so on. In this case, the call stack is printed because the program terminated abnormally.
        - The call stack is printed by the printStackTrace method. The output indicates that the exception occurred in method main, at line 6 of ThrowDemo.java. The line number and the name of the file containing the line are printed. The remainder of the output shows the contents of the call stack, starting with the


    try
    catch
    finally
    throw
    throws

Types of exceptions:

    Checked exception
    Unchecked exception
    
    - Checked exception: Checked exceptions are checked at compile-time.
    - Unchecked exception: Unchecked exceptions are not checked at compile-time, but they are checked at runtime.