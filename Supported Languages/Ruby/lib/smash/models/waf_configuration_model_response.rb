# This file was automatically generated for SMASH by SMASH v2.0
# ( https://smashlabs.io ).

module Smash
  # WAFConfigurationModelResponse Model.
  class WAFConfigurationModelResponse < BaseModel
    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :success

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :rule

    # A mapping from model property names to API property names.
    def self.names
      if @_hash.nil?
        @_hash = {}
        @_hash['success'] = 'success'
        @_hash['rule'] = 'rule'
      end
      @_hash
    end

    def initialize(success = nil,
                   rule = nil,
                   additional_properties = {})
      @success = success
      @rule = rule

      # Add additional model properties to the instance.
      additional_properties.each do |_name, value|
        instance_variable_set("@#{_name}", value)
      end
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      success = hash['success']
      rule = hash['rule']

      # Clean out expected properties from Hash.
      names.each_value { |k| hash.delete(k) }

      # Create object from extracted values.
      WAFConfigurationModelResponse.new(success,
                                        rule,
                                        hash)
    end
  end
end
