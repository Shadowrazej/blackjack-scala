package main.scala.com.blackjack.domain

import com.blackjack.anyval.{GameId, PlayerId}
import com.blackjack.domain.BetAmount

sealed trait Command

object Command {
  final case class StartGame(gameId: GameId) extends Command
  final case class ResolveGame(gameId: GameId, gameResult: GameResult) extends Command
  final case class PlaceBet(gameId: GameId, playerId: PlayerId, amount: BetAmount) extends Command
  final case class AcceptBets(gameId: GameId, playerId: PlayerId) extends Command
  final case class CloseBets(gameId: GameId) extends Command
//  final case class DealCard(gameId: GameId)
}
