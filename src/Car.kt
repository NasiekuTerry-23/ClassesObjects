class Car (carBrand: String) {

    private var isTurnedOn = false
    var speed = 0
    var brand = carBrand

    fun startEngine(){
        println("brrreerrr vrrrr")
        Thread.sleep(1000)
        println("Your $brand is now turned on")
        Thread.sleep(1000)

        isTurnedOn = true
    }

    fun drive(speed: Int){
        if (isTurnedOn){
            if (speed > 0){
                println("Car is driving")
            }else{
                println("Car is parked")
            }
        }else{
            println("Cannot drive car with the engine turned off...")
        }

    }

    fun turnOffEngine(){
        if (isTurnedOn){
            isTurnedOn = false
            println("Engine turned off successfully")
        }else{
            println("Your engine is already turned off...")
        }
    }
}