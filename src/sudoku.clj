(ns sudoku
  (:require [clojure.set :as set]))

(def board identity)

(def all-values #{1 2 3 4 5 6 7 8 9})

(defn value-at [board coord]
  (get-in board coord))

(defn has-value? [board coord]
  (pos? (value-at board coord)))

(defn row-values [board [row _]]
  (into #{} (get board row)))

(defn col-values [board [_ col]]
  (into #{} (map #(get % col) board)))

(defn coord-pairs [coords]
  (into [] (for [row coords
                 col coords]
              (vector row col))))

(defn- top-left-coord [[row col]]
  (vector (* 3 (quot row 3)) (* 3 (quot col 3))))

(defn block-values [board coord]
  (let [top-row (first (top-left-coord coord))
        block-coords (coord-pairs (range top-row (+ top-row 3)))]
    (into #{} (map #(value-at board %) block-coords))))
    
(defn valid-values-for [board coord]
  (if (has-value? board coord)
    #{}
    (let [r (row-values board coord)
          c (col-values board coord)
          b (block-values board coord)] 
      (set/difference all-values r c b))))

(defn- board-values [board]
  (apply set/union (map #(into #{} %) board)))

(defn filled? [board]
  (not (contains? (board-values board) 0)))

(defn rows [board]
  nil)

(defn valid-rows? [board]
  nil)

(defn cols [board]
  nil)

(defn valid-cols? [board]
  nil)

(defn blocks [board]
  nil)

(defn valid-blocks? [board]
  nil)

(defn valid-solution? [board]
  nil)

(defn set-value-at [board coord new-value]
  nil)

(defn find-empty-point [board]
  nil)

(defn solve [board]
  nil)
