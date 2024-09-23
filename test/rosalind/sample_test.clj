(ns rosalind.sample-test
  (:require [clojure.test :refer [deftest testing is run-tests]]
            [rosalind.solvers :refer [solve]]))

(deftest dna-sample
  (testing "DNA sample dataset generates correct symbol counts"
    (let [sample-data "AGCTTTTCATTCTGACTGCAACGGGCAATATGTCTCTGTGTGGATTAAAAAAAGAGTGTCTGATAGCAGC"]
      (is (= (solve :dna sample-data)
             "20 12 17 21")))))

(run-tests)
