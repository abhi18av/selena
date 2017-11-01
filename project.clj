(defproject selena "0.1.0-SNAPSHOT"
  :description "A little Clojure and Selenium soup"
  :url "https://github.com/abhi18av/selena"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0-beta3"]
[im.chit/hara "2.5.10"]
[im.chit/lucid "1.3.13"]  ]
  :main ^:skip-aot selena.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
