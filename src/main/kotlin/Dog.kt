class Dog(location: String, food: String, val noise: String)  : Animal(location,food) {

    var breedOfDog ="husky"
    override fun makeNoise() {
        println("The dogs ${noise}.")
    }
    override fun eat() {
        println("The ${breedOfDog} eats ${food}.")
    }

    override fun sleep() {
        println("Dog is sleeping...")
    }
}