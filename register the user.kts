import com.sun.org.apache.xml.internal.security.Init
import java.awt.Color
import java.awt.geom.Area
import java.lang.Exception
import javax.lang.model.element.ElementKind
import javax.swing.ImageIcon


var firstCondition = false

if (firstCondition) {
    println("true hai")
} else {
    println("false hai")
}
var isWorkingCondition = true

if (isWorkingCondition || firstCondition) {
    print("if block chla hai")
} else {
    print("else wala chla hai")
}


var score = 12

if (score > 100) {
    println("good score")

} else if (score > 150) {
    println("excelent score")

} else if (score < 10) {
    println("bad score")
} else {
    println("failed")
}


var boxerspeed = 2
var boxerpower = 6
if (boxerpower > 20) {

    if (boxerspeed > 100) {
        println(" boxer is powerfull and fast")

    } else {
        println("boxer is not powerfull and fast")
    }

}


var personAge = 20

when (personAge) {
    1 -> {
        println("personAge is equal to : $personAge")
    }
    20 -> {
        println("personAge is equal to : $personAge")
    }
    20, 30 -> {
        println("personAge is equal to : $personAge")
    }
    in 10..20 -> {
        println("personAge is equal to : $personAge")
    }
    !in 30..70 -> {
        println("personAge is equal to : $personAge")
    }
    else -> {
        println("personAge is equal to : $personAge")
    }
}


var personage = 50
var persnweight = 30

var result = if (personage > persnweight) personage else persnweight

println("$result")


var noOfCars = 50
var noofBikes = 100

var maximumvalue = if (noOfCars == noofBikes) noOfCars else noofBikes
println(maximumvalue)


var boxerPunchSpeed = 500
var isBoxerSpeedFast = when (boxerPunchSpeed) {
    200 -> true
    else -> false
}
println(isBoxerSpeedFast)



for (myNumber in 1..10) {
    println("$myNumber - Sujit")
}



for (myNumber in 1..10) {
    println("$myNumber -- sujit")
    for (mySecondNumber in 1..20) {
        println("$mySecondNumber -- kumar")
    }
}


var haveMoney = false
var count = 1
while (count < 6 && !haveMoney) {
    println("$count  -- keep spending")
    count++
}


var peopleAreFriendly: Boolean = true

var count = 1

do {
    println("$count talk to people")

    count++
} while (peopleAreFriendly && count < 5)



for (myNumber in 1..10) {
    if (myNumber == 4) {
        break
        continue
    }
    println("$myNumber Welcome!")
}


var myAnimalname = "My lion"
println(myAnimalname)
println(myAnimalname.toUpperCase())
println(myAnimalname.toLowerCase())
println(myAnimalname.split("y"))
println(myAnimalname[0])
println(myAnimalname[4])
println(myAnimalname.split(""))


var partyNames = Array<String>(size = 10) { "" }

partyNames[1] = "sujit kumar"
println(partyNames[1])
partyNames[2] = "me 2nd no. hu"
println(partyNames[2])

println()

println("all party names")



for (myvar in partyNames) {
    println(myvar)
}

partyNames[0] = "A"
partyNames[3] = "B"
partyNames[4] = "C"
partyNames[5] = "D"
partyNames[6] = "E"
partyNames[7] = "F"
partyNames[8] = "G"
partyNames[9] = "H"


for (myvar in 0..9) {
    println(partyNames[myvar])
}


println()
println("all the people invited by the users")


for (index in 0..9) {
    partyNames[index] = readLine()!!

    println("" + partyNames[index]) + "is invited in the party"
}


var partyList = ArrayList<String> = ArrayList<String>()
partyList.add("john")
partyList.add("juy")
partyList.add("sujit")
partyList.add("kumar")
partyList.add("mishra")
println("the person invited to the party is " + partyList.get(0))
println("the person invited to the party is " + partyList.get(1))
println("the person invited to the party is " + partyList.get(2))
println("the person invited to the party is " + partyList.get(3))
println("the person invited to the party is " + partyList.get(4))


var dictionary = HashMap<String, String>()

dictionary.put("hello", "Salutation")
dictionary.put("nice", "Beautifull")
dictionary.put("fantastic", "Gorgeous")
dictionary.put("support", "backup")

println(dictionary["hello"])
println(dictionary["Hello"])
println(dictionary["fantastic"])
println(dictionary.get("nice"))
println(dictionary.get("support"))

println("All Keys:")

for (key in dictionary.keys) {
    println(key)
}

println("All Values:")

for (value in dictionary.values) {
    println(value)
}

