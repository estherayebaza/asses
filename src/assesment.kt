import java.util.*

fun main() {
introduction("Esther",23)

    machine(4)
    machine(20)
    machine(14)
   println(myFriends())
    println(multiply(23,20))
    println(divide(20,5))
    println(mod(28,6))
    var brother=Human("Timothy",23,59)
brother.eat(2)
    brother.speak("I am a brother to Esther")
    brother.birthday()

    val namesArray= arrayOf("sincere","phionah","esther","janet","timothy")
println(Arrays.toString((namesArray)))
}
fun introduction( name:String,age:Int){
println("My name is $name and I am $age years old")
}
fun machine(age: Int) {
    if (age < 6) {
        println("Serve  a glass of milk")
    }
    else if (age > 6 && age < 15) {
        println("Serve a bottle of fanta orange ")
    } else {
        println("a bottle of coca cola")
    }
}
fun myFriends():Int{
    var names = arrayOf("matthan", "Ian", "mercy","Patience")
    var x=0
    for (name in names) {
        if (name.length > 4) {
            x++;
        }
    }
    return x
}
fun multiply(num1:Int,num2:Int):Int{
   var multiplication=num1*num2
    return multiplication
}
fun divide(x:Int,y:Int):Int{
    var division=x/y
    return division
}
fun mod(d:Int,f:Int):Int{
    var modulus=d%f
    return modulus
}
class Human(var name:String,var age:Int,var weight:Int,) {
    fun eat(foodWeight: Int) {
        println(" I am eating $foodWeight kgs of food")
        weight += foodWeight
        println(weight)
    }
    fun speak(speech: String) {
        println("$speech")
    }
    fun birthday() {
        age += 2

    }
fun names(name1: String, name2: String, name3: String,name4:String,name5:String): Array<String> {
    val namesArray = arrayOf(name1, name2,name3, name4,name5)
    return namesArray
}}