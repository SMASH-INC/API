# This file was automatically generated for SMASH by SMASH v2.0
# ( https://smashlabs.io ).

module Smash
  # UserAuthenticationModelResponse Model.
  class UserAuthenticationModelResponse < BaseModel
    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :request

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :uid

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :valid

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :id

    # TODO: Write general description for this method
    # @return [InfoModel]
    attr_accessor :info

    # A mapping from model property names to API property names.
    def self.names
      if @_hash.nil?
        @_hash = {}
        @_hash['request'] = 'request'
        @_hash['uid'] = 'uid'
        @_hash['valid'] = 'valid'
        @_hash['id'] = 'id'
        @_hash['info'] = 'info'
      end
      @_hash
    end

    def initialize(request = nil,
                   uid = nil,
                   valid = nil,
                   id = nil,
                   info = nil,
                   additional_properties = {})
      @request = request
      @uid = uid
      @valid = valid
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
      uid = hash['uid']
      valid = hash['valid']
      id = hash['id']
      info = InfoModel.from_hash(hash['info']) if hash['info']

      # Clean out expected properties from Hash.
      names.each_value { |k| hash.delete(k) }

      # Create object from extracted values.
      UserAuthenticationModelResponse.new(request,
                                          uid,
                                          valid,
                                          id,
                                          info,
                                          hash)
    end
  end
end
