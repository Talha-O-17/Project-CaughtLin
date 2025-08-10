fun main() {
    /*There are two types of operators.
      1.Unary(Operates on a single operand)
      2.Binary(Operates on two operands)
    */

    //Unary operation example..
    var x = -5;
    println("x = $x")
    x = -x; // -5 becomes 5;
    println("x = $x")

    //There are also x++(post increment)and ++x(pre increment)

    //Pre increment first adds 1 to its value then assings the value.
    /* Following happens in the code below
       First x = x + 1; (x = 5 + 1, so x = 6);
       then num = 6;
     */
    var num1 = ++x;
    println(num1)

    //Post increment first assigns the value then increments;
    /*
        First num2 = x ( x = 6 so num2 = 6)
        then 1 gets added to x (x = x + 1, so x = 6 + 1, x = 7)
     */
    var num2 = x++
    println(num2)
}