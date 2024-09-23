(ns rosalind.solvers.fib
  (:require [clojure.string :as str]
            [rosalind.solvers :refer [solve]]))

(defn fib
  [n k]
  (if (<= n 2)
    1
    (+ (fib (- n 1) k)
       (* k
          (fib (- n 2) k)))))

(defmethod solve :fib
  [_ input]
  (let [[n k] (map read-string (str/split input #" "))]
    (str (fib n k))))

