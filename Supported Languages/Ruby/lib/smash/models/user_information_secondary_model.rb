# This file was automatically generated for SMASH by SMASH v2.0
# ( https://smashlabs.io ).

module Smash
  # UserInformationSecondaryModel Model.
  class UserInformationSecondaryModel < BaseModel
    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :key

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :uid

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :user

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :apiuid

    # A mapping from model property names to API property names.
    def self.names
      if @_hash.nil?
        @_hash = {}
        @_hash['key'] = 'key'
        @_hash['uid'] = 'uid'
        @_hash['user'] = 'user'
        @_hash['apiuid'] = 'apiuid'
      end
      @_hash
    end

    def initialize(key = nil,
                   uid = nil,
                   user = nil,
                   apiuid = nil,
                   additional_properties = {})
      @key = key
      @uid = uid
      @user = user
      @apiuid = apiuid

      # Add additional model properties to the instance.
      additional_properties.each do |_name, value|
        instance_variable_set("@#{_name}", value)
      end
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      key = hash['key']
      uid = hash['uid']
      user = hash['user']
      apiuid = hash['apiuid']

      # Clean out expected properties from Hash.
      names.each_value { |k| hash.delete(k) }

      # Create object from extracted values.
      UserInformationSecondaryModel.new(key,
                                        uid,
                                        user,
                                        apiuid,
                                        hash)
    end
  end
end
