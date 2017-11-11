# This file was automatically generated for SMASH by SMASH v2.0
# ( https://smashlabs.io ).

module Smash
  # DataModel Model.
  class DataModel < BaseModel
    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :result

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :content

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :id

    # A mapping from model property names to API property names.
    def self.names
      if @_hash.nil?
        @_hash = {}
        @_hash['result'] = 'result'
        @_hash['content'] = 'content'
        @_hash['id'] = 'id'
      end
      @_hash
    end

    def initialize(result = nil,
                   content = nil,
                   id = nil,
                   additional_properties = {})
      @result = result
      @content = content
      @id = id

      # Add additional model properties to the instance.
      additional_properties.each do |_name, value|
        instance_variable_set("@#{_name}", value)
      end
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      result = hash['result']
      content = hash['content']
      id = hash['id']

      # Clean out expected properties from Hash.
      names.each_value { |k| hash.delete(k) }

      # Create object from extracted values.
      DataModel.new(result,
                    content,
                    id,
                    hash)
    end
  end
end
