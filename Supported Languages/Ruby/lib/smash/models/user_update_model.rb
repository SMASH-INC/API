# This file was automatically generated for SMASH by SMASH v2.0
# ( https://smashlabs.io ).

module Smash
  # UserUpdateModel Model.
  class UserUpdateModel < BaseModel
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

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :oldpassword

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :newpassword

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :name

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :email

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :phone

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :avatar

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :countrycode

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

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :custom_input

    # A mapping from model property names to API property names.
    def self.names
      if @_hash.nil?
        @_hash = {}
        @_hash['key'] = 'key'
        @_hash['uid'] = 'uid'
        @_hash['user'] = 'user'
        @_hash['apiuid'] = 'apiuid'
        @_hash['oldpassword'] = 'oldpassword'
        @_hash['newpassword'] = 'newpassword'
        @_hash['name'] = 'name'
        @_hash['email'] = 'email'
        @_hash['phone'] = 'phone'
        @_hash['avatar'] = 'avatar'
        @_hash['countrycode'] = 'countrycode'
        @_hash['address'] = 'address'
        @_hash['a'] = 'a'
        @_hash['sa'] = 'sa'
        @_hash['c'] = 'c'
        @_hash['s'] = 's'
        @_hash['z'] = 'z'
        @_hash['custom_input'] = 'custom-input'
      end
      @_hash
    end

    def initialize(key = nil,
                   uid = nil,
                   user = nil,
                   apiuid = nil,
                   oldpassword = nil,
                   newpassword = nil,
                   name = nil,
                   email = nil,
                   phone = nil,
                   avatar = nil,
                   countrycode = nil,
                   address = nil,
                   a = nil,
                   sa = nil,
                   c = nil,
                   s = nil,
                   z = nil,
                   custom_input = nil,
                   additional_properties = {})
      @key = key
      @uid = uid
      @user = user
      @apiuid = apiuid
      @oldpassword = oldpassword
      @newpassword = newpassword
      @name = name
      @email = email
      @phone = phone
      @avatar = avatar
      @countrycode = countrycode
      @address = address
      @a = a
      @sa = sa
      @c = c
      @s = s
      @z = z
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
      key = hash['key']
      uid = hash['uid']
      user = hash['user']
      apiuid = hash['apiuid']
      oldpassword = hash['oldpassword']
      newpassword = hash['newpassword']
      name = hash['name']
      email = hash['email']
      phone = hash['phone']
      avatar = hash['avatar']
      countrycode = hash['countrycode']
      address = hash['address']
      a = hash['a']
      sa = hash['sa']
      c = hash['c']
      s = hash['s']
      z = hash['z']
      custom_input = hash['custom-input']

      # Clean out expected properties from Hash.
      names.each_value { |k| hash.delete(k) }

      # Create object from extracted values.
      UserUpdateModel.new(key,
                          uid,
                          user,
                          apiuid,
                          oldpassword,
                          newpassword,
                          name,
                          email,
                          phone,
                          avatar,
                          countrycode,
                          address,
                          a,
                          sa,
                          c,
                          s,
                          z,
                          custom_input,
                          hash)
    end
  end
end
