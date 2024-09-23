(ns rosalind.solvers)

(defmulti solve
  (fn [problem-id dataset]
    problem-id))

(defmethod solve :default
  [problem-id _]
  (str "No solver for problem \"" problem-id "\""))
