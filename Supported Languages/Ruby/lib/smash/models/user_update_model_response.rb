# This file was automatically generated for SMASH by SMASH v2.0
# ( https://smashlabs.io ).

module Smash
  # UserUpdateModelResponse Model.
  class UserUpdateModelResponse < BaseModel
    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :request

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :updated

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :id

    # TODO: Write general description for this method
    # @return [UserCustomUpdateModel]
    attr_accessor :info

    # A mapping from model property names to API property names.
    def self.names
      if @_hash.nil?
        @_hash = {}
        @_hash['request'] = 'request'
        @_hash['updated'] = 'updated'
        @_hash['id'] = 'id'
        @_hash['info'] = 'info'
      end
      @_hash
    end

    def initialize(request = nil,
                   updated = nil,
                   id = nil,
                   info = nil,
                   additional_properties = {})
      @request = request
      @updated = updated
      @id = id
      @info = info

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
      updated = hash['updated']
      id = hash['id']
      info = UserCustomUpdateModel.from_hash(hash['info']) if hash['info']

      # Clean out expected properties from Hash.
      names.each_value { |k| hash.delete(k) }

      # Create object from extracted values.
      UserUpdateModelResponse.new(request,
                                  updated,
                                  id,
                                  info,
                                  hash)
    end
  end
end
