(ns rosalind.solvers.gc
  (:require [rosalind.solvers :refer [solve]]
            [clojure.string :as str]))

(defn gc-percent
  [dna-str]
  (float
   (* 100
      (/ (count (re-seq #"[GC]" dna-str))
         (count dna-str)))))

(defn parse-strings
  [raw-input]
  (let [to-map (fn [x]
                 {:id (first x)
                  :gc-percent (gc-percent (str/join (rest x)))})]
    (map (comp to-map str/split-lines)
         (filter seq
                 (str/split raw-input #">")))))

(defmethod solve :gc
  [_ input]
  (let [strands (apply list (parse-strings input))
        best (apply max-key :gc-percent strands)]
    (str/join "\n"
              (list (:id best)
                    (:gc-percent best)))))
