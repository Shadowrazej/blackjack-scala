package com.blackjack.domain

import com.blackjack.domain.Deck.deck
import main.scala.com.blackjack.anyval.Rank._
import main.scala.com.blackjack.anyval.Suit._

import scala.util.Random

case class Deck(cards: List[Card] = deck) {
  // How should I deal the cards? What's the purpose? Just to check that card is really present in the Deck?
  // I think I can use dealFirstCard to deal random cards from the console
  // deal specific card => possibility to deal specific card
  // should I store such function "dealCard" in the class "Deck"? Is there better place?
  def dealTopCard(): Option[Deck] = {
    cards match {
      case head :: tail => Some(Deck(tail))
      case _ => None
    }
  }

  def dealCard(card: Card): Option[Deck] = {
    cards.indexOf(card) match {
      case -1 => None
      case index => Some(Deck(cards.filter(_ != card)))
    }
  }
}

object Deck {
  val deck: List[Card] = {
    List(
      Card(Ace(), Spades()),
      Card(Ace(), Diamonds()),
      Card(Ace(), Hearts()),
      Card(Ace(), Clubs()),
      Card(King(), Spades()),
      Card(King(), Diamonds()),
      Card(King(), Hearts()),
      Card(King(), Clubs()),
      Card(Queen(), Spades()),
      Card(Queen(), Diamonds()),
      Card(Queen(), Hearts()),
      Card(Queen(), Clubs()),
      Card(Jack(), Spades()),
      Card(Jack(), Diamonds()),
      Card(Jack(), Hearts()),
      Card(Jack(), Clubs()),
      Card(Ten(), Spades()),
      Card(Ten(), Diamonds()),
      Card(Ten(), Hearts()),
      Card(Ten(), Clubs()),
      Card(Nine, Spades()),
      Card(Nine, Diamonds()),
      Card(Nine, Hearts()),
      Card(Nine, Clubs()),
      Card(Eight, Spades()),
      Card(Eight, Diamonds()),
      Card(Eight, Hearts()),
      Card(Eight, Clubs()),
      Card(Seven, Spades()),
      Card(Seven, Diamonds()),
      Card(Seven, Hearts()),
      Card(Seven, Clubs()),
      Card(Six, Spades()),
      Card(Six, Diamonds()),
      Card(Six, Hearts()),
      Card(Six, Clubs()),
      Card(Five, Spades()),
      Card(Five, Diamonds()),
      Card(Five, Hearts()),
      Card(Five, Clubs()),
      Card(Four, Spades()),
      Card(Four, Diamonds()),
      Card(Four, Hearts()),
      Card(Four, Clubs()),
      Card(Three, Spades()),
      Card(Three, Diamonds()),
      Card(Three, Hearts()),
      Card(Three, Clubs()),
      Card(Two, Spades()),
      Card(Two, Diamonds()),
      Card(Two, Hearts()),
      Card(Two, Clubs())
    )
    new Random().shuffle(deck)
  }
}
