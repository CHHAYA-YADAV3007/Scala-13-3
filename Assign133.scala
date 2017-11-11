/**
 * Assign133.scala
 * @author Chhaya Yadav
 * Compiled on 11th Nov 2017
 */
//package declaration


package ScalaAssgn133mypack

//Scala Object declaration 

object Assign133 {
  
//main method declaration and definition  
  
  def main( args : Array[String]):Unit ={
    
    println("Below program will determine the square root of an integer with Babylonian Method")
    
    println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^")
    
    println("Enter the Number ")
    
    //Taking user input at runtime
    
    var n = readInt()
    
    println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^")
      
    squareRoot(n)
    
    println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^")
    
    squareRoot(49)
    
    println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^")
    
    squareRoot(121)
      
      
    
  }
  
//function declaration for determining the square root for a number passed as an argument and no return type
  
  def squareRoot(n:Int):Unit= {
   
     var x = n 
     
     var y = 1

// e determines the accuracy level     
        
     var e = 0.000000001
     
     while((x-y)>e){
       
       x = (x + y)/2 
       
       y = n/x
       
     }
     
// if number is perfect square root of input argument , then display the message accordingly
     
     if((x*x) ==n)   println(x + " is the perfect square Root of " + n)
     
// if number is not perfect square root of input argument, then display the message accordingly
     
     else          println(x + " is the approximate square Root of " + n)
  }
}