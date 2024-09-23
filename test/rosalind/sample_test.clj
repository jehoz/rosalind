(ns rosalind.sample-test
  (:require [clojure.test :refer [deftest testing is]]
            [rosalind.solvers :refer [solve]]
            [rosalind.solvers.dna]))

(deftest dna-sample
  (testing "DNA sample dataset generates correct symbol counts"
    (let [sample-data "AGCTTTTCATTCTGACTGCAACGGGCAATATGTCTCTGTGTGGATTAAAAAAAGAGTGTCTGATAGCAGC"]
      (is (= (solve :dna sample-data)
             "20 12 17 21")))))
