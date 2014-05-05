import scala.util.Random

object GissaTalet {
  def main(args : Array[String]) {

    println("Gissa Talet")

    println("välkommen till gissa talet. Mellan 1 och 10.")

    val rattTal = Random.nextInt(10) + 1

    var antal = 0

    var gissning = -1
    println("Skriv ett tal")
    while (rattTal != gissning) {
      antal = antal + 1
      gissning = readInt()

      if(rattTal > gissning) {
       println("fel talet är större")
      }

      if(rattTal < gissning) {
        println("fel talet är mindre")
      }
    }

    println("grattis du gissade rätt, du gjorde " + antal + " gissningar")

  }
}
