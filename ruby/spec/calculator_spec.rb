# frozen_string_literal: true

require 'rspec'

describe 'Calculator' do

  it 'add 1 and 2 should return 3' do
    calculator = Calculator.new
    result = calculator.add(1, 2)
    expect(result).to be == 3
  end

end
