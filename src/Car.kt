//Think of class as the template of an object that you want to create on your own.

//let's say I want to create a Car.
// What is a car??? for mee??
// For me to be a car it has to have a name, and an engine and it should move.

class Car {
    //in kotlin we have to initialize it. that's why we are using defualt values. that can't changed if needed
    var name = ""
    var engines : Int = 3

    fun move(){
        println("$name  is moving with it $engines engines")
    }
}
//This is simply the bluprint of a car.
//Now if we create a car object on our main.kt. go to main.kt