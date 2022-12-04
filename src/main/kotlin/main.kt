
fun main(args: Array<String>) {
    val animals: List<Animal> = listOf(
        Dog("on the street", "meat", "barks"),
        Cat("at home", "chicken", "meows"),
        Horse("in the meadow", "hay", "loudly")
    )
    val veterinar = Veterinarian()
    animals.forEach{animal -> veterinar.treatAnimal(animal)}

//    print("Введите число: ")
//    var number: Int =Integer.valueOf(readLine())
//    var name = readLine()

}
