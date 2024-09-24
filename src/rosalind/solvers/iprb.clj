(ns rosalind.solvers.iprb
  (:require [rosalind.solvers :refer [solve]]
            [clojure.string :as str]))

(defn fac
  [n]
  (reduce *' (range 1 (inc n))))

(defn num-combos
  [n k]
  (/ (fac n)
     (* (fac k) (fac (- n k)))))

(defmethod solve :iprb
  [_ input]
  (let [[dom het rec] (map read-string (str/split input #" "))
        total-pop (* 4 (num-combos (+ dom het rec) 2))
        dom-offspring (+ (* 4 (num-combos dom 2))
                         (* 4 dom het)
                         (* 4 dom rec)
                         (* 3 (num-combos het 2))
                         (* 2 het rec))]
    (float (/ dom-offspring total-pop))))
