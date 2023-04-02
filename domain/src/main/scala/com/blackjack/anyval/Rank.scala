package main.scala.com.blackjack.anyval

sealed trait Rank {
  def value: Int
}

object Rank {
  final case class Ace() extends Rank {
    def value = 11
  }
  final case class Face() extends Rank {
    def value = 10
  }
  final case class Numeric(value: Int) extends Rank

  val King = Face
  val Queen = Face
  val Jack = Face
  val Ten = Face

  val Nine = Numeric(9)
  val Eight = Numeric(8)
  val Seven = Numeric(7)
  val Six = Numeric(6)
  val Five = Numeric(5)
  val Four = Numeric(4)
  val Three = Numeric(3)
  val Two = Numeric(2)
}
