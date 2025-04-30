package com.learning.java.dsa.carrano.ch1;


/**
 *
 * An interface that describes the operations of a piggy bank.
 * @author Prakash
 * @version 1.0
 *
 */
public interface PiggyBankInterface {
  /**
   * Adds a given coin to this piggy bank.
   * @param aCoin A given coin.
   * @return Either true if the coin has been added to the bank,
   *        or false if it has not been added.
   */
  public boolean add(Coin aCoin);

  /**
   * Removes a coin from this piggy bank.
   * @return Either true if a coin has been removed from the bank,
   *        or false if it has not been added.
   */
  public Coin remove();

  /**
   * Checks whether piggy bank contains any coin.
   * @return Either true if the piggy bank has no coin left,
   *        or false if it has coin(s).
   */
  public boolean isEmpty();
}

