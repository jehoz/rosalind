(ns rosalind.main
  (:gen-class)
  (:require [clojure.tools.cli :as cli]
            [clojure.java.io :as io]
            [clojure.string :as string]
            [rosalind.solvers :refer [solve]]

            [rosalind.solvers.dna]
            [rosalind.solvers.rna]
            [rosalind.solvers.revc]
            [rosalind.solvers.fib]
            [rosalind.solvers.gc]
            [rosalind.solvers.hamm]
            [rosalind.solvers.iprb]))

(def cli-options
  [["-p" "--problem ID" "Problem id, e.g. DNA"
    :default []]
   ["-d" "--dataset FILE" "Path to dataset file"
    :default []]
   ["-h" "--help"]])

(defn -main
  [& args]
  (let [{:keys [options summary]} (cli/parse-opts args cli-options)]
    (when (:help options)
      (println summary)
      (System/exit 0))
    (when (not (and (:problem options) (:dataset options)))
      (println "problem and dataset are required")
      (System/exit 0))
    (with-open [file (io/reader (:dataset options))]
      (let [problem (keyword (string/lower-case (:problem options)))]
        (println (solve problem (slurp file)))))))