println("updating Dictionary")

dictionary.put("hello", " How are you")
println(dictionary["hello"])


dictionary.remove(key = "nice")

println()

for (key in dictionary.keys) {
    println(key)
}


var partyNames = arrayOf("sujit", "kumar", "mishra ", "hun")

println(partyNames[0])
println(partyNames[1])
println(partyNames[2])
println(partyNames[3])


var partyNames = listOf<String>("sujit", "kumar", "mishra")
println(partyNames[2])

var partyArrayList = arrayListOf<String>("a", "b", "c", "d")

partyArrayList.add("e")
partyArrayList.remove("b")

println()

for (myvar in partyArrayList) {
    println(myvar)
}

var partyListMutable = mutableListOf<String>("guest 1", "guest 2", "guest 3")

partyListMutable[0] = "Someone else"
println(partyListMutable)


var dictionary = hashMapOf<String, String>("hello" to "Salutation", "sujit" to "kumar")

println(dictionary["hello"])
println(dictionary["sujit"])


var animalsNames = setOf<String>("lion", "deer", "dog", "cat", "lion")

for (animalname in animalsNames) {
    println(animalname)


}


var mutableAnimalName = mutableSetOf<String>("lion", "deer", "dog", "cat", "lion")

mutableAnimalName.add("fish")

println()

for (mutablename in mutableAnimalName) {
    println(mutablename)
}




fun makeAPost() {
    println("Post is created")

}

fun DownloadImge() {
    println("image is Downloaded")
}

fun imageUploaded() {
    println("image is Uploaded")
}

makeAPost()
DownloadImge()
imageUploaded()




fun sum(a: Int, b: Int): Int {

    var result = a b
            return result
}
println(sum(3, 5))



fun subtract(a: Int = 20, b: Int = 5): Unit {

    println(a - b)
}

subtract(5, 8)




fun polymorphism(stringParameter: String): Unit {
    println(stringParameter)
}

fun polymorphism(integerParameter: Int): Unit {
    println(integerParameter)
}

fun polymorphism(doubleParameter: Double): Unit {
    println(doubleParameter)
}

polymorphism("sujit")
polymorphism(23)



how to create class

class Car() {
    var speed: Int = 0
    var Color: String = "green"
    var power: Int = 0
}

var myCar = Car()

println(myCar.Color)

var yourCar = Car()
yourCar.power = 200

println(yourCar.power)
println(myCar.power)

This is Primary constructer
class Boxer(name: String, power: Int, speed: Int) {
    private var name: String = ""
    private var power: Int? = null
    private var speed: Int = 0


    init {

        println(name + "--" + "Power:" + power + "--" + "Speed:" + speed)
    }
}

var myboxer = Boxer("Sujit Kumr ", 2000, 300)

Difference between
        var and
val
var sujit = 20
val kumar = 30
println(sujit)
println(kumar)
sujit = 40
kumar = 50
println(sujit)
println(kumar)

This is the example of custom constructor
class Animmal(power: Int) {
    init {
        println(power)

    }

    constructor(name: String, color: String, speed: Int, power: Int) : this(power) {
        println(name + "  " + color + "  " + speed + "  " + power)
    }
}

var animal = Animmal("sujit", "RED", 2000, 400)
var Myanimal = Animmal(5000)

This is the example of inheritance in kotlin

open class Person() {
    var name: String? = null
    var age: Int? = null
    var height: Int? = null
}

class Student : Person() {
    var StudentId: Int? = null
}

class Employee() : Person() {
    var EmployeeId: Int? = null
}

var person1 = Person()
person1.name = "Sujit Kumar"
person1.age = 24
person1.height = 172
println(person1.name + person1.age + person1.height)

var student = Student()
student.StudentId = 12344
println(student.StudentId)

var employee = Employee()
employee.EmployeeId = 2345
println(employee.EmployeeId)


This is the Examples of all Acess modifiers
class Person1() {
    public var name: String? = null

}

class Person2() {
    private var age: Int? = null
}

open class Student() {
    protected var studentName: String? = null
}

var person1 = Person1()
person1.name = "sujit"
println(person1.name)

var person2 = Person2()
person2.age = 20 it can not of accessed as it is declared as private
        println(person2.age)
class Student2() : Student() {
    fun ChangeName() {
        studentName = "someone"
        println(studentName)
    }

}

var student2 = Student2()
student2.ChangeName()

Overiding example in kotlin
        open class Animal() {
    open fun fight() {
        println("kyu ldh rhe ho bhai")
    }

}

