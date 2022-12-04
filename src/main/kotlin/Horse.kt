class Horse(location: String, food: String, val noise: String) : Animal(location,food) {
    var nickname ="Tuco"
    override fun makeNoise() {
        println("A horse named ${nickname} began to neigh  ${noise}.")
    }
    override fun eat() {
        println("The horse eats ${food}.")
    }

    override fun sleep() {
        println("Horse is sleeping...")
    }
}