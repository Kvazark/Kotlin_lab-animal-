class Cat(location: String, food: String, val noise: String) : Animal(location,food) {

    var coatColor: String = "ginger"
    override fun makeNoise() {
        println("The cat ${noise}.")
    }

    override fun eat() {
        println("The ${coatColor} cat eats ${food}.")
    }

    override fun sleep() {
        println("Cat is sleeping...")
    }
}