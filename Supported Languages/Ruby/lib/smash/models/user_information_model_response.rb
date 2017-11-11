# This file was automatically generated for SMASH by SMASH v2.0
# ( https://smashlabs.io ).

module Smash
  # UserInformationModelResponse Model.
  class UserInformationModelResponse < BaseModel
    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :user

    # Users API Private Key
    # @return [String]
    attr_accessor :key

    # Users API Public Key
    # @return [String]
    attr_accessor :api

    # Users Profile Information
    # @return [UserInformationSecondaryModel]
    attr_accessor :info

    # A mapping from model property names to API property names.
    def self.names
      if @_hash.nil?
        @_hash = {}
        @_hash['user'] = 'user'
        @_hash['key'] = 'key'
        @_hash['api'] = 'api'
        @_hash['info'] = 'info'
      end
      @_hash
    end

    def initialize(user = nil,
                   key = nil,
                   api = nil,
                   info = nil,
                   additional_properties = {})
      @user = user
      @key = key
      @api = api
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
      user = hash['user']
      key = hash['key']
      api = hash['api']
      info = UserInformationSecondaryModel.from_hash(hash['info']) if
        hash['info']

      # Clean out expected properties from Hash.
      names.each_value { |k| hash.delete(k) }

      # Create object from extracted values.
      UserInformationModelResponse.new(user,
                                       key,
                                       api,
                                       info,
                                       hash)
    end
  end
end
