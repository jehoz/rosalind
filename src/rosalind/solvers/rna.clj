(ns rosalind.solvers.rna
  (:require
   [clojure.string :as string]
   [rosalind.solvers :refer [solve]]))

(defmethod solve :rna
  [_ strand]
  (string/replace strand "T" "U"))
