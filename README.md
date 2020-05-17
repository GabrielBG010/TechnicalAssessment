Instructions:

Complete the attached program. This program models a Deck of Playing Cards consisting of 52 cards:  https://en.wikipedia.org/wiki/Standard_52-card_deck.
* There must be 4 suits: Spades, Hearts, Clubs and Diamonds.
* Each suit must contain 13 cards numbered 2 - 10, Jack (J), Queen (Q), King (K), and Ace (A).
* Complete the 'Deck' class and make any additions or modifications to any of the provided classes.

** print_deck function:
*** Prints the entire deck to standard out. Prints 4 rows of 13 cards each.

** shuffle function:
*** all 52 cards should be randomly permuted. This must use a seedable random number generator (available in both C++ and Java) so that the output is deterministic and testable.

** sort function:
*** Sorts the deck from lowest to highest by suit then by card face value. 
*** The suits are valued from highest to lowest: Spades, Hearts, Clubs, Diamonds
*** The cards are valued from highest to lowest: King,Queen,Jack,10,9,8,7,6,5,4,3,2,Ace
*** Do not use any of the built in language sorting functions like qsort() in c++ or Arrays.sort() in Java.

** deal_hand function:
*** A deal function which prints N sets of M cards: The internal set of cards in the deck does not need to be altered. i.e. The deck doesn't 'lose' the cards it deals. Also, two consecutive 'deals' should produce the same result. The deck must be shuffled in order to produce a different 'deal'.

* Evaluation will be based on program correctness and coding style, as well as the quality and accuracy of comments. Additional testing will be performed on the various classes and functions.
* This should take you no more than two hours to complete.

You may use one of the following programming languages: C++, Java.
Please apply an object oriented approach to your design.

Implement using the following website: https://repl.it/languages.

* Enter either c++ or Java in the "search for a language" box.
* If you are using c++, select "C++: A general purpose system programming language."
* If you are using Java select "Java: A concurrent, class-based, statically typed object-oriented language."

You can create separate files using the 'Add File' button just above the file list. Please 'save' your work anonymously or as a signed in user. Send us the "Share Link:" that is generated when you click the "Share" button.
