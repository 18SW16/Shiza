Class  ClassTask one
 
2 
 
3 Starting off with the main method-which oughts to be the first method on the call Stack, inside the main we encounter the object of the TEST CLASS which calls the
 
4 method A, in A() string a is concatenated to b and hence "ab" is the new string, now B() is called inside A() and in B() the string is concatenated to d forming
 
5 "abd" and now C() is called inside B(), but before the stack jumps to C() the FINALLY block is executed and the String gets concatenated to e and the string 
 
6 becomes "abde" and now the C() actually is invoked. Upon calling C() it throws an Exception, which doesn't get any handler there so it jumps to its calling
 
7 Method B() where the Exception AGAIN isn't handled and that in B's catch the exception is thrown again, resulting in the INVOKING of the caller method of 
 
8 B()==> A() and in A() the exception is handled and the String is concatenated to "abdec" on adding c from the statement in the catch of A(). With that being said 
 
9 the main Method in the stack call is invoked again and the display method of TEST class is called. That method displays the FINAL string "abdec C