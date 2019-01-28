(defproject seq-http "0.2.0"
  :description "HTTP service that generates basic mathematical sequences given input"
  :url "https://github.com/michaeldye/seq-http"
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [ring "1.4.0"]
                 [ring/ring-json "0.4.0"]
                 [org.clojure/tools.logging "0.4.1"]
                 [compojure "1.4.0"]]
  :plugins [[lein-ring "0.9.6"]]
  :ring {:handler seq-http.handler/app
         :init seq-http.handler/init
         :destroy seq-http.handler/destroy
         :stacktrace-middleware ring.middleware.stacktrace/wrap-stacktrace-log}
  :profiles {
              :production {
                :ring {:stacktraces? false
                       :auto-reload? false} } })
