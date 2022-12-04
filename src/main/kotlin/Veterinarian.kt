class Veterinarian {
    fun treatAnimal (animal: Animal){
        val animalName = animal::class
        println("At the reception, a ${animalName.simpleName} that eats ${animal.food} and is most often ${animal.location}.")
        animal.eat()
        animal.makeNoise()
        animal.sleep()
        println(" ")
    }
}