fun main() {
    //Data types for real numbers.
    //Double  and Float

    //Double is the default
    //So this is a double
    var realNum1 = 2.56
    var realNum2 : Double  = 3.7849342

    //Even if specify the data type suing :Float we still have to put F after the number
    //var realnum3 : Float = 3.566. is wrong
    //we could also do this var realnum3 = 3.566f
    var realnum3 : Float = 3.566F

    //The difference between double and float is in their precision
    //the output of code below should be something like this...
    //fl = 1.1234568
    //doub = 1.1234567891234568
    //So we use double when we want more than 8 digits after decimal point or our priority is precision
    val fl: Float = 1.123456789123456789f
    val dob: Double = 1.123456789123456789
    println("fl = $fl")
    println("doub = $dob")


}