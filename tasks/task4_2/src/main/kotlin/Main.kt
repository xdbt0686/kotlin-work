// Task 4.2: use of if and ranges

fun main() {
    println("Pizza menu")
    println("Please choose what you want")
    println("a Margherita Pizza")
    println("b Pepperoni Pizza") 
    println("c Meat Feast") 
    println("d Supreme")  // Add your code here
    val choice = readln().lowercase()
    val Order = if (choice.length ==1 && choice in "a".."d"){
        println("Order accepted")
    }
    else {println("Invalid choice!")
    }
}