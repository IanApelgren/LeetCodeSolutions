object Solution {
    def countVowelSubstrings(word: String): Int = 
        (for {a <- 0 to word.length - 1
              b <- a + 1 to word.length
            if (word.substring(a, b).toSet == "aeiou".toSet)
        } yield 1).sum
}