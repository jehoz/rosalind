(ns rosalind.sample-test
  (:require [clojure.test :refer [deftest testing is run-tests]]
            [rosalind.solvers :refer [solve]]
            [rosalind.solvers.dna]
            [rosalind.solvers.rna]))

(deftest dna-sample
  (testing "DNA sample dataset generates correct symbol counts"
    (let [sample-data "AGCTTTTCATTCTGACTGCAACGGGCAATATGTCTCTGTGTGGATTAAAAAAAGAGTGTCTGATAGCAGC"]
      (is (= (solve :dna sample-data)
             "20 12 17 21")))))

(deftest rna-sample
  (testing "RNA sample dataset produces correct transcription"
    (let [sample-data "GATGGAACTTGACTACGTAAATT"]
      (is (= (solve :rna sample-data)
             "GAUGGAACUUGACUACGUAAAUU")))))

(comment
  (run-tests))
