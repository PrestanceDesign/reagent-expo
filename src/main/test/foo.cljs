(ns test.foo
  (:require ["react-native" :as rn]
            [test.bar :refer [bar]]))

(defn foo
  []
  [:> rn/View
   [:> rn/Text "Hot reload OK when changes this file"]
   [bar]])
