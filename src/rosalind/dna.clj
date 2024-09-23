(ns rosalind.dna
  (:require [rosalind.solvers :refer [solve]]))

(defmethod solve :dna
  [_ strand]
  (let [counts (frequencies strand)]
    (str (counts \A) " "
         (counts \C) " "
         (counts \G) " "
         (counts \T))))
