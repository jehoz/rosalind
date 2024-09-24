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

(deftest gc-sample
  (testing "GC content sample dataset produces sample output"
    (let [sample-data (str ">Rosalind_6404\n"
                           "CCTGCGGAAGATCGGCACTAGAATAGCCAGAACCGTTTCTCTGAGGCTTCCGGCCTTCCC\n"
                           "TCCCACTAATAATTCTGAGG\n"
                           ">Rosalind_5959\n"
                           "CCATCGGTAGCGCATCCTTAGTCCAATTAAGTCCCTATCCAGGCGCTCCGCCGAAGGTCT\n"
                           "ATATCCATTTGTCAGCAGACACGC\n"
                           ">Rosalind_0808\n"
                           "CCACCCTCGTGGTATGGCTAGGCATTCAGGAACCGGAGAACGCTTCAGACCAGCCCGGAC\n"
                           "TGGGAACCTGCGGGCAGTAGGTGGAAT")]
      (is (= (solve :gc sample-data)
             (str "Rosalind_0808\n"
                  "60.91954"))))))

(comment
  (run-tests))
