# This file was automatically generated for SMASH by SMASH v2.0
# ( https://smashlabs.io ).

module Smash
  # UserInformationModel Model.
  class UserInformationModel < BaseModel
    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :realname

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :displayname

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :avatar

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :email

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :address

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :address1

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :address2

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :city

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :state

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :zipcode

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :phone

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :lastlogin

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :ip

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :2fa

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :iplock

    # A mapping from model property names to API property names.
    def self.names
      if @_hash.nil?
        @_hash = {}
        @_hash['realname'] = 'realname'
        @_hash['displayname'] = 'displayname'
        @_hash['avatar'] = 'avatar'
        @_hash['email'] = 'email'
        @_hash['address'] = 'address'
        @_hash['address1'] = 'address1'
        @_hash['address2'] = 'address2'
        @_hash['city'] = 'city'
        @_hash['state'] = 'state'
        @_hash['zipcode'] = 'zipcode'
        @_hash['phone'] = 'phone'
        @_hash['lastlogin'] = 'lastlogin'
        @_hash['ip'] = 'ip'
        @_hash['2fa'] = '2fa'
        @_hash['iplock'] = 'iplock'
      end
      @_hash
    end

    def initialize(realname = nil,
                   displayname = nil,
                   avatar = nil,
                   email = nil,
                   address = nil,
                   address1 = nil,
                   address2 = nil,
                   city = nil,
                   state = nil,
                   zipcode = nil,
                   phone = nil,
                   lastlogin = nil,
                   ip = nil,
                   2fa = nil,
                   iplock = nil,
                   additional_properties = {})
      @realname = realname
      @displayname = displayname
      @avatar = avatar
      @email = email
      @address = address
      @address1 = address1
      @address2 = address2
      @city = city
      @state = state
      @zipcode = zipcode
      @phone = phone
      @lastlogin = lastlogin
      @ip = ip
      @2fa = 2fa
      @iplock = iplock

      # Add additional model properties to the instance.
      additional_properties.each do |_name, value|
        instance_variable_set("@#{_name}", value)
      end
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      realname = hash['realname']
      displayname = hash['displayname']
      avatar = hash['avatar']
      email = hash['email']
      address = hash['address']
      address1 = hash['address1']
      address2 = hash['address2']
      city = hash['city']
      state = hash['state']
      zipcode = hash['zipcode']
      phone = hash['phone']
      lastlogin = hash['lastlogin']
      ip = hash['ip']
      2fa = hash['2fa']
      iplock = hash['iplock']

      # Clean out expected properties from Hash.
      names.each_value { |k| hash.delete(k) }

      # Create object from extracted values.
      UserInformationModel.new(realname,
                               displayname,
                               avatar,
                               email,
                               address,
                               address1,
                               address2,
                               city,
                               state,
                               zipcode,
                               phone,
                               lastlogin,
                               ip,
                               2fa,
                               iplock,
                               hash)
    end
  end
end
