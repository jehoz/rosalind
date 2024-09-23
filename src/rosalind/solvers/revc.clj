(ns rosalind.solvers.revc
  (:require [rosalind.solvers :refer [solve]]))

(defmethod solve :revc
  [_ strand]
  (apply str
         (reverse
          (map (fn [nuc]
                 (case nuc
                   \A \T
                   \C \G
                   \G \C
                   \T \A
                   nuc))
               strand))))
