package com.bridgelab;

public class CardGame {
    public static void main(String[] args) {
        DistributeCards distributeCards = new DistributeCards(4,9);
        distributeCards.distribute();
        distributeCards.printDistributedCards();
    }
}
