# This file was automatically generated for SMASH by SMASH v2.0
# ( https://smashlabs.io ).

module Smash
  # UserDeletionResponseModel Model.
  class UserDeletionResponseModel < BaseModel
    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :request

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :deleted

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :id

    # A mapping from model property names to API property names.
    def self.names
      if @_hash.nil?
        @_hash = {}
        @_hash['request'] = 'request'
        @_hash['deleted'] = 'deleted'
        @_hash['id'] = 'id'
      end
      @_hash
    end

    def initialize(request = nil,
                   deleted = nil,
                   id = nil,
                   additional_properties = {})
      @request = request
      @deleted = deleted
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
      request = hash['request']
      deleted = hash['deleted']
      id = hash['id']

      # Clean out expected properties from Hash.
      names.each_value { |k| hash.delete(k) }

      # Create object from extracted values.
      UserDeletionResponseModel.new(request,
                                    deleted,
                                    id,
                                    hash)
    end
  end
end
