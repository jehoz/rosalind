(ns rosalind.solvers.hamm
  (:require [rosalind.solvers :refer [solve]]
            [clojure.core.reducers :refer [fold]]
            [clojure.string :as str]))

(defmethod solve :hamm
  [_ input]
  (let [[a b] (str/split-lines input)]
    (str (fold + (map #(if (not= %1 %2) 1 0) a b)))))
