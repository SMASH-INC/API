# This file was automatically generated for SMASH by SMASH v2.0
# ( https://smashlabs.io ).

module Smash
  # UserProfileInformationModel Model.
  class UserProfileInformationModel < BaseModel
    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :uid

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :apiuid

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :realname

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :displayname

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :email

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :address

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :phone

    # A mapping from model property names to API property names.
    def self.names
      if @_hash.nil?
        @_hash = {}
        @_hash['uid'] = 'uid'
        @_hash['apiuid'] = 'apiuid'
        @_hash['realname'] = 'realname'
        @_hash['displayname'] = 'displayname'
        @_hash['email'] = 'email'
        @_hash['address'] = 'address'
        @_hash['phone'] = 'phone'
      end
      @_hash
    end

    def initialize(uid = nil,
                   apiuid = nil,
                   realname = nil,
                   displayname = nil,
                   email = nil,
                   address = nil,
                   phone = nil,
                   additional_properties = {})
      @uid = uid
      @apiuid = apiuid
      @realname = realname
      @displayname = displayname
      @email = email
      @address = address
      @phone = phone

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
      realname = hash['realname']
      displayname = hash['displayname']
      email = hash['email']
      address = hash['address']
      phone = hash['phone']

      # Clean out expected properties from Hash.
      names.each_value { |k| hash.delete(k) }

      # Create object from extracted values.
      UserProfileInformationModel.new(uid,
                                      apiuid,
                                      realname,
                                      displayname,
                                      email,
                                      address,
                                      phone,
                                      hash)
    end
  end
end
