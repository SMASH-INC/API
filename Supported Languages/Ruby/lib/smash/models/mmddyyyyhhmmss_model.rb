# This file was automatically generated for SMASH by SMASH v2.0
# ( https://smashlabs.io ).

module Smash
  # MMDDYYYYHHMMSSModel Model.
  class MMDDYYYYHHMMSSModel < BaseModel
    # TODO: Write general description for this method
    # @return [DataModel]
    attr_accessor :data

    # A mapping from model property names to API property names.
    def self.names
      if @_hash.nil?
        @_hash = {}
        @_hash['data'] = 'data'
      end
      @_hash
    end

    def initialize(data = nil,
                   additional_properties = {})
      @data = data

      # Add additional model properties to the instance.
      additional_properties.each do |_name, value|
        instance_variable_set("@#{_name}", value)
      end
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      data = DataModel.from_hash(hash['data']) if hash['data']

      # Clean out expected properties from Hash.
      names.each_value { |k| hash.delete(k) }

      # Create object from extracted values.
      MMDDYYYYHHMMSSModel.new(data,
                              hash)
    end
  end
end
