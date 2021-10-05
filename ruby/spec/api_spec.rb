# frozen_string_literal: true

require 'json'
require 'rack/test'
require 'rspec'
require 'rspec/expectations'
require 'sinatra'
require_relative '../app.rb'

describe 'Api' do
  include Rack::Test::Methods

  def app
    Sinatra::Application
  end

  it 'controller: should delegate to calculator' do
    calculator_double = double(Calculator)
    expect(calculator_double).to receive(:add).and_return(3)
    allow(Calculator).to receive(:new).and_return(calculator_double)
    body = { a: 1, b: 2 }
    post '/add', body.to_json, 'CONTENT_TYPE' => 'application/json'
    expect(last_response.status).to be == 200
    result = JSON.parse(last_response.body)['result'].to_i
    expect(result).to be == 3
  end

  it 'api: add 1 and 2 should return 3' do
    body = { a: 1, b: 2 }
    post '/add', body.to_json, 'CONTENT_TYPE' => 'application/json'
    expect(last_response.status).to be == 200
    result = JSON.parse(last_response.body)['result'].to_i
    expect(result).to be == 3
  end

end
