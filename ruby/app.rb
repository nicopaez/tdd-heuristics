require 'sinatra'
require 'json'
require './model/calculator'

get '/' do
  content_type :json
  { content: 'hello' }.to_json
end

post '/add' do
  content_type :json
  input = JSON.parse(request.body.read)
  a = input['a']
  b = input['b']
  calculator = Calculator.new
  { result: calculator.add(a.to_i, b.to_i) }.to_json
end
