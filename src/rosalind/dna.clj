(ns rosalind.dna)

(defn solve
  [strand]
  (let [counts (frequencies strand)]
    (str (counts \A) " "
         (counts \C) " "
         (counts \G) " "
         (counts \T))))
