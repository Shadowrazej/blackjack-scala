package main.scala.com.blackjack.anyval

sealed trait Rank

object Rank {
  final case class Ace() extends Rank
  final case class King() extends Rank
  final case class Queen() extends Rank
  final case class Jack() extends Rank
  final case class Ten() extends Rank
  final case class Nine() extends Rank
  final case class Eight() extends Rank
  final case class Seven() extends Rank
  final case class Six() extends Rank
  final case class Five() extends Rank
  final case class Four() extends Rank
  final case class Three() extends Rank
  final case class Two() extends Rank
}
