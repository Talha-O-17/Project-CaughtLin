fun main() {
    //variables in kotlin
    // we will learn about var and val

    //everything between double quotation is a string.
    // so the variable, name , can store a string
    var name = "Talha17"

    //this should give print the name when executed..
    println(name);

    //Important thing about var is that value  can be changed
    name = "Zeros-O-17"
    println(name);

    //we can explicitly specify the data type after it's name
    val favColor : String = "Blue"
    // since we have used val we can't change the value again like name

    //if we didn't use $before the name the output would be something like this
    // My name is name. And My favourite color is favColor
    //So inside double quotation to the value of a variable we use $varName or ${varName}
    println("My name is $name. And My favourite color is ${favColor}")
}