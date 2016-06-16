(ns sudoku
  (:require [clojure.set :as set]))

(def board identity)

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
  nil)

(defn filled? [board]
  nil)

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
