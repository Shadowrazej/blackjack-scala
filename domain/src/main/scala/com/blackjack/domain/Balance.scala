package com.blackjack.domain

import main.scala.com.blackjack.anyval.BalanceId

case class Balance(id: BalanceId, amount: BigDecimal) {
  private def isValid: Boolean = amount >= 0

  def credit(amount: BigDecimal): Either[BalanceError, Balance] = {
    val newBalance = Balance(id, this.amount + amount)
    if (newBalance.isValid) Right(newBalance)
    else Left(NegativeBalance)
  }

  def debit(amount: BigDecimal): Either[BalanceError, Balance] = {
    val newBalance = Balance(id, this.amount - amount)
    if (newBalance.isValid) Right(newBalance)
    else Left(NegativeBalance)
  }
}

sealed trait BalanceError
case object NegativeBalance extends BalanceError
