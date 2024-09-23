(ns rosalind.sample-test
  (:require [clojure.test :refer [deftest testing is run-tests]]
            [rosalind.solvers :refer [solve]]))

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

(deftest revc-sample
  (testing "Reverse compliment sample dataset produces sample output"
    (let [sample-data "AAAACCCGGT"]
      (is (= (solve :revc sample-data)
             "ACCGGGTTTT")))))

(deftest fib-sample
  (testing "Fibonacci sample dataset produces sample output"
    (let [sample-data "5 3"]
      (is (= (solve :fib sample-data)
             "19")))))

(comment
  (run-tests))
