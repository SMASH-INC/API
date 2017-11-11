# This file was automatically generated for SMASH by SMASH v2.0
# ( https://smashlabs.io ).

module Smash
  # LoggingSetupModelResponse Model.
  class LoggingSetupModelResponse < BaseModel
    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :success

    # A mapping from model property names to API property names.
    def self.names
      if @_hash.nil?
        @_hash = {}
        @_hash['success'] = 'success'
      end
      @_hash
    end

    def initialize(success = nil,
                   additional_properties = {})
      @success = success

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

      # Clean out expected properties from Hash.
      names.each_value { |k| hash.delete(k) }

      # Create object from extracted values.
      LoggingSetupModelResponse.new(success,
                                    hash)
    end
  end
end
