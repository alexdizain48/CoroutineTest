import io.reactivex.Observable
import io.reactivex.internal.util.HalfSerializer.onNext
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.rxkotlin.toObservable
import io.reactivex.subjects.PublishSubject
import io.reactivex.subjects.ReplaySubject
import io.reactivex.subjects.Subject
import javafx.application.Application.launch
import kotlinx.coroutines.*
import kotlinx.coroutines.Dispatchers.IO
import java.math.BigDecimal
import kotlin.concurrent.thread

/*fun main(args: Array<String>) {
    val name = "Madrigal"
    var healthPoints = 89
    val isBlessed = true
    val isImmortal = false

    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
    if (auraVisible) {
        println("GREEN")
    } else {
        println("NONE")
    }

    val healthStatus = HealtStatus(healthPoints, isBlessed)
    println(healthStatus)

    runSimulation("Guyal") { playerName: String, numBuildings: Int ->
        val currentYear = 2018
        println("Adding $numBuildings houses")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
    }
}

private inline fun runSimulation(playerName: String, greetingFunction: (String, Int) -> String) {
    val numBuilding = (1..3).shuffled().last()
    println(greetingFunction(playerName, numBuilding))
}

private fun HealtStatus(healthPoints: Int, isBlessed: Boolean): String {
    val healthStatus = when (healthPoints) {
        100 -> "is in excellent condition!"
        in 90..99 -> "has a few scratches."
        in 75..89 -> if (isBlessed) {
            "has some minor wounds but is healing quite quickly!"
        } else {
            "has some minor wounds."
        }
        in 15..74 -> "looks pretty hurt."
        else -> "is in awful condition!"
    }
    return healthStatus
}*/
/*fun main() = runBlocking {
   val startTime = System.currentTimeMillis()
    val job = launch(Dispatchers.Default) {
        var nextPrintTime = startTime
        var i = 0
        while (i < 5) {
            ensureActive()
            if (System.currentTimeMillis() >= nextPrintTime) {
                println("Hello ${i++}")
                nextPrintTime += 500L
            }
        }
    }
    delay(1000L)
    println("Cansel")
    job.cancelAndJoin()
    println("IsActive ${job.isActive}")
    println("Done")

}*/


enum class PaymentOption(val commission: BigDecimal) {
    CASH(BigDecimal.ONE),
    CARD(BigDecimal.TEN),
    TRANSFER(BigDecimal.ZERO)
}

fun main() {

    val blabala: String = ""
    val blabala1: String = ""
    val blabala2: String = ""

    val id: Int = 0


    val paiyment: PaymentOption = PaymentOption.values().random()
    println(paiyment.commission)


    /* val lootBoxOne = LootBox(Fedora("Hi", 48))
     val lootBoxTwo = LootBox(Coin(45))

     lootBoxOne.fetch()?.run {
         println("You retrieve $name from the box!")
     }

     val coin = lootBoxOne.fetch {
         Coin(it.value * 3)
     }
     coin?.let {
         println(it.value)
     }*/


    // val greetingFunction = { name: String, age: Int ->
    /*runSimulation("Alex", ::printConstructionCost) { name, numBuildings ->
        val currentYear = 2018
        "Welcome to SimVillage, $name - $numBuildings! (copyright $currentYear)"
    }*/

    //runSimulation("Alex", greetingFunction)
}

inline fun runSimulation(
    name: String,
    costPrinter: (Int) -> Unit,
    greetingFunction: (String, Int) -> String
) {
    val numBuildings = (1..3).shuffled().last()
    costPrinter(numBuildings)
    println(greetingFunction(name, numBuildings))
}

fun printConstructionCost(numBuildings: Int) {
    val cost = 500
    println("construction cost: ${cost * numBuildings}")
}






