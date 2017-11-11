# This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io ).

require 'json'
require 'test/unit'
require 'smash.rb'
require_relative '../test_helper.rb'
require_relative '../http_response_catcher.rb'

class ControllerTestBase < Test::Unit::TestCase
  include Smash

  class << self
    attr_accessor :controller
  end

  # Called only once for a test class before any test has executed.
  def self.startup		
    @@api_client = SMASH.new
    @@request_timeout = 30
    @@assert_precision = 0.01

    # Set Configuration parameters for test execution
    Configuration.environment = Configuration::Environment::PRODUCTION
  end

  # Called once before every test case.
  def setup
    @response_catcher = HttpResponseCatcher.new
    self.class.controller.http_call_back = @response_catcher
  end
end