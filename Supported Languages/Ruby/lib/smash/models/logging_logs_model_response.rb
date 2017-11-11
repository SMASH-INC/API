# This file was automatically generated for SMASH by SMASH v2.0
# ( https://smashlabs.io ).

module Smash
  # LoggingLogsModelResponse Model.
  class LoggingLogsModelResponse < BaseModel
    # TODO: Write general description for this method
    # @return [LogModel]
    attr_accessor :log

    # A mapping from model property names to API property names.
    def self.names
      if @_hash.nil?
        @_hash = {}
        @_hash['log'] = 'log'
      end
      @_hash
    end

    def initialize(log = nil,
                   additional_properties = {})
      @log = log

      # Add additional model properties to the instance.
      additional_properties.each do |_name, value|
        instance_variable_set("@#{_name}", value)
      end
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      log = LogModel.from_hash(hash['log']) if hash['log']

      # Clean out expected properties from Hash.
      names.each_value { |k| hash.delete(k) }

      # Create object from extracted values.
      LoggingLogsModelResponse.new(log,
                                   hash)
    end
  end
end