class Animal2 : Animal() {
    override fun fight() {
        println("abe bhai me to override ho gya superclass me")
    }
}

var animal = Animal()
animal.fight()

var anima2 = Animal2()
anima2.fight()


This is an example of using Super Keyword
open class Boxer() {
    var name: String = ""
    var age: Int = 0
    var Height = 0

    fun thrownPunch() {
        println("The boxer is punching the thrown")
    }

}

class KickBoxer() : Boxer() {
    fun fight() {
        super.thrownPunch()
        println("The kickboxer is fighting")
    }
}

var kickBoxer = KickBoxer()
kickBoxer.fight()


This is an example of  Interface

interface ComputerInterface {
    fun getName(): String
    fun getRAM(): Int
    fun getCPU(): String
}
with the help of interface we can make multiple classes and use the different function
class MyOppo : ComputerInterface {
    override fun getName(): String {
        return "OPPO"
    }

    override fun getRAM(): Int {
        return 300
    }

    override fun getCPU(): String {
        return "Snapdragon"
    }
}

class MyIphone : ComputerInterface {
    override fun getName(): String {
        return "Iphone"
    }

    override fun getRAM(): Int {
        return 500
    }

    override fun getCPU(): String {
        return "IOS"
    }
}

var myOppo = MyOppo()
println(myOppo.getName() + "  " + myOppo.getRAM() + "  " + myOppo.getCPU())

var myIphone = MyIphone()
println(myIphone.getName() + "  " + myIphone.getRAM() + "  " + myIphone.getCPU())



Abstract Classs in Kotlin

        abstract class AnimalClass {
    abstract fun getName(): String   abstract function
    abstract var legs: Int? = null abstract variable

    fun getSpeed(): Int     non abstract function
    {
        return 2000
    }

}

class MyLion : AnimalClass() {
    override fun getName(): String {
        return "Mein Sher Hun"
    }

    fun getOverSpeed(): Int {
        return getSpeed()
    }
}

class MyTiger : AnimalClass() {
    override fun getName(): String {
        return "Mein Tiger HUn(Salman Bhai"
    }

    fun getOverspeed(): Int {
        return getSpeed()
    }

}

var myLion = MyLion()
println(myLion.getName() + "  " + myLion.getOverSpeed())

var myTiger = MyTiger()
println(myTiger.getName() + "  " + myLion.getOverSpeed())


this is the enum example
enum class GameStatus {
    WON, LOSS
}

enum class FeelingStatus {
    GOOD, BAD
}
println(GameStatus.LOSS)
println(GameStatus.WON)
println(FeelingStatus.BAD)
println(FeelingStatus.GOOD)

Generic class type example
class GenericClass<T>(kind: T) {
    init {
        println(kind)
    }
}

var myclass = GenericClass("Sujit kumar Mishra")


Generic type Example
class Myclass<T>(kuch: T) {
    var name = kuch
}

var myclass = Myclass("Sujit kumar")
println(myclass.name)

Extension example

fun ArrayList<Int>.addTwoNumbers(a: Int, b: Int): Int {
    var result = a + b
    return result
}

var intArray = ArrayList<Int>()
intArray.add(3)
intArray.add(4)
intArray.add(5)
intArray.addTwoNumbers(intArray[1], intArray[2])


Extention example in kotlin
class Circle(var radius: Double) {
    fun Area(): Double {
        return Math.PI radius radius
    }
}

fun Circle.Perimeter(): Double {
    return 2 Math . PI radius
}

var circle = Circle(2.5)
println("the area of circle is: " + circle.Area())
println("The perimeter of circle is :" + circle.Perimeter())


outer class declaration
class outerClass {
    var str = "Outer class"
    nested
    class declaration
    class nestedClass {
        val firstName = "Praveen"
        val lastName = "Ruhil"
    }
}

accessing member of Nested class
print(outerClass.nestedClass().firstName)
print(" ")
println(outerClass.nestedClass().lastName)


outer class declaration
class outerClass {
    var str = "Outer class"
    nested
    class declaration
    class nestedClass {
        var s1 = "Nested class"
        nested
        class member function
        fun nestfunc(str2: String): String {
            var s2 = s1.plus(str2)
            return s2
        }
    }
}

creating object of Nested class
val nested = outerClass.nestedClass()
invoking the nested member function by passing string
var result = nested.nestfunc(" member function call successful")
println(result)

try and catch block in kotlin
    println("Print an Integer")

    try {
        var integer: Int = readLine()!!.toInt()
        println(integer)
    } catch (myException: Exception) {
        myException.printStackTrace()
        println(myException.message)
    }
   








