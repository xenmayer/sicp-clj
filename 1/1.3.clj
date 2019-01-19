(defn sum-of-biggest-sqrs [x y z]
  (if (> x y) (if (> y z) (+ (* x x) (* y y))
                  (+ (* x x) (* z z)))
      (if (> x z) (+ (* x x) (* y y))
          (+ (* y y) (* z z)))))
