package main.scala.com.blackjack.domain

import com.blackjack.domain.Card
import main.scala.com.blackjack.anyval.Rank

case class Hand(cards: List[Card]) {
  def addCard(card: Card): Hand = Hand(this.cards :+ card)
  def score: Int = {
    val rank: List[Rank] = cards.map(card => card.rank)
    val numAces: Int = rank.count(rank => rank.value == 11 || rank.value == 1)
    val score: Int = rank.map(_.value).sum
    if (score > 21 && numAces > 0) score - (numAces * 10) else score
  }
  def evaluateHand: Int = this match {
    case Hand(List(Card(Rank.Ace(), _), Card(Rank.Ace(), _))) => 1
    case Hand(List(Card(Rank.Ace(), _), Card(Rank.Face(), _))) => 2
    case Hand(_) if score == 21 => 3
    case Hand(_) if score == 20 => 4
    case Hand(_) if score == 19 => 5
    case Hand(_) if score == 18 => 6
    case Hand(_) if score == 17 => 7
    case Hand(_) if score == 16 => 8
    case Hand(_) if score == 15 => 9
    case Hand(_) if score == 14 => 10
    case Hand(_) if score == 13 => 11
    case Hand(_) if score == 12 => 12
    case _ => 13
  }
}
