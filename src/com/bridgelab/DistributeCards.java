package com.bridgelab;

public class DistributeCards {
    DeckOfCards deck;

    String[][] distributeCards;
    int noOfPlayers, noOfCardEach;

    public DistributeCards(int noOfPlayers, int noOfCardEach){
        deck = new DeckOfCards();
        deck.deck();
        this.noOfCardEach = noOfCardEach;
        this.noOfPlayers = noOfPlayers;
        distributeCards = new String[noOfPlayers][noOfCardEach];
    }

    public void distribute(){
        for (int i = 0; i < noOfPlayers; i++){
            for (int j = 0; j < noOfCardEach; j++){
                int random = (int)(Math.random() * 52);
                if (deck.cards[random] == null) {
                    random = (int) (Math.random() * 52);
                }
                distributeCards[i][j] = deck.cards[random];
                deck.cards[random] = null;
            }
        }
    }

    public void printDistributedCards() {
        for (int i = 0; i < noOfPlayers; i++ ){
            for (int j = 0; j < noOfCardEach; j++){
                System.out.print(distributeCards[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("========================================");
        deck.printCards();
    }
}
