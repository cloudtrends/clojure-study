

;;http://www.moxleystratton.com/blog/2008/05/01/clojure-tutorial-for-the-non-lisp-programmer/


;; clojure classes are not attached to module

(println (+ 3 3 3))

(println (list 1 2 3))

(println  (list "one" "two" "three"))



(println '1 2 3 4 5)


(println [9 0 "hello"])

(println  {"a" 1, "b" 2, "c" 3} )


(def x 5)
(println x)


(def my-list '(1 2 3))
(println  (last my-list) )


(defn election-year? [year]
  (zero? (rem year 4)))
(println  (election-year? 2007))
(println  (election-year? 2008))





(def plus-one
  (fn [x] (+ x 1)))

(println (plus-one 2) )




(defn plus-one
  "Returns a number one greater than x"
  [x]
  (+ x 1))



(defn plus-one
  {:doc "Returns a number one greater than x"}
  [x]
  (+ x 1))



(println  (str "Hello," " world!"))


(println (if false "yes"))

(do (println "Hello.") (+ 2 2))

(loop [i 0]
  (when (< i 5)
    (println i)
    (recur (inc i))
    )
  )


(dorun (for [i (range 0 5)]
         (println i)))


(doseq [i (range 0 5)]
  (println i))



(println (new java.util.Date))


