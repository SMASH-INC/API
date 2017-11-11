# This file was automatically generated for SMASH by SMASH v2.0
# ( https://smashlabs.io ).

module Smash
  # UserCustomUpdateModel Model.
  class UserCustomUpdateModel < BaseModel
    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :uid

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :apiuid

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :avatar

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :custom_input

    # A mapping from model property names to API property names.
    def self.names
      if @_hash.nil?
        @_hash = {}
        @_hash['uid'] = 'uid'
        @_hash['apiuid'] = 'apiuid'
        @_hash['avatar'] = 'avatar'
        @_hash['custom_input'] = 'custom-input'
      end
      @_hash
    end

    def initialize(uid = nil,
                   apiuid = nil,
                   avatar = nil,
                   custom_input = nil,
                   additional_properties = {})
      @uid = uid
      @apiuid = apiuid
      @avatar = avatar
      @custom_input = custom_input

      # Add additional model properties to the instance.
      additional_properties.each do |_name, value|
        instance_variable_set("@#{_name}", value)
      end
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      uid = hash['uid']
      apiuid = hash['apiuid']
      avatar = hash['avatar']
      custom_input = hash['custom-input']

      # Clean out expected properties from Hash.
      names.each_value { |k| hash.delete(k) }

      # Create object from extracted values.
      UserCustomUpdateModel.new(uid,
                                apiuid,
                                avatar,
                                custom_input,
                                hash)
    end
  end
end
