# This file was automatically generated for SMASH by SMASH v2.0
# ( https://smashlabs.io ).

module Smash
  # VerifyAddress Model.
  class VerifyAddress < BaseModel
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
    attr_accessor :address

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :a

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :sa

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :c

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :s

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :z

    # A mapping from model property names to API property names.
    def self.names
      if @_hash.nil?
        @_hash = {}
        @_hash['key'] = 'key'
        @_hash['uid'] = 'uid'
        @_hash['user'] = 'user'
        @_hash['address'] = 'address'
        @_hash['a'] = 'a'
        @_hash['sa'] = 'sa'
        @_hash['c'] = 'c'
        @_hash['s'] = 's'
        @_hash['z'] = 'z'
      end
      @_hash
    end

    def initialize(key = nil,
                   uid = nil,
                   user = nil,
                   address = nil,
                   a = nil,
                   sa = nil,
                   c = nil,
                   s = nil,
                   z = nil,
                   additional_properties = {})
      @key = key
      @uid = uid
      @user = user
      @address = address
      @a = a
      @sa = sa
      @c = c
      @s = s
      @z = z

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
      address = hash['address']
      a = hash['a']
      sa = hash['sa']
      c = hash['c']
      s = hash['s']
      z = hash['z']

      # Clean out expected properties from Hash.
      names.each_value { |k| hash.delete(k) }

      # Create object from extracted values.
      VerifyAddress.new(key,
                        uid,
                        user,
                        address,
                        a,
                        sa,
                        c,
                        s,
                        z,
                        hash)
    end
  end
end
