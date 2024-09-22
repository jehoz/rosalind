(ns rosalind.sample-test
  (:require [clojure.test :refer [deftest testing is run-tests]]
            [rosalind.dna :as dna]))

(deftest dna-sample
  (testing "DNA sample dataset generates correct symbol counts"
    (let [sample-data "AGCTTTTCATTCTGACTGCAACGGGCAATATGTCTCTGTGTGGATTAAAAAAAGAGTGTCTGATAGCAGC"]
      (is (= (dna/solve sample-data)
             "20 12 17 21")))))

(run-tests)
