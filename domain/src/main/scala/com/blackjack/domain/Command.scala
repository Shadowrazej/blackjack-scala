package main.scala.com.blackjack.domain

import com.blackjack.anyval.{GameId, PlayerId}
import com.blackjack.domain.BetAmount

sealed trait Command

object Command {
  final case class StartGame(gameId: GameId)
  final case class ResolveGame(gameId: GameId, gameResult: GameResult)
  final case class SetChips(gameId: GameId, playerId: PlayerId, chips: BetAmount)
  final case class AcceptBets(gameId: GameId, playerId: PlayerId)
  final case class CloseBets(gameId: GameId)
}
