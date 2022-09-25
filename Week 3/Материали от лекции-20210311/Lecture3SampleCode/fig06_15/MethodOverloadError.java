// Fig. 6.15: MethodOverload.java
// Overloaded methods with identical signatures 
// cause compilation errors, even if return types are different.

public class MethodOverloadError
{   
   // declaration of method square with int argument
   public int square( int x )
   {
      return x * x;
   }
   
   // second declaration of method square with int argument 
   // causes compilation error even though return types are different
   public double square( int y )
   {
      return y * y;
   }
} // end class MethodOverloadError

