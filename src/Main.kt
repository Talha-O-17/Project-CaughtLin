fun main() {
    //Data types for whole numbers.

    //Data type Byte uses only 8bits of memory.
    //since 2^8 = 256, it can store 256 number.
    //and since Byte is used to hold negative numbers also.
    //a Byte type var can store values from -128 - 127.
    var tinynumber : Byte = 45;

    //do this for the other data types and check the results
    println("Size of Short in bits is =  ${Short.SIZE_BITS}")
    println("Byte's range = ${Short.MIN_VALUE} - ${Short.MAX_VALUE}")

    //Short data type uses 16 bits of memory
    //So it can store -32,768 to 32,767.
    var smallNumber : Short  = 32000;

    //Int uses 32 bits of memory.
    //so it can store values from -2,147,483,648 to 2,147,483,647.
    var bigNumber : Int = 2000000

    //Long uses 64 bits of memeory.
    //So it is used to hold a very large value;
    var largeNumber : Long = 20000000000000000
    //Instead of using :Long we could also do var large number = 200000000000L
    //the capital L(case doesn't matter) tells that it is of long data type.

    //if we don't explicitly mention the data type intellij will assume a whole number value as Int
    //num is an Int here even though the value is very small
    var num1 = 0;

    //if the value exceeds the boundary of the int then it is interpreted as Long.
    var num2 = 9223372036854775807
}