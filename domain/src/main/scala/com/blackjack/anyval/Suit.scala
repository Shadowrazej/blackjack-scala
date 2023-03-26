package main.scala.com.blackjack.anyval

sealed trait Suit

object Suit {
  final case class Clubs() extends Suit
  final case class Hearts() extends Suit
  final case class Spades() extends Suit
  final case class Diamonds() extends Suit
}
