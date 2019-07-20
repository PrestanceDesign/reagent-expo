(ns test.bar
  (:require ["react-native" :as rn]))

(defn bar
  []
  [:> rn/Text "Here changes are not hot reload"])
