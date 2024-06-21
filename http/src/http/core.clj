(ns http.core
  (:gen-class)
  (:require [clj-http.client :as client]
            [cheshire.core :as json :refer :all]))


(defn call-openai-api
  [prompt]
  (let [api-url "https://api.openai.com/v1/completions"
        api-key (System/getenv "OPENAI_API_KEY")
        headers {"Authorization" (str "Bearer " api-key)
                 "Content-Type" "application/json"}
        body ( json/encode {"prompt" prompt
                           "model" "gpt-3.5-turbo-instruct"
                           "max_tokens" 100
                           "temperature" 0.7})]
    (client/post api-url {:headers headers :body body})))

(defn -main
  "Makes a call to OpenAI API with a prompt."
  []
  (let [response (call-openai-api "Hello, World!")]
    (println "Response from OpenAI:" (json/decode (:body response)))))